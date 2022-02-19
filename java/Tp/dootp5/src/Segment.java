//import geodessin.*;
//package ligne;

public class Segment {
    public Point[] segement;

    public Segment(Point[] extremites){
        this.segement[0]= extremites[0];
        this.segement[1] = extremites[1];
    }
    public Segment(Point p1, Point p2){
        this.segement[0] = p1;
        this.segement[1] = p2;
    }

    /**
     * focntion qui permet de donne la longeur d'un segment
     * @return
     */
    public double longueur (){
        return this.segement[0].distance(this.segement[1]);
    }

    /**
     * metode qui renvois l'inversse dun segment
     * @return
     */
    public Segment inverse (){
        Point[] tamp = new Point[0];
        tamp[0] = this.segement[1];
        tamp[1] = this.segement[0];
        Segment segments2 = new Segment(tamp);
        return segments2;
    }

    /**
     * focntion qui donne un point millieux du segements
     * @return
     */
    public Point millieux(){
        Point point = new Point(0,0);
        point.coord[0]=(this.segement[0].coord[0] + this.segement[1].coord[0])/2;
        point.coord[1]=(this.segement[0].coord[1] + this.segement[1].coord[1]);
        return point;
    }

    /**
     * methodde qui permet de savoir si 2 segment se coupe
     * @param s2
     * @return
     */
    public boolean coupe(Segment s2) {
        double x1 = this.segement[0].x();
        double y1 = this.segement[0].y();
        double x2 = this.segement[1].x();
        double y2 = this.segement[1].y();
        double x3 = s2.segement[0].x();
        double y3 = s2.segement[0].y();
        double x4 = s2.segement[1].x();
        double y4 = s2.segement[1].y();
        if ((((x1 <= x3 && x3 <= x2) || (x1 <= x4 && x4 <= x2)) && (y3 <= y1 && y1 <= y4)) || (((x3 <= x1 && x1 <= x4) || (x3 <= x2 && x2 <= x4)) && (y1 <= y3 && y3 <= y2))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean contien (){
        return true;
    }

}
