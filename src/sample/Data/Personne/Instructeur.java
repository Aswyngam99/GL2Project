package sample.Data.Personne;

import sample.Data.Personne.Proprietes.*;
import sample.Data.Personne.Utilisateur;


/**
 * Class Instructeur
 */
public class Instructeur extends Utilisateur implements PeutCommuniquer, PeutParticiperauxforums, PeutVoter, PeutCreerBlog, PeutCreerWiki, PeutModifierRessources {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Instructeur () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   * @param        titre
   * @param        contenu
   */
  public void creerUnTopic(String titre, String contenu)
  {
  }


  /**
   * @param        reponse
   */
  public void repondre(String reponse)
  {
  }


  /**
   */
  public void creerBlog()
  {
  }


  /**
   * @param        titre
   * @param        description
   */
  public void creerWiki(String titre, String description)
  {
  }


}
