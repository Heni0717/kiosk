package com.example.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lv3. 객체지향 설계를 적용해 순서 제어를 클래스로 관리
//  * 요구사항 : main함수에서 관리하던 순서 제어를 Kiosk 클래스로 관리
//          => 객체지향 개념, 데이터의 구조적 관리
public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems =new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();

    }
}