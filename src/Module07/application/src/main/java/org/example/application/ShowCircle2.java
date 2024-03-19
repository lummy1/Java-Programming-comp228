package org.example.application;

//Some GUI Examples: Circle2 with Property Binding


import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.stage.Stage;


public class ShowCircle2 extends Application

{


    @Override

    public void start(Stage primaryStage)

    {



//creare a pane to hold the circle

        Pane pane = new Pane();


//create a circle and set its properties

        Circle circle = new Circle();

        circle.centerXProperty().bind(pane.widthProperty().divide(2));

        circle.centerYProperty().bind(pane.heightProperty().divide(2));


        circle.setRadius(50);

        circle.setStroke(Color.BLACK);

        circle.setFill(Color.BLUEVIOLET);




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