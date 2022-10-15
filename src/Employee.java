public class Employee {
    private final String name;
    private int department;
    private float salary;
    private int id;
    private static int counter = 0;

    public Employee (String name, int department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("ФИО: " + name + ", отдел: " + department + ", зарплата: " +
                salary);
    }
}
