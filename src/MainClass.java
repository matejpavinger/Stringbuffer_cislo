import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer(9);
        Scanner scanner = new Scanner(System.in);
        boolean konec = false;
        while (konec==false) {
            System.out.println("zadejte " + (buffer.length()+1) + ". číslo:");
            char c = scanner.next().charAt(0);
            konec = Character.toString(c).matches("-");
            if(Character.toString(c).matches("-")){
                if(buffer.length()!=9){System.out.println("Nezapsal jsi 9 čísel."); return;}
                else{konec=true;}
            }
            else if(!Character.toString(c).matches("[0-9]")) {
                System.out.println("Zadaný znak není číslo.");
            }
            else{
                buffer.append(c);
            }
        }
        System.out.println("+420 " + buffer.substring(0, 3) + " " + buffer.substring(3, 6) + " " + buffer.substring(6, 9));
    }
}
