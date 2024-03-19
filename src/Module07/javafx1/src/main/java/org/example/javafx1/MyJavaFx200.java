package org.example.javafx1;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.stage.Stage;



public class MyJavaFx200 extends Application

{

    @Override

    public void start(Stage primaryStage)

    {

//create a scene and place a button on it

        Button btOK = new Button("OK");

        Scene scene = new Scene(btOK, 200,250);

        primaryStage.setTitle("Syed's Stage"); //title for the stage

        primaryStage.setScene(scene);

        primaryStage.show(); //display the stage


    }


    public static void main(String[] args)

    {

        Application.launch(args);


    }


}