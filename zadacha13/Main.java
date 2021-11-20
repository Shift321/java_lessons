import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<Integer>();
        for (int j = 0; j < 4; j++) {
            int[] array = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 11 };
            Random rand = new Random();

            for (int i = 0; i < array.length; i++) {
                int randomIndexToSwap = rand.nextInt(array.length);
                int temp = array[randomIndexToSwap];
                array[randomIndexToSwap] = array[i];
                array[i] = temp;
            }
            for (int card = 0; card < array.length; card++) {
                deck.add(array[card]);
            }
        }
        boolean run = true;
        int player = 0;
        int opponent = 0;
        player += deck.remove(0);
        player += deck.remove(0);
        opponent += deck.remove(0);
        opponent += deck.remove(0);
        int botmaxcount = 18;
        boolean playerend = false;
        boolean opponentend = false;
        char anwser = ' ';
        Scanner input = new Scanner(System.in);
        System.out.printf("Добро пожаловать в игру 21 у тебя %d очков!", player);
        while (run) {
            System.out.println(" Хочешь взять еще карту? y/n ");
            anwser = input.next().charAt(0);
            if (anwser == 'y') {
                player += deck.remove(0);
                playerend = false;
                if (player > 21) {
                    System.out.printf("Ты проиграл у тебя %d очков соболезную( ", player);
                    run = false;
                    input.close();

                }
                System.out.printf("Теперь у тебя %d очков", player);
            } else if (anwser == 'n') {
                playerend = true;
            }
            if (opponent <= botmaxcount && opponent != 21) {
                opponent += deck.remove(0);
                System.out.println("Противник взял карту");
                opponentend = false;
                if (opponent > 21) {
                    System.out.printf("У противника %d очков он проиграл , поздравляю с победой ! ", opponent);
                    run = false;
                    input.close();
                }
            }

            else {
                opponentend = true;
            }
            if (playerend && opponentend) {
                System.out.println("Вскрываемся!");
                System.out.printf("У вас %d очков ", player);
                System.out.printf("У противника %d очков ", opponent);
                if (player > opponent) {
                    System.out.println("Вы победили поздравляю !:) ");
                    run = false;
                    input.close();
                } else {
                    System.out.println("Победил ваш противник сожалею !;( ");
                    run = false;
                    input.close();
                }
            }
        }

    }
}
