package com.example.Lv4;

import java.util.ArrayList;
import java.util.List;

// MenuItem 클래스를 관리
// 버거, 음료 등 각 카테고리 내에 여러 MenuItem 포함
public class Menu {

    // 필드 : 카테고리, 메뉴 아이템(리스트로 관리)
    String category;
    List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String _category) {
        this.category = _category;
    }


    // getter
    public String getCategory(){
        return category;
    }
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void getMenuItemsList(){
        System.out.println("[ "+category+" MENU ]");
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for(int i=0; i<menuItems.size(); i++){
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.name + " | W " + menuItem.price + " | " + menuItem.description);
        }
        System.out.println("0. 돌아가기");
    }

    // setter - main()메소드에서 생성하는 MenuItem을 할당할때 사용
    public void setMenuItems(List<MenuItem> _menuItems){
        this.menuItems = _menuItems;
    }

}
