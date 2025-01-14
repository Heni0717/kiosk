package com.example.Lv1;

import java.util.Scanner;

// Lv1. 기본적인 키오스크 프로그래밍
//  * 요구사항 : 햄버거 메뉴 출력, 입력받은 숫자에 따른 로직 실행, 특정 번호가 입력되면 프로그램 종료
//          => 입력 처리, 간단한 흐름 제어
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입/출력 반복
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");
            System.out.print("원하는 메뉴 번호 입력: ");
            int input = sc.nextInt();

            // 0번을 입력받으면 프로그램 종료
            if(input==0){
                System.out.println("프로그램 종료");
                break;
            }
            // 입력된 번호에 따른 출력 로직(선택한 메뉴 : 메뉴이름) 출력
            switch (input){
                case 1:
                    System.out.println("선택한 메뉴: ShackBurger");
                    break;
                case 2:
                    System.out.println("선택한 메뉴: SmokeShack");
                    break;
                case 3:
                    System.out.println("선택한 메뉴: Cheeseburger");
                    break;
                case 4:
                    System.out.println("선택한 메뉴: Hamburger");
                    break;
                default:
                    System.out.println("번호 입력 오류");
                    continue;
            }
        }
    }
}