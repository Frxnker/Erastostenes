public class Eratostenes {
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 1000.");
        int n;
        boolean Primo = true;

        for (n = 2; n < 1000; n++) {
            for (int i = 2; i < n; i++) {

                if (n % i == 0) Primo = false;
            }
                if (Primo) System.out.print(" " + n + " ");
                Primo = true;
        }
    }
}
