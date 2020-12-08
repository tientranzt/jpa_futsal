package com.axonactive.resultvalue;

public enum ResultValue {

    WIN(3),
    DRAW(1),
    LOOSE(0);

    private int value;

    ResultValue(int value) {
        this.value = value;
    }

}
