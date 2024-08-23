package ProjectManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class ProjectManagementSystem implements Reporting {
    List<Project> projects;
    List<Employee> employees;
    List<Task> tasks;

    // Constructor
    public ProjectManagementSystem() {
        projects = new ArrayList<>();
        employees = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    // Add a project
    public void addProject(Project project) {
        projects.add(project);
        System.out.println("Project added: " + project);
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

    // Add a task
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    @Override
    public void generateProjectReport() {
        System.out.println("Project Report:");
        for (Project project : projects) {
            System.out.println(project);
        }
    }

    @Override
    public void generateEmployeeReport() {
        System.out.println("Employee Report:");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getId() + ", Name: " + employee.getName() + ", Role: " + employee.getRole());
            System.out.println("Projects:");
            for (Task task : tasks) {
                if (task.getAssignedEmployee().equals(employee)) {
                    System.out.println(" - " + task.getProject().getName() + ": " + task.getProject().getDescription() + " (Status: " + task.getProject().getStatus() + ")");
                }
            }
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (Project project : projects) {
            System.out.println("Project: " + project.getName());
            for (Task task : tasks) {
                if (task.getProject().equals(project)) {
                    System.out.println("  - " + task.toString());
                }
            }
        }
    }
}



