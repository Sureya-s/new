import java.util.Scanner;
public class arreyy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arey = new int[5];
        for(int i = 0;i<=4;i=i+1){
            arey[i] = scan.nextInt();   
        }
        System.out.println(arey[0]+arey[1]+arey[2]+arey[3]+arey[4]);
        
    }
}
    

