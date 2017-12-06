public class Main {
  public static void main(String[] args) {
    Employee be = new BonusEmployee(350);
    be.setBasicSalary(120000);

    System.out.println(be.getMonthlySalary());
  }
}
