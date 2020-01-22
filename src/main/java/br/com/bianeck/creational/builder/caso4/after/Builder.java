package br.com.bianeck.creational.builder.caso4.after;

import java.awt.*;

interface Builder {
    void set_width_and_height(int width, int height);

    void start_row();

    void build_cell(String value);

    Component get_result();
}
