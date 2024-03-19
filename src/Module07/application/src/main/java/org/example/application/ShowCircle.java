package org.example.application;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.stage.Stage;


public class ShowCircle extends Application

{


    @Override

    public void start(Stage primaryStage)

    {

        Circle circle = new Circle();

        circle.setCenterX(100);

        circle.setCenterY(100);

        circle.setRadius(50);

        circle.setStroke(Color.BLACK);

        circle.setFill(Color.BLUEVIOLET);


//creare a pane to hold the circle

        Pane pane = new Pane();

        pane.getChildren().add(circle);


//create a scene and place the pane in the stage with a specified size

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("SHOW CIRCLE");


//place the scene in the stage

        primaryStage.setScene(scene);

//display primaryStage

        primaryStage.show();




    }

    public static void main(String[] args)

    {

        Application.launch(args);


    }


}
