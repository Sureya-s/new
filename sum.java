public class sum {
    public static void main(String[] args) {
        int sum = 0;
        int digits = 0; int value = 0;
        int number = 4321;
        while(number > 0){
            digits = number % 10;
            sum  += digits;
            number = number/10;

        }
        System.out.println(sum);

    }
    

}
