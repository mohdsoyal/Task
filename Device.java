package task;

public class Device {
    String brand;
    String model;
   

    
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
       
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
       
    }


 }


class Smartphone extends Device {
    String operatingSystem;
    double cameraResolution;

   
    public Smartphone(String brand, String model, String operatingSystem, double cameraResolution) {
        super(brand, model); 
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

   
    public void displaySmartphoneInfo() {
        displayInfo(); 
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
    }

  
    public void takePhoto() {
        System.out.println("Photo taken with " + cameraResolution + " MP camera.");
    }

}
