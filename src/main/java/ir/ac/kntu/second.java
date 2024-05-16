package com.example.demo;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class second extends Application{
    Timeline timeline;
    AnimationTimer timer;
    Double i= Double.valueOf(0);
    @Override
    public void start(Stage stage) throws IOException {
        Group p = new Group();
        Scene scene = new Scene(p);
        stage.setScene(scene);
        final Circle circle = new Circle(20,  Color.rgb(156,216,255));
        circle.setEffect(new Lighting());
        final Text text = new Text (i.toString());
        text.setStroke(Color.BLACK);
        final StackPane stack = new StackPane();
        stack.getChildren().addAll(circle, text);
        stack.setLayoutX(30);
        stack.setLayoutY(30);
        p.getChildren().add(stack);
        stage.show();
//        Timeline timeline = new Timeline();
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.setAutoReverse(true);
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                Integer x=(int)(i/1);
                text.setText(x.toString());
                i+=0.02;
            }
        };
//        KeyValue keyValueY = new KeyValue(stack.scaleYProperty(), 5);
//        Duration duration = Duration.millis(10000);
//        KeyFrame keyFrame = new KeyFrame(duration,keyValueY);
//        timeline.getKeyFrames().add(keyFrame);
//        timeline.play();
        timer.start();
    }

    public static void main(String[] args) {
        launch();
    }
}

