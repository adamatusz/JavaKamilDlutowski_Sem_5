package Lab2_23112025;

import java.time.LocalDate;

// Abstrakcyjna klasa Osoba
abstract class Person {
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}


class EmployeePoint2 extends Person {
    private double salary;
    private LocalDate hireDate;

    public EmployeePoint2(String name, double salary, LocalDate hireDate) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String getDescription() {
        return "Pracownik o wynagrodzeniu " + salary + " zatrudniony " + hireDate;
    }
}

class Manager extends EmployeePoint2 {
    private double bonus;

    public Manager(String name, double salary, LocalDate hireDate, double bonus) {
        super(name, salary, hireDate);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String getDescription() {
        return "Manager o wynagrodzeniu " + getSalary() +
                " (w tym bonus " + bonus + ") zatrudniony " + getHireDate();
    }
}
