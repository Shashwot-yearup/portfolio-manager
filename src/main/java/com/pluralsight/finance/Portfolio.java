package com.pluralsight.finance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private List<Valuable> items = new ArrayList<>();

    public Portfolio() {
    }

    //Method to put things in list.
    public void addToItems(Valuable valuable) {
        items.add(valuable);
    }

    //Method to get the totalValue of the items
    public BigDecimal getTotalValue() {

        BigDecimal totalValue = new BigDecimal(0);
        for (Valuable valuable : items) {
            totalValue = totalValue.add(valuable.getValue());
        }
        return totalValue;
    }

    //Method to get the most valuable item
    public Valuable getMostValuable() {
        Valuable mostValuable = items.get(0);
        for (Valuable valuable : items) {
            if (valuable.getValue().compareTo(mostValuable.getValue()) > 0) {
                mostValuable = valuable;
            }
        }
        return mostValuable;
    }

    //Method to get the most valuable item
    public Valuable getLeastValuable() {
        Valuable leastValuable = items.get(0);
        for (Valuable valuable : items) {
            if (valuable.getValue().compareTo(leastValuable.getValue()) < 0) {
                leastValuable = valuable;
            }
        }
        return leastValuable;
    }

    public List<Valuable> getItems() {
        return items;
    }
}