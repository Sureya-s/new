import java.util.Scanner;
public class loan {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        int salary = scan.nextInt();
        if (age <= 25 || salary >= 20000){
            System.out.print("Enter the loan amount");
            int loan = scan.nextInt();
            if(loan <= 50000){
                System.out.print("You are eligible for loan");
            }
            else{
                System.out.print("Max loan amount is 50000");
            }
        }
        else{
            System.out.print("You are not eligible for loan");
        }
    }
    
}
