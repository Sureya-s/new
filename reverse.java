public class reverse {
    public static void main(String[] args) {
        int num = 9876;
        int reverse = 0;
        int digit = 0;
        while(num > 0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }
        System.out.println(reverse);
        
    
    }
}
