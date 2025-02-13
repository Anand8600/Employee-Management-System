package com.employee;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//	@Override
//	public String toString() {
//		return "EmpID: " + id + "\tEmpName: " + name + "\tEmpSalary: " + salary + "\tDepartment: " + department;
//	}
    
	@Override
	public String toString() {
	    return String.format("EmpID: %-5d EmpName: %-15s EmpSalary: %-10.2f Department: %-15s", id, name, salary, department);
	}
}
