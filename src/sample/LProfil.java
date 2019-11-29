package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LProfil {

    public void GoTraining(javafx.event.ActionEvent actionEvent) throws IOException {
        // IF IT's an INSTRUCTOR
        Parent formation = FXMLLoader.load(getClass().getResource("Formation.fxml"));
        Scene scene4 = new Scene(formation);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
        //IF IT's a STUDENT
        /*Parent formation = FXMLLoader.load(getClass().getResource("FormationL.fxml"));
        Scene scene4 = new Scene(formation);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        */window.show();
    }

    public void GoLogin(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent signup = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene2 = new Scene(signup);
        Stage window = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    public void handleClose(MouseEvent mouseEvent) {
        System.exit(0);
    }
}
