/**
 * Created by Benny on 2/26/2017.
 */
public class Cook implements Runnable {

    public Cook() {
        new Thread(this).run();
    }

    @Override
    public void run() {
        if (Pot.fullness <= 0) {
            fillPot();
        }
    }

    private void fillPot() {
        Pot.fullness = 10;
        System.out.println("The cook has refilled the pot to " + Pot.fullness + " portions.");
    }
}
