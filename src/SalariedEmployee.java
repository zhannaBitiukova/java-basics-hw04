public class SalariedEmployee extends Employee{
  private String socialSecurityNumber = "";
  private double fixedMonthlyPayment = 0;

  @Override
  public void calculatePay() {
    this.averageMonthlySalary = getFixedMonthlyPayment();
  }
  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    setEmployeeId(employeeId);
    setName(name);
    setSocialSecurityNumber(socialSecurityNumber);
  }

  public String getSocialSecurityNumber() { return socialSecurityNumber; }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() { return fixedMonthlyPayment; }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

}
