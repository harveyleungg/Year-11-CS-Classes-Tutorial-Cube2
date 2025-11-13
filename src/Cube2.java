public class Cube2 {
    /// properties
    private Cube basicCube;
    private String color;

    /// constructors
    public Cube2() {
        this.basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this.basicCube = new Cube(side);
        basicCube.setSide(side);
        this.color = "black";
    }

    public Cube2(int side, String color) {
        this.basicCube = new Cube(side);
        basicCube.setSide(side);
        this.color = color;
    }

    /// behaviors
    public int getSide() {
        return basicCube.getSide();
    }
    public void setSide(int side) {
        basicCube.setSide(side);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int calculateVolume() {
        return basicCube.calculateVolume();
    }
    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }

    public String toString(int side, String color) {
        return "Cube{side=" + side + ", color=" + color + "}";
    }
    public Cube2 add(Cube2 otherCube) {
        int a = this.basicCube.getSide();
        int b = otherCube.getSide();
        int a2 = a * a;
        int b2 = b * b;
        int c2 = a2 + b2;
        long c = Math.round(Math.sqrt(c2));
        if (c * c != c2) {
            throw new IllegalArgumentException("Sides of two cubes do not form a Pythagorean triple!");
        }

        Cube2 newCube = new Cube2();
        newCube.setSide((int) c);
        newCube.setColor(this.color);
        return newCube;
    }
    public Cube2 minus(Cube2 otherCube) {
        int a = this.basicCube.getSide();
        int b = otherCube.getSide();
        int a2 = a * a;
        int b2 = b * b;
        int c2 = Math.abs(a2 - b2);
        long c = Math.round(Math.sqrt(c2));
        if (c * c != c2) {
            throw new IllegalArgumentException("Sides of two cubes do not form a Pythagorean triple!");
        }

        Cube2 newCube = new Cube2();
        newCube.setSide((int) c);
        newCube.setColor(this.color);
        return newCube;
    }

    public String toString() {
        return "Cube{side=" + basicCube.getSide() + ", color=\"" + this.color + "\"}";
    }
}
