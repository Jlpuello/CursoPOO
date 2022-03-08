from car import Car
from account import Account

if __name__=="__main__":
    print("hola mundo")

    car = Car("BPO09", Account("Jorge Puello", "1051890135"))

    print (vars(car))
    print (vars(car.driver))