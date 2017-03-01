/**
 * Created by Benny on 3/1/2017.
 */
public class CookDekker implements Runnable {

    T t;

    public CookDekker(T t) {
        this.t = t;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(true){
            t.t1WantsToEnter = true;

            while(t.t2WantsToEnter){
                if (t.favoredThread == 2){
                    t.t1WantsToEnter = false;
                    while(t.favoredThread == 2);
                    t.t1WantsToEnter = true;
                }
            }

            if (Pot.fullness == 0) {
                fillPot();
            }

            t.favoredThread = 2;
            t.t1WantsToEnter = false;
        }
    }

    private void fillPot() {
        Pot.fullness = 10;
        System.out.println("The cook has refilled the pot to " + Pot.fullness + " portions.");
    }
}
