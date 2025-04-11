public class EjerciciosRecursivos {
    
    public int fibonacci(int n){
        if(n <= 1){
            return n;
        }else if (n == 1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    /*
     * Método que devuelve la suma de los numeros
     * que contiene n
     * n = 5
     * 5 + 4 + 3 + 2 + 1 = 15 
     * 
     * @param n numero a ser sumado
     * @return retorna cada suma. para n = 5  retorna 15
     */
    public int sumaConsecutivos(int n){
        if(n == 1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n + resultadoParcial;
        return resultado;
    }


    /*
     * Escribe una función recursiva que calcule la potencia
     * de un número base elevado a un exponente entero.
     * Por ejemplo, si base es 2 y exponente es 3;
     * la función debe devolver 2^3 = 8
     */

    public int getPotencia(int base, int exponente) {
        if(exponente == 0){
            return 1;
        } else {
            return base * getPotencia(base, exponente - 1);

        }
    }

    /*
     * Si el número es menor que 10, lo cual significa que solo tiene 
     * un dígito, se devuelve el número mismo. En caso contrario, 
     * se extrae el último dígito utilizando el operador módulo 
     * % y se calcula el los dígitos menos el ultimo utilizando
     * la división entera /10. Luego, se realiza una llamada 
     * recursiva a sumaDigitos con el resto y se suma el 
     * último dígito
     */

    public int sumaDigitos(int n){
        if(n < 10){
            return n;
        } else{
            int ultimoDigito = n % 10;
            int numerosRestantes = n / 10;
            return sumaDigitos(numerosRestantes) 
                    + ultimoDigito;
        }
    }

    public static void imprimirDescendente(int n) {
        if (n < 1) {
            return;
        } else {
            System.out.print(n + " ");
            imprimirDescendente(n - 1);
        }
    }

    public static int reverso(int n, int invertido) {
        if (n == 0) {
            return invertido;
        }
        return reverso(n / 10, invertido * 10 + n % 10);
    }
}      
    
