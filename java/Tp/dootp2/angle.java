class Angle {
        double degre = 0; 


        /** 
         * Constructuer principale 
         * @return 
         */
    public Angle(double x){
        this.degre= norme(x); 
    }
    /**
     * construcuter a partie d'un enter 
     * @param  x float
     *  
     */
    public Angle(int x ){
        double tamp= radians(x);
        this.degre= norme(tamp);
    }
    /** Constructuer initialisant la varible degre a 90(PI/2 radians) */
    public Angle(){
        this.degre = radians(90);
    }
    /**
     * focntion qui peremt d'afficher le degre d'un angle et qui sera utilise avec la methdoe system.out?printl
     * 
     */
    public String toString(){
        return( "valeur :" + Math.toDegrees(this.degre)+"degres");
    }
    /** 
     * permet de verifier si la valeur est bien comprise entre PI et -PI 
     * 
     * @param x double 
     * 
     * @return 
     * x :si x et deja compris entre -PI et PI
     * si x et inferieur a Math.PI return x modulo -2 PI 
     * si x et superieux a Math.PI return x modulo + 2 PI
     *  
     *      */
    public double norme (double x ) { 
        if (x < Math.PI && x > -Math.PI){
            return x;
        }
        else { 
         if(x>Math.PI){
           x-=2*Math.PI;
           return x;
         }
         else{
             x+= 2*Math.PI;
             return x ;
         }
        }
    }
    /**methode qui permet de convertire un angle entier en radian
     * @param angle int
     * @return angle double 
     * 
     */
    public double radians(int angle){
        return Math.toRadians(angle);
    }
    /**
     * mehode qui convertie un radians en degre
     * @param radian double
     * @return tamp int 
     */
    public int degre(double radian){
        int tamp = (int)(radian*Math.PI)/180;
        Math.round(tamp);
        return tamp;
    }
    /**
     * fonction qui donne l'opposer d'un radian sur le cercle triconometrique
     * @param radian double
     * @return  radian double
     */
    public double oppose(double radian){
        if (radian < Math.PI && radian > -Math.PI){
        if (radian < 0 ){
           return (radian + 2*Math.PI);}
        if (radian == 0)
        { return 0;}
        else {
        return (radian -2*Math.PI);
        }
        }
        else {
            int tamp = (int) radian;
            radians(tamp);
           return  oppose(tamp);
        }
    }
    /**
     * mutateur qui ajouter un anglans donner en paramatre a un objet angle 
     * @param x double
     */
    public void ajouter(double x){
        this.degre = this.degre +x;
    }
}