package chess;


import chess.panels.GamePanelAI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {

    public Menu() {
        super("Chess");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font f = new Font(Font.DIALOG, Font.PLAIN, 24);
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(15, 40, 15, 40);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        this.add(menuPanel);

        JLabel name = new JLabel("Wanna play chess?");
        JButton ai = new JButton("Play with AI!");

        name.setFont(f);
        ai.setFont(f);

        menuPanel.setBackground(Color.decode("#9fc5e8"));


        ai.setBackground(Color.decode("#ebb67e"));
        ai.setOpaque(true);




        ai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameFrame(new GamePanelAI());
                setVisible(false);
                dispose();
            }
        });

        menuPanel.add(name, c);
        menuPanel.add(ai, c);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
