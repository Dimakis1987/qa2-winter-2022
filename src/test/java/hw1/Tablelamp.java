package hw1;

public class Tablelamp {
    private String brand;
    private String colour;
    private int contrastColour;
    private float heightInM;
    private boolean removable;
    //--------------------------------Getters and Settres----------------------------------------

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getContrastColour() {
        return contrastColour;
    }

    public void setContrastColour(int contrastColour) {
        this.contrastColour = contrastColour;
    }

    public float getHeightInM() {
        return heightInM;
    }

    public void setHeightInM(float heightInM) {
        this.heightInM = heightInM;
    }

    public boolean isRemovable() {
        return removable;
    }

    public void setRemovable(boolean removable) {
        this.removable = removable;
    }
}
