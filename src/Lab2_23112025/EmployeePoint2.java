//package Lab2_23112025;
//
//import java.time.LocalDate;
//
//class EmployeePoint2 {
//    private String name;
//    private double salary;
//    private LocalDate hireDate;
//
//    public EmployeePoint2(String name, double salary, LocalDate hireDate) {
//        this.name = name;
//        this.salary = salary;
//        this.hireDate = hireDate;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public LocalDate getHireDate() {
//        return hireDate;
//    }
//}
//
//class Manager extends EmployeePoint2 {
//    private double bonus;
//
//    public Manager(String name, double salary, LocalDate hireDate, double bonus) {
//        super(name, salary, hireDate);
//        this.bonus = bonus;
//    }
//
//    @Override
//    public double getSalary() {
//        return super.getSalary() + bonus;
//    }
//}
//
