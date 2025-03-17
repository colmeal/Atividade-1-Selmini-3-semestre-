
import java.util.ArrayList;
import java.util.Scanner;

public class AnalisarSoma {
    public static boolean verifica(ArrayList<Integer> numeros) {
        for (int i = 2; i < numeros.size(); i++) {
            for (int j = 0; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (numeros.get(i) == numeros.get(j) + numeros.get(k)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números:");
        int n = scanner.nextInt();
        
        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros.add(scanner.nextInt());
        }
        
        if (verifica(numeros)) {
            System.out.println("Existe um elemento que é a soma de dois anteriores.");
        } else {
            System.out.println("Nenhum elemento é a soma de dois anteriores.");
        }
        
        scanner.close();
    }
}