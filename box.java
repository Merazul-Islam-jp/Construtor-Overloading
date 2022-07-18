package Constroture_Overloading;

public class box {

    double height, width, depth;

    box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    // Construtor overloading

    box() {
        height = width = depth = 0;
    }
    // Construtor overloading

    box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        double vol;

        box obj1 = new box();
        box obj2 = new box(10, 20, 30);
        box obj3 = new box(3);

        prln("the first object value is:" + obj1.volume());
        prln("the Second object value is:" + obj2.volume());
        prln("the Third object value is:" + obj3.volume());

    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

}
