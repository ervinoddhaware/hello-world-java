//My first java program
//Name: Vinod
//Date: 30 april 2026
//Goal: Learning java full stack development

public class HelloWorld {   // 1 class declaration
    public static void main(String arg[])  // main method starting pt of the prog.
    {
        //variable declare kar rahe hai
        String name = "Vinod Dhaware";
        String city = "Pune";
        String goal = "Java Full Stack Developer";
        int month = 9;
        boolean isBeginner = true;

        System.out.println("=================================");
        System.out.println("Hello World!");
        System.out.println("My name is " + name);
        System.out.println("I live in " + city + " city.");
        System.out.println("I am learing to become a " + goal);
        System.out.println("I will become job ready in "+ month +" months.");
        System.out.println("Am i beginner? "+ isBeginner);
        System.out.println("=================================");

        //Extra line for practice
        System.out.println("\nI will become a full stack developer in 9-12 months!");
    }
}
