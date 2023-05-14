import Figure.Circle;
import Figure.Oval;
import Figure.Pentagon;

public class Main {
    public static void main(String[] args) {
        Oval oval = new Oval("Овал");
        oval.sayName();

        Pentagon pentagon = new Pentagon("Пятиугольник");
        pentagon.sayName();

        Circle circle = new Circle("Окружность");
        circle.sayName();
    }
}