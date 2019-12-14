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

  private Integer idArt;
  private String titreArt;
  private String contenu;
  private String langue;
  private Date dateCreation;
  private String auteur;
  
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

  public Integer getIdArt() {
    return idArt;
  }

  public void setIdArt(Integer idArt) {
    this.idArt = idArt;
  }

  public String getTitreArt() {
    return titreArt;
  }

  public void setTitreArt(String titreArt) {
    this.titreArt = titreArt;
  }

  public String getContenu() {
    return contenu;
  }

  public void setContenu(String contenu) {
    this.contenu = contenu;
  }

  public String getLangue() {
    return langue;
  }

  public void setLangue(String langue) {
    this.langue = langue;
  }

  public Date getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
  }

  public String getAuteur() {
    return auteur;
  }

  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }


  //
  // Other methods
  //

}
