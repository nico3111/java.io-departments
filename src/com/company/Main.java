package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

            File testfile = new File("C:\\Users\\DCV\\Desktop\\Abteilungen.txt");
            try {
                FileReader reader = new FileReader(testfile);
                BufferedReader buffReader = new BufferedReader(reader);

                Department[] departments = new Department[10];
                String line = null;
                int counter = 0;
                while ((line = buffReader.readLine()) != null){
                    String[] splitted = line.split(";");

                    String name = splitted[0];
                    String departmentName = splitted[1];

                    Department department = new Department(name, departmentName);
                    departments[counter] = department;
                    counter++;
                }
            } catch (Exception ex) {
            }


//        Department board = new Department("Vorstand","Alfred Boss");
//        Department salesManager = new Department("Vertriebsleiter", "Max Mustermann");
//        Department privatCustomer = new Department("Privatkunden Leiter","Angela Musterfrau");
//        Department businessCustomer = new Department("Firmenkunden Leiter","Alfons Muste");
//        Department purchasing = new Department("Einkauf Leiter", "Alois Kaufmann");
//        Department purchchasingMechanic = new Department("Einkauf Mechanic", "Herlinde Gunz");
//        Department purchasingSmallParts = new Department("Einkauf Kleinteile Leiter", "Hermann Friedrich");
//        Department purchasingBigParts = new Department("Einkauf Großteile Leiter", "Hannelore Peter");
//        Department purchasingEurope = new Department("Einkauf Europa Leiter", "Moritz But");
//
//        board.addSubDepartment(salesManager);
//        salesManager.addSubDepartment(privatCustomer);
//        salesManager.addSubDepartment(businessCustomer);
//
//        salesManager.addSubDepartment(purchasing);
//        purchasing.addSubDepartment(purchchasingMechanic);
//        purchchasingMechanic.addSubDepartment(purchasingSmallParts);
//        purchchasingMechanic.addSubDepartment(purchasingBigParts);
//        purchchasingMechanic.addSubDepartment(purchasingEurope);

//        board.printDepartmentTree(0);
    }
}
