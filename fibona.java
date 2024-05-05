public class fibona {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        double count = 10;
        for(int i = 3; i<=count; i++){
            n3 = n2 + n1;
            System.out.println(n3);
            n2 = n1;
            n1 = n3;


        } 
    }
    
}
