package com.gildedrose;

public class Item {
    private int sellIn;
    private int quality;
    private String name;
    private int sellInRate = 1;
    private int qualityRate = 1;

    public Item(int sellIn, int quality, String name) {
        this.sellIn = sellIn;
        this.quality = quality;
        this.name = name;

    }


    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellInRate() {
        return sellInRate;
    }

    public void setSellInRate(int sellInRate) {
        this.sellInRate = sellInRate;
    }

    public int getQualityRate() {
        return qualityRate;
    }

    public void setQualityRate(int qualityRate) {
        this.qualityRate = qualityRate;
    }
}
