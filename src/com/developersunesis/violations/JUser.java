package com.developersunesis.violations;

import java.math.BigDecimal;

public class JUser {

    private String id;
    private String name;
    private String address;
    private JUser superior;
    private BigDecimal salary;

    public JUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public JUser getSuperior() {
        return superior;
    }

    public void setSuperior(JUser superior) {
        this.superior = superior;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
