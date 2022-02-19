import geodessin.*;
import geodessin.dessin.Afficheur;
import geodessin.geo.Visee;

public class Triangle {
    private Point[]  P;

    /**
     * contrusteur
     * @param p1
     * @param p2
     * @param p3
     */
    public Triangle (Point p1, Point p2, Point p3 ) {
        this.P[0] = p1;
        this.P[1] = p2;
        this.P[2] = p3;
    }

    /**
     * meethode qui affige les sommet d un triangle
     * @return
     */
    public Point[] sommets(){
        return this.P;
    }

    /**
     * methode qui permet d'afficher les arretes d un triangle
     * @return
     */
    public Segment[] arretes(){
        Segment segment = new Segment(this.P[0],this.P[1]);
        Segment segment2 = new Segment(this.P[0],this.P[2]);
        Segment segment3 = new Segment(this.P[1],this.P[2]);
        Segment[] tamp = new Segment[0];
        tamp[0] = segment;
        tamp[1] = segment2;
        tamp[2] = segment3;
        return tamp ;
    }

    /**
     * methode qui donne le perimtre d un triangle
     * @return
     */
    public double perimetre (){
        return this.arretes()[0].longueur() + this.arretes()[1].longueur() + this.arretes()[2].longueur();
    }

    /**
     * methode qui verifie si les sommet son donne dnas le bon sens(sens trigonometrique)
     * @return
     */
    public boolean direct (){
        // je comprent l'importance de cette fonction mais je ne trouve aps de moyen pour la realiser
        return true ;
    }

    /**
     * methode qui verifie si un triangle passe sur un point
     * @param p
     * @return
     */
    public boolean passePar(Point p){
        if (this.arretes()[0].contien() == true){
            return true;
        }
        else if(this.arretes()[1].contien() == true){
            return true;
        }
        else if (this.arretes()[2].contien() == true){
            return true;
        }
        else return false;
    }

    /**
     * methode qui verifie si un point donne et a l'interieur du triangle ou non
     * @param p
     * @return
     */
    public boolean entour(Point p){
        Visee vise = new Visee(this.P[0].coord[0],this.P[0].coord[1],this.P[1].coord[0],this.P[1].coord[1]);
        Visee vise1 = new Visee(this.P[0].coord[0],this.P[0].coord[1],this.P[2].coord[0],this.P[1].coord[1]);
        Visee vise2 = new Visee(this.P[1].coord[0],this.P[0].coord[1],this.P[2].coord[0],this.P[1].coord[1]);

        if (vise.aGauche(p.coord[0],p.coord[1])){
            if (vise1.aGauche(p.coord[0],p.coord[1])){
                if (vise2.aGauche(p.coord[0],p.coord[1])){
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /**
     * methode qui permet d'afficher les coordoner du traingle
     * @return
     */
    public String toString(){
        return "le triangle a pour coordonner :"+this.P;
    }

    /**
     * methode qui permet d'afficher le triangle
     */
    public void tracer (){
        Afficheur affigage = new Afficheur(200,200);
        affigage.zoneVisible(-100,100,-100,100);
        affigage.ajouterTriangle(this.P[0].coord[0],this.P[0].coord[1],this.P[1].coord[0],this.P[1].coord[1],this.P[2].coord[0],this.P[2].coord[1]);
        if (affigage.valide() == true){
            if (affigage.visible() == true){
                affigage.activer();
            }
        }
    }
}
