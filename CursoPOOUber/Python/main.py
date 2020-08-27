from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello world");

    car = Car("GFK253", Account("Dilan Ariza", "10001333805"))
    print(vars(car))
    print(vars(car.driver))