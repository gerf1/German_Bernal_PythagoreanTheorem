import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
       
         double LegC = 0 ;
         double squareRoot = 0;
        LegC = legA*legA + legB*legB;

        squareRoot =  Math.sqrt(LegC); 

        return squareRoot;
    }
}