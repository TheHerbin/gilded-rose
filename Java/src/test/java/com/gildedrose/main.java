package com.gildedrose;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

    }

    public void endOfTheDay(ArrayList<Item> itemList){
        boolean res = false;
        for (Item unItem : itemList) {
            //conditions spéciales :

            switch(unItem.getName()){
                //nom = Aged Brie
                case "Aged Brie":
                    unItem.setSellIn(unItem.getSellIn() - unItem.getSellInRate());
                    if(unItem.getQuality() < 50){
                        unItem.setQuality(unItem.getQuality() + unItem.getQualityRate());
                    }
                break;

                //nom = Backstage passes
                case "Backstage passes":

                    //mise a jour des "Rates"
                    if(unItem.getSellIn() <= 10){
                        unItem.setQualityRate(2);
                    }
                    if(unItem.getSellIn() <= 5){
                        unItem.setQualityRate(3);
                    }

                    unItem.setSellIn(unItem.getSellIn() - unItem.getSellInRate());
                    if(unItem.getQuality() < 50){
                        unItem.setQuality(unItem.getQuality() + unItem.getQualityRate());
                    }
                    if(unItem.getSellIn() <= 0){
                        unItem.setQuality(0);
                    }
                break;

                //nom = Sulfuras
                case "Sulfuras":
                    //mise a jour des "Rates"
                    unItem.setSellInRate(0);
                    unItem.setQualityRate(0);

                    //valeurs
                    unItem.setQuality(80);
                break;

                //nom = Conjured
                case "Conjured":
                    //mise a jour des "Rates"
                    unItem.setSellInRate(1);
                    unItem.setQualityRate(2);

                    //valeurs

                    if (unItem.getSellIn() > 0) {
                        unItem.setSellIn(unItem.getSellIn() - unItem.getSellInRate());
                        unItem.setQuality(unItem.getQuality() - unItem.getQualityRate());
                    }
                    if (unItem.getSellIn() <= 0) {
                        unItem.setSellIn(unItem.getSellIn() - unItem.getSellInRate());
                        if (unItem.getQuality() >= unItem.getQualityRate() * 2) {
                            unItem.setQuality(unItem.getQuality() - (unItem.getQualityRate() * 2));
                        }
                    }
                break;

                case "":
                    if (unItem.getSellIn() > 0) {
                        unItem.setSellIn(unItem.getSellIn() - unItem.getSellInRate());
                        unItem.setQuality(unItem.getQuality() - unItem.getQualityRate());
                    }
                    if (unItem.getSellIn() <= 0) {
                        unItem.setSellIn(unItem.getSellIn() - unItem.getSellInRate());
                        if (unItem.getQuality() >= unItem.getQualityRate() * 2) {
                            unItem.setQuality(unItem.getQuality() - (unItem.getQualityRate() * 2));
                        }
                    }
                break;
            }

        }
    }
}
