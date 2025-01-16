package com.example.Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Kiosk {

    List<Menu> menuList;

    public Kiosk(List<Menu> _menuList) {
        this.menuList = _menuList;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int categorySelect;
        // 입/출력 반복
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menuList.size(); i++) {
                Menu menus = menuList.get(i);
                System.out.println((i + 1) + ". " + menus.getMenuList());
            }
            System.out.println("0. 종료");
            // 숫자 입력 받기 - 카테고리 선택
            System.out.print("카테고리 번호 입력: ");
            categorySelect = sc.nextInt();
            Menu menu = menuList.get(categorySelect - 1);

            if (categorySelect == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (categorySelect > 0 && categorySelect <= menuList.size()) {
                while (true) {
                    menu.getMenuItemsList();
                    System.out.print("메뉴 번호 입력: ");
                    int itemSelect = sc.nextInt();

                    if (itemSelect == 0) {
                        System.out.println("메인 메뉴로 돌아갑니다.\n");
                        break;
                    } else if (itemSelect > 0 && itemSelect <= menu.getMenuItems().size()) {
                        MenuItem selectedItem = menu.getMenuItems().get(itemSelect - 1);
                        System.out.println("선택한 메뉴: " + selectedItem);
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    }
                }

            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        sc.close();


    }
}


