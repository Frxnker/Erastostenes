public class Eratostenes {
    public static void main(String[] args) {
        System.out.println("Dime un número para saber todos los números primos entre 1 y ese número:");
        int N = Integer.parseInt(System.console().readLine());
        int a = 0;

        for (int i = 2; i < N; i++) {
            boolean esPrimo = true;
            a = i;
            if (a % i == 0) {
                esPrimo = false;
            } else {
                esPrimo = true;
                System.out.println(a);
            }
        }
    }
}
