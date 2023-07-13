package main.java101.Patika.OOP.rentACar;

class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed,String color){
        this.model=model;
        this.speed=speed;
        this.color=color;
        this.type="Sedan";
        this.speedLimit=180;

    }
    Car(){

    }

    void  increaseSpeed(int increment) {
        this.speed += increment;
    }
    void decreaseSpeed(int decrease){
        if(this.speed >0){
            this.speed -=decrease;

        }
    }
    void printInfo(){
        System.out.println("Model :" + this.model);
        System.out.println("Color :" + this.color);
        System.out.println("Typ :" + this.type);
        System.out.println("Speed :" + this.speed);
    }
}
