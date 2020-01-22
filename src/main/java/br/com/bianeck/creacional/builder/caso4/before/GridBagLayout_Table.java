package br.com.bianeck.creacional.builder.caso4.before;

import javax.swing.*;
import java.awt.*;

class GridBagLayout_Table {
    private JPanel m_table = new JPanel();

    public GridBagLayout_Table(String[][] matrix) {
        GridBagConstraints c = new GridBagConstraints();

        m_table.setLayout(new GridBagLayout());
        m_table.setBackground(Color.white);

        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[i].length; ++j) {
                c.gridx = i;
                c.gridy = j;
                m_table.add(new Label(matrix[i][j]), c);
            }
    }

    public Component get_table() {
        return m_table;
    }
}
