/**
 * Created by Benny on 3/1/2017.
 */
public class SavageDekker implements Runnable {

    T t;

    public SavageDekker(T t) {
        this.t = t;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(true){
            t.t2WantsToEnter = true;

            while(t.t1WantsToEnter){
                if (t.favoredThread == 1){
                    t.t2WantsToEnter = false;
                    while(t.favoredThread == 1);
                    t.t2WantsToEnter = true;
                }
            }

            if (Pot.fullness > 0) {
                eatFromPot();
            }

            t.favoredThread = 1;
            t.t2WantsToEnter = false;
        }
    }

    private void eatFromPot() {
        Pot.fullness--;
        System.out.println("The savage has eaten one portion. The pot has " + Pot.fullness + " portions left.");
    }
}
