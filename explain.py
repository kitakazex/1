# 抽象化の例
from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def draw(self):
        pass

class Circle(Shape):
    def draw(self):
        print("Drawing a circle")

class Square(Shape):
    def draw(self):
        print("Drawing a square")

# カプセル化の例
class BankAccount:
    def __init__(self):
        self.__balance = 0

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount

    def get_balance(self):
        return self.__balance

# 継承の例
class Animal:
    def make_sound(self):
        print("Animal makes a sound")

class Dog(Animal):
    def make_sound(self):
        print("Dog barks")

class Cat(Animal):
    def make_sound(self):
        print("Cat meows")

# ポリモーフィズムの例
class Zoo:
    def perform_sound(self, animal):
        animal.make_sound()

if __name__ == "__main__":
    circle = Circle()
    square = Square()

    circle.draw()  # 抽象化とポリモーフィズム
    square.draw()  # 抽象化とポリモーフィズム

    account = BankAccount()
    account.deposit(1000)
    print("Account balance:", account.get_balance())  # カプセル化

    dog = Dog()
    cat = Cat()

    zoo = Zoo()
    zoo.perform_sound(dog)  # ポリモーフィズム
    zoo.perform_sound(cat)  # ポリモーフィズム
