package com.example.twod;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class View {
    private Pane root;
    private Rectangle unit;

    public View(Pane root, Rectangle unit) {
        this.root = root;
        this.unit = unit;
    }
    public View() {
        this.root = new Pane();
        this.unit = new Rectangle(20,20, Color.BLUE);
        root.getChildren().add(unit);
    }

    public Pane getRoot() {
        return root;
    }

    public void updateUnit(){
        unit.setX(unit.getX()+1);
    }
}
