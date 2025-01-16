package com.example.Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Kiosk {

    List<Menu> menuList =new ArrayList<>();

    public Kiosk(List<Menu> _menuList){
        this.menuList=_menuList;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        int categorySelect;
        // 입/출력 반복
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for(int i=0; i< menuList.size(); i++){
                Menu menus = menuList.get(i);
                System.out.println((i+1)+". "+menus.getMenuList());
            }
            System.out.println("0. 종료");
            // 숫자 입력 받기 - 카테고리 선택
            System.out.print("카테고리 번호 입력: ");
            categorySelect = sc.nextInt();
            break;
        }
        while (true){
            // 0번을 입력받으면 프로그램 종료
            if(categorySelect==0){
                System.out.println("프로그램 종료");
                break;
            }
            switch (categorySelect){
                case 1:
                    System.out.println("햄버거 출력할거임");
                    System.out.println(this.menuList.get(0).menuItems);
                    break;
                case 2:
                    System.out.println("음료 출력할거임");
                    break;
                case 3:
                    System.out.println("디저트 출력할거임");
                    break;
                default:
                    System.out.println("넌 잘못입력했다.");
                    continue;
            }
            this.start();
        }


    }
}


