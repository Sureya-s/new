public class prime {
    public static void main(String[] args) {
        int count = 0;
        int n = 1;
    
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                count = count + 1;
            }
        }
        if(count == 2){
            System.out.println("pr");
        }
        else{
            System.out.println("not");
        }

    }
    
    
}
