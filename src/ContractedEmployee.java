public class ContractedEmployee extends Employee {
  private String federalTaxID = "";
  private double hourlyRate = 0;
  private double numberOfHoursWorked = 0;

  @Override
  public void calculatePay() {
    this.averageMonthlySalary = getHourlyRate() * getNumberOfHoursWorked();
  }
  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    setEmployeeId(employeeId);
    setName(name);
    setFederalTaxId(federalTaxId);
  }

  public String getFederalTaxId() {
    return this.federalTaxID;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxID = federalTaxId;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return this.numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

}
