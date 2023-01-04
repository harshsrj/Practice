import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        System.out.println("-------------The Rock Paper Scissors Game-------------");
        System.out.println("In this game you and computer will randomly and consequently choose between \n rock/paper/scissor.");
        System.out.println("First you choose the number that denotes between rock/scissors/paper then \n the computer will generate random number");
        System.out.println("Rock = 1" + " Paper = 2" + " Scissors = 3");
        Scanner sc = new Scanner(System.in);
        Random computer = new Random();
        System.out.print("Choose :");
        int user_input = sc.nextInt();
        int Comp_random = computer.nextInt((3-1)+1)+1;
        System.out.println("Computer chose: "+Comp_random);
        if (user_input==Comp_random){
            System.out.println("It's a tie");
        }
        if (user_input==3&& Comp_random==2){
            System.out.println("You win");
        }

        else if (user_input==2&& Comp_random==1){
            System.out.println("You win");
        }
        else if (user_input==1&& Comp_random==3){
            System.out.println("You win");
        }
        else {
            System.out.println("You lose");
        }

    }
}
