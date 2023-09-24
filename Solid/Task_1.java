// public class Employee {
//     private String name;
//     private Date dob;
//     private int baseSalary;

//     public Employee(String name, Date dob, int baseSalary) {
//         this.name = name;
//         this.dob = dob;
//         this.baseSalary = baseSalary;
//     }

//     public String getEmpInfo() {
//         return "name - " + name + " , dob - " + dob.toString();
//     }

//     public int calculateNetSalary() {
//         int tax = (int) (baseSalary * 0.25);// calculate in otherway
//         return baseSalary - tax;
//     }
// }

public class Employee {
    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}

public class Salary {
    private Employee employee;
    private int baseSalary;

    public Salary(Employee employee, int baseSalary) {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }

}