class ZaraUtil {
    static Random rand = new Random();

    // Method to generate salary and service data
    public static int[][] generateSalaryAndServiceData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [][0] = salary, [][1] = years of service

        for (int i = 0; i < numEmployees; i++) {
            int salary = rand.nextInt(90000) + 10000; // Random 5-digit salary
            int serviceYears = rand.nextInt(10) + 1;  // Random years of service between 1-10
            data[i][0] = salary;
            data[i][1] = serviceYears;
        }

        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] salaryData) {
        double[][] result = new double[salaryData.length][2]; // [][0] = bonus, [][1] = new salary

        for (int i = 0; i < salaryData.length; i++) {
            int salary = salaryData[i][0];
            int years = salaryData[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    // Method to display table and totals
    public static void displayBonusReport(int[][] salaryData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-5s %-10s %-15s %-10s %-15s %-15s%n", 
                          "Emp#", "Salary", "Years of Service", "Bonus %", "Bonus Amt", "New Salary");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < salaryData.length; i++) {
            int empNum = i + 1;
            int salary = salaryData[i][0];
            int years = salaryData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];
            String bonusPercent = (years > 5) ? "5%" : "2%";

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-5d %-10d %-15d %-10s %-15.2f %-15.2f%n",
                    empNum, salary, years, bonusPercent, bonus, newSalary);
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-15s %-10s %-15.2f %-15.2f%n",
                "TOTAL", totalOldSalary, "", "", totalBonus, totalNewSalary);
    }
}
