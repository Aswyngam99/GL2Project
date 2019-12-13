package sample.Data.Sondage;

import java.util.*;


/**
 * Class Sondage
 */
public class Sondage {

  //
  // Fields
  //

  private String text;
  private ArrayList<String> choix;
  private ArrayList<Integer> nbVotes;
  
  //
  // Constructors
  //
  public Sondage () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ArrayList<String> getChoix() {
    return choix;
  }

  public void setChoix(ArrayList<String> choix) {
    this.choix = choix;
  }

  public ArrayList<Integer> getNbVotes() {
    return nbVotes;
  }

  public void setNbVotes(ArrayList<Integer> nbVotes) {
    this.nbVotes = nbVotes;
  }


  //
  // Other methods
  //

}
