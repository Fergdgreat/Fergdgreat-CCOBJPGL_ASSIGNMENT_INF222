package Controller;

import javax.swing.text.html.ImageView;

import Model.DearJohn;
import Model.Jollibee;
import Model.KennyRogers;
import Model.Mcdo;
import Model.Kfc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import Model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    DearJohn dearJohn = new DearJohn();
    Mcdo mcdo = new Mcdo();
    Jollibee jollibee = new Jollibee();
    KennyRogers kennyRogers = new KennyRogers();
    Kfc kfc = new Kfc();

    public void initialize() {

        dearJohn.setFlavor("Spaghetti");
        dearJohn.setTaste("Delicous");

        mcdo.setFlavor("Chicken ALA KING");
        mcdo.setTaste("60pesos busog kana");

        jollibee.setFlavor("JollyHotdog");
        jollibee.setTaste("malinamnam");

        kennyRogers.setFlavor("Burger Steak");
        kennyRogers.setTaste("Sobrangmasarap");

        kfc.setFlavor("Zinger");
        kfc.setTaste("Maanghang pero masarap");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("The DearJohn " + dearJohn.getFlavor() + " is " + dearJohn.getTaste());
        }
        if (sourceButton == btn2) {
            alert.setContentText("The Mcdo " + mcdo.getFlavor() + " is " + mcdo.getTaste());
        }
        if (sourceButton == btn3) {
            alert.setContentText("The Jollibee " + jollibee.getFlavor() + " is " + jollibee.getTaste());
        }
        if (sourceButton == btn4) {
            alert.setContentText("The KennyRogers " + kennyRogers.getFlavor() + " is " + kennyRogers.getTaste());       
        }
        if (sourceButton == btn5) {
            alert.setContentText("The Kfc " + kfc.getFlavor() + " is " + kfc.getTaste());

        }

        alert.showAndWait();

    }
}
