// Fichier  : ProgrammeStupide.java
// Auteur   : P. Even (IUT de St Die, Dpt Info)
// Contexte : BUT INFO 2021/2022 / Ressource "Qualite de Developpement"


/** Code truffe d'erreurs a diagnostiquer et corriger. */
class Decouverte
{
  /** Exemple d'attribut d'instance de type booleen initialise a FAUX. */
  static boolean toutPair = false;
  /** Exemple d'attribut de classe de type reel simple precision. */
  public static double seuil = 1.76;
  /** Exemple d'attibut d'instance de type tableau d'entiers. */
  int[] laveurs = {2, 0, 0, 2};


  /** Determine si le tableau ne comporte que des valeurs paires.
    * Met a jour l'attribut toutPair. */
  void verifierParite ()
  {
    int cpt = 0;
    toutPair = true;
    for (cpt = 0; toutPair && cpt < laveurs.length; cpt ++)
      if (laveurs[cpt] % 2==0 ) 
      toutPair = false;
  }

  /** Retourne la moyenne des valeurs. */
   double moyenne ()
  {
    int i =0 ;
    long cumul = 0L;
    while (i < laveurs.length)
    {
      cumul += laveurs[i];
      i += 1;
    }
    return (cumul / (double) i) ;
  }

  /** Verifie si la moyenne est elevee (par rapport au seuil). */
  boolean moyenneElevee ()
  {
    return (moyenne () > seuil);
  }

  /** Convertit l'instance de Decouverte en chienne de caractere. */
  public String toString ()
  {
    String chaine = new String ("Donnees de moyenne ");
    if (! moyenneElevee ()) chaine = chaine + "peu ";
    return (chaine + "elevee");
  }


  /** Test de la classe. */
  public static void main (String[] args)
  {
    // Creation d'une instance de la classe Decouverte
    Decouverte monObjet = new Decouverte ();
    monObjet.verifierParite ();

    // Affichage
    System.out.print (monObjet);
    if (! toutPair) System.out.print (" pas");
    System.out.println (" toutes paires");

    // Retrait d'une valeur dans le tableau
    // il faut recreer un nouveau tableau 
    int[] nouveauTableau = new int[3];
    for (int i = 0; i < 3; i++) nouveauTableau[i] = monObjet.laveurs[i];
    monObjet.laveurs = nouveauTableau;

    // Mise a jour de la parite
    monObjet.verifierParite ();

    // Affichage de la moyenne des valeurs
    System.out.print ("Moyenne (" + monObjet.laveurs[0]);
    for (int i = 1; i < monObjet.laveurs.length; i++)
      System.out.print ("," + monObjet.laveurs[i]);
    double m = monObjet.moyenne();
    System.out.println (") = " + m);
    System.out.print ("Test ma moyenne = " + m + " : ");
    if (m > 0.67 || m < 0.66) System.out.println ("ERREUR");
    else System.out.println ("OK");

    // Creation d'un nouvel objet et affichage de sa moyenne
    Decouverte autreObjet= new Decouverte ();
    m = autreObjet.moyenne ();
    System.out.print ("Test autre moyenne = " + m + " : ");
    if (m > 1.01 || m < 0.99) System.out.println ("ERREUR");
    else System.out.println ("OK");
    

    // Affichage de l'inverse de la deuxieme valeur
    autreObjet.seuil = 1.F / monObjet.laveurs[1];
    System.out.println ("Inverse n2 = " + autreObjet.seuil);
    System.out.println ((autreObjet.seuil - autreObjet.seuil) + "a");
  }
}
