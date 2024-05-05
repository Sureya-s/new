import java.util.Scanner;
public class palin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String orginal, reverse = "";
        orginal = scan.nextLine();
        for(int i = orginal.length() - 1; i >= 0; i-- ){
            reverse = reverse + orginal.charAt(i);

        }
        if(orginal.equals(reverse)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Polaiyadimoooneee");
        }
 }
    
}
