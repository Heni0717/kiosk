package com.example.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 키오스크 프로그램의 메뉴 관리, 사용자 입력 처리
public class Kiosk {

    List<MenuItem> menuItems =new ArrayList<>();

    public Kiosk(List<MenuItem> _menuItems){
        this.menuItems=_menuItems;
    }

    Scanner sc = new Scanner(System.in);

    // Lv2의 main에서 관리하던 반복 로직을 start 함수로 Kiosk에서 관리
    public void start(){
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            // List 안에 있는 MenuItem을 하나씩 출력
            for(int i=0; i<menuItems.size(); i++){
                MenuItem menu = menuItems.get(i);
                System.out.println((i + 1) + ". " + menu.name + " | W " + menu.price + " | " + menu.description);
            }
            System.out.println("0. 종료");

            System.out.print("원하는 메뉴 번호 입력: ");
            int input = sc.nextInt();

            if(input==0){
                System.out.println("프로그램 종료");
                break;
            }
            // 입력된 숫자에 따른 처리 - 선택한 메뉴 : 이름, 가격, 설명
            //  -> toString을 사용하지 않기로 결정, 본인 편의상,, 이름만 호출
            //  => 아래 이름을 불러오는 방식처럼 가격과 설명도 가져올수 있음.
            switch (input){
                case 1:
                    System.out.println("선택한 메뉴: "+menuItems.get(0).name);
                    break;
                case 2:
                    System.out.println("선택한 메뉴: "+menuItems.get(1).name);
                    break;
                case 3:
                    System.out.println("선택한 메뉴: "+menuItems.get(2).name);
                    break;
                case 4:
                    System.out.println("선택한 메뉴: "+menuItems.get(3).name);
                    break;
                default:
                    System.out.println("번호 입력 오류");
                    continue;
            }
        }
    }
}


