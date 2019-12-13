package sample.Data.Ressources.Wiki;

import sample.Data.Personne.Proprietes.PeutCreerWiki;


/**
 * Class Wiki
 */
public class Wiki {

  //
  // Fields
  //

  private int id;
  private String titre;
  private String description;
  private PeutCreerWiki createur;
  
  //
  // Constructors
  //
  public Wiki () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  private void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private int getId () {
    return id;
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
   * Set the value of description
   * @param newVar the new value of description
   */
  private void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
  private String getDescription () {
    return description;
  }

  /**
   * Set the value of createur
   * @param newVar the new value of createur
   */
  private void setCreateur (PeutCreerWiki newVar) {
    createur = newVar;
  }

  /**
   * Get the value of createur
   * @return the value of createur
   */
  private PeutCreerWiki getCreateur () {
    return createur;
  }

  //
  // Other methods
  //

}
