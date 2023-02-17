//IT's a code calculates the total salary of employees with base pay and hours worked.
class FooCorporation {
    public static void calculateSalary(double base_pay, int working_hour) {
        if (base_pay < 8.00) {
            System.out.println("Error: Minimum wage cannot be less than $8.00/hour.");
        } else if (working_hour > 60) {
            System.out.println("Error: Working hour cannot be more than 60 hours.");
        } else if (working_hour > 40) {
            extraSalary(base_pay, working_hour);
        } else {
            double salary = base_pay * working_hour;
            System.out.println("Salary of employee: " + salary);
        }
    }

    public static double extraSalary(double base_pay, int working_hour) {
        int overtime = working_hour - 40;
        double salary = base_pay * 1.5 * overtime;
        System.out.println("Salary of employee: " + salary);
        return salary;
    }

    public static void main(String[] args) {
        calculateSalary(7.50, 35);
        calculateSalary(8.20, 47);
        calculateSalary(10.00, 73);
    }
}
