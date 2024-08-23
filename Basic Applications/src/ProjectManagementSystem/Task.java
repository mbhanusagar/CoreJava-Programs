package ProjectManagementSystem;

//Class representing a task
class Task {
 private String title;
 private String description;
 private Employee assignedEmployee;
 private String status;
 private Project project;

 // Constructor
 public Task(String title, String description, Employee assignedEmployee, String status, Project project) {
     this.title = title;
     this.description = description;
     this.assignedEmployee = assignedEmployee;
     this.status = status;
     this.project = project;
 }

 public Project getProject() {
     return project;
 }

 public Employee getAssignedEmployee() {
     return assignedEmployee;
 }

 @Override
 public String toString() {
     return title + ": " + description + " (Assigned to: " + assignedEmployee.getName() + ", Status: " + status + ")";
 }
}




