package sample.Data.Personne;

import sample.Data.Personne.Proprietes.PeutAjoutSupprRessources;
import sample.Data.Personne.Proprietes.PeutCreerBlog;
import sample.Data.Personne.Proprietes.PeutRedigerWiki;

/**
 * Class Administrateur
 */
public class Administrateur extends Utilisateur implements PeutCreerBlog, PeutRedigerWiki, PeutAjoutSupprRessources {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Administrateur () { };
  
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
   */
  public void creerBlog()
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
