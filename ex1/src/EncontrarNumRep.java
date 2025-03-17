import java.util.ArrayList;
import java.util.Scanner;

public class EncontrarNumRep {
    public static int encontrar(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    return numeros.get(i);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Quantidade de números:");
        int n = scanner.nextInt();
        
        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros.add(scanner.nextInt());
        }
        
        int repetido = encontrar(numeros);
        System.out.println("    Número repetido: " + repetido);
        
        scanner.close();
    }
}
