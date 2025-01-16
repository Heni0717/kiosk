package com.example.Lv4;

import java.util.ArrayList;
import java.util.List;

// Lv4. 객체지향 설계를 적용해 음식메뉴, 주문 내역을 클래스 기반으로 관리
//  * 요구사항 :
public class Main {
    public static void main(String[] args) {

        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        List<MenuItem> burgerMenuItemList = new ArrayList<>(List.of(
           new MenuItem("햄버거1", 1.0, "첫번째 햄버거.."),
            new MenuItem("햄버거2", 1.1, "두번째 햄버거.."),
            new MenuItem("햄버거3", 1.2, "세번째 햄버거.."),
            new MenuItem("햄버거4", 1.3, "네번째 햄버거..")
        ));

        // Menu 객체 생성, MenuList 초기화 후 값 할당..,?
        List<Menu> menuList = new ArrayList<>();
        Menu burgerMenu = new Menu("Burgers");
        Menu drinkMenu = new Menu("Drinks");
        Menu dessertMenu = new Menu("Deserts");
        burgerMenu.setMenuItems(burgerMenuItemList);
        menuList.add(burgerMenu);
        menuList.add(drinkMenu);
        menuList.add(dessertMenu);

        // Kiosk 초기화, 클래스의 반복 로직 시작(시작함수 호출)
        Kiosk kiosk = new Kiosk(menuList);
        kiosk.start();

    }
}