package com.javafxmasterclass.props;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private final StringProperty name;
    private final IntegerProperty salary;

    public Employee(String name, int salary) {
        this.name = new SimpleStringProperty(name);
        this.salary = new SimpleIntegerProperty(salary);
    }

    public String getName() {
        return name.getValue();
    }

    public int getSalary() {
        return salary.getValue();
    }

    public IntegerProperty getSalaryProperty() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary.set(salary);
    }

    public StringProperty getNameProperty() {
        return name;
    }
}
