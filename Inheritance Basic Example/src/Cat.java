public class Cat extends Animal {
    int age;
    public Cat(String color,int age){
        super(color);
        this.age=age;
    }



    public void meow(){
        System.out.println("Meow meow meow");
    }

    @Override
    public void Eat() {
        System.out.println("Cat is eating");
    }
}
