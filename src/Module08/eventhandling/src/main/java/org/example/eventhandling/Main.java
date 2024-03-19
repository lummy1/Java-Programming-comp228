package org.example.eventhandling;

//Event Handling: Anonymous Inner Class


import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.layout.HBox;

import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {

        launch(args);// w w w . d e m o 2s . c o m

    }


    Button btnAdd;

    Button btnSubtract;

    Label lbl;

    int myCounter = 0;


    @Override

    public void start(Stage primaryStage) {

// Create the Add button

        btnAdd = new Button();

        btnAdd.setText("Add");

        btnAdd.setOnAction(new EventHandler<ActionEvent>() // 28

        {

            public void handle(ActionEvent e) // 30

            {

                myCounter++; // 32

                lbl.setText(Integer.toString(myCounter));

            }

        });

// Create the Subtract button

        btnSubtract = new Button();

        btnSubtract.setText("Subtract");

        btnSubtract.setOnAction(new EventHandler<ActionEvent>() // 41

        {

            public void handle(ActionEvent e) // 43

            {

                myCounter--;

                lbl.setText(Integer.toString(myCounter));

            }

        });

// Create the Label

        lbl = new Label();

        lbl.setText(Integer.toString(myCounter));

// Add the buttons and label to an HBox pane

        HBox pane = new HBox(10);

        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

// Add the layout pane to a scene

        Scene scene = new Scene(pane, 200, 75);

// Add the scene to the stage, set the title

// and show the stage

        primaryStage.setScene(scene);

        primaryStage.setTitle("Add/Sub");

        primaryStage.show();

    }

}