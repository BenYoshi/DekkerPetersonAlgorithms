/**
 * Created by Benny on 2/26/2017.
 */
public class Savage implements Runnable {

    public Savage() {
        new Thread(this).run();
    }

    @Override
    public void run() {
        if (Pot.fullness > 0) {
            eatFromPot();
        }
    }

    private void eatFromPot() {
        Pot.fullness--;
        System.out.println("The savage has eaten one portion. The pot has " + Pot.fullness + " portions left.");
    }
}
