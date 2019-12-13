package sample.Form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Form {
    public void GoCour(ActionEvent actionEvent) throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("../Cours/Cours.fxml"));
        Scene scene4 = new Scene(test);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
    public void GOwork(ActionEvent actionEvent) throws IOException {
        Parent work = FXMLLoader.load(getClass().getResource("../Homework/Homework.fxml"));
        Scene scene4 = new Scene(work);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
    public void GOtest(ActionEvent actionEvent) throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("../Test/Test.fxml"));
        Scene scene4 = new Scene(test);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
    public void GoProfil(MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent profil = FXMLLoader.load(getClass().getResource("../LProfil/LProfil.fxml"));
        Scene scene3 = new Scene(profil);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
}
