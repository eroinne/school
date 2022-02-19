# Math-Graphe

## Généraliter

### Graphe orienter

- Graph d'odre n( nb de sommet)
- Graph de taille m ( nb d'arc )
- cas particulier :
    > un 1-graph = simple

### Graph non Orienter

- Multigraph -> plusier arrete entre 2 sommet
- au plus 1 arrete ente 2 sommet = simple
  
### Graph deffinition

- complet ->  si arc= (a,b) et (b,a)
- biparti -> 2 partie dans le garph  
- un sommet et dit incideant a un arc si il est une des extremiter
- isomorph -> si   `x adjacent a y dans G ⇔ f (x) adjacent a f (y) dans G`
- demi degré exterieur ->nb d'arc ayent i comme extermiter initial (d+(i) )
- demi degre interrieur ->  nb d'arc ayent j comme extermiter final (d-(j) )
- degre -> nb d'arc ayanty i comme extremiter (d(i) )
- arc incident ( preille que demi degre maix aveec des arc aynet leru extremiter initialdans a )
- cocyle -> ensemble des arcs incidents
- clique -> sous graph complet
- matrice d'insidence sommet arcs
  
---

### Ordonnancement
ojectife : decomposer en tache careteriquer par leur duree <br>
graph possible : graphe potentiels-taches et le graphe potentiels-etapes (graphe PERT).

#### Construction du Graph

- chque tache = un sommet <br>
- un arc (i,j) de longeur di si la tache i precede la tache j 
- 2 sommet alpha et omega (tach ficitve de duree 0 (debut est fin de traveaux))
- represnetation des rang ( `le nombre d'arcs dnas un chemin de cardinaliter max entre alpha et un sommet donnée` )
- chaine elmentaire :  chemain tel que l'on ne recontre le mme sommet que 1 seul fois
- cycle : cahine don les extremiter coincident
- cycle elementaire ( pareille que chaine )
- chaine symple : tout les arrete dons differente
- cycle simple : on ne passe que 1 fois par arrete
- distance d(i,j) : longuer du plus court chemin

---
Important :
> distance D(i,j) longeur du plus cour chemin / max e(i)
> diamtre omega(G) = max d(i,j)
> Ecartement e(i) = max d(i,j)
> rayon rho(G) = min e(i)
> Un centre = sommet d'ecartement minimal
> Le centre = ensemble des centre
> nilpotante : un matice et nilpotante si A^k = 0

si matrice d'agence et nilpotante le grahe orienter et snas circuit

```n

 fermeture transitive :ensemble de sommet que lon peux attindre depusi un sommet donne 
 si -1 : ancetre 
 si 1 : decendants 

```

Un chrape et dis connex si pour TOUT couple de sommet(i,j) il exisite une chaine joignant i et j.
un graph et dis donnex si et selemnt si sa conextiter est egale a 1

fortement connex : si il existe un chemin entre 2 sommet (i;j) dans cette ordre

cycle heulerien : chaine eulerienne avec la meme extremiter

Cycle eulerien :
> Théorème 1 : un graphe connexe G admet un cycle eulérien si et seulement
si tous ses sommets sont de degré pair

eulerien : admet un cycle eulerien
semie eulerien : ademn une chane eulerienne

si le nb de sommet :

- et nul -> graph eulerien
- est egale a 2 les chaine eulereienn du pgrah auront s'est 2 sommet comme extremiter
  
chemin hamiltonien : passer 1 fois par chque sommet(parielle pour circute etc...)

### Coloration

graphe adjoin : graph au sommet est arrte sonbt inversser
graph plainaire : graph ua aucune arrete n'es croisse une autere
