package com.example.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lv3. 객체지향 설계를 적용해 순서 제어를 클래스로 관리
//  * 요구사항 : main함수에서 관리하던 순서 제어를 Kiosk 클래스로 관리
//          => 객체지향 개념, 데이터의 구조적 관리
public class Main {
    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();
        kiosk.start();

    }
}