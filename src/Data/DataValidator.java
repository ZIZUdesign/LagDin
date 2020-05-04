package Data;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class DataValidator {


    static boolean name(String navn) {
        return !navn.isEmpty() && navn.matches("[^\\d]+");
    }



    static boolean pris(int pris) {
       return pris > 0;
    }




}
