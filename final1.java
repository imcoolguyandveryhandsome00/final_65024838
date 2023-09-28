import java.util.ArrayList;
public class final1 {
    
interface Person {
    String getName();
    int getAge();
    void setName(String name);
    void setAge(int age);
    void printDetails();
}

interface Job {
    String getPosition();
    int getEmpID();
    void setPosition(String position);
    void setEmpID(int empID);
    void printDetails();
}

class Employee implements Person, Job {
    private String name;
    private int age;
    private String position;
    private int empID;
    private ArrayList<Project> myProjects;

    public Employee(String name, int age, String position, int empID) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.empID = empID;
        this.myProjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void addProject(Project project) {
        myProjects.add(project);
    }

    public void printlnDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " + getPosition());
        System.out.println("EmpID: " + getEmpID());

        System.out.println("Projects:");
        for (Project project : myProjects) {
            System.out.println("Project Name: " + project.getProjectName());
            System.out.println("Project Description: " + project.getDescription());
        }
    }
}

class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }
}

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", 30, "UX/UI", 0001);
        Employee employee2 = new Employee("Tim", 25, "FrontEnd", 0002);

        employee1.addProject(new Project("Web A", "Developing a web application"));
        employee1.addProject(new Project("Mobile A", "Developing a mobile app"));

        employee2.addProject(new Project("Web A", "Developing a web application"));

        System.out.println("Employee 1 Details:");
        employee1.printDetails();
        System.out.println("\nEmployee 2 Details:");
        employee2.printDetails();
    }
}
}