package sample.ui.Formation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Formation {
    public void GoProfil(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent profil = FXMLLoader.load(getClass().getResource("../LProfil/LProfil.fxml"));
        Scene scene3 = new Scene(profil, 930, 625);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setX(220);
        window.setY(50);
        window.setScene(scene3);
        window.show();
    }

    public void GoList(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent liststud = FXMLLoader.load(getClass().getResource("../ListStudent/ListStudent.fxml"));
        Scene scene4 = new Scene(liststud);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();

    }
    public void GoForm(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent liststud = FXMLLoader.load(getClass().getResource("../Form/Form.fxml"));
        Scene scene4 = new Scene(liststud);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();

    }
}