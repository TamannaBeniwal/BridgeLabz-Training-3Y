import java.util.Random;

public class ZaraBonusCalculatorApp {
    public static void main(String[] args) {
        // Step 1: Generate salary and service data
        int[][] salaryData = ZaraUtil.generateSalaryAndServiceData(10);

        // Step 2: Calculate new salary and bonus
        double[][] bonusData = ZaraUtil.calculateBonusAndNewSalary(salaryData);

        // Step 3: Display tabular data and totals
        ZaraUtil.displayBonusReport(salaryData, bonusData);
    }
}
