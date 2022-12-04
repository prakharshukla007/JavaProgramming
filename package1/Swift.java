package package1;

import java.util.Objects;

public class Swift extends Vehicle {

    private String name;

    private String color;

    private String mileage;

    private String musicSystem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Swift() {

    }

    public Swift(Integer noOfWheels, String engineType, String type, String modelNumber, Integer price, String name, String color, String mileage, String musicSystem) {
        super(noOfWheels, engineType, type, modelNumber, price);
        this.name = name;
        this.color = color;
        this.mileage = mileage;
        this.musicSystem = musicSystem;
    }

    public Swift(String name, String color, String mileage, String musicSystem) {
        this.name = name;
        this.color = color;
        this.mileage = mileage;
        this.musicSystem = musicSystem;
    }

    @Override
    public String toString() {
        return "Swift{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage='" + mileage + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Swift swift = (Swift) o;
        return Objects.equals(name, swift.name) && Objects.equals(color, swift.color) && Objects.equals(mileage, swift.mileage) && Objects.equals(musicSystem, swift.musicSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, color, mileage, musicSystem);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }

    //Dynamic Polymorphism
    @Override
    public String buyVehicle() {
        return name + color + mileage;
    }

}
