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
-  biparti -> 2 partie dans le garph  
-  un sommet et dit incideant a un arc si il est une des extremiter 
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

