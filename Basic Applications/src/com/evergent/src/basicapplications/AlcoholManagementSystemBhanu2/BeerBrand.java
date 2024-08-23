package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;

enum BeerBrand {
    KINGFISHER("Kingfisher", 100),
    CARLSBERG("Carlsberg", 120),
    BUDWAISER("Budwiser", 150);

    private final String name;
    private final int price;

    BeerBrand(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Beer getBeer() {
        return new Beer(name, price);
    }
}


