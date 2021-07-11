import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Insert a number ");
        int A =sn.nextInt();
        int total = 0;
       while(A > 0){

        int resto = (A % 2) ;
        int divDos = (A / 2);

        System.out.println("Valor binario " + resto + " - Resultado de la division " + divDos);

        total += (resto);
        String totalReal = String.valueOf(total);

        A = divDos;
       System.out.println(totalReal);
       }

    }


}
