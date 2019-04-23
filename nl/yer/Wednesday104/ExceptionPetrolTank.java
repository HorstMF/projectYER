package nl.yer.Wednesday104;

import java.util.Objects;

public class ExceptionPetrolTank {

    private int minLevel;
    private int maxLevel;
    private int currentLevel;
    private String brand;

    public ExceptionPetrolTank(int minLevel, int maxLevel) {
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    public ExceptionPetrolTank(int currentLevel, String brand) {
        this.currentLevel = currentLevel;
        this.brand = brand;
    }


    public void fill(int liters) throws ExceptionTankFull { //communicatie naar de main
        for(int i=0; i<liters; i++){
            if(currentLevel<maxLevel) {
                currentLevel++;
            }
            else {
                throw new ExceptionTankFull("Tank is vol");
            }
        }
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentLevel, brand);
    }

    @Override
    public boolean equals (Object o) {
        if (o instanceof ExceptionPetrolTank) {
            ExceptionPetrolTank other = (ExceptionPetrolTank) o;
            return this.getBrand().equals(other.getBrand());
        } else {
            return false;
    }

}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }}
