
package testing.cs42sap.additional;

public class ZTemp {

    public static void main(String[] args) {
        new ZTemp();
    }
    
    public ZTemp() {
        String s1 = "This is a string of characters.";
        String s2 = reverse(s1);
        System.out.println("s1 = '" + s1 + "'");
        System.out.println("s2 = '" + s2 + "'");
        
        int[] array = { 10, 20, 30, 40 };
        int sum = sum(array, 0);
        System.out.println("Sum of array = " + sum);
        
        // Creating an Object: A specific instance of the Animal class
        Animal animal = new Animal();

        // Defining the attributes for this specific instance
        animal.type = "Horse";
        animal.sound = "Neigh";
        // Using the behavior
        animal.makeNoise();        
        
        // Creating a Dog object
        Dog dog = new Dog();
        dog.type = "Dog";      // Inherited attribute
        dog.sound = "Woof!";     // Inherited attribute        
        dog.makeNoise();         // Inherited behavior
        dog.wagTail();           // Specific subclass behavior

        // Creating a Cat object
        Cat cat = new Cat();
        
        Cat gary = new Cat("Gary","purrrr");
        
        BigAnimal bigAnimal = new BigAnimal("Lion", "growl", "Large");
        
        Hunter hunter = new Hunter();
        hunter.hunt(bigAnimal);
        
        Animal[] zoo = { animal, dog, cat, gary, bigAnimal };
        for (Animal creature: zoo) {
            creature.makeNoise();
        }
        
    }

    /**
     * Reverses the order of characters in a given string using a 
     * recursive process.
     *
     * @param string The String to be reversed
     * @return A new String with the characters in reverse order
     */
    public String reverse(String string) {        
        if (string == null || string.length() <= 1) {
            // Base Case: If the string is empty or one char, it's already 
            // "reversed"
            return string;
        }
        else {
            // Recursive Case: Take the last char and put it in front of 
            // the result of reversing the rest of the string
            int    index = string.length() - 1;
            String last  = string.substring(index);
            String rest = string.substring(0, index);
            return last + reverse(rest);
        }
    }
    
    /**
     * Recursively calculates the sum of all integers in an array starting 
     * from a given index.
     *
     * @param array The array of integers to be summed
     * @param index The current starting position in the array
     * @return The sum of the element at the current index plus the sum of all 
     * subsequent elements
     */
    public static int sum(int[] array, int index) {
        if (index == array.length) {
            // Base Case: We've reached the end of the array
            return 0;
        }
        else {
            // Recursive Case: Add current element to the sum of the remaining 
            // elements (the 'index + 1' captures the progress of the recursion)
            return array[index] + sum(array, index + 1);
        }
    }
    
        
    
    public class Animal 
    {
        // Attributes: Defined characteristics (State)
        String type;
        String sound;

        // Behavior: Defined actions (Methods)
        public void makeNoise() {
            System.out.println(type + " says: " + sound);
        }        
    }
    
    public class Dog extends Animal 
    {
        public void wagTail() {
            System.out.println(type + " is wagging their tail!");
        }
    }

    public class Cat extends Animal 
    {
        public Cat() {
            type = "Cat";
            sound = "meow";
            makeNoise();
            scratchPost();
        }
        
        public Cat(String type, String sound) {
            this.type = type;
            this.sound = sound;
            makeNoise();
        }
        
        public void scratchPost() {
            System.out.println(type + " is scratching the post.");
        }
    }
    
    public class BigAnimal extends Animal
    {
        private String size;
        
        public BigAnimal(String type, String sound, String size) {
            super.type = type;
            super.sound = sound;
            set(size);
            makeNoise();
        }

        private void set(String size) {
            this.size = size;
        }

        @Override
        public void makeNoise() {
            System.out.println(size + " " + type + " roars: " + sound);
        }
    }
    
    public class Gun
    {
        public void shoot(Animal animal) {
            System.out.println("Bang at " + animal.type);
        }
    }
    
    public class Hunter
    {
        private Gun gun;
        
        public Hunter() {
            gun = new Gun();
        }
        
        public void hunt(Animal animal) {
            gun.shoot(animal);
        }
    }
        
}