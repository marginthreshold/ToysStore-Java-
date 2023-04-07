package lottery;

import java.util.Random;
import java.util.Scanner;

public class WinProbability {
    private int probability;

    public void setProbability() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте вероятность выигрыша игрушки от 0 до 100");
        try {
            this.probability = sc.nextInt();
            if (this.probability < 0 || this.probability > 100) {
                System.out.println("Неправильно задана вероятность, используем значение по умолчанию 30%");
                this.probability = 30;
            }
        } catch (Exception e) {
            System.out.println("Неправильно задана вероятность, используем значение по умолчанию 30%");
            this.probability = 30;
        }
    }

    public int checkWinLose() {
        Random rand = new Random();
        int chance = rand.nextInt(100) + 1;
        if (chance <= this.probability) {
            System.out.println("Поздравляем, вы выиграли");
            return 1;
        }
        else {
            System.out.println("Извините, вы не выиграли");
            return 0;
        }
    }
}
