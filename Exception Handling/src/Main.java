public class Main {
    public static void main(String[] args) {

        try {
            Worker w1 = new Worker();
            w1.setName("Ali");
            w1.setSalary(5000);

            Worker w2 = new Worker();
            w2.setName("Ayşe");
            w2.setSalary(7000);

            Worker w3 = new Worker();
            w3.setName("Mehmet");
            w3.setSalary(-2000);   

        } catch (SalaryException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Total number of workers: " + Worker.counter);
    }
}
