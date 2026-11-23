package finance;

import java.math.BigDecimal;

public class House extends FixedAsset implements Valuable {
    private int yearBuild;
    private int squareFeet;
    private int bedRooms;

    public House(String name, BigDecimal marketValue, int yearBuild, int squareFeet, int bedRooms) {
        super(name, marketValue);
        this.yearBuild = yearBuild;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    @Override
    public BigDecimal getValue() {
        return getMarketValue();
    }
}
