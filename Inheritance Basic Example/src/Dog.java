public class Dog extends Animal{
    String breed;

    public Dog(String color,String breed) {
        super(color);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Hav hav hav hav");
    }

    @Override
    public void Eat() {
        System.out.println("Dog is eating");
    }
}
