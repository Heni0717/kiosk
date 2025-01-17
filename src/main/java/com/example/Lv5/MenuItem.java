package com.example.Lv5;

// 햄버거 메뉴를 관리하는 MenuItem 클래스
public class MenuItem {
    // 필드 : 이름, 가격, 설명 -> 캡슐화
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }

    // getter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
}
