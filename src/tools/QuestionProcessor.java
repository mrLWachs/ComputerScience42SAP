package tools;

import java.util.List;
import java.lang.reflect.Method;
import java.util.ArrayList;

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
        try
        {
            Class<?> clazz = ClassLoader.getSystemClassLoader()
                    .loadClass("com.baeldung.annotation.scanner.SampleAnnotatedClass");
            Question classAnnotation = clazz.getAnnotation(Question.class);
            Method[] methods = clazz.getMethods();
            List<String> annotatedMethods = new ArrayList<>();
            for (Method method : methods)
            {
                Question annotation = method.getAnnotation(Question.class);
                if (annotation != null)
                {
                    annotatedMethods.add(annotation.Test());
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
