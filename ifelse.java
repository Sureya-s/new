import java.util.Scanner;
class ifelse{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Score:");
        int score = scan.nextInt();
        if(score > 70){
            System.out.println("Excellent");


        }
        else if(score >50 && score <=70){
            System.out.println("Good Job");

        }
        else if(score <= 50){
            System.out.println("You have to improve");
        }
    }
}