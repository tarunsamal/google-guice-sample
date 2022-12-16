package sample.tarun.request;

import sample.tarun.services.DrawShape;

import javax.inject.Inject;

public class SquareRequest {

    DrawShape drawShape;

    @Inject
    public SquareRequest(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public void makeRequest() {
        drawShape.draw();
    }

}
