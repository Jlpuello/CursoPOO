class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;
    
    

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println("license : "+ license +","+ "Driver : "+ driver.name);
    }
}