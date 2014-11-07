package gui;
import perso.Personne;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.*;
/**
 * Created by goubin on 07/11/14.
 */
public class Fenetre extends JFrame {
    /** a label for the name */
    private JLabel label;
    /** a textfield for the name */
    private JTextField text;
    /** a button to perform an action: e.g. say hello (TBD) */
    private JButton button;
    private JList list;
    public Fenetre(List<Personne> personneList) {
        String[] stuff = new String[personneList.size()];
        for(int i=0;i<stuff.length;i++) {
            stuff[i] = personneList.get(i).toString();
        }
        initComponent(stuff);
//works with new JList(String[]);
    }


    private void initComponent(String[] personneList) {
        list = new JList(personneList);

        label = new JLabel("Name :");
        text = new JTextField(20);
        button = new JButton("Confirm");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPopupName();
            }
        });
        this.setLayout(new BorderLayout());
        this.add(BorderLayout.NORTH, list);
        this.add("West", label);
        this.add("Center", text);
        this.add("East", button);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    private void showPopupName() {
        label.setText("Name : " + text.getText());
    }
}
