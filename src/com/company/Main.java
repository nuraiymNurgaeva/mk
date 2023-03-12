package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        JPanel polka = new JPanel(new GridBagLayout());
        window.add(polka);

        JLabel logo = new JLabel("Shoro");
        polka.add(logo);
        JTextField textField = new JTextField(13);
        polka.add(textField);
        JButton button = new JButton("Go");
        polka.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com/search?q="+textField.getText()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });


        window.setVisible(true);
        window.setSize(400, 400);
    }
}
