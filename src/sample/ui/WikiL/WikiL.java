package sample.ui.WikiL;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class WikiL {

    public void GoProfil(MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent profil = FXMLLoader.load(getClass().getResource("../LProfil/LProfil.fxml"));
        Scene scene3 = new Scene(profil);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
    public void GOarticle(ActionEvent actionEvent) throws IOException {
        Parent work = FXMLLoader.load(getClass().getResource("../Article/Article.fxml"));
        Scene scene4 = new Scene(work);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
}
