public class Main {
    public static void main(String[] args) {
        Company c1 = new AkinSoft();
        Company c2 = new GoogleCompany();
        Company c3 = new MicrosoftCompany();


        Company[] companies = {c1, c2, c3};

        System.out.println("--- Company Informations ---\n");


        for (Company company : companies) {


            company.print();
            System.out.println("Adres: " + company.getAddress());


            if (company instanceof GoogleCompany) {
                GoogleCompany google = (GoogleCompany) company; // Casting işlemi
                google.doSomething();
            }

            System.out.println("---------------------------------");
        }
    }
}


