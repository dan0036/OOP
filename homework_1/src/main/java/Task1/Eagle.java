package Task1;

public class Eagle extends Animal{
    public Eagle() {
    }

    @Override // Исключение родительского метода, чуждого для этого экземпляра класса
    public void toSwim() {
        System.out.println("Eagles don't swim!");
        throw new RuntimeException("Eagles don't swim!");
    }
}
