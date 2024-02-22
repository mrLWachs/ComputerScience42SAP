package tools;

import io.Simulator;
import java.util.Set;
import org.reflections.Reflections;
import static org.reflections.scanners.Scanners.SubTypes;
import static org.reflections.scanners.Scanners.TypesAnnotated;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author a.belski
 */
public class QuestionProcessor
{
    public static void RunAllQuestions()
    {
        Reflections reflections = new Reflections("questions");
        
        try
        {
            System.out.println("getting annotated classes");
            Set<Class<?>> annotated
                    = reflections.get(SubTypes
                            .of(TypesAnnotated
                                    .with(Question.class))
                            .asClass());
            
            System.out.println("annotated size: " + annotated.size());
            
            for (Class<?> clazz : annotated)
            {
                Simulator.output("Testing " + clazz.getCanonicalName() + ": ");
                clazz.getConstructor().newInstance();
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
