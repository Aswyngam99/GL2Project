package sample.DataBase.dao;

import sample.Data.Ressources.Article;
import sample.Data.Ressources.Blog.ArticledeBlog;
import sample.Data.Ressources.Forum.Topic;
import sample.Data.Ressources.Wiki.ArticledeWiki;
import sample.DataBase.DAO;

import java.sql.*;
import java.util.ArrayList;

public class ArticleDAO implements DAO {
    private ArrayList<Topic> listtopics;
    private ArrayList<ArticledeBlog> listartblog;
    private ArrayList<ArticledeWiki> listartwiki;


    public ArticleDAO(){
        listtopics= new ArrayList<Topic>();
        listartblog= new ArrayList<ArticledeBlog>();
        listartwiki=new ArrayList<ArticledeWiki>();
        extractData();
    }

    void extractArticle(ResultSet rs){
        try {
            String type=rs.getString("type");
            switch (type){
                case "articlewiki" :
                    ArticledeWiki art= new ArticledeWiki();
                    art.setIdArt(rs.getInt("idArticle"));
                    art.setTitreArt(rs.getString("tittreArticle"));
                    art.setContenu(rs.getString("contenu"));
                    art.setLangue(rs.getString("langue"));
                    art.setDateCreation(rs.getDate("date"));
                    art.setAuteur(rs.getString("auteur"));

                    listartwiki.add(art);
                    break;
                case "articleblog" :
                    ArticledeBlog blg= new ArticledeBlog();
                    blg.setIdArt(rs.getInt("idArticle"));
                    blg.setTitreArt(rs.getString("tittreArticle"));
                    blg.setContenu(rs.getString("contenu"));
                    blg.setLangue(rs.getString("langue"));
                    blg.setDateCreation(rs.getDate("date"));
                    blg.setAuteur(rs.getString("auteur"));

                    listartblog.add((blg));
                    break;
                case "topic" :
                    Topic topic= new Topic();
                    topic.setIdArt(rs.getInt("idArticle"));
                    topic.setTitreArt(rs.getString("tittreArticle"));
                    topic.setContenu(rs.getString("contenu"));
                    topic.setLangue(rs.getString("langue"));
                    topic.setDateCreation(rs.getDate("date"));
                    topic.setAuteur(rs.getString("auteur"));

                    listtopics.add(topic)
                    ;
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void extractData(){
        String requete="select * from Article";
        try {
            Class.forName(DRIVER);

            Connection con= DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement=con.createStatement();
            ResultSet rs= statement.executeQuery(requete);

            while (rs.next()){
                extractArticle(rs);
            }
            rs.close();
            con.close();
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void newArticle(String titre, String contenu, String sqlquerry){
        try {
            Class.forName(DRIVER);

            Connection con= DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement= con.createStatement();
            statement.executeUpdate(sqlquerry);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
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
}
