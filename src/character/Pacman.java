/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Luis
 */
public class Pacman {

    public Pacman(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        mouthWidth = 80;
        int ballChange = 50;
    }

    public void draw(Graphics graphics) {
//        graphics.drawRect(x, y, 200, 200);
//      start drawing
//        graphics.setColor(new Color (245, 94, 177));
//        graphics.fillOval(this.x, this.y, 200, 200);
        graphics.setColor(new Color(235, 240, 0));
        graphics.fillArc(x, y, width, height, mouthWidth / 2, 360 - (mouthWidth));

//        graphics.setColor(new Color(235, 240, 0));
//        graphics.fillOval(x +  500, y + 150, 100, 100);
//        graphics.setColor(new Color(235, 240, 0));
//        graphics.fillOval(800, 250, 100, 100);
        
//        graphics.setColor(Color.red);
//        graphics.fillOval(x + 200, y + 50, MovingBall + 50, MovingBall + 50);
//        graphics.setColor(Color.yellow);
//        graphics.fillOval(100, 250, 100, 100);
///        
    
        

    }
    private int mouthWidth;
    private int x;
    private int y;
    private int width;
    private int height;
    private int MovingBall;

   public void setMouthWidth(int width) {
       this.mouthWidth = width;
    }
//   public void setMovingBall (int width) {
//       this.MovingBall = width;
//   }

    void setX(int pokemonX) {
    }

}
