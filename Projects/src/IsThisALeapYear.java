import java.util.Scanner;

public class IsThisALeapYear {
    public static void main(String[] args) {
        System.out.println("This will tell if it is leap year or not: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year%4 == 0){
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }
    }

}
