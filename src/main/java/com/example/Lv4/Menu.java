package com.example.Lv4;

import java.util.ArrayList;
import java.util.List;

// MenuItem 클래스를 관리
// 버거, 음료 등 각 카테고리 내에 여러 MenuItem 포함
public class Menu {

    String menuList;
    List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String menuList) {
        this.menuList = menuList;
        List<MenuItem> menuItems = new ArrayList<>();
    }

    // 메뉴 리스트 리턴
    public String getMenuList(){
        return menuList;
    }

    // MenuItem 클래스를 List로 관리
    public void setMenuItems(List<MenuItem> _menuItems){
        this.menuItems = _menuItems;
    }
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void getMenuItemsList(){
        System.out.println("[ "+menuList+" MENU ]");
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for(int i=0; i<menuItems.size(); i++){
            MenuItem menu = menuItems.get(i);
            System.out.println((i + 1) + ". " + menu.name + " | W " + menu.price + " | " + menu.description);
        }
        System.out.println("0. 종료");
    }

}
