package sample;

import javafx.beans.property.SimpleDoubleProperty;

public class DataValidator {


    static boolean name(String name) {
        return !name.isBlank() && name.matches("[^\\d]+");
    }

    static boolean pris(SimpleDoubleProperty pris) {
        return pris > 0;
    }
}
