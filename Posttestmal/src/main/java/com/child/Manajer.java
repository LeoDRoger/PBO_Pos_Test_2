package com.child;

import com.induk.Employee;

public final class Manajer extends Employee {
    public Manajer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Manajer: " + getName() + ", gaji: $" + getSalary());
    }
}
