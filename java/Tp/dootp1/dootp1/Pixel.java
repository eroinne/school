
public class Pixel {
    double x;
    double y;
    /** constuctuer sans parametre */
    Pixel (){
        this.x=0;
        this.y=0;

    }
    /** constuctueravec un pixel en parametre */
    public Pixel(Pixel P){
        this(P.x,P.y);
    }
    /**Construcuter avec deux reel en parametre  */
    Pixel(double X , double Y){
        this.x=X;
        this.y=Y;
}
    /**Contrsucteur avec parametre  */
    Pixel(int x, int y){
        this.x=x; 
        this.y=y;
    }
    /** constructuer avec 2 tabealux d'entier  */
    Pixel(int[]tab1, int[] tab2){
        this.x=tab1[1]-tab1[0];
        this.y=tab2[1]-tab2[0];
    }
    /** methoe qui permet d'afficher le pixel( utiliser dans le system.out.println()) 
     * @return  un String
     */
    public String toString(){
        return("(" + this.x + "," + this.y+ ")" );
    }
    /**
     * methode qui return le carre de la distance euclidienne d'un pixel pris en 
     * parametre
     * @param P
     * @return un double 
     */
    public double distance2(Pixel P){
        return(x*x + y*y);
    }
    /**
     * Methode qui test si le pixel est plus loin de l'origine que le pixel en paramètre
     * @return un booleen
     */
    public boolean plusloinQue(){
        double tamp1;
        tamp1 =this.x+this.y;
        double tamp;
        tamp=distance2(this);
        if (tamp1 > tamp ){
            return true ;
            }
        return false;
    }
}

