import java.util.Scanner;

public class ChatBot_V1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I'm your chat bot, let's start by setting me up");
        System.out.println("What you would like to name me? ");
        String robotName = input.next();
        System.out.println("Okay, my name is "+robotName+" then!, I also like it!");
        System.out.println("What is your name please? ");
        String name = input.next();
        System.out.println("very nice name, "+name);
        System.out.println("Heads up and look above!, You are not allowd to use me if you are under the age of 16 years old!");
        System.out.println("Is that clear? (Yes or No?)" );
        String answer = input.next();
        System.out.println("That is it for now, see you tomorrow for the rest of the setup, great things awaits! I tell ya, HAHA!");
    }
}
