public class StudentApp {
    public static void main(String[] args) {
        BachelorStudent b = new BachelorStudent(1, 70f, 80f);
        MasterStudent m = new MasterStudent(2, 65f, 75f, 3);
        PhDStudent p = new PhDStudent(3, 85f, 90f, 2, 4);

        System.out.println("Bachelor total: " + b.computeTotalScore());
        System.out.println("Master total: " + m.computeTotalScore());
        System.out.println("PhD total: " + p.computeTotalScore());
    }
}
