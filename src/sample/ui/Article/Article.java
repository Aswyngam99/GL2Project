package sample.ui.Article;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class Article {

    public JFXButton save;
    public JFXTextField titre;
    public JFXTextArea contenu;


    public void Gowikil(MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent wikil = FXMLLoader.load(getClass().getResource("../WikiL/WikiL.fxml"));
        Scene scene3 = new Scene(wikil);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    public void sauve(ActionEvent actionEvent) {
        Main.nouvelarticle(titre.getText(), contenu.getText(), 3);
    }
}
