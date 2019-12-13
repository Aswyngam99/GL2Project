package sample.ui.ListStudent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ListStudent {
    public void GoFormation(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent profil = FXMLLoader.load(getClass().getResource("../Formation/Formation.fxml"));
        Scene scene3 = new Scene(profil, 1036, 401);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setX(220);
        window.setY(50);
        window.setScene(scene3);
        window.show();
    }

}
