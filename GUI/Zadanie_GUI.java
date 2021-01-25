package GUI;

import Logika_Biznesowa.Logika;
import Logika_Biznesowa.Obserwator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie_GUI implements ActionListener {

    JFrame frame = new JFrame();
    JTextField WynikTekst = new JTextField();
    Logika ObslugaLogiki = new Logika(this);
    JTextField PlikTekst = new JTextField();

    public Zadanie_GUI(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel Elementy = new JPanel();
        Elementy.setLayout(new BoxLayout(Elementy, BoxLayout.PAGE_AXIS));
        Elementy.add(Box.createVerticalStrut(10));
        JLabel Plik = new JLabel("Plik");
        Elementy.add(Plik);
        PlikTekst.setPreferredSize(new Dimension(200,30));
        Elementy.add(PlikTekst);
        JLabel Wynik = new JLabel("Wynik");
        Elementy.add(Wynik);

        WynikTekst.setPreferredSize(new Dimension(200,30));
        Elementy.add(WynikTekst);
        JButton Enter = new JButton("Enter");
        Elementy.add(Enter);
        Elementy.setBorder(BorderFactory.createEmptyBorder(10,10,10,50));
        Enter.addActionListener(this);

        frame.setLayout(new BorderLayout());
        frame.add(Elementy,BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
        frame.repaint();

    }

    public void OdswiezWynik(boolean tester){
        if (tester) WynikTekst.setText("Pozytywny");
        else WynikTekst.setText("Negatywny");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ObslugaLogiki.Metoda(PlikTekst.getText());
    }
}
