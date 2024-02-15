package testing.forest;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class TestCode {

    public TestCode() {
        initializeQuestions("testing.forest.questions");
    }

    private void initializeQuestions(String packageName) {
        List<Class<?>> questionClasses = getClasses(packageName);
        for (Class<?> questionClass : questionClasses) {
            try {
                Constructor<?> constructor = questionClass.getDeclaredConstructor();
                constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private List<Class<?>> getClasses(String packageName) {
        List<Class<?>> classes = new ArrayList<>();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = packageName.replace('.', '/');
            java.net.URL resource = classLoader.getResource(path);
            java.nio.file.Path directory = java.nio.file.Paths.get(resource.toURI());
            java.nio.file.Files.walk(directory)
                    .filter(p -> p.toString().endsWith(".class"))
                    .forEach(p -> {
                        String className = packageName + '.' + p.getFileName().toString().replace(".class", "");
                        try {
                            Class<?> cls = Class.forName(className);
                            classes.add(cls);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }

}
