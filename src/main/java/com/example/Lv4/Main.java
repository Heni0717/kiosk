package com.example.Lv4;

import java.util.ArrayList;
import java.util.List;

// Lv4. 객체지향 설계를 적용해 음식메뉴, 주문 내역을 클래스 기반으로 관리
public class Main {
    public static void main(String[] args) {

        // Menu 객체 생성, 이 값을 담는 menuList생성과 할당 <- "카테고리 생성"
        List<Menu> menuList = new ArrayList<>();
        Menu burgerMenu = new Menu("Burgers");
        Menu drinkMenu = new Menu("Drinks");
        Menu dessertMenu = new Menu("Deserts");
        menuList.add(burgerMenu);
        menuList.add(drinkMenu);
        menuList.add(dessertMenu);

        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 필드 삽입
        List<MenuItem> burgerMenuItemList = new ArrayList<>(List.of(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ));
        List<MenuItem> drinkMenuItemList = new ArrayList<>(List.of(
                new MenuItem("Coke", 2.0, "코카콜라"),
                new MenuItem("Sprite", 2.0, "스프라이트"),
                new MenuItem("Fanta", 2.0, "환타")
        ));
        List<MenuItem> dessertMenuItemList = new ArrayList<>(List.of(
                new MenuItem("CheeseSticks", 2.5, "막대모양의 치즈 튀김 2개"),
                new MenuItem("FrenchFries", 1.8, "얇은 막대모양의 감자 튀김"),
                new MenuItem("Coleslaw", 2.0, "양배추, 당근 등이 들어간 야채 샐러드"),
                new MenuItem("CheeseBalls", 2.5, "공모양의 치즈 튀김")
        ));

        burgerMenu.setMenuItems(burgerMenuItemList);
        drinkMenu.setMenuItems(drinkMenuItemList);
        dessertMenu.setMenuItems(dessertMenuItemList);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuList);
        // 클래스의 반복 로직 시작(시작함수 호출)
        kiosk.start();

    }
}