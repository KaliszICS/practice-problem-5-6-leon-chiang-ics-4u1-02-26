public class Smartphone {

    private Battery battery;
    private Display display;
    private Processor processor;
    private String brand;
    private String model;

    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
    }

    public Smartphone(String brand, String model, int batteryCapacity, double displaySize, String resolution, String processorModel, double processorSpeed) {
        this.brand = brand;
        this.model = model;
        this.battery = new Battery(batteryCapacity);
        this.display = new Display(displaySize, resolution);
        this.processor = new Processor(processorModel, processorSpeed);
    }

    public String powerOn() {
        if (battery.isCharged() == true) {
            display.turnOn();
            return "Powering on" + brand + " " + model;
        }
        return "Cannot power on: Battery depleted";
    }
    
    public String powerOff() {
        display.turnOff();
        return "Powering off" + brand + " " + model;
    }

    public void chargeBattery() {
        battery.charge();
    }

    public String runApp(String appName) {
        if (display.getOnOff() == true) {
            return processor.processTask(appName);
        }
        return "Phone is off. Cannot run " + appName;
    }

    public void upgradeComponent (Battery newBattery) {
        battery = newBattery;
    }

    public void upgradeComponent (Processor newProcessor) {
        processor = newProcessor;
    }

    public void upgradeComponent (Display newDisplay) {
        display = newDisplay;
    }
    
    @Override
    public String toString() {
        return this.brand + " " + this.model + " Smartphone\n" +
               this.battery.toString() + "\n" +
               this.display.toString() + "\n" +
               this.processor.toString();
    }
}
