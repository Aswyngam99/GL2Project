package sample;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Data.AllDataFromDB;
import sample.Data.Personne.Administrateur;
import sample.Data.Personne.Apprenant;
import sample.Data.Personne.Instructeur;
import sample.Data.Ressources.Blog.ArticledeBlog;
import sample.Data.Ressources.Forum.Topic;
import sample.Data.Ressources.Wiki.ArticledeWiki;

import java.util.ArrayList;

public class Main extends Application {

    private static AllDataFromDB alldata;
    private static String login;
    private static String urlim;
    private static int type;


    @Override
        public void start(Stage stage) throws Exception
        {
            alldata= new AllDataFromDB();
            Parent root = FXMLLoader.load(getClass().getResource("ui/Login/Login.fxml"));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 715, 400));
            stage.setX(350);
            stage.setY(150);
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }




        public static void inscription(String username, String password, String email, int type){
                Main.getAlldata().inscription(username, password, email, type);
                login=username;
                setType(type);
        }

        public static void nouvelarticle(String titre, String contenu, int type){
            alldata.newArticle(titre, contenu, type);
        }

    public static String getUrlim() {
        return urlim;
    }

    public static void setUrlim(String urlim) {
        Main.urlim = urlim;
    }

    public static AllDataFromDB getAlldata() {
        return alldata;
    }

    public static void setAlldata(AllDataFromDB alldata) {
        Main.alldata = alldata;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        Main.login = login;
    }

    public static int getType() {
        return type;
    }

    public static void setType(int type) {
        Main.type = type;
    }
}