package labelteste;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LabelTeste extends JFrame {

    public static void main(String args[]) {
        LabelTeste l1 = new LabelTeste();
        l1.teste();

    }

    public void teste() {

        JLabel label = new JLabel("Testeeee");
        JLabel label2 = new JLabel("Testeeee");
        JLabel label3 = new JLabel("Testeeee");
        JLabel label4 = new JLabel("Testeeee");
        JLabel label5 = new JLabel("Testeeee");
        JLabel label6 = new JLabel("Testeeee");

        JButton jb = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");

        setLayout(new GridLayout(2, 3));

        add(label);
        add(jb);
        add(label2);
        add(jb2);
        add(label3);
        add(jb3);
        add(label4);
        add(jb4);
        add(label5);
        add(jb5);
        add(label6);
        add(jb6);

        setTitle("Tela de cornos");
        setSize(500, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
