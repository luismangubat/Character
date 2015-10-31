/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import static environment.Utility.random;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Luis
 */
class MultipleBall {  
    { 
        size = 3;
        x = 900;
        y = 10;
        
    } 
    
    public MultipleBall (int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size + 1;
               
        
    }
    public void draw(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.fillRect(x, y, size * 5, size );
                
                
    }
    
    private int x;
    private int y;
    private int size;

    void setX(int xChange) {
        this.x = this.x - ((xChange * size));
    }

    int getX() {
        return this.x; 
    }

    int getSize() {
        return this.size;
        
    }

    void resetBall() {
        this.x = 900;
        this.y = random(580);
        this.size = random(3);
    }

  
}
    

