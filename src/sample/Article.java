package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Article {

    public void Gowikil(MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent wikil = FXMLLoader.load(getClass().getResource("WikiL.fxml"));
        Scene scene3 = new Scene(wikil);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
}
