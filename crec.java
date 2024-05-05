import java.util.Scanner;
public class crec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        int middle = size/2;
        for(int i = 0; i<= size-1; i=i+1){
            a[i] = scan.nextInt();


        }
        System.out.println(a[middle]);
    }
    
}
