package finance;

import java.math.BigDecimal;

public class Gold extends FixedAsset implements Valuable {
    private double weight;

    public Gold(String name, BigDecimal marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public BigDecimal getValue() {
        return getMarketValue();
    }
}