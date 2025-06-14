package com.soft.simple_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePanel extends JPanel {

    //Constants
    private final int SCREEN_WIDTH = 500;
    private final int SCREEN_HEIGHT = 600;
    private final int BLOCK_SIZE = 75;
    private int x = 1;
    private int y = 1;

    //Game State
    private int speedX = 2;
    private int speedY = 2;
    private Color randomColor = Color.BLACK;

    //Utilities
    private Timer gameTimer;
    private Random random = new Random();

    public GamePanel() {
        Dimension screenSize = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
        setPreferredSize(screenSize);

        int targetFPS = 60;
        gameTimer = new Timer(1000 / targetFPS, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
                repaint();
            }
        });
        gameTimer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(randomColor);
        g.fillRect(x, y, BLOCK_SIZE, BLOCK_SIZE);
    }

    public void update() {
        boolean hitBoundary = false;

        if (x <= 0 || x >= SCREEN_WIDTH - BLOCK_SIZE) {
            speedX *= -1; // reverse direction
            hitBoundary = true;
        }

        if (y <= 0 || y >= SCREEN_HEIGHT - BLOCK_SIZE) {
            speedY *= -1;
            hitBoundary = true;
        }

        if (hitBoundary) {
            randomColor = new Color(random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256));
        }

        x += speedX;
        y += speedY;
    }

    @Override
    public void removeNotify() {
        super.removeNotify();
        if (gameTimer != null) {
            gameTimer.stop();
        }
    }
}
