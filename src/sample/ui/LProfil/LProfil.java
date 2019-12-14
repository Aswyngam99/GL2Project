package sample.ui.LProfil;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class LProfil {

    public void GoTraining(javafx.event.ActionEvent actionEvent) throws IOException {
        // IF IT's an INSTRUCTOR
        if(Main.getType()==2) {
            Parent formation = FXMLLoader.load(getClass().getResource("../Formation/Formation.fxml"));
            Scene scene4 = new Scene(formation);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene4);
            window.show();
        }

        //IF IT's a STUDENT
        if(Main.getType()==1) {
            Parent formation = FXMLLoader.load(getClass().getResource("../FormationL/FormationL.fxml"));
            Scene scene4 = new Scene(formation);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene4);

            window.show();
        }
    }

    public void GoLogin(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent signup = FXMLLoader.load(getClass().getResource("../Login/Login.fxml"));
        Scene scene2 = new Scene(signup);
        Stage window = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    public void GoWiki(javafx.event.ActionEvent actionEvent) throws IOException {
        // IF IT's an INSTRUCTOR
        if(Main.getType()==2) {

            Parent wiki = FXMLLoader.load(getClass().getResource("../Wiki/Wiki.fxml"));
            Scene scene4 = new Scene(wiki);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene4);
            window.show();
        }
        //IF IT's a STUDENT
        if(Main.getType()==1) {

            Parent wikil = FXMLLoader.load(getClass().getResource("../WikiL/WikiL.fxml"));
            Scene scene4 = new Scene(wikil);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene4);
            window.show();
        }
    }
    public void GoForum(javafx.event.ActionEvent actionEvent) throws IOException {
        // BOTH
        Parent f = FXMLLoader.load(getClass().getResource("../Forum/Forum.fxml"));
        Scene scene4 = new Scene(f);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
    public void GoChat(javafx.event.ActionEvent actionEvent) throws IOException {
        // BOTH
        Parent chat = FXMLLoader.load(getClass().getResource("../Chat/Chat.fxml"));
        Scene scene4 = new Scene(chat);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
    public void GoPoll(javafx.event.ActionEvent actionEvent) throws IOException {
        // BOTH
        Parent chat = FXMLLoader.load(getClass().getResource("../Poll/Poll.fxml"));
        Scene scene4 = new Scene(chat);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
    public void Edit(javafx.event.ActionEvent actionEvent) throws IOException {
        // BOTH
        Parent chat = FXMLLoader.load(getClass().getResource("../EditProf/EditProf.fxml"));
        Scene scene4 = new Scene(chat);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
}
