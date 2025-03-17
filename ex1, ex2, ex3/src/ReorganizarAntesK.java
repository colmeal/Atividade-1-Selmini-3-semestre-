import java.util.ArrayList;
import java.util.Scanner;

//EX3

public class ReorganizarAntesK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }

        System.out.print("Digite o valor de k: ");
        int k = sc.nextInt();

        reorganizarArray(A, k);

        System.out.println("Reorganizado: " + A);
        sc.close();
    }

    public static void reorganizarArray(ArrayList<Integer> A, int k) {
        int i = 0, j = 0;
        while (j < A.size()) {
            if (A.get(j) <= k) {
                int temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
                i++;
            }
            j++;
        }
    }
}