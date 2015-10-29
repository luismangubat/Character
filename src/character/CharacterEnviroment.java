/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Luis
 */
class CharacterEnviroment extends Environment {

    private Pacman pokemon, fred;
    private int width = 80;
    private int widthChange = -1;
    private Ball ball;
    private int ballX;
    private Ball2 ball2;
    private int ballX2;

    public CharacterEnviroment() {

        pokemon = new Pacman(100, 100, 400, 400);
        ball = new Ball(600, 250, 100, 100);
        ball2 = new Ball2(600, 250, 100, 100);
        this.setBackground(Color.black);

    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {
        if (pokemon != null) {
            if (width <= 0) {
                widthChange = +8;
            } else if (width >= 80) {
                widthChange = -8;
            }
            width = width + widthChange;
            pokemon.setMouthWidth(width);
        }

        if (fred != null) {
            width = width + widthChange;
            fred.setMouthWidth(width);
        }

        if (ball != null) {
            if (ballX >= 160) {
                ballX = ballX - 5;
            } else {
                ballX = 900;
            }

            ball.setX(ballX);
        }
        if (ball2 != null) {
            if (ballX >= 200) {
                ballX = ballX - 5;
            } else {
                ballX = 900;
            }
        }

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (pokemon != null) {
            pokemon.draw(graphics);
        }
        if (ball != null) {
            ball.draw(graphics);
        }
        if (ball2 != null) {
            ball2.draw(graphics);
        }
    }

}
