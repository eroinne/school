// Fichier  : Terminator.java
// Auteur   : P. Even (IUT de St Die, Dpt Info)
// Contexte : BUT INFO 2021/2022 / Ressource "Qualite de Developpement"


/** Mise en evidence des limites de controle du ramasse-miettes. */
class Terminator
{
  /** Nombre de terminators crees. */
  private static int nb = 0;
  /** Nombre de terminators crees et delaisses a chaque cycle. */
  private final static int nbt = 10;
  /** Nombre de paquets de gros objets crees a chaque cycle. */
  private static int nbb = 10;
  /** Taille des gros objets. */
  private static int bigobj = 2000;
  /** Numero du terminator. */
  private final int num;


  /** Construit un terminator. */
  Terminator ()
  {
    num = nb++;
  }

  /** Signale la destruction effective du Terminator. */
  protected void finalize ()
  {
    System.out.println ("Elimination de " + num);
  }

  /** Creation et destruction de terminators. */
  public static void main (String[] args)
  {
    boolean arret = false;
    if (args.length > 0) nbb = (new Integer (args[0])).intValue ();
    Saisie s = new Saisie ();
    do
    {
      System.out.println ("0: sortie, 1: ajout ou retrait, 2: ramasse-miettes");
      switch (s.entier ())
      {
        case 0 : // Fin du programme
          arret = true;
          break;
        case 1 : // Creation et destruction de nbt terminators
          for (int i = 0; i < nbt; i++)
          {
            double[] tmp = new double[nbb * bigobj];
            new Terminator ();
          }
          break;
        case 2 : // Forcage de la mise en oeuvre du ramasse-niettes
          System.gc ();
          break;
      }
    } 
    while (! arret);
  }
}
