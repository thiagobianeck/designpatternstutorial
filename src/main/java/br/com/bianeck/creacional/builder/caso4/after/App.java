package br.com.bianeck.creacional.builder.caso4.after;

import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) {
        (new App()).demo(args);
    }

    /**
     * Client code perspective.
     */
    private void demo(String[] args) {
        // Name of the GUI table class can be passed to the app parameters.
        String class_name = args.length > 0 ? args[0] : "JTable_Builder";

        Builder target = null;
        try {
            target = (Builder) Class.forName(getClass().getName() + "$" + class_name)
                    .getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        String file_name = getClass().getResource("../BuilderDemo.dat").getFile();
        TableDirector director = new TableDirector(target);
        director.construct(file_name);
        Component comp = target.get_result();

        JFrame frame = new JFrame("BuilderDemo - " + class_name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(comp);
        frame.pack();
        frame.setVisible(true);
    }










}
