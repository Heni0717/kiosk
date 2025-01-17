package com.example.Lv5;

import java.util.List;
import java.util.Scanner;


public class Kiosk {
    // 카테고리  리스트
    private List<Menu> menuList;
    private Scanner sc = new Scanner(System.in);

    // main()함수에서 Kiosk를 객체화 시킬 생성자
    public Kiosk(List<Menu> _menuList) {
        this.menuList = _menuList;
    }

    // Kiosk의 역할을 수행할 시작 함수
    public void start() {

        // 입/출력 반복
        while (true) {
            // 상위 카테고리 출력하는 반복문
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menuList.size(); i++) {
                Menu menus = menuList.get(i);
                System.out.println((i + 1) + ". " + menus.getCategory());
            }
            System.out.println("0. 종료");

            // 숫자 입력 받기 - 카테고리 선택 (0 입력시 종료)
            System.out.println("카테고리 선택: ");
            int categorySelect = getInputException("카테고리", menuList.size());
            if (categorySelect == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            // 카테고리 선택시 -> 메뉴 선택 (0 입력시 뒤로가기)
            Menu menu = menuList.get(categorySelect - 1);
            while (true) {
                // 메뉴 아이템 리스트 출력
                menu.getMenuItemsList();

                // 숫자 입력 받기 - 메뉴 선택
                System.out.println("메뉴 선택: ");
                int itemSelect = getInputException("메뉴", menu.getMenuItems().size());

                if (itemSelect == 0) {
                    System.out.println("메인 메뉴로 돌아갑니다.\n");
                    break;
                } else {
                    MenuItem selectedItem = menu.getMenuItems().get(itemSelect - 1);
                    System.out.println("선택한 메뉴: " + selectedItem.getName() + "\n");
                }
            }
        }
        sc.close();
    }

    // 사용자 입력 예외 처리
    private int getInputException(String subject, int max) {
//        int input = -1;
        while (true) {
            int input=sc.nextInt();
            try {
                if (input >= 0 && input <= max) {
                    return input;
                } else {
                    System.out.println("잘못된 "+subject+" 입력입니다.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                sc.next(); // 잘못된 입력을 제거(버퍼 제거?)
            }
        }
    }
}


