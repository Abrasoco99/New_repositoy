import java.util.Scanner;

public class PracticaOperadores {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce primer numero:");
        int nota1 = lector.nextInt();

        System.out.println("introuce segundo numero:");
        int nota2 = lector.nextInt();

        int suma = nota1+nota2;
        int resta = nota1-nota2;
        int multiplicacion = nota1*nota2;
        int division = nota1/nota2;
        int modulo = nota1%nota2;
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+division);
        System.out.println("el resto es: "+modulo);
    }
}
