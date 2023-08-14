package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    // Write your code here!
    private RectangleWarehouse warehouse;

    public RectangleObserver(RectangleWarehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        int rectangleId = rectangle.getId();
        double sideA = rectangle.getSideA(); // updated sideA value
        double sideB = rectangle.getSideB(); // updated sideB value

        double square = sideA * sideB; // calculate square
        double perimeter = 2 * (sideA + sideB); // calculate perimeter

        RectangleValues values = new RectangleValues(square, perimeter);
        warehouse.put(rectangleId, values); // update warehouse with new values
    }
}
