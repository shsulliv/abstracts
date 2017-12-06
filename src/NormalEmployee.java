public class NormalEmployee extends Employee {

  public int getMonthlySalary() {
    return Math.round(basicSalary / 12);
  }
}
