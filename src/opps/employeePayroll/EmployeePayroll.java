package opps.employeePayroll;

class EmployeePayroll extends Payroll {

    private Employee employee;
    private double tax;
    private double deduction;

    public EmployeePayroll(Employee employee,
                           double tax,
                           double deduction) {
        this.employee = employee;
        this.tax = tax;
        this.deduction = deduction;
    }

    @Override
    public double calculateNetPay() {
        return employee.getSalary() - tax - deduction;
    }

    public void displayPaySlip() {
        System.out.println("\n------ PAY SLIP ------");
        System.out.println("Employee ID : " + employee.getEmpId());
        System.out.println("Name        : " + employee.getName());
        System.out.println("Salary      : " + employee.getSalary());
        System.out.println("Tax         : " + tax);
        System.out.println("Deduction   : " + deduction);
        System.out.println("Net Pay     : " + calculateNetPay());
    }
}
