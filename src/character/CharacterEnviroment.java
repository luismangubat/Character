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
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
class CharacterEnviroment extends Environment {

    private ArrayList<MultipleBall> balls;

    private Pacman pokemon, fred;
    private int width = 80;
    private int widthChange = -1;
    private Ball ball;
    private int ballX;
    private Ball2 ball2;
    private int ballX2;
    private Ball3 ball3;
    private int ballX3;
    private int pokemonX;
    private int xChange;

    public CharacterEnviroment() {

        pokemon = new Pacman(100, 100, 400, 400);
        ball = new Ball(600, 250, 100, 100);
        ball2 = new Ball2(600, 250, 100, 100);
        this.setBackground(Color.black);
        ball3 = new Ball3(600, 250, 100, 100);

        balls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            balls.add(new MultipleBall(random(900), random(580), random(3)));

        }

    }

    public int random(int value) {
        return (int) (Math.random() * value);

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
                ballX = ballX - 7;
            } else {
                ballX = 900;
            }

            ball.setX(ballX);
        }
        if (ball2 != null) {
            if (ballX2 == 0) {
                ballX2 = 530;
            }
            if (ballX2 >= 160) {
                ballX2 = ballX2 - 7;
            } else {
                ballX2 = 900;
            }
        }
        ball2.setX(ballX2);

        if (ball3 != null) {
            if (ballX3 == 0) {
                ballX3 = 720;
            }
            if (ballX3 >= 160) {
                ballX3 = ballX3 - 7;
            } else {
                ballX3 = 900;
            }
            ball3.setX(ballX3);
        }

        if (pokemon != null) {
            if (pokemonX >= 160) {
                pokemonX = pokemonX + 3;
            } else {
                pokemonX = 900;
            }
            pokemon.setX(pokemonX);
        }
        if (balls != null) {
            xChange = 10;
            balls.stream().forEach((theBall) -> {
            theBall.setX(xChange);
            
            if (theBall.getX() <= 0 - (theBall.getSize() * 5)) {
                theBall.resetBall();
            }
            
        });
            
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
        balls.stream().forEach((theBall) -> {
            theBall.draw(graphics);
        });

        if (pokemon != null) {
            pokemon.draw(graphics);
        }
        if (ball != null) {
            ball.draw(graphics);
        }
        if (ball2 != null) {
            ball2.draw(graphics);
        }
        if (ball3 != null) {
            ball3.draw(graphics);
        }

    }
}
