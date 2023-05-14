import Figure.Circle;
import Figure.Hexagon;
import Figure.Oval;
import Figure.Pentagon;
import Triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        Oval oval = new Oval("Овал");
        oval.sayName();

        Pentagon pentagon = new Pentagon("Пятиугольник");
        pentagon.sayName();

        Circle circle = new Circle("Окружность");
        circle.sayName();

        Hexagon hexagon = new Hexagon("Шистиугольник");
        hexagon.sayName();

        Triangle triangle = new Triangle("Треугольник");
        triangle.sayName();
    }
}