package com.developersunesis.corrections.ocp;

import com.developersunesis.goodfaith.ocp.IUser;

import java.math.BigDecimal;

public class Employee extends IUser {

    private IUser superior;
    private BigDecimal salary;

    public Employee() {
    }

    public IUser getSuperior() {
        return superior;
    }

    public void setSuperior(IUser superior) {
        this.superior = superior;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "superior=" + superior +
                ", salary=" + salary +
                '}';
    }
}
