package sample.Data.Personne;

import sample.Data.Sondage.Choix;

import java.util.ArrayList;

/**
 * Class Utilisateur
 */
public class Utilisateur {

  //
  // Fields
  //

  private String login;
  private String mdp;
  private String addremail;
  private String photoDP;
  private String langue;
  private int fh;
  
  //
  // Constructors
  //
  public Utilisateur () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getMdp() {
    return mdp;
  }

  public void setMdp(String mdp) {
    this.mdp = mdp;
  }

  public String getAddremail() {
    return addremail;
  }

  public void setAddremail(String addremail) {
    this.addremail = addremail;
  }

  public String getPhotoDP() {
    return photoDP;
  }

  public void setPhotoDP(String photoDP) {
    this.photoDP = photoDP;
  }

  public String getLangue() {
    return langue;
  }

  public void setLangue() {
    setLangue();
  }

  public void setLangue(String langue) {
    this.langue = langue;
  }

  public int getFh() {
    return fh;
  }

  public void setFh(int fh) {
    this.fh = fh;
  }

  public void creerSondage(String text, ArrayList<Choix> choix)
  {
  }


  /**
   * @param        idSondage
   */
  public void supprSondage(int idSondage)
  {
  }


}
