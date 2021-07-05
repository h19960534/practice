package v1ch05.abstractClasses;

import java.time.*;

public class Employee extends Person
{
    private double salary;
    private LocalDate hireDay;    

    public Employee(String name, double salary ,int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary()
    {
    return this.salary;
    }
    public LocalDate getHireDay()
    {
    return this.hireDay;
    }

    public String getDescription()
    {
    return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(final double byPercent)
    {
    final double raise = salary * byPercent / 100;
    salary += raise;
    }
}