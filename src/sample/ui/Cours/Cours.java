package sample.ui.Cours;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Cours {

    public void create(ActionEvent actionEvent) throws IOException {
        Parent cour = FXMLLoader.load(getClass().getResource("../CreateC/CreateC.fxml"));
        Scene scene4 = new Scene(cour);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
    public void GoFormation(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent profil = FXMLLoader.load(getClass().getResource("../Formation/Formation.fxml"));
        Scene scene3 = new Scene(profil);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
    public void GOtest(ActionEvent actionEvent) throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("../Test/Test.fxml"));
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
}
