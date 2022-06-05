
public class Employee implements Payable {
  public Employee() {}
  private String employeeId = "";
  private String name = "";
  protected double averageMonthlySalary = 0;

  public void calculatePay() {}

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() { return this.employeeId; }

  public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

  public String getName() { return this.name; }

  public void setName(String name) { this.name = name; }

  public double getAverageMonthlySalary() { return this.averageMonthlySalary; }

  @Override
  public String toString() {
    String format = "%.2f";
    String averageMonthlySalaryFormatted = String.format(format, getAverageMonthlySalary());
    return "Average monthly salary is "
            + averageMonthlySalaryFormatted
            + " for employee " + getName()
            + ", " + getEmployeeId();
  }
}
