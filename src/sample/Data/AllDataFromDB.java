package sample.Data;

import sample.Data.Personne.Administrateur;
import sample.Data.Personne.Apprenant;
import sample.Data.Personne.Instructeur;
import sample.Data.Personne.Utilisateur;
import sample.Data.Ressources.Blog.ArticledeBlog;
import sample.Data.Ressources.Forum.Topic;
import sample.Data.Ressources.Wiki.ArticledeWiki;
import sample.DataBase.dao.ArticleDAO;
import sample.DataBase.dao.UtilisateurDAO;

import java.util.ArrayList;

public class AllDataFromDB {

    private ArrayList<Topic> listtopics;
    private ArrayList<ArticledeBlog> listartblog;
    private ArrayList<ArticledeWiki> listartwiki;
    private Administrateur admin;
    private ArrayList<Apprenant> apprenlist;
    private ArrayList<Instructeur> instrulist;

    public AllDataFromDB(){
        ArticleDAO  art= new ArticleDAO();
        listtopics=art.getListtopics();
        listartblog=art.getListartblog();
        listartwiki=art.getListartwiki();
        UtilisateurDAO uti= new UtilisateurDAO();
        admin=uti.getAdmin();
        apprenlist= uti.getApprenlist();
        instrulist=uti.getInstrulist();
    }

    public int authentification(String login, String mdp){
        if(login.equals(admin.getLogin())){
            if(mdp.equals(admin.getMdp())){
                return 3;
            }
        }
        for(Apprenant appr : apprenlist){
            if(appr.getLogin().equals(login)){
                if(appr.getMdp().equals(mdp)){
                    return (1);
                }
                else
                    break;
            }
        }
        for(Instructeur instr : instrulist){
            if(instr.getLogin().equals(login)){
                if(instr.getMdp().equals(mdp)){
                    return 2;
                }
                else
                    break;
            }
        }
        return 0;
    }

    public void inscription(){

    }
}
