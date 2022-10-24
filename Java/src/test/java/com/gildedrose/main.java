package com.gildedrose;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

    }

    public void updateQuality(ArrayList<Item> itemList){

        for (Item unItem : itemList) {
            unItem.updateQuality();

        }
    }
}
