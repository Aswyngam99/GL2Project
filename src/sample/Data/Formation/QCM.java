package sample.Data.Formation;

import java.util.*;


/**
 * Class QCM
 */
public class QCM {

  //
  // Fields
  //

  private String enonce;
  private ArrayList<String> choix;
  private int reponse_;
  
  //
  // Constructors
  //
  public QCM () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of enonce
   * @param newVar the new value of enonce
   */
  private void setEnonce (String newVar) {
    enonce = newVar;
  }

  /**
   * Get the value of enonce
   * @return the value of enonce
   */
  private String getEnonce () {
    return enonce;
  }

  /**
   * Set the value of choix
   * @param newVar the new value of choix
   */
  private void setChoix (ArrayList<String> newVar) {
    choix = newVar;
  }

  /**
   * Get the value of choix
   * @return the value of choix
   */
  private ArrayList<String> getChoix () {
    return choix;
  }

  /**
   * Set the value of reponse_
   * @param newVar the new value of reponse_
   */
  private void setReponse_ (int newVar) {
    reponse_ = newVar;
  }

  /**
   * Get the value of reponse_
   * @return the value of reponse_
   */
  private int getReponse_ () {
    return reponse_;
  }

  //
  // Other methods
  //

}
