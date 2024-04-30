class Coordinate {
    private int x, y, z;

    public Coordinate(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void display() {
        System.out.println("Coordinates: (" + x + ", " + y + ", " + z + ")");
    }

    public static Coordinate addCoordinates(Coordinate c1, Coordinate c2, Coordinate c3) throws ZeroCoordinateException {
        int newX = c1.x + c2.x + c3.x;
        int newY = c1.y + c2.y + c3.y;
        int newZ = c1.z + c2.z + c3.z;

        if (newX == 0 && newY == 0 && newZ == 0) {
            throw new ZeroCoordinateException("Resultant coordinates are all zero.");
        }
        return new Coordinate(newX, newY, newZ);
    }

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(1, 2, 3);
        Coordinate c2 = new Coordinate(4, 5, 6);
        Coordinate c3 = new Coordinate(7, 8, 9);
        try {
            Coordinate result = Coordinate.addCoordinates(c1, c2, c3);
            result.display();
        } catch (ZeroCoordinateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
// Custom exception class for zero coordinates
class ZeroCoordinateException extends Exception {
    public ZeroCoordinateException(String message) {
        super(message);
    }
}
