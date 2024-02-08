package Week04;

class Job {
    private String role;
    private long salary;
    private int id;

    // Constructors (if needed)
    public Job() {
    }

    public Job(String role, long salary, int id) {
        this.role = role;
        this.salary = salary;
        this.id = id;
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Setter for role
    public void setRole(String role) {
        this.role = role;
    }

    // Getter for salary
    public long getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(long salary) {
        this.salary = salary;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }
}
