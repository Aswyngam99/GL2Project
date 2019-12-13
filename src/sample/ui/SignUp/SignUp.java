package sample.ui.SignUp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUp {


    public void handleClose(javafx.scene.input.MouseEvent mouseEvent2) {
        System.exit(0);
    }

    public void GoLogin(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent signup = FXMLLoader.load(getClass().getResource("../Login/Login.fxml"));
        Scene scene2 = new Scene(signup);
        Stage window = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
}
