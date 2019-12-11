package sample;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login extends Application {
        @Override
        public void start(Stage stage) throws Exception
        {
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 715, 400));
            stage.setX(350);
            stage.setY(150);
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }


}


