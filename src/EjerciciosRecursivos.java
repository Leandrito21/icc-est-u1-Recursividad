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
}
