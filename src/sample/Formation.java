package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Formation {
    public void GoProfil(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent profil = FXMLLoader.load(getClass().getResource("LProfil.fxml"));
        Scene scene3 = new Scene(profil, 930, 625);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setX(220);
        window.setY(50);
        window.setScene(scene3);
        window.show();
    }

    public void GoList(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent liststud = FXMLLoader.load(getClass().getResource("ListStudent.fxml"));
        Scene scene4 = new Scene(liststud);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();


    }
    public void GoCour(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent c = FXMLLoader.load(getClass().getResource("Cours.fxml"));
        Scene scene4 = new Scene(c);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();


    }
}