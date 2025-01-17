package com.example.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lv2. 객체지향 설계를 적용해 햄버거 메뉴 클래스로 관리
//  * 요구사항 : 햄버거 메뉴를 MenuItem 클래스와 List로 관리
//          => 객체지향 개념, 데이터의 구조적 관리
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 햄버거 메뉴를 담을 List 선언
        List<MenuItem> menuItems =new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for(int i=0; i<menuItems.size(); i++){
                MenuItem menu = menuItems.get(i);
                System.out.println((i + 1) + ". " + menu.name + " | W " + menu.price + " | " + menu.description);
            }
            System.out.println("0. 종료      | 종료");

            System.out.print("원하는 메뉴 번호 입력: ");
            int input = sc.nextInt();

            if(input==0){
                System.out.println("프로그램 종료");
                break;
            }
            // MenuItem에 toString으로 정의된 형식으로 출력됨
            switch (input){
                case 1:
                    System.out.println("선택한 메뉴: "+menuItems.get(0));
                    break;
                case 2:
                    System.out.println("선택한 메뉴: "+menuItems.get(1));
                    break;
                case 3:
                    System.out.println("선택한 메뉴: "+menuItems.get(2));
                    break;
                case 4:
                    System.out.println("선택한 메뉴: "+menuItems.get(3));
                    break;
                default:
                    System.out.println("번호 입력 오류");
                    continue;
            }
        }
    }
}