public class CollinearityCheckerApp {
    public static void main(String[] args) {
        // Sample points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Points:");
        System.out.println("A(" + x1 + "," + y1 + ")");
        System.out.println("B(" + x2 + "," + y2 + ")");
        System.out.println("C(" + x3 + "," + y3 + ")");

        // Check collinearity using slope
        boolean isCollinearSlope = CollinearityChecker.checkCollinearityBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("\nCollinear using Slope? " + isCollinearSlope);

        // Check collinearity using area
        boolean isCollinearArea = CollinearityChecker.checkCollinearityByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Area? " + isCollinearArea);
    }
}
