/**
 * Created by Benny on 2/26/2017.
 */
public class CookPeterson implements Runnable {

    T t;

    public CookPeterson(T t) {
        this.t = t;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while( true ){
            t.t1WantsToEnter = true;
            t.favoredThread = 2;

            while(t.t2WantsToEnter && t.favoredThread == 2);

            if (Pot.fullness == 0) {
                fillPot();
            }

            t.t1WantsToEnter = false;
        }
    }

    private void fillPot() {
        Pot.fullness = 10;
        System.out.println("The cook has refilled the pot to " + Pot.fullness + " portions.");
    }
}
