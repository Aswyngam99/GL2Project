package sample.ui.CreateC;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class CreateC {
    public JFXButton save;
    public JFXTextArea contenu;
    public JFXTextField titre;

    public void Gocours(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        //RETURN TO MENU
        Parent cour = FXMLLoader.load(getClass().getResource("../Cours/Cours.fxml"));
        Scene scene3 = new Scene(cour);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    public void sauvg(ActionEvent actionEvent) {
        Main.nouvelarticle(titre.getText(), contenu.getText(), 3);

    }
}
