package modul_8.unit_8_2_1;

public class Player extends Human {
    Backpack backpack;

    public Player(String name) {
        super(name + " the Player");
        this.backpack = new Backpack();
    }

    class Backpack {
        private String staff = "";

        void put(String thing) {
            staff += thing + ",";
        }

        @Override
        public String toString() {
            if (staff.equals("")) {
                return "the backpack is empty";
            }
            return staff.substring(0, staff.length() - 1) + " in the backpack";
        }
    }

    public void take(String thing) {
        backpack.put(thing);
    }
}
