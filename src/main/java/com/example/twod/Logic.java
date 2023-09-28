package com.example.twod;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Logic {

    public static void mapCreator(Pane map){
       Canvas canvas = new Canvas(800, 600);
       System.out.println(map.getHeight());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.GREEN);
        gc.fillRect(0,0,100,600);
        gc.fillRect(0,400,400,200);
        map.getChildren().add(canvas);
    }
}
