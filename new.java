import java.util.Scanner;
class new {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == b){
            System.out.println("Yes they are same ");
        }
        else{
            System.out.println("They are not same");
        }
    }
}