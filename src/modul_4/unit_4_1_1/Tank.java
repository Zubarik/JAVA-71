package modul_4.unit_4_1_1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tank {
    private int mov;

    public Tank() {
    }

    public void goForward(int i) {
        mov+=i;
    }

    public void printPosition() {
        System.out.println("The Tank is at "+mov+" now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
