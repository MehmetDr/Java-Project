public class Worker {

    private String name;
    private double salary;


    public static int counter = 0;

    public Worker() {
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) throws SalaryException {
        if (salary < 0) {
            throw new SalaryException("salary amount must be greater than zero");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
