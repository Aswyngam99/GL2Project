package sample.Data.Personne;

import sample.Data.Personne.Proprietes.*;


/**
 * Class Apprenant
 */
public class Apprenant extends Utilisateur implements PeutCommuniquer, PeutParticiperauxforums, PeutVoter, PeutRedigerWiki, PeutModifierRessources {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Apprenant () { };
  
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
   * @param        titre
   * @param        contenu
   */
  public void redigerWiki(String titre, String contenu)
  {
  }


}
