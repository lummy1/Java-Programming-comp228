package Week04;

class Person {
    // Composition has-a relationship
    private Job job;

    // Constructor
    public Person() {
        // Creating a new Job object
        this.job = new Job();
        // Setting the salary of the Job object to 1000L
        job.setSalary(1000L);
    }

    // Getter method to retrieve the salary
    public long getSalary() {
        return job.getSalary();
    }
}
