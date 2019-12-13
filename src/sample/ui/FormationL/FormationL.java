package sample.ui.FormationL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FormationL {
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

}
