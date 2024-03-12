package Module3;

//1.2 App class

import java.util.Scanner;

public class App

{

    public static void main(String[] args)

    {

        // Strings for asking 2 questions: prompt strings

        String q1 = "What is the color of the sky?\n" + "(a)Green \n(b)Blue \n(c)Yellow\n";

        String q2 = "What is the color of an orange?\n" + "(a)Magenta \n(b)Red \n(c)Orange\n";

        // array of questions

        Question[] questions = {

                new Question(q1, "b"),

                new Question(q2, "c")

        };

        takeTest(questions);

    }

    public static void takeTest(Question[] questions)

    {

        int score = 0;

        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++)

        {

            System.out.println(questions[i].prompt);

            String answer = keyboardInput.nextLine();

            if (answer.equals(questions[i].answer))

            {

                score++;

            }

        }

        System.out.println("\nYou scored " + score + "/" + questions.length);

    }

}