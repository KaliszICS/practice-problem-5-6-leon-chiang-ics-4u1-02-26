public class Display {
    
    private double sizeInches;
    private String resolution;
    private boolean onOff = false;

    public Display (double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = this.resolution;
    }

    public String turnOn() {
        onOff = true;
        return "Display turned on. " + sizeInches + "-inch, " + resolution;
    }

    public String turnOff() {
        onOff = false;
        return "Display turned off";
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public double getSizeInches() {
        return sizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Display: " + sizeInches + "inches, " + resolution;
    }
}
