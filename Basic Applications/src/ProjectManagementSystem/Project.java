package ProjectManagementSystem;

public abstract class Project {
	protected String name;
    protected String description;
    protected String status;

    // Constructor
    public Project(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getDetails() {
        return name + ": " + description + " (Status: " + status + ")";
    }

    @Override
    public String toString() {
        return getDetails();
    }
}

// Concrete class representing a software project
class SoftwareProject extends Project {
    // Constructor
    public SoftwareProject(String name, String description, String status) {
        super(name, description, status);
    }
}



