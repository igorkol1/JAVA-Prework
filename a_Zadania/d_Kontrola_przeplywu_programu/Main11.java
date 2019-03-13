
public class Main11 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    row += "* ";
                }else {
                    row += j+1+" ";
                }
            }
            System.out.print(row + "\n");
        }
        for (int i = n; i > 0; i--) {
            String row = "";
            for (int j = n; j > 0; j--) {
                if(j>n-i){
                    row += "* ";
                }else {
                    row += n-j+1+" ";
                }
            }
            System.out.print(row + "\n");
        }
    }

}
