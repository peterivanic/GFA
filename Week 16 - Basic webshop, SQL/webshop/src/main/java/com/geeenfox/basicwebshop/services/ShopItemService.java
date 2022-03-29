package com.geeenfox.basicwebshop.services;

import com.geeenfox.basicwebshop.models.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class ShopItemService {
    private static List<ShopItem> items = new ArrayList<>(
            List.of(new ShopItem(
                    "Running shoes",
                    "Nike running shoes for every day sport",
                    1000,
                    5
                    ),
                    new ShopItem(
                            "Printer",
                            "Some HP pprinter that will print pages",
                            3000,
                            2
                    ),
                    new ShopItem(
                            "Coca cola",
                            "0.5l stanadart coke",
                            25,
                            0
                    ),
                    new ShopItem(
                            "Wokin",
                            "Chicken with fried rice and WOKIN sauce",
                            1000,
                            100
                    ),
                    new ShopItem(
                            "T-shirt",
                            "Blue with a corgi on bike",
                            1000,
                            5
                    ))
    );

    public static List<ShopItem> getItems() {
        return items;
    }
}
