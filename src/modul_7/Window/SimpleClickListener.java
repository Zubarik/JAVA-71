package modul_7.Window;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SimpleClickListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked аt " + e.getX() + "," + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
