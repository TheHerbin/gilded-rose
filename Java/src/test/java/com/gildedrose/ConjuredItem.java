package com.gildedrose;

public class ConjuredItem extends Item{
    protected int sellIn;
    protected int quality;
    protected String name;
    protected int sellInRate = 1;
    protected int qualityRate = 2;

    @Override
    void updateQuality() {
        if (this.getSellIn() > 0) {
            this.setSellIn(this.getSellIn() - this.getSellInRate());
            this.setQuality(this.getQuality() - this.getQualityRate());
        }
        if (this.getSellIn() <= 0) {
            this.setSellIn(this.getSellIn() - this.getSellInRate());
            if (this.getQuality() >= this.getQualityRate() * 2) {
                this.setQuality(this.getQuality() - (this.getQualityRate() * 2));
            }
        }
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
