//import geodessin.*;
//package ligne; porbleme averc le package
public class Point {
    public double[] coord;

    /**
     *constructeur a partir d'un double
     * @param coords
     */
    public Point(double[] coords) {
        this.coord = coords;
    }

    public Point(double x, double y) {
       this.coord[0]=x ;
       this.coord[1]=y;
    }

    /**
     * constructeur a partire d'un point (constructeur par recopie)
     * @param p
     */
    public Point(Point p) {
        this.coord = p.coord;
    }

    /**
     * methode qui donne les coordoner d'un point
     * @return
     */
    public double[] coordoner(){
        return this.coord ;
    }

    /**
     * methode qui permet d'afficher les coordoner du point
     * @return
     */
    public String toString(){
        return "les coordoner du point son : "+ this.coord ;
    }

    /**
     * donne la coordoner x d'un point
     * @return
     */
    public double x (){
        return this.coord[0];
    }

    /**
     * donne la coorodner y d'un point
     * @return
     */
    public double y (){
        return this.coord[1];
    }

    /**
     * mutateur qui permet de changer l'emplacement du point
     * @param x
     * @param y
     */
    public void deplacer(double x, double y){
        this.coord[0] = x;
        this.coord[1] = y;
    }

    /**
     * methode qui permet de voir si 2 point sont egaux
     * @param p
     * @return
     */
    public boolean confonduAvec(Point p){
        if (this.coord == p.coord){
            return true;
        }
        else return false;
    }

    /**
     * methode qui permet de donne les distance entre 2 point
     * @param p
     * @return
     */
    public double distance(Point p){
        return Math.sqrt(Math.pow((p.coord[0]-this.coord[0]),2) + Math.pow((p.coord[1] - this.coord[1]),2));
    }

    /**
     * methode qui permet de fais une symtrei d'un point pour un autre
     * @param p
     * @return
     */
    public Point symetrique ( Point p ){
        Point point = new Point(0,0);
        point.coord[0] = (this.coord[0]+p.coord[0])/2;
        point.coord[1] = (this.coord[1]+p.coord[1])/2;
    }
}
