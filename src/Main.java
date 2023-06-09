import Figure.Circle;
import Figure.Hexagon;
import Figure.Oval;
import Figure.Pentagon;
import Figure.Triangles.EquilateralTriangle;
import Figure.Triangles.IsoscelesTriangle;
import Figure.Triangles.RightTriangle;
import Figure.Triangles.Triangle;
import Figure.quadrilateral.*;

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

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Равносторонний треугольник");
        equilateralTriangle.sayName();

        Quadrilateral quadrilateral = new Quadrilateral("Четырехугольник");
        quadrilateral.sayName();

        ConvexQuadrilateral convexQuadrilateral = new ConvexQuadrilateral("Выпуклый четырехугольник");
        convexQuadrilateral.sayName();

        Parallelogram parallelogram = new Parallelogram("Параллелограм");
        parallelogram.sayName();

        Rectangle rectangle = new Rectangle("Прямоугольник");
        rectangle.sayName();

        Square square = new Square("Квадрат");
        square.sayName();

        Rhombus rhombus = new Rhombus("Ромб");
        rhombus.sayName();

        Trapeze trapeze = new Trapeze("Трапеция");
        trapeze.sayName();
    }
}