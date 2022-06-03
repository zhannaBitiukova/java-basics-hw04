public class ContractedEmployee extends Employee {
  // TODO fix class declaration and declare variables here

  public double hourlyRate = 0;
  public double numberOfHoursWorked = 0;
  public String federalTaxID = "";
  public String employeeID = "";
  public String name = "";

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super();
    // TODO fill in code here
    this.employeeID = employeeId;
    this.name = name;
    this.federalTaxID = federalTaxId;
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement
    return "";
  }

  public void setFederalTaxId(String federalTaxId) {
    // TODO fill in code here
    this.federalTaxID = federalTaxId;
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement
    double averageMonthlySalary = this.hourlyRate * this.numberOfHoursWorked;
    return averageMonthlySalary;
  }

  public void setHourlyRate(double hourlyRate) {
    // TODO fill in code here
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement
    return this.numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    // TODO fill in code here
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  // TODO fill in code here
}
