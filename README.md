![header](https://capsule-render.vercel.app/api?type=transparent&fontColor=F8E0E0&text=Kiosk&height=150&fontSize=60&desc=[Spring%205기]%20CH2%20키오스크%20과제&descAlignY=75&descAlign=60)

### 목차
- [개요](#개요)
- [개발 프로세스](#개발-프로세스)
- [필수 기능](#필수-기능)
- [트러블 슈팅](#트러블-슈팅)
- [자체 평가](#자체-평가)
---
### 개요
&nbsp;▶️ 목적 : 자바 문법 실습, 객체지향 개념 적용

&nbsp;▶️ 접근 방식 <br>
- 필수 : 객체지향 설계(추상화, 캡슐화, 상속, 다형성)에 대한 고민
- 도전 : 문법의 심화 - 고급 자바 문법 학습

---
### 개발 프로세스
&nbsp;▶️ 개발 환경 : <img src="https://img.shields.io/badge/IntelliJ IDEA-000000?style=flatsquare&logo=intellijidea&logoColor="/> <img src="https://img.shields.io/badge/JDK 17-0174DF?style=flatsquare&logo=&logoColor="/>

&nbsp;▶️ 요구사항
- 필요기능 정의
    - 필수 : 
    - 도전 :
- 사용자 인터페이스 방식 : 콘솔 기반
- 예외 처리(사용자 입력) - `try~catch`
    - 존재하지 않는 메뉴 번호 입력 : 오류 메시지 출력 후 재입력 요구 - `try`
    - 정수가 아닌 것을 입력받은 경우 : ~ `catch(Exception e){오류 메시지 출력, 버퍼 제거}` 이후 재입력 요구 -`try`

&nbsp;▶️ 설계
- 클래스
    - `Main` : 시작점, `main()`
    - `MenuItem` : 세부 메뉴 속성 가짐
    - `Kiosk` : 프로그램 순서 및 흐름 제어
    - `Menu` : `MenuItem` 관리
- 기능 분해
    - 필수 과제 Lv5 기준
        - `Main`
          - `main()`
        - `MenuItem`
          - `MenuItem()` `getName()` `getPrice()` `getDescription`
        - `Kiosk`
          - `kiosk()` `start()` `getInputException():사용자 입력 예외 처리`
        - `Menu`
          - `Menu()` `getCategory()` `getMenuItems()` `getMenuItemList()` `setMenuItems():MenuItem 초기화`
- 데이터 흐름
    - input : 카테고리 선택(정수 1개 입력), 메뉴 선택(정수 1개 입력), 뒤로가기 또는 종료(0입력)
    - kiosk : 사용자의 입력에 따른 입출력 반복 로직 생성 및 예외 처리
    - output
      - 카테고리 선택 시 : 하위 메뉴(버거, 음료, 디저트)의 목록 출력
      - 메뉴 선택 시 : 선택한 메뉴 정보 출력(이후 다시 입력 요구)
      - 0 입력 시
        - 메뉴 : 상위 카테고리로 뒤로가기
        - 카테고리 : 프로그램 종료

---
### 필수 기능

<details>
<summary>🌱Lv1. 기본적인 키오스크 프로그래밍</summary><br>  

- [x] : ㅇㅇ

</details>

---
### 트러블 슈팅

- <a href="여기 링크 넣을거여">TIL 링크</a>
---
### 자체 평가
&nbsp;▶️ 완성도

- [x] ㅇㅇ

&nbsp;▶️ 이해도
- [x] ㅇㅇ


&nbsp;▶️ 우수성
- [x] ㅇㅇ


---