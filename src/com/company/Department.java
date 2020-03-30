package com.company;

public class Department {

    Department[] subDepartment = new Department[10];
    String departmentName;
    String board;
    int departmentCounter = 0;
    String name;

    public Department(String departmentname, String name) {
        this.departmentName = departmentname;
        this.name = name;
    }

    public void addSubDepartment(Department department) {
        this.subDepartment[departmentCounter] = department;
        departmentCounter++;
    }

    public void getDepartmentName(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("\t");
        }
        System.out.println(departmentName + "\t" + name);
    }

    public void printDepartmentTree(int indent) {
        getDepartmentName(indent);
        indent++;
        for (int i = 0; i < departmentCounter; i++) {
            subDepartment[i].printDepartmentTree(indent);
        }
    }

    @Override
    public String toString() {
        return departmentName + name;
    }
}

