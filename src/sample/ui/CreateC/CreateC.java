package sample.ui.CreateC;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateC {
    public void Gocours(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent cour = FXMLLoader.load(getClass().getResource("../Cours/Cours.fxml"));
        Scene scene3 = new Scene(cour);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

}
