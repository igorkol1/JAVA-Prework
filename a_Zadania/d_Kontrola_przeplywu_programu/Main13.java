
public class Main13 {

    public static void main(String[] args) {
        int points = -102;
        String mark;
        if(points<0){
            System.out.println("Liczba punktów mniejsza niż 0.");
            return;
        }else if(points>100){
            System.out.println("Liczba punktów większa niż 100.");
            return;
        }
        if(points<=39){
            mark = "ocena niedostateczna";
        }else if (points<=54) {
            mark = "ocena dopuszczająca";
        }else if(points<=69){
            mark = "ocena dostateczna";
        }else if(points<=84){
            mark = "ocena dobra";
        }else if(points<=98){
            mark = "ocena bardzo dobra";
        }else{
            mark = "ocena celująca";
        }
        System.out.println("Wynik: "+mark);
    }

}
