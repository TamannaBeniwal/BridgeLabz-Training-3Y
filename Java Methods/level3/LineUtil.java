class LineUtil {

    // Method to calculate Euclidean distance
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and intercept and return as array [slope, intercept]
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            // Avoid division by zero for vertical line
            return null;
        }

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - (slope * x1);
        return new double[]{slope, intercept};
    }
}
