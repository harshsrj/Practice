import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("This is Percentage Calculator");
        System.out.println("how much marks you obtained in Subject 1");
        float M1 = marks.nextFloat();
        System.out.println("how much marks you obtained in Subject 2");
        float M2 = marks.nextFloat();
        System.out.println("how much marks you obtained in Subject 3");
        float M3 = marks.nextFloat();
        System.out.println("how much marks you obtained in Subject 4");
        float M4 = marks.nextFloat();
        System.out.println("how much marks you obtained in Subject 5");
        float M5 = marks.nextFloat();
        float percentage = (M1+M2+M3+M4+M5)/5;
        if (percentage>=40 && M1 >= 33 && M2>=33 && M3>=33 ){
            System.out.println("Congratulations !! You PASSED :) ");
        }
        else {
            System.out.println("Sorry , You Failed :( ");
        }
        System.out.println("you got "+percentage+"% marks");
    }
}