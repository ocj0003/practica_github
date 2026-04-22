import java.util.ArrayList;

public class CalcularPrimos {
    public static void main(String[] args) {
        ArrayList<Integer> numerosPrimos=new ArrayList<Integer>();

        for (int i = 1; i <= 10000; i++) {
            if (esPrimo(i)){
                numerosPrimos.add(i);
            }
        }
        System.out.println("Primos de la lista: "+numerosPrimos);
        System.out.println("Primos de la lista: "+numerosPrimos.size());
    }
    public static boolean esPrimo(int x) {
        if (x < 2) return false;

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}