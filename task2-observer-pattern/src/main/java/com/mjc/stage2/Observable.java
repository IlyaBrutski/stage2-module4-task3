package com.mjc.stage2;

import com.mjc.stage2.event.RectangleEvent;

public interface Observable {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}