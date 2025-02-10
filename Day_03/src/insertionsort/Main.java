package insertionsort;

public class Main {
    public static void main(String[] args) {
        // Object of the class
        SortEmployeeId employeeId = new SortEmployeeId();

        // Employee id
        int[] empId = {45,10,71,88,44};

        // Method call to sort employee id
        int [] sortedEmpId = employeeId.sortEmployeeId(empId);

        for(int i = 0; i < sortedEmpId.length; i++){
            System.out.print(sortedEmpId[i] + " ");
        }
    }

}
