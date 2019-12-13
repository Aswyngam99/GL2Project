package sample.Data.Chat;

import sample.Data.Personne.Proprietes.PeutCommuniquer;


/**
 * Class Message
 */
public class Message {

  //
  // Fields
  //

  private PeutCommuniquer emetteur;
  private PeutCommuniquer recepteur;
  private String contenu;
  
  //
  // Constructors
  //
  public Message () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of emetteur
   * @param newVar the new value of emetteur
   */
  private void setEmetteur (PeutCommuniquer newVar) {
    emetteur = newVar;
  }

  /**
   * Get the value of emetteur
   * @return the value of emetteur
   */
  private PeutCommuniquer getEmetteur () {
    return emetteur;
  }

  /**
   * Set the value of recepteur
   * @param newVar the new value of recepteur
   */
  private void setRecepteur (PeutCommuniquer newVar) {
    recepteur = newVar;
  }

  /**
   * Get the value of recepteur
   * @return the value of recepteur
   */
  private PeutCommuniquer getRecepteur () {
    return recepteur;
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
