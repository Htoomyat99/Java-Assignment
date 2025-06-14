package com.soft.simple_game;

import javax.swing.*;

public class GameFrame {
    private JFrame frame;

    public GameFrame(GamePanel gamePanel) {
        frame = new JFrame();
        frame.add(gamePanel);
        frame.setTitle("Simple Game");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       frame.setResizable(false);
    }
}
