package testing.forest;

import testing.forest.questions.*;

import java.lang.reflect.Constructor;

/*
 * TestCode.java - Running some code for testing purposes
 *
 * @Author Forest
 */
public class TestCode {
    public TestCode() {
        initializeQuestions();
    }

    private void initializeQuestions() {
        try {
            Class<?>[] questionClasses = {
                    Question1.class,
                    Question2.class,
                    Question3.class
            };

            for (Class<?> questionClass : questionClasses) {
                Constructor<?> constructor = questionClass.getDeclaredConstructor();
                constructor.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
