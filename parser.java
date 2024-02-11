import javax.swing.*;
import java.awt.*;

public class parser {

    public static void main(String[] args) {
        form();
    }

    private static JFrame form() {
        JFrame window = new JFrame("VLMX Parser");
        window.setSize(800, 600);
        Color bunker = Color.decode("#111111");
        window.getContentPane().setBackground(bunker);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        window.setVisible(true);
        window.add(search());
        return window;
    }

    public static JTextField search() {
        JLabel seacr_label = new JLabel("Поиск по артикулу");
        seacr_label.setForeground(Color.GREEN);
        seacr_label.setVisible(true);
        JTextField search_list = new JTextField();
        search_list.setBounds(50, 50, 200, 30);
        search_list.setVisible(false);
        return search_list;    
    }
}
