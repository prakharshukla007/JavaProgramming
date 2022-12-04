package package1;

import java.util.Objects;

public class Vehicle {

    private Integer noOfWheels;

    private String engineType;

    private String type;

    private String modelNumber;

    private Integer price;

    public Vehicle() {

    }

    //Object

    public Vehicle(Integer noOfWheels, String engineType, String type, String modelNumber, Integer price) {
        super();
        this.noOfWheels = noOfWheels;
        this.engineType = engineType;
        this.type = type;
        this.modelNumber = modelNumber;
        this.price = price;
    }

    //vehicle1.buyVehicle() --> return modelNumber + type

    public String buyVehicle() {
        return modelNumber + type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfWheels=" + noOfWheels +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(noOfWheels, vehicle.noOfWheels) && Objects.equals(engineType, vehicle.engineType) && Objects.equals(type, vehicle.type) && Objects.equals(modelNumber, vehicle.modelNumber) && Objects.equals(price, vehicle.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noOfWheels, engineType, type, modelNumber, price);
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Integer getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(Integer noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
