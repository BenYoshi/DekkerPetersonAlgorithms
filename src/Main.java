public class Main {

    public static void main(String[] args) {
//        runRegular();
//        runDekkers();
//        runPetersons();
    }

    private static void runRegular() {
        while (true) {
            new Cook();
            new Savage();
        }
    }

    public static void runDekkers(){
        T t = new T();
        new CookDekker(t);
        new SavageDekker(t);
    }

    public static void runPetersons(){
        T t = new T();
        new CookPeterson(t);
        new SavagePeterson(t);
    }
}

class T {
    boolean t1WantsToEnter = false;
    boolean t2WantsToEnter = false;
    int favoredThread;
}

class Pot {
    public static int fullness;
}