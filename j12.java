interface Area {
    float PI = 3.14f;
    float calculate(float radius);
}

class Circle implements Area {
    @Override
    public float calculate(float radius) {
        float area = PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
        return area;
    }
}

public class j12 {
    public static void main(String[] args) {
        // Question 12: create a program for interface and use in a class
        Circle circle1 = new Circle();
        circle1.calculate(1.2f);
    }
}
