package sample.tarun.impl;

import sample.tarun.services.DrawShape;

public class DrawSquare implements DrawShape {
    @Override
    public void draw() {
        System.out.print("Drawing Squares");
    }
}
