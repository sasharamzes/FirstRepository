package Figure;

public class Figure {
    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public void sayName(){
        System.out.println("Это " + name);
    }
}
