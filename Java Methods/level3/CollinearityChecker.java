class CollinearityChecker {

    // Method to check collinearity using slope formula
    public static boolean checkCollinearityBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // To avoid division by zero, cross-multiply instead of directly dividing
        int slopeAB_Y = y2 - y1;
        int slopeAB_X = x2 - x1;

        int slopeBC_Y = y3 - y2;
        int slopeBC_X = x3 - x2;

        int slopeAC_Y = y3 - y1;
        int slopeAC_X = x3 - x1;

        // Check: (y2 - y1)*(x3 - x2) == (y3 - y2)*(x2 - x1)
        // If slopes AB, BC, and AC are equal, the following condition must hold:
        return (slopeAB_Y * slopeBC_X == slopeBC_Y * slopeAB_X) &&
               (slopeAB_Y * slopeAC_X == slopeAC_Y * slopeAB_X);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean checkCollinearityByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));
        return area == 0.0;
    }
}
