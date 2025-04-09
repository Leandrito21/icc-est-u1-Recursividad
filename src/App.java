public class App {
    public static void main(String[] args) throws Exception {
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
}
//los metedos estaticos solo pueden llarmar a estaticos, amenos que esten instaciados a una clase
