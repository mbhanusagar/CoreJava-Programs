package ProjectManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProjectManagementSystem system = new ProjectManagementSystem();

        // Add some initial data
        Project project1 = new SoftwareProject("Project A", "Development of a new software application.", "In Progress");
        Project project2 = new SoftwareProject("Project B", "Upgrade of existing software systems.", "Completed");

        system.addProject(project1);
        system.addProject(project2);

        Employee employee1 = new Employee("E001", "Alice", "Developer");
        Employee employee2 = new Employee("E002", "Bob", "Tester");

        system.addEmployee(employee1);
        system.addEmployee(employee2);

        Task task1 = new Task("Develop core modules", "Development of core functionalities", employee1, "In Progress", project1);
        Task task2 = new Task("Test application features", "Testing all features", employee2, "Not Started", project2);

        system.addTask(task1);
        system.addTask(task2);

        // Menu loop
        while (true) {
            System.out.println("\nProject Management System Menu:");
            System.out.println("1. Generate Project Report");
            System.out.println("2. Generate Employee Report");
            System.out.println("3. Display Tasks");
            System.out.println("4. Add New Project");
            System.out.println("5. Add New Employee");
            System.out.println("6. Add New Task");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.generateProjectReport();
                    break;

                case 2:
                    system.generateEmployeeReport();
                    break;

                case 3:
                    system.displayTasks();
                    break;

                case 4:
                    // Add new project
                    System.out.print("Enter project name: ");
                    String projectName = scanner.nextLine();
                    System.out.print("Enter project description: ");
                    String projectDescription = scanner.nextLine();
                    System.out.print("Enter project status: ");
                    String projectStatus = scanner.nextLine();
                    system.addProject(new SoftwareProject(projectName, projectDescription, projectStatus));
                    break;

                case 5:
                    // Add new employee
                    System.out.print("Enter employee ID: ");
                    String employeeId = scanner.nextLine();
                    System.out.print("Enter employee name: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Enter employee role: ");
                    String employeeRole = scanner.nextLine();
                    system.addEmployee(new Employee(employeeId, employeeName, employeeRole));
                    break;

                case 6:
                    // Add new task
                    System.out.print("Enter task title: ");
                    String taskTitle = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    System.out.print("Enter assigned employee ID: ");
                    String assignedEmployeeId = scanner.nextLine();
                    Employee assignedEmployee = findEmployeeById(system, assignedEmployeeId);
                    if (assignedEmployee != null) {
                        System.out.print("Enter task status: ");
                        String taskStatus = scanner.nextLine();
                        System.out.print("Enter project name: ");
                        String projectNameForTask = scanner.nextLine();
                        Project project = findProjectByName(system, projectNameForTask);
                        if (project != null) {
                            system.addTask(new Task(taskTitle, taskDescription, assignedEmployee, taskStatus, project));
                        } else {
                            System.out.println("Project not found.");
                        }
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 7:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }

    // Helper method to find an employee by ID
    private static Employee findEmployeeById(ProjectManagementSystem system, String id) {
        for (Employee employee : system.employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    // Helper method to find a project by name
    private static Project findProjectByName(ProjectManagementSystem system, String name) {
        for (Project project : system.projects) {
            if (project.getName().equalsIgnoreCase(name)) {
                return project;
            }
        }
        return null;
    }
}


