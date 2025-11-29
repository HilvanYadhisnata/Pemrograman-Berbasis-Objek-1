import java.util.Date;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, double salary, boolean active, String[] skills, Date hireDate, double bonus) {
        super(name, age, salary, active, skills, null);
        this.bonus = bonus;
    }

    // Getter bonus
    public double getBonus() {
        return bonus;
    }

    // Setter bonus
    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            throw new IllegalArgumentException("Bonus tidak boleh negatif!");
        }
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("%-15s : %s%n", "Bonus", nf.format(getBonus()));
    }
    
}