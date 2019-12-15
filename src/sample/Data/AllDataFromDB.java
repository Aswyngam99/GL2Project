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
import sample.Main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class AllDataFromDB {


    private ArticleDAO  art;
    private UtilisateurDAO uti;

    private ArrayList<Topic> listtopics;
    private ArrayList<ArticledeBlog> listartblog;
    private ArrayList<ArticledeWiki> listartwiki;

    private Administrateur admin;
    private ArrayList<Apprenant> apprenlist;
    private ArrayList<Instructeur> instrulist;

    public AllDataFromDB(){
        art= new ArticleDAO();
        listtopics=art.getListtopics();
        listartblog=art.getListartblog();
        listartwiki=art.getListartwiki();

        uti= new UtilisateurDAO();
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

    public void inscription(String login, String mdp, String email, int type){
        if(type==1){
            //student
            Apprenant apr= new Apprenant(login, mdp, email);
            apprenlist.add(apr);
            String sql="insert into Utilisateur (login, mdp, addremail, type) value ('"+login+"', '"+mdp+"', '"+email+"', 'apprenant')";
            uti.inscription(login, mdp, email, sql);
        }
        else if(type==2){
            //teacher
            Instructeur instru= new Instructeur(login, mdp, email);
            instrulist.add(instru);
            String sql="insert into Utilisateur (login, mdp, addremail, type) value ('"+login+"', '"+mdp+"', '"+email+"', 'instructeur')";
            uti.inscription(login, mdp, email, sql);
        }
    }

    public void newArticle(String titre, String contenu, int type){
        if(type==1){
            //topic
            Topic top= new Topic(titre, contenu, Main.getLogin());
            listtopics.add(top);
            String timeStamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            String sql="insert into Article (tittreArticle, contenu, date, type, auteur) value ('"+titre+"', '"+contenu+"', '"+timeStamp+"', 'topic', '"+Main.getLogin()+"');";
            art.newArticle(titre, contenu, sql);
        }
        else  if(type==2){
            //blogart
            ArticledeBlog blg= new ArticledeBlog(titre, contenu, Main.getLogin());
            listartblog.add(blg);
            String timeStamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            String sql="insert into Article (tittreArticle, contenu, date, type, auteur) value ('"+titre+"', '"+contenu+"', '"+timeStamp+"', 'articleblog', '"+Main.getLogin()+"');";
            art.newArticle(titre, contenu, sql);
        }
        else if(type==3){
            //wikiart
            ArticledeWiki wikileaks= new ArticledeWiki(titre, contenu, Main.getLogin());
            listartwiki.add(wikileaks);
            String timeStamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            String sql="insert into Article (tittreArticle, contenu, date, type, auteur) value ('"+titre+"', '"+contenu+"', '"+timeStamp+"', 'articlewiki', '"+Main.getLogin()+"');";
            art.newArticle(titre, contenu, sql);
        }
    }
    public ArticleDAO getArt() {
        return art;
    }

    public UtilisateurDAO getUti() {
        return uti;
    }

    public ArrayList<Topic> getListtopics() {
        return listtopics;
    }

    public ArrayList<ArticledeBlog> getListartblog() {
        return listartblog;
    }

    public ArrayList<ArticledeWiki> getListartwiki() {
        return listartwiki;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public ArrayList<Apprenant> getApprenlist() {
        return apprenlist;
    }

    public ArrayList<Instructeur> getInstrulist() {
        return instrulist;
    }

}
