/**
 * Created by Benny on 2/28/2017.
 */
public class SavagePeterson implements Runnable {

    T t;

    public SavagePeterson(T t) {
        this.t = t;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while( true ){ // put condition here
            t.t2WantsToEnter = true;
            t.favoredThread = 1;

            while(t.t1WantsToEnter && t.favoredThread == 1);

            if (Pot.fullness > 0) {
                eatFromPot();
            }

            t.t2WantsToEnter = false;
        }
    }

    private void eatFromPot() {
        Pot.fullness--;
        System.out.println("The savage has eaten one portion. The pot has " + Pot.fullness + " portions left.");
    }
}
