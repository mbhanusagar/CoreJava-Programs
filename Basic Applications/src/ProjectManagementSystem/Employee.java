package ProjectManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Class representing an employee
class Employee {
    private String id;
    private String name;
    private String role;
    private List<Project> assignedProjects;

    // Constructor
    public Employee(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.assignedProjects = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void assignProject(Project project) {
        assignedProjects.add(project);
    }

    public List<Project> getAssignedProjects() {
        return assignedProjects;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(id)
          .append(", Name: ").append(name)
          .append(", Role: ").append(role)
          .append("\nAssigned Projects:\n");
        
        if (assignedProjects.isEmpty()) {
            sb.append("  No projects assigned.");
        } else {
            for (Project project : assignedProjects) {
                sb.append("  - ").append(project.getName())
                  .append(": ").append(project.getDescription())
                  .append(" (Status: ").append(project.getStatus())
                  .append(")\n");
            }
        }
        return sb.toString();
    }
}
