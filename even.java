public class even {
    public static void main(String args[]){
        int odd = 0;
        int even = 0;
        for(int i=0;i<=50;i=i+1){
            if(i%2 == 0){
                System.out.println(i);
                even = even +1;
            }
            else if(i%2 != 0){
                odd = odd + 1;


            }
        }
        System.out.println("The number of odd numbers are" + odd);

    }
    
}
