import java.util.Date;
import java.text.SimpleDateFormat;
public class MainEmployee {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee("anjing", 2, 0.0, false, new String[]{}, null);
        
        Manager mgr1 = new Manager("Budi", 35, 8000.0, true, new String[]{}, null, 1500.0);
        
        // Setting values Array Skills 
        String[] skills = {"Java", "Python", "C++"};
        emp1.setSkills(skills);

        String[] mgrSkills = {"Leadership", "Communication", "Project Management"};
        mgr1.setSkills(mgrSkills);        

        // Setting Hire Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date hireDate = sdf.parse("2024-01-15");
        emp1.setHireDate(hireDate);

        Date hireDateMgr = sdf.parse("2022-06-01"); 
        mgr1.setHireDate(hireDateMgr);

        // Display Employee Info
        emp1.displayInfo();
        mgr1.displayInfo();

        // System.out.println("Name of Employee: " + emp1.getName());
        // System.out.println("Age of Employee: " + emp1.getAge());
        // System.out.println("Salary of Employee: " + emp1.getSalary());
        // System.out.println("Skills of Employee: " + String.join(", ", emp1.getSkills()));
        // System.out.println("Employee Status: " + (emp1.isActive() ? "Active" : "Inactive"));
        // System.out.println("Hire Date of Employee: " + emp1.getHireDate());
        }
    
}