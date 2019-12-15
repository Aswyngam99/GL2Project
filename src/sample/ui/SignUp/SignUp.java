package sample.ui.SignUp;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class SignUp {


    public JFXTextField email;
    public JFXTextField username;
    public JFXPasswordField password;
    public JFXRadioButton learner;
    public JFXRadioButton instit;

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

    public void sinscrire(MouseEvent mouseEvent) {
        if (!learner.isDisable()) {
            Main.inscription(username.getText(), password.getText(), email.getText(), 1);
        } else if (!instit.isDisable()) {
            Main.inscription(username.getText(), password.getText(), email.getText(), 2);
        }
        Parent signup = null;
        try {
            signup = FXMLLoader.load(getClass().getResource("../LProfil/LProfil.fxml"));
            Scene scene2 = new Scene(signup);
            Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
