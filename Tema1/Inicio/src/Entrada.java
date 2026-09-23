public class Entrada {

    /**
     * Clase dedicada a la ejecucion del programa
     */
    // comienzo de clase
    // para definir metodos
    /*
    Probando linea multiple para escribir
    con dos lineas

     */

    // TODO Prestar atencion a las clases del profesor Borja
    public static void main(String[] args) {

        System.out.println("Mi primer programa");
        // variable sirve para guardar un dato y utlizarlo -> tipo, vombre de variable y valor
        // segun tel tipo de dato que guardo: palabras/numeros/ boolean
        // segun el origen del dato que tengo guardado: primitivos / complejos

        String nombre = "Abraham";
        String apellidos = "Socorro";
        String apellidos1 = "Liria";
        char letra = 'A';
        int edad = 27;
        double altura = 1.80;
        float alturafloat = 1.80f;
        boolean acierto = false;



        //%s -> palabra
        // %d -> numero sin decimales
        // %f -> numero con decimales
        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años", nombre, apellidos, apellidos1, edad);



    }

}
