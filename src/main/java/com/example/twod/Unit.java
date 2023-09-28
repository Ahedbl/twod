package com.example.twod;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Unit {
    private Rectangle rect;
    private Color color;

    public Unit(Rectangle rect, Color color) {
        this.rect = rect;
        this.color = color;
    }

    public Rectangle getRect() {
        return rect;
    }

    public Color getColor() {
        return color;
    }
}
