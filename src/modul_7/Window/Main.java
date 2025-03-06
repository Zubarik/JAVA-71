package modul_7.Window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // создаем окно
        JFrame jf = new JFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 300);
        jf.addMouseListener(new SimpleClickListener());
        // и показываем его
        jf.setVisible(true);
    }
}
