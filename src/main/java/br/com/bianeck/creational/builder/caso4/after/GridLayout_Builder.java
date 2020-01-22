package br.com.bianeck.creational.builder.caso4.after;

import javax.swing.*;
import java.awt.*;

public class GridLayout_Builder implements Builder {
    private JPanel m_panel = new JPanel();

    public void set_width_and_height(int width, int height) {
        m_panel.setLayout(new GridLayout(height, width));
        m_panel.setBackground(Color.white);
    }

    public void start_row() {
    }

    public void build_cell(String value) {
        m_panel.add(new Label(value));
    }

    public Component get_result() {
        return m_panel;
    }
}
