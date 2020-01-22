package br.com.bianeck.creational.builder.caso4.after;

import javax.swing.*;
import java.awt.*;

public class GridBagLayout_Builder implements Builder {
    private JPanel m_panel = new JPanel();
    private GridBagConstraints c = new GridBagConstraints();
    private int x = 0, y = 0;

    public void set_width_and_height(int width, int height) {
        m_panel.setLayout(new GridBagLayout());
        m_panel.setBackground(Color.white);
    }

    public void start_row() {
        x = 0;
        ++y;
    }

    public void build_cell(String value) {
        c.gridx = x++;
        c.gridy = y;
        m_panel.add(new Label(value), c);
    }

    public Component get_result() {
        return m_panel;
    }
}
