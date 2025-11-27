public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;


    public Worker(String name,int socialSecurityNumber,float wage,int workingHours){
        this.name= name;
        this.socialSecurityNumber= socialSecurityNumber;
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public void displayInfo(){
        System.out.println("Name: " +name);
        System.out.println("Security Number: " + socialSecurityNumber);
    }
    public void displaySAlary(){
        float salary = wage * workingHours;
        System.out.println("Salary: "+salary );
    }



}