package Data;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import io.InvalidPrisException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Data implements Serializable {

    private static final long serialVersionUID = 1;

    private transient  SimpleStringProperty navn;
    private transient SimpleIntegerProperty pris;


    public Data(String fnavn, int newPris) {

        if (!DataValidator.pris(newPris)) {
            throw new InvalidPrisException();
        }
        this.navn = new SimpleStringProperty(fnavn);
        this.pris = new SimpleIntegerProperty(newPris);

    }




    public String getNavn() {
        return navn.get();
    }



    public final void setName(String name) {
        if(!DataValidator.name(name)) {
            throw new IllegalArgumentException("Navn kan ikke være tom eller inneholde tall");
        }

        this.navn.set(name);
    }


    public double  getPris() {
        return pris.get();
    }

    public void setPris(int pris) {
        this.pris.set(pris);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s;%s",
                navn.getValue(), pris.getValue());

    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeUTF(getNavn());
        s.writeDouble(getPris());

    } // writeObject

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        String name = s.readUTF();
        double pris = s.readInt();

        this.navn = new SimpleStringProperty();
        this.pris = new SimpleIntegerProperty();

        setName(name);
        setPris((int) pris);

    }




}
