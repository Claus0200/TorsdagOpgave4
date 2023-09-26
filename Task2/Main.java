import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name");
        String name = scanner.nextLine();
        System.out.println("Hello, how are you " + name);
        System.out.println("Please type your age");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");
        int retirementAge = 67 - age;
        System.out.println("You may retire in " + retirementAge + " years");
    }

}


