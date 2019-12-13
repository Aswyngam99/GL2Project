package sample.Data.Formation;

import java.util.*;


/**
 * Class Cours
 */
public class Cours {

  //
  // Fields
  //

  private int idCours;
  private String titre;
  private String contenu;
  
  //
  // Constructors
  //
  public Cours () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idCours
   * @param newVar the new value of idCours
   */
  private void setIdCours (int newVar) {
    idCours = newVar;
  }

  /**
   * Get the value of idCours
   * @return the value of idCours
   */
  private int getIdCours () {
    return idCours;
  }

  /**
   * Set the value of titre
   * @param newVar the new value of titre
   */
  private void setTitre (String newVar) {
    titre = newVar;
  }

  /**
   * Get the value of titre
   * @return the value of titre
   */
  private String getTitre () {
    return titre;
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

  //
  // Other methods
  //

}
