/**
 * Created by zal on 10.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello player");
        startGame();
    }

    public static void startGame() {
        Field.initField();
        Field.showField();
    }
}
