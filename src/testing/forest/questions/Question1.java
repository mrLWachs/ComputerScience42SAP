package testing.forest.questions;

import io.Simulator;

public class Question1 {
    public Question1() {
        Simulator.header("Question 1");
        int a = 5;
        int b = 2;
        double c = 3.0;
        Simulator.code("int a = 5;");
        Simulator.code("int b = 2;");
        Simulator.code("double c = 3.0;");
        Simulator.code("System.out.println(5 + a / b * c -1);");
        System.out.println(5 + a / b * c -1);
    }
}
