// My First Java Program with Variables
// Name: Vinod Dhaware
// Date: 30 April 2026
// Goal: Learning Java Full Stack Development

public class HelloWorld {

    public static void main(String[] args) {

        // Declaring Variables
        String name = "Vinod Dhaware";
        String city = "Pune";
        String goal = "Java Full Stack Developer";
        int months = 10;
        boolean isBeginner = true;
        double currentProgress = 6.0;  //new data type

        System.out.println("=====================================");
        System.out.println("Hello World!");
        System.out.println("My name is " + name);
        System.out.println("I live in " + city + " city.");
        System.out.println("I am learning to become a " + goal);
        System.out.println("I will become job ready in " + months + " months.");
        System.out.println("Am I a beginner? " + isBeginner);
        System.out.println("My current progress is "+ currentProgress + " months.");
        System.out.println("=====================================");

        // Extra message with new line
        System.out.println("\nI am determined to become a successful Full Stack Developer");
    }
}