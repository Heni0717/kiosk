package com.example.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lv3. 객체지향 설계를 적용해 순서 제어를 클래스로 관리
//  * 요구사항 : main함수에서 관리하던 순서 제어를 Kiosk 클래스로 관리
//          => 객체지향 개념, 데이터의 구조적 관리
public class Main {
    public static void main(String[] args) {

        // Kiosk 클래스의 생성자를 통해 List속의 값 할당
        List<MenuItem> menuItems =new ArrayList<>();
        menuItems.add(new MenuItem("햄버거", 1.0,"첫번째 햄버거"));
        menuItems.add(new MenuItem("햄버거2", 1.1,"두번째 햄버거"));
        menuItems.add(new MenuItem("햄버거3", 1.2,"세번째 햄버거"));
        menuItems.add(new MenuItem("햄버거4", 1.3,"네번째 햄버거"));

        Kiosk kiosk = new Kiosk(menuItems);
        // Kiosk 클래스의 반복 로직 시작
        kiosk.start();

    }
}