public class BonusEmployee extends NormalEmployee {
  private final int bonus;

  public BonusEmployee(int bonus) {
    this.bonus = bonus;
  }

  public int getMonthlySalary() {
    return super.getMonthlySalary() + bonus;
  }
}
