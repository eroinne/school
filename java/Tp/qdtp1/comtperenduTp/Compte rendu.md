Lambey
Baptiste

# TPQ1

### Exercice 1 

Corection des eurreur : <br>

1) 
```java
  boolean toutPair = FAUX;
```
l'eurrer etait un erreur de signalisation la farbilant toutpaire etait inisialiser a 0 et non a un  boolean <br>

2)
```java 
public final static double seuil = 1.76;
```
erreur d'initialisation sa varibale seuil etait considere come un float est non un double <br>

3) 
```java
toutPair = true;
```
erreur de syntaxe : la variable toutPaire s'est retrouver initialiser a la valuer **trou** au lieux de **true** <br>

4) 
```java 
if (laveurs[cpt] % 2==0 ) 
```
l'erruer ici se trovue etre une erreur de syntaxe ou le programeur avais oublier le ==0 a la fin par consequance le programe testais si :"laveurs[cpt] % 2" renvoyais une faleur boolean true ou fals <br> 

5)
```java
static boolean toutPair = false;
```
l'eurreur ici et une erreur de static la variable toutPair s'est trouver ne pas etre static se  qui a entrener des erreur<br>

6)
```java
static double moyenne ()
```
erreur static du meme type que si desu <br>

7)
```java
static int[] laveurs = {2, 0, 0, 2};
```
erreur de type contexte statique  la varible laveur n'etait pas consider comme static 

8)
```java
public static double seuil = 1.76;
```
la viarlbe etait considerer comme etant une varible final allrod quelle ne devais pas s'est donc une eurreur d'initialisation<br>

9)
```java
 int i =0 ;
```
l'erreur ici est une erruer d'initilasiation la variable i n'etait tout silmplement pas initialiser a 0 <br>

10)
```java
    Decouverte autreObjet= new Decouverte ();
```
l'eurr ici se trouve aussi etre une erreur d'initialisation l'objet autre objet netait pas considerer comme etant direcement un nouvelle objet de decouvert<br>

11)
```java
 while (i < laveurs.length)
```
 l'erreur icic sze trouvais etre que l'index allais jsuqua 4 se qui sortia du tableaux car il considerai qu'il y avais donc 5 element pour la solution nous avons utiliser la longeur du tableaux pour eviter de sortir du talbeux <br>

12)
```java
 double m = monObjet.moyenne();
```
 deffinition d'un objet pour effiter les autre erreur. <br>


 Maintenat que le programe fonction corecetemtn nous allons nous atarder sur les mots infinity et NaN <br>
 infinity aparais car l'on initialise la varible autreObjet a une division par 0 <br>
 quand  au NaN il aprair car l'on trouve une erruer lors de l'operation suivante : "autreObjet.seuil - autreObjet.seuil"


### Exercice 2 

Le programe terminator.java permet de metre en evidance les limit du ramasse miete. Le nom controle du raamse miette est mis en evidance a l'aide de plusieru probleme. par exmple si l'o,n rentre pleusieur fois le nombre 1 le ramace miette se lance automatiquement de plus l'autre dans le quelle il detruie les objet et aleatoire, de plus il peux exectuer la destruction nimport quand.