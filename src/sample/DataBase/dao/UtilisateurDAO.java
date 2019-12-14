package sample.DataBase.dao;

import sample.Data.Personne.Administrateur;
import sample.Data.Personne.Apprenant;
import sample.Data.Personne.Instructeur;
import sample.Data.Personne.Utilisateur;
import sample.DataBase.DAO;

import java.sql.*;
import java.util.ArrayList;

public class UtilisateurDAO implements DAO {

    private Administrateur admin;
    private ArrayList<Apprenant> apprenlist;
    private ArrayList<Instructeur> instrulist;

    public UtilisateurDAO(){
        admin= new Administrateur();
        apprenlist= new ArrayList<Apprenant>();
        instrulist= new ArrayList<Instructeur>();
        extractData();
    }

    void extractUser(ResultSet rs){
        Utilisateur p= new Utilisateur();
        try{
            String type= rs.getString("type");
            switch (type){
                case "admin" :
                    Administrateur adm= new Administrateur();
                    adm.setLogin(rs.getString("login"));
                    adm.setMdp(rs.getString("mdp"));
                    adm.setAddremail(rs.getString("addremail"));
                    adm.setPhotoDP(rs.getString("pdp"));
                    adm.setLangue(rs.getString("langue"));
                    adm.setFh(rs.getInt("fh"));
                    admin=adm;
                    break;
                case "apprenant" :
                    Apprenant appr= new Apprenant();
                    appr.setLogin(rs.getString("login"));
                    appr.setMdp(rs.getString("mdp"));
                    appr.setAddremail(rs.getString("addremail"));
                    appr.setPhotoDP(rs.getString("pdp"));
                    appr.setLangue(rs.getString("langue"));
                    appr.setFh(rs.getInt("fh"));
                    apprenlist.add(appr);
                    break;
                case "instructeur" :
                    Instructeur ins= new Instructeur();
                    ins.setLogin(rs.getString("login"));
                    ins.setMdp(rs.getString("mdp"));
                    ins.setAddremail(rs.getString("addremail"));
                    ins.setPhotoDP(rs.getString("pdp"));
                    ins.setLangue(rs.getString("langue"));
                    ins.setFh(rs.getInt("fh"));
                    instrulist.add(ins);
                    break;
            }
        }catch (SQLException e){

        }
    }

    void extractData(){
        String requete="select * from Utilisateur order by login";
        try {
            Class.forName(DRIVER);

            Connection con= DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement=con.createStatement();
            ResultSet rs= statement.executeQuery(requete);

            while (rs.next()){
                extractUser(rs);
            }
            rs.close();
            con.close();
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
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
