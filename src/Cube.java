public class Cube {
    /// properties
    private int side;

    /// constructors
    public Cube() {
        this.side = 1;
    }
    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = side;
    }

    /// behaviors
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = side;
    }
    public int calculateSurfaceArea() {
        return side * side * 6;
    }
    public int calculateVolume() {
        return side * side * side;
    }
    public String toString(int side, String color) {
        return "Cube{side=" + side + ", color=\"" + color + "\"}";
    }
}
