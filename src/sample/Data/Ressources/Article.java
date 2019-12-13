package sample.Data.Ressources;

import sample.Data.Personne.Utilisateur;

import java.util.Date;

/**
 * Class Article
 */
public class Article {

  //
  // Fields
  //

  private String idArt;
  private String titreArt;
  private String contenu;
  private String langue;
  private Date dateCreation;
  private Utilisateur auteur;
  
  //
  // Constructors
  //
  public Article () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idArt
   * @param newVar the new value of idArt
   */
  private void setIdArt (String newVar) {
    idArt = newVar;
  }

  /**
   * Get the value of idArt
   * @return the value of idArt
   */
  private String getIdArt () {
    return idArt;
  }

  /**
   * Set the value of titreArt
   * @param newVar the new value of titreArt
   */
  private void setTitreArt (String newVar) {
    titreArt = newVar;
  }

  /**
   * Get the value of titreArt
   * @return the value of titreArt
   */
  private String getTitreArt () {
    return titreArt;
  }

  /**
   * Set the value of contenu
   * @param newVar the new value of contenu
   */
  private void setContenu (String newVar) {
    contenu = newVar;
  }

  /**
   * Get the value of contenu
   * @return the value of contenu
   */
  private String getContenu () {
    return contenu;
  }

  /**
   * Set the value of langue
   * @param newVar the new value of langue
   */
  private void setLangue (String newVar) {
    langue = newVar;
  }

  /**
   * Get the value of langue
   * @return the value of langue
   */
  private String getLangue () {
    return langue;
  }

  /**
   * Set the value of dateCreation
   * @param newVar the new value of dateCreation
   */
  private void setDateCreation (Date newVar) {
    dateCreation = newVar;
  }

  /**
   * Get the value of dateCreation
   * @return the value of dateCreation
   */
  private Date getDateCreation () {
    return dateCreation;
  }

  /**
   * Set the value of auteur
   * @param newVar the new value of auteur
   */
  private void setAuteur (Utilisateur newVar) {
    auteur = newVar;
  }

  /**
   * Get the value of auteur
   * @return the value of auteur
   */
  private Utilisateur getAuteur () {
    return auteur;
  }

  //
  // Other methods
  //

}
