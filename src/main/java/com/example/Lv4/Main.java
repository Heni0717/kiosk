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
            new MenuItem("햄버거1", 3.0, "첫번째 햄버거.."),
            new MenuItem("햄버거2", 3.1, "두번째 햄버거.."),
            new MenuItem("햄버거3", 3.2, "세번째 햄버거.."),
            new MenuItem("햄버거4", 3.3, "네번째 햄버거..")
        ));
        List<MenuItem> drinkMenuItemList = new ArrayList<>(List.of(
                new MenuItem("음료1", 2.0, "첫번째 음료.."),
                new MenuItem("음료2", 2.1, "두번째 음료.."),
                new MenuItem("음료3", 2.2, "세번째 음료.."),
                new MenuItem("음료4", 2.3, "네번째 음료..")
        ));
        List<MenuItem> dessertMenuItemList = new ArrayList<>(List.of(
                new MenuItem("디저트1", 1.0, "첫번째 디저트.."),
                new MenuItem("디저트2", 1.1, "두번째 디저트.."),
                new MenuItem("디저트3", 1.2, "세번째 디저트.."),
                new MenuItem("디저트4", 1.3, "네번째 디저트..")
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