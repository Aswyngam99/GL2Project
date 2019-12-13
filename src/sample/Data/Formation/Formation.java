package sample.Data.Formation;

import sample.Data.Personne.Apprenant;
import sample.Data.Personne.Instructeur;

import java.util.*;


/**
 * Class Formation
 */
public class Formation {

  //
  // Fields
  //

  private int idFormation;
  private String titre;
  private Date dateCreation_;
  private ArrayList<Apprenant> listeDinscrits;
  private ArrayList<Instructeur> instructeurs;
  
  //
  // Constructors
  //
  public Formation () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idFormation
   * @param newVar the new value of idFormation
   */
  private void setIdFormation (int newVar) {
    idFormation = newVar;
  }

  /**
   * Get the value of idFormation
   * @return the value of idFormation
   */
  private int getIdFormation () {
    return idFormation;
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
   * Set the value of dateCreation_
   * @param newVar the new value of dateCreation_
   */
  private void setDateCreation_ (Date newVar) {
    dateCreation_ = newVar;
  }

  /**
   * Get the value of dateCreation_
   * @return the value of dateCreation_
   */
  private Date getDateCreation_ () {
    return dateCreation_;
  }

  /**
   * Set the value of listeDinscrits
   * @param newVar the new value of listeDinscrits
   */
  private void setListeDinscrits (ArrayList<Apprenant> newVar) {
    listeDinscrits = newVar;
  }

  /**
   * Get the value of listeDinscrits
   * @return the value of listeDinscrits
   */
  private ArrayList<Apprenant> getListeDinscrits () {
    return listeDinscrits;
  }

  /**
   * Set the value of instructeurs
   * @param newVar the new value of instructeurs
   */
  private void setInstructeurs (ArrayList<Instructeur> newVar) {
    instructeurs = newVar;
  }

  /**
   * Get the value of instructeurs
   * @return the value of instructeurs
   */
  private ArrayList<Instructeur> getInstructeurs () {
    return instructeurs;
  }

  //
  // Other methods
  //

}
