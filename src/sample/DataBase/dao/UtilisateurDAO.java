package sample.DataBase.dao;

import sample.Data.Personne.Administrateur;
import sample.Data.Personne.Apprenant;
import sample.Data.Personne.Instructeur;
import sample.Data.Personne.Utilisateur;
import sample.DataBase.DAO;

import java.sql.*;
import java.util.ArrayList;

public class UtilisateurDAO implements DAO {

    private ArrayList<Administrateur> adminlist;
    private ArrayList<Apprenant> apprenlist;
    private ArrayList<Instructeur> instrulist;

    UtilisateurDAO(){
        adminlist= new ArrayList<Administrateur>();
        apprenlist= new ArrayList<Apprenant>();
        instrulist= new ArrayList<Instructeur>();
        getUsers();
    }

    void createUser(ResultSet rs){
        Utilisateur p= new Utilisateur();
        try{
            p.setLogin(rs.getString("login"));
            p.setMdp(rs.getString("mdp"));
            p.setAddremail(rs.getString("addremail"));
            p.setPhotoDP(rs.getString("pdp"));
            p.setLangue(rs.getString("langue"));
            p.setFh(rs.getInt("fh"));
            String type= rs.getString("type");
            switch (type){
                case "admin" : adminlist.add((Administrateur) p);
                    break;
                case "apprenant" : apprenlist.add((Apprenant) p);
                    break;
                case "instructeur" : instrulist.add((Instructeur)p);
                    break;
            }
        }catch (SQLException e){

        }
    }

    void getUsers(){
        String requete="select * from Utilisateur order by login";
        try {
            Class.forName(DRIVER);

            Connection con= DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement=con.createStatement();
            ResultSet rs= statement.executeQuery(requete);

            while (rs.next()){
                createUser(rs);
            }
            rs.close();
            con.close();
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
