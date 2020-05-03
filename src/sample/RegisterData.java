package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class RegisterData implements Serializable {

    private static final long serialVersionUID = 1;

    private transient ObservableList<Data> pregister = FXCollections.observableArrayList();

    public ObservableList<Data> getRegister() {
        return pregister;
    }

    public void addData(Data d) {
        pregister.add(d);
    }

    public void removeAll() {
        pregister.clear();
    }

    public void attachTableView(TableView tv) {
        tv.setItems(pregister);
    }

    public Data searchRegisterByName(String name) {
        Pattern pattern = Pattern.compile(name, Pattern.CASE_INSENSITIVE);

        for (Data d : pregister) {
            Matcher matcher = pattern.matcher(d.getNavn());

            if (matcher.find()) {
                return d;
            }
        }

        return null;


    }

    public ObservableList<Data> filterByName(String name) {
        return pregister.stream().
                filter(p -> p.getNavn().toLowerCase().
                        matches(String.format("%s%s%s",".*", name.toLowerCase(), ".*"))).
                collect(Collectors.toCollection(FXCollections::observableArrayList));
    }// filterByName

    public ObservableList<Data> filterByPris(double pris) {
        return pregister.stream().
                filter(p -> p.getPris() == pris).
                collect(Collectors.toCollection(FXCollections::observableArrayList));
    }// filterByPris

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Data d : pregister) {
            sb.append(d.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }// toString

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeObject(new ArrayList<>(pregister));
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        List<Data> list = (List<Data>) s.readObject();
        pregister = FXCollections.observableArrayList();
        pregister.addAll(list);
    }
}
