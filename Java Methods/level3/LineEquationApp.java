public class LineEquationApp {
    public static void main(String[] args) {
        // Sample Points
        double x1 = 2, y1 = 3;
        double x2 = 6, y2 = 11;

        // Calculate Euclidean Distance
        double distance = LineUtil.calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between A(%.1f, %.1f) and B(%.1f, %.1f): %.2f\n", x1, y1, x2, y2, distance);

        // Calculate Line Equation
        double[] lineEquation = LineUtil.calculateLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            double slope = lineEquation[0];
            double intercept = lineEquation[1];
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", slope, intercept);
        } else {
            System.out.println("Line equation is undefined (vertical line).");
        }
    }
}
