import java.util.Scanner;
public class ternary {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String solu = a > b?"a is greater":"b is greater";
        System.out.println(solu);
    }
    
}
