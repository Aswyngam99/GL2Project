package sample.ui.Login;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    public void handleClose(MouseEvent mouseEvent) {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public void GoSignUp(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent signup = FXMLLoader.load(getClass().getResource("../SignUp/SignUp.fxml"));
        Scene scene2 = new Scene(signup);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }

    public void GoLogin(javafx.event.ActionEvent actionEvent) throws IOException {
        //BOTH Student and Instructor
        Parent profil = FXMLLoader.load(getClass().getResource("../LProfil/LProfil.fxml"));
        Scene scene3 = new Scene(profil, 930, 630);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setX(220);
        window.setY(50);
        window.setScene(scene3);
        window.show();
    }
}