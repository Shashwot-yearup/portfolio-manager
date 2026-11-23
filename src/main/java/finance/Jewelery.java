package finance;

import java.math.BigDecimal;

public class Jewelery extends FixedAsset implements Valuable {
    private double karat;

    public Jewelery(String name, BigDecimal marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public BigDecimal getMarketValue() {
        return getMarketValue();
    }
}