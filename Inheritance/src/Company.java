public class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }


    protected String getAddress() {
        return "Main Company Address";
    }

    public void print() {
        System.out.println("Company name: " + this.name);
    }
}


