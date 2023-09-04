package entities;

public class Student {

    public String name;

    public double firstPoint;
    public double secondPoint;
    public double thirdPoint;

    public double finalScore(){
        return firstPoint + secondPoint + thirdPoint;

    }

    public double missingPoint(){
        if (finalScore() < 60){
            return 60 - finalScore();
        }else {
            return 0.0;
        }
    }

}
