import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] endmassive = new int[size];
        for (int i = 0; i < size; i++) {
            endmassive[i] = input.nextInt();

        }
        int size_2 = input.nextInt();
        int[] endmassive_2 = new int[size_2];
        for (int i = 0; i < size_2; i++) {
            endmassive_2[i] = input.nextInt();

        }
        int[] last_massive = new int[size + size_2];
        for (int i = 0; i < size; i++) {
            last_massive[i] = endmassive[i];

        }
        for (int i = 0; i < size_2; i++) {
            last_massive[i + size] = endmassive_2[i];

        }
        for (int i : last_massive) {
            System.out.print(i);
            System.out.print(" ");

        }
    }
}