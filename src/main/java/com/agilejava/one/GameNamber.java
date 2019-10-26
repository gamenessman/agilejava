package com.agilejava.one;

public class GameNamber {
    private int value;

    public GameNamber(int value) {
        this.value = value;
    }

    public String say() {
        if (isdividable(5) && isdividable(3)) {
            return "fizzbuzz";
        }
        if (isdividable(3)) {
            return "fizz";
        }
        if (isdividable(5)) {
            return "buzz";
        }
        return String.valueOf(this.value);
    }

    private boolean isdividable(int base) {
        return this.value % base == 0;
    }
}
