package jdk.seminar4.hw;

import java.util.ArrayList;
import java.util.List;

public class EmployeesBook {
    List<Employee> employees;

    public EmployeesBook() {
        this.employees = new ArrayList<>();
    }


    public List<Employee> searchByExperience(int experience) {
        if (employees == null) return null;
        boolean isMatched = false;
        List<Employee> searchedResult = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getExperience() == experience) {
                searchedResult.add(emp);
                isMatched = true;
            }
        }
        if (!isMatched) System.out.println("Нет сотрудников со стажем " + experience);
        return searchedResult;
    }

    public List<String> searchPhoneNumberByName(String name) {
        if (employees == null) return null;
        boolean isMatched = false;
        List<String> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                result.add(emp.getPhoneNumber());
                isMatched = true;
            }
        }
        if ((!isMatched)) System.out.println("Нет сотрудников по имени " + name);
        return result;
    }

    public Employee searchEmployeeById(int id) {
        if (employees == null) return null;
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        System.out.println("Нет сотрудника с id = " + id);
        return null;
    }

    public void addNewEmployee(Employee employee) {
        if (employees != null) {
            for (Employee emp : employees) {
                if (emp.getId() == employee.getId()) {
                    System.out.println("Сотрудник с id = " + employee.getId() + " уже есть в справочнике.");
                    return;
                }
            }
            employees.add(employee);
        }
    }

    @Override
    public String toString() {
        return employees.toString();
    }

}
