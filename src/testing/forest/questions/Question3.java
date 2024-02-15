package testing.forest.questions;

import io.Simulator;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

    List<Integer> rn1List = new ArrayList<>();
    List<Integer> rn2List = new ArrayList<>();
    List<Integer> rn3List = new ArrayList<>();
    List<Integer> rn4List = new ArrayList<>();
    List<Integer> rn5List = new ArrayList<>();

    public Question3() {
        Simulator.header("Question 3");
        Simulator.comment("Witch of the following statments assigns a random int between 25 and 60, inclusive, to `rn`?");

        Simulator.code("int rn = (int) (Math.random() * 25) + 36;");
        Simulator.code("int rn = (int) (Math.random() * 25) + 60;");
        Simulator.code("int rn = (int) (Math.random() * 26) + 60;");
        Simulator.code("int rn = (int) (Math.random() * 36) + 25;");
        Simulator.code("int rn = (int) (Math.random() * 60) + 25;");

        Simulator.comment("Run each 100 times.");

        for (int i = 0; i < 100; i++) {
            int rn1 = (int) (Math.random() * 25) + 36;
            int rn2 = (int) (Math.random() * 25) + 60;
            int rn3 = (int) (Math.random() * 26) + 60;
            int rn4 = (int) (Math.random() * 36) + 25;
            int rn5 = (int) (Math.random() * 60) + 25;

            rn1List.add(rn1);
            rn2List.add(rn2);
            rn3List.add(rn3);
            rn4List.add(rn4);
            rn5List.add(rn5);
        }

        // Check if the results are within the range
        boolean rn1InRange = rn1List.stream().allMatch(num -> num >= 25 && num <= 60);
        boolean rn2InRange = rn2List.stream().allMatch(num -> num >= 25 && num <= 60);
        boolean rn3InRange = rn3List.stream().allMatch(num -> num >= 25 && num <= 60);
        boolean rn4InRange = rn4List.stream().allMatch(num -> num >= 25 && num <= 60);
        boolean rn5InRange = rn5List.stream().allMatch(num -> num >= 25 && num <= 60);

        // Output the results
        Simulator.output("rn1List: " + rn1List + ", all in range: " + rn1InRange, true);
        Simulator.output("rn2List: " + rn2List + ", all in range: " + rn2InRange, true);
        Simulator.output("rn3List: " + rn3List + ", all in range: " + rn3InRange, true);
        Simulator.output("rn4List: " + rn4List + ", all in range: " + rn4InRange, true);
        Simulator.output("rn5List: " + rn5List + ", all in range: " + rn5InRange, true);


    }
}
