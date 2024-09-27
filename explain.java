class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        circle.draw(); // 抽象化とポリモーフィズム
        square.draw(); // 抽象化とポリモーフィズム

        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Account balance: " + account.getBalance()); // カプセル化

        Animal dog = new Dog();
        Animal cat = new Cat();

        Zoo zoo = new Zoo();
        zoo.performSound(dog); // ポリモーフィズム
        zoo.performSound(cat); // ポリモーフィズム
    }
}

// 抽象化の例
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

// カプセル化の例
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

// 継承の例
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// ポリモーフィズムの例
class Zoo {
    void performSound(Animal animal) {
        animal.makeSound();
    }
}


