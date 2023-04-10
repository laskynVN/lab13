package employee;

import java.util.Comparator;

public abstract class Employee {
    private String name;
    private int id;

    public Employee() {}

    public Employee(String name , int id)
    {
        setName(name);
        setId(id);
    }

    public abstract double getAverageSalary();


    public static Comparator<Employee> CompToSalaryAndName = new Comparator<Employee>() {

        public int compare(Employee e1, Employee e2) {

            int empSalary1 = (int) e1.getAverageSalary();
            int empSalary2 = (int) e2.getAverageSalary();
            String empName1 = e1.getName().toUpperCase();
            String empName2 = e2.getName().toUpperCase();
            if(empSalary2 != empSalary1 ) {
                return empSalary2 - empSalary1;
            }
            else
            {
                return empName1.compareTo(empName2);
            }
        }};
    @Override
    public String toString() {
        return  "Зарплата " + getAverageSalary() + "\n" +
                "Имя " + getName() + "\n" +
                "Id " + getId() + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
