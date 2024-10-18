public class CharArr {
    public static void main(String[] arg){
        char [] a = {'1', '2', '3'};
        int product = 1;
        for(int i = 0; i < 3; i++){
            product *= a[i];
        }
        System.out.println(product);
    }
    
}
