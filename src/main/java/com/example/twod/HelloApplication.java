package com.example.twod;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static int WIDTH = 800;
    public static int HEIGHT = 800;
    private Pane gameLayer;
    private Pane uiLayer;
    private Pane backgroundLayer;
    private Rectangle player;
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        backgroundLayer = new Pane();
        gameLayer = new Pane();
        uiLayer = new Pane();

        backgroundLayer.setPrefSize(800, 600);
        gameLayer.setPrefSize(800, 600);
        uiLayer.setPrefSize(800, 600);
        Logic.mapCreator(backgroundLayer);

        player = new Rectangle(50, 50, Color.RED);
        Player p1 = new Player(player);
        gameLayer.getChildren().add(p1.getRect());

        root.getChildren().addAll(backgroundLayer, gameLayer,  uiLayer);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
        });
        scene.setOnKeyReleased(event -> {
            KeyCode keyCode = event.getCode();
        });
        primaryStage.setScene(scene);
        primaryStage.show();
        startGameLoop();
    }

    private void startGameLoop() {
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                // Update game logic
                update();

            }
        };

        gameLoop.start();
    }

    private void update() {
        // Update game logic here
        // For example, you can update the player's position
    }



    public static void main(String[] args) {
        launch(args);
    }
}
