import java.util.Scanner;

public class ChatBot_V1 {
    public static void main(String[] args) {
        // Note: Always add new Scanner then (System.in) for input
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I'm your chat bot, let's start by setting me up");
        System.out.print("What you would like to name me? ");
        String robotName = input.nextLine();
        System.out.println("Okay, my name is "+robotName+" then!, I also like it!");
        System.out.print("What is your name please? ");
        String name = input.nextLine();
        System.out.println("What a great name you have, "+name);
        System.out.println("Heads up and look above!, You are not allowed to use me if you are " +
                "under the age of 16 years old!");
        System.out.println("So let me guess your age");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int ageBy3 = input.nextInt();
        int ageBy5 = input.nextInt();
        int ageBy7 = input.nextInt();
        int age = (ageBy3 * 70 + ageBy5 * 21 + ageBy7 * 15) % 105;
        System.out.println("I guess your age is "+ age +", That's great!");
        System.out.println("Let me show you what I can do\nI can count up to whatever number you " +
                "give me, try it, give me a number!");
        int numByUser = input.nextInt();
        int numToCount = -1;
        while (numToCount < numByUser) {
            numToCount += 1;
            System.out.println(numToCount + "!");
        }
        System.out.println("Completed, I told ya!, I can do it!");

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int inputForTest = input.nextInt();
        while (inputForTest > 2 || inputForTest < 2) {
            System.out.println("Please, try again.");
            inputForTest = input.nextInt();
        } 
        System.out.println("Congrats, You got it, right!");
        System.out.println("That is it for now, see you tomorrow for the rest of the setup, " +
                "great things awaits! I tell ya, HAHA!");
        }

    }

