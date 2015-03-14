/**
 * Created by c4q-Abass on 3/13/15.
 */
import java.util.Scanner;
public class advGame {
    int score;

    public static void Astronomy() {
        Scanner gameInputAst = new Scanner(System.in);
        String astAns = null;
        System.out.println("Maybe you can figure out which planet is closest to you");
        astAns = gameInputAst.nextLine();
        if (astAns == "Andromeda") {
            System.out.println("Eureka! Great, now let's set up the gps...yes we have gps here");
            //Call next category function.
        }
    }


    public static void History() {
        Scanner gameInput = new Scanner(System.in);
        int ansHist = 1939;
        System.out.println("You will need a security code to start up your spaceship. Some trivia will help you rack up enough points to get there");

        //ansHist = gameInput.nextInt();
    }

    public static void main(String[] args) {
        int score = 0;
        int userAns = 0;
        int answer = 0;
        String navAns = null;
        Scanner gameInput = new Scanner(System.in);
        String aboutMe = ("This is an adventure game for lovers of history, mystery, storytelling, exploring, " +
                "and puzzle-solving.\n While you're at it, you can pick up points that will help you figure out how to get home.");


        System.out.println("You are trapped in an another galaxy and you need to solve some clues to find your way back home");
        System.out.print("\nThe portal requires you to " +
                "solve some clues to move to the next level and get closer to home. Press 1 to begin.");
        userAns = gameInput.nextInt();
        if (userAns == 1) {
            History();
            System.out.println("The code is the same as the year that the second world war began. Would you like to take a guess?");
            answer = gameInput.nextInt();
            if (answer == 1939){
                System.out.println("Great, let's start up the spaceship");
                score += 10;
                System.out.println("The spaceship is beginning, but first we need some help with navigation.");
                System.out.println("Your score is " +score);
            } else {
                System.out.println("Sorry that's wrong");
                System.out.println("Your score is " +score);
            }

            if (score == 10) {   //navigation
                System.out.println("You're on the closest galaxy to Earth");
                Astronomy();
                navAns = gameInput.nextLine();

            }


        }

    }
}