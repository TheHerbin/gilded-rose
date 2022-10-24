package com.gildedrose;

public class BackstagePassesItem extends Item{
    protected int sellIn;
    protected int quality;
    protected String name;
    protected int sellInRate = 1;
    protected int qualityRate = 1;

    @Override
    void updateQuality() {
        //mise a jour des "Rates"
        if(this.getSellIn() <= 10){
            this.setQualityRate(2);
        }
        if(this.getSellIn() <= 5){
            this.setQualityRate(3);
        }

        this.setSellIn(this.getSellIn() - this.getSellInRate());
        if(this.getQuality() < 50){
            this.setQuality(this.getQuality() + this.getQualityRate());
        }
        if(this.getSellIn() <= 0){
            this.setQuality(0);
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
