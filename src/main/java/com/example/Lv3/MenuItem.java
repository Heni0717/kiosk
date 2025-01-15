package com.example.Lv3;

// 햄버거 메뉴를 관리하는 MenuItem 클래스
public class MenuItem {
    // 필드 : 이름, 가격, 설명
    String name;
    double price;
    String description;

    // 인스턴스화 시킬 생성자
    public MenuItem(String name, double price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }

    // getter를 사용하지 않고 main에서 list 내용을 출력하기 위해 임시 .. 사용..
    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }
}
