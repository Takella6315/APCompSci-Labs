package Unit14.Unit14Activity2;

class bunny extends pets {
    public bunny(String name, double weight, int age) {
        super(name, weight, age);
    }
    
    @Override
    public String makeSound() {
        return "squeak";
    }
}