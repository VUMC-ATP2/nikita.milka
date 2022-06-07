package classroom.objects;

public class Circle {

    final double PI = 3.14;
    double circleRadius;

    // PI * R ^ 2

    public double circleArea(double radius) {
        circleRadius = PI * (radius * radius);
        //return PI * Math.pow(radius, 2);
        return circleRadius;
    }
}
