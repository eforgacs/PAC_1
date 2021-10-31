package TextbookExamples;

class Circle {
    private double radius;

    public Circle(double radius) {
        radius = radius;
        System.out.println(this.radius);
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(2);
    }
}

