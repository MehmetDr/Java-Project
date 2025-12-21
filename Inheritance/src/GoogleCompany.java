class GoogleCompany extends Company {
    public GoogleCompany() {
        super("Google");
    }

    @Override
    protected String getAddress() {
        return "California, USA";
    }


    void doSomething() {
        System.out.println("Google searching...");
    }
}
