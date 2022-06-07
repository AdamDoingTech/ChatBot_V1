/*
    Built using Java.
    Created by: Adam [Atom Lab X]
    Date: March 30th, 2022
 */

import java.util.Scanner;

public class ChatBot_V1 {
    public static void main(String[] args) {
        // Note: Always add new Scanner then (System.in) for input.
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I'm your chat bot, let's start by setting me up");
        // Introduction.
        System.out.print("What you would like to name me? ");
        String robotName = input.nextLine();
        System.out.println("Okay, my name is "+ robotName +" then!, I also like it!");
        System.out.print("What is your name please? ");
        String name = input.nextLine();
        System.out.println("What a great name you have, "+ name);
        System.out.println("Heads up and look above!, You are not allowed to use me if you are " +
                "under thea age of 16 years old!");
        // Guessing age OR entering age [int] by the user.
        System.out.print("Please enter your age: ");
        // System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int ageInput = input.nextInt();
        /*
        int ageBy5 = input.nextInt();
        int ageBy5 = input.nextInt();
        int ageBy7 = input.nextInt();
        int age = (ageBy3 * 70 + ageBy5 * 21 + ageBy7 * 15) % 105;
        */
        if (ageInput >= 16) {
            System.out.println("So your age is "+ ageInput +", That's great!");
            System.out.println("You can use me");
        } else {
            System.out.println("Sorry, you can not use me, Bye!!!");
            // exit method used to terminate the program.
            System.exit(0);
        }

        System.out.println("Also, let me show you what I can do\nI can count up to whatever " +
                "number" +
                " you " +
                "give me, try it, give me a number!");
        int numByUser = input.nextInt();
        int numToCount = -1;
        while (numToCount < numByUser) {
            numToCount += 1;
            System.out.println(numToCount + "!");
        }
        System.out.println("Completed, I told ya!, I can do it!");
        // Anime Test.
        System.out.println("Let's test your Anime knowledge.");
        System.out.println("Which character is Shikamaru's wife?");
        System.out.println("1. Haruno Sakura.");
        System.out.println("2. Nara Temari.");
        System.out.println("3. Kunoichi TenTen.");
        System.out.println("4. Hyuga Hinata.");
        int inputForTest = input.nextInt();
        /*
         While loop will keep running, until it is out of the loop, if the answer was 2 rather,
         than any other number.
        */
        if (inputForTest != 2) {
            do {
                System.out.println("Please, try again.");
                inputForTest = input.nextInt();
            } while (inputForTest != 2);
        }
        // The end of the conversation.
        System.out.println("Congrats, You got it, right!");
        System.out.println("That is it for now, but look ahead, great things awaits I tell ya!");
        }
    }

