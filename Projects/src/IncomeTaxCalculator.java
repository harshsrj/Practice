import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args){
        System.out.println("This will tell you how much Income Tax you need to pay");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Annual Salary in Lacs: ");
        float salary = sc.nextFloat();
        float tax = 0.0f;
        if (salary<=2.5f){
            System.out.println("You don't need to pay any Tax");
        }
        else if (salary>2.5f && salary<=5.0f){
            tax = tax + 0.05f*(salary-2.5f);
            System.out.println("Your calculated tax is: "+tax);
        }
        else if (salary>5.0f && salary<=10.0f){
            tax = tax + 0.2f*(salary-5.0f);
            tax = tax + 0.05f*(2.5f);
            System.out.println("Your calculated tax is: "+tax);
        }
        else{
            tax = tax + 0.2f*(5.0f);
            tax = tax + 0.05f*(2.5f);
            tax = tax + 0.3f*(salary - 10f);
            System.out.println("Your calculated tax is: "+tax);
        }
    }
}

