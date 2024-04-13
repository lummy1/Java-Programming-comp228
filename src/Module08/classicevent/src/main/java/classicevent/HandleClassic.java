package classicevent;

//Event Handling: the classic way

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.HBox;

import javafx.stage.Stage;

import javax.swing.JOptionPane;

import javax.swing.*;

public class HandleClassic extends Application

{

    @Override

    public void start(Stage primaryStage)

    {

        // hold two buttons in HBox

        HBox pane = new HBox(10);

        pane.setAlignment(Pos.CENTER);

        Button btOk = new Button("OK");

        Button btCancel = new Button("Cancel");

        OkHandlerClass handler1 = new OkHandlerClass();

        btOk.setOnAction(handler1); // register btOk with handler1

        CancelHandlerClass handler2 = new CancelHandlerClass();

        btCancel.setOnAction(handler2);

        pane.getChildren().addAll(btOk, btCancel);

        // routine the create a scene and place it in a stage

        Scene scene = new Scene(pane);

        primaryStage.setTitle("EventClassic");

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args)

    {

        Application.launch(args);

    }

}

class OkHandlerClass implements EventHandler<ActionEvent>

{
    JFrame myFrame = new JFrame();

    @Override

    public void handle(ActionEvent e)

    {

        System.out.println("Ok Button Pressed!!");

        JOptionPane.showMessageDialog(myFrame, "OK Button Pressed.");

    }

}

class CancelHandlerClass implements EventHandler<ActionEvent>

{

    JFrame myFrame = new JFrame();

    @Override

    public void handle(ActionEvent e)

    {

        System.out.println("Cancel Button Pressed!!");

        JOptionPane.showMessageDialog(myFrame, "Cancel Button Pressed.");

    }

}
