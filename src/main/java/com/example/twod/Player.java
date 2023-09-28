package com.example.twod;

import javafx.scene.shape.Rectangle;

import java.util.Objects;

public class Player {
    private Rectangle rect;
    private double accelerationY;
    private double accelerationX;
    private double speedY;
    private double speedX;

    Player (Rectangle rect){
        this.rect = rect;
        accelerationX = 5;
        accelerationY = 3;
        speedX = 0;
        speedY = 0;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void Movement(String keyPressed){
        if(Objects.equals(keyPressed, "DOWN")){rect.setY(rect.getY()+ 10);}
        if(Objects.equals(keyPressed, "UP")){rect.setY(rect.getY()- 3);}
        if(Objects.equals(keyPressed, "LEFT")){rect.setX(rect.getX()- 3);}
        if(Objects.equals(keyPressed, "RIGHT")){rect.setX(rect.getX()+ 3);}
    }
    private void yMove(){

    }
}
