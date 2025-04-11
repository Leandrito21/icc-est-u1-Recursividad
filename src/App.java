public class App {
    public static void main(String[] args) throws Exception {

        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();
        int resultadoFibonacci = ejercicios.fibonacci(5); 
        System.out.println("Fibonacci(6) = " + resultadoFibonacci);

        // Llamar al método sumaConsecutivos
        int resultadoSuma = ejercicios.sumaConsecutivos(5); 
        System.out.println("Suma consecutivos(5) = " + resultadoSuma);

        int resultadoExponente = ejercicios.getPotencia(2, 2);
        System.out.println("Multiplicación de consecutivos = " + resultadoExponente);

        int resultadoDigitos = ejercicios.sumaDigitos(1234);
        System.out.println("Suma de digitos del número dado = " + resultadoDigitos);
    }

    /* 
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("resultado: " + resultadoFinal);
    }

    public static int factorial(int n) {
        if(n == 0){
            System.out.println("Alcancé el caso base");
            return 1;
            
        }
        int resultado = n * factorial(n-1);
        System.out.println("Calculando factorial de: " + n + " factorial ("+ (n-1)+" - 1)");
        return resultado;

    }
    */
    
}
//los metedos estaticos solo pueden llarmar a estaticos, amenos que esten instaciados a una clase
