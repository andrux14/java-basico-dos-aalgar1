public class SumatoriaNumerosFor {
    public static void main(String[] args) {

        int i,a=1,b=2, contador=0;
        for (i=1; i<10; i++){

        contador= a+b;
            System.out.println(a+ " + " + b + " = " + contador);
            a=contador;
            b++;

        }
        System.out.println("La suma de los 10 primeros numeros es: " + contador);
    }
}
