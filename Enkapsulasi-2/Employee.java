import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private boolean active;
    private String[] skills;
    private Date hireDate;
    
    public Employee(String name, int age, double salary, boolean active, String[] skills, Date hireDate) {
        // Default constructor
        setName(name);
        setAge(age);
        setSalary(salary); 
        setActive(active);
        setSkills(skills);
        setHireDate(hireDate);
    }

    // Getter age
    public int getAge(){
        return age;
    }

    // Setter Age
    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Umur harus lebih dari 0!");
        }
    }

    // Getter name
    public String getName() {
        return name;
    }

    // Setter name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nama tidak boleh kosong!");
            
        }
    }

    // Formatter Rupiah
    protected static final NumberFormat nf = 
    NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"));

    // Getter salary
    public double getSalary() {
        return salary;
    }

    // Setter salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary tidak boleh negatif!");
        }
    }

    // Getter active
    public boolean isActive() {
        return active;
    }

    // Setter active
    public void setActive(boolean active) {
        this.active = active;
    }

    // Getter Skills
    public String[] getSkills() {
        return skills;
    }

    // Setter skills
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    // Getter hireDate
    public Date getHireDate() {
        return hireDate;
    }

    // Setter hireDate
    public void setHireDate(Date hireDate) {
        Date today = new Date(); // tanggal saat ini

    if (hireDate.after(today)) {
        throw new IllegalArgumentException("Hire date tidak boleh lebih dari hari ini!");
    }

    this.hireDate = hireDate;;
    }

    // Tampilknkan info employee
    public void displayInfo() {
        System.out.println("================================= Data Employee =================================");
        System.out.printf("%-15s : %s%n", "Name", getName());
        System.out.printf("%-15s : %d%n", "Age", getAge());
        System.out.printf("%-15s : %s%n", "Salary", nf.format(getSalary()));
        System.out.printf("%-15s : %s%n", "Active", (isActive() ? "Yes" : "No"));
        System.out.printf("%-15s : %s%n", "Skills", String.join(", ", getSkills()));
        System.out.printf("%-15s : %s%n", "Hire Date", getHireDate());
        

    }
   
}
