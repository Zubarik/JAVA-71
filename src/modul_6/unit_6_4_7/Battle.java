package modul_6.unit_6_4_7;

public class Battle {
    private static final int MAX = 5;
    private Monstr[] monstrs;
    private int countPlayrs = 0;

    public Battle() {
        monstrs = new Monstr[MAX];
    }

    public void add(Monstr monster) {
        if (countPlayrs < MAX) {
            monstrs[countPlayrs++] = monster;
        } else {
            System.out.println("No more monsters!");
        }
    }

    private void run() {
        for (int i = 0; i < countPlayrs; i++) {
            if (monstrs[i] != null) {
                monstrs[i].attack();
            }
        }
    }

    public void start() {
        run();
    }
}
