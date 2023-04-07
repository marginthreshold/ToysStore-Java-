package lottery;


import boxes.BearToyBox;
import boxes.UnicornToyBox;
import toys.BearToy;
import toys.UnicornToy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private BearToyBox bearToyBox;
    private UnicornToyBox unicornToyBox;

    public Lottery(BearToyBox bearToyBox, UnicornToyBox unicornToyBox) {
        this.bearToyBox = bearToyBox;
        this.unicornToyBox = unicornToyBox;
    }

    public void playLottery() throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        WinProbability winProbability = new WinProbability();
        int checkwin = 0;
        String play = "play";
        int num = 1;
        while (true) {
            System.out.println("\nЕсли вы не хотите продолжать лотерею, введите stop и нажмите Enter");
            play = sc.next();
            if (play.equals("stop")){
                System.out.println("Лотерея окончена");
                System.out.println(this.bearToyBox);
                System.out.println(this.unicornToyBox);
                System.exit(1);
            }
            num = rand.nextInt(2) + 1;
            if (num == 1) {
                BearToy lotteryBearToy = this.bearToyBox.getToyFromBox();
                winProbability.setProbability();
                checkwin = winProbability.checkWinLose();
                if (checkwin==1){
                    System.out.println(lotteryBearToy);
                    FileWriter writer = new FileWriter("WonToys.csv",true);
                    BufferedWriter buffer = new BufferedWriter(writer);
                    buffer.write("\n"+lotteryBearToy);
                    buffer.close();
                    writer.close();
                } else {
                    this.bearToyBox.addToyToBox(lotteryBearToy);
                }

            } else {
                UnicornToy lotteryUnicornToy = this.unicornToyBox.getToyFromBox();
                winProbability.setProbability();
                checkwin = winProbability.checkWinLose();
                if (checkwin==1){
                    System.out.println(lotteryUnicornToy);
                    FileWriter writer = new FileWriter("WonToys.csv",true);
                    BufferedWriter buffer = new BufferedWriter(writer);
                    buffer.write("\n"+lotteryUnicornToy);
                    buffer.close();
                    writer.close();
                } else {
                    this.unicornToyBox.addToyToBox(lotteryUnicornToy);
                }
            }
        }
    }
}
