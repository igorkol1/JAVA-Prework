
public class Main15 {

    public static void main(String[] args) {
        int x = 8;
        int factorial = 1;
        // for(int i = 1; i<=x; i++){
        //     factorial*=i;
        // }
        int i  = 1;
        while(i<=x){
            factorial*=i;
            i++;
        }
        System.out.println("Silnia "+x+"! to "+factorial);
    }

}
