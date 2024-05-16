package ir.ac.kntu;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("creating canvas");
        Canvas canvas = new Canvas(1000.0f, 1000.0f);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Group root = new Group(canvas);



//background options
        InputStream stream1=new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\1s.jpg");
        Image image1=new Image(stream1);
        InputStream strLable = new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\dr.png");
        Image labal = new Image(strLable);
        InputStream blS = new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\black.png");
        Image bl = new Image(blS);
        InputStream stomachS = new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\manba.png");
        Image stomach = new Image(stomachS);
        InputStream glasS = new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\glass.png");
        Image glas = new Image(glasS);
        Pane pane=new Pane(root);
        gc.drawImage(image1,10,70,200,170);
        gc.drawImage(image1,603,390,190,300);
        gc.drawImage(labal,503,50,300,100);
        gc.drawImage(bl,503,120,300,280);
        gc.drawImage(stomach,220,100,280,560);
        gc.setFont(new Font("man",37));
        gc.fillText("level",625,450);
        gc.fillText("speed",625,530);
        gc.fillText("virus",625,620);
        gc.setFont(new Font("man",25));
        gc.fillText("TOP",30,120);
        gc.fillText("SCORE",30,180);
        gc.drawImage(glas,10,400,200,260);

//background
        InputStream stream = new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\3.jpg");
        Image image = new Image(stream);
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundimage);
        pane.setBackground(background);


//virus
        Integer i=0;
        Circle circle=new Circle(100,100,100,Color.BLUE);
        circle.centerXProperty();

        Timeline timeline=new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.getKeyFrames().addAll(new KeyFrame(Duration.ZERO,new KeyValue(circle.translateXProperty(),100)),new KeyFrame(new Duration(40),new KeyValue(circle.centerXProperty(), 100)));
//            InputStream h=new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\redthree.png");
//            Image red=new Image(h);
//            gc.drawImage(red,10,500,60,60);
        pane.getChildren().addAll(circle);

//
        timeline.play();
        Scene scene= new Scene(pane,800,700);
            stage.setScene(scene);
            stage.show();


    }

    private InputStream showRedTwo() throws FileNotFoundException {
        InputStream stream1=new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\redthree.png");
        return stream1;
    }

    private InputStream showRedThree() throws FileNotFoundException {
        InputStream stream1=new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\redtwo.png");
        return stream1;
    }

    private InputStream showRedOne() throws FileNotFoundException {
        InputStream stream1=new FileInputStream("C:\\Users\\Mr Pasha\\Desktop\\New folder (2)\\redone.png");
        return stream1;
    }

    public static void main(String[] args) {
        launch();
    }
}