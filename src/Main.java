import Figure.Circle;
import Figure.Hexagon;
import Figure.Oval;
import Figure.Pentagon;
import Figure.Triangles.IsoscelesTriangle;
import Figure.Triangles.RightTriangle;
import Figure.Triangles.Triangle;

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

        RightTriangle rightTriangle = new RightTriangle("Прямоугольный треугольник");
        rightTriangle.sayName();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle("Равнобедренный треугольник");
        isoscelesTriangle.sayName();
    }
}