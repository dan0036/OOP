package Task1;

public class Fox extends Animal{
    public Fox() {
    }
    @Override // Исключение родительского метода, чуждого для этого экземпляра класса
    public void toFly() {
        System.out.println("Foxes don't fly!");
        throw new RuntimeException("Foxes don't fly!");
    }
}
