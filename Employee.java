package classes;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        double zam;
        if ((2021 - hireYear) < 10) {
            zam = this.salary * 0.05;
        } else if ((2021 - hireYear) < 20) {
            zam = this.salary * 0.1;
        } else {
            zam = this.salary * 0.15;
        }
        return zam;
    }

    public void toStrin() {
        double tax = this.tax();
        double bonus = this.bonus();
        double raiseSalary = this.raiseSalary();
        System.out.println("Employee Name\t: " + this.name + "\nEmployee Salary\t: " + this.salary + "\nWork Hours\t\t: " + this.workHours +
                            "\nhireYear\t\t: " + this.hireYear);
        System.out.println("Tax\t\t\t\t: " + tax);
        System.out.println("Bonus\t\t\t: " + bonus);
        System.out.println("Salary raise\t: " + raiseSalary);
        double totalSalary = this.salary - tax + bonus + raiseSalary;
        System.out.println("Total Salary\t: " + totalSalary);
    }

}
