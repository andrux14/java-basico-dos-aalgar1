public class SumatoriaNumerosWhile {
    public static void main(String[] args) {

        int i=1,a=1,b=2, contador=0;
        while (i<10){

            contador= a+b;
            System.out.println(a+ " + " + b + " = " + contador);
            a=contador;
            b++;
            i++;

        }
        System.out.println("La suma de los 10 primeros numeros es: " + contador);
    }
}
