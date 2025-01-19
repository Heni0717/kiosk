![header](https://capsule-render.vercel.app/api?type=transparent&fontColor=F8E0E0&text=Kiosk&height=150&fontSize=60&desc=[Spring%205기]%20CH2%20키오스크%20과제&descAlignY=75&descAlign=50)

### 📑 목차
- [개요](#개요)
- [개발 프로세스](#개발-프로세스)
- [필수 기능](#필수-기능)
- [트러블 슈팅](#트러블-슈팅)
- [자체 평가](#자체-평가)
---
### 📜 개요
**목적** : 자바 문법 실습, 객체지향 개념 적용

**접근 방식**
- 필수 : 객체지향 설계(추상화, 캡슐화, 상속, 다형성)에 대한 고민
- 도전 : 문법의 심화 - 고급 자바 문법 학습

---
### 🛠️ 개발 프로세스
**개발 환경** : <img src="https://img.shields.io/badge/IntelliJ IDEA-000000?style=flatsquare&logo=intellijidea&logoColor="/> <img src="https://img.shields.io/badge/JDK 17-0174DF?style=flatsquare&logo=&logoColor="/>

**요구사항**
- 필요기능 정의
    - 필수 : 메뉴 출력, 메뉴 선택(사용자 입력 받기), 주문 내역 확인, 잘못된 입력 처리, 프로그램 종료
    - 도전 : 장바구니 기능, 주문 완료 및 결제, 사용자 입력 최적화
- 사용자 인터페이스 방식 : 콘솔 기반
- 예외 처리(사용자 입력) - `try~catch`
    - 존재하지 않는 메뉴 번호 입력 : 오류 메시지 출력 후 재입력 요구 - `try`
    - 정수가 아닌 것을 입력받은 경우 : ~ `catch(Exception e){오류 메시지 출력, 버퍼 제거}` 이후 재입력 요구 -`try`

**설계**
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
### 🌱 필수 기능

<details>
<summary>Lv1. 기본적인 키오스크 프로그래밍</summary>

- 입력 처리와 간단한 흐름 제어


- [x] : 여러 햄버거 메뉴 출력 - `while`
- [x] : 입력받은 숫자에 따라 다른 로직 실행하는 코드 작성 - `Scanner` `switch`
- [x] : 특정 번호 입력되면 프로그램 종료 - `if` `break`
</details>

<details>
<summary>Lv2. 객체지향 설계를 적용한 햄버거 메뉴의 클래스 관리</summary>

- 객체지향 개념 학습, 데이터를 구조적으로 관리하며 프로그램 설계
- 햄버거 메뉴를 `MenuItem`클래스와 List를 통해 관리


- [x] : MenuItem 클래스 생성
  - [x] : 필드 - 이름, 가격, 설명
- [x] : `main()`에서 `MenuItem`클래스를 활용해 햄버거 메뉴 출력
  - [x] : `MenuItem` 객체 생성을 통해 속성 세팅 - `new`
- [x] : List 선언해 여러 `MenuItem` 추가 - `List<MenuItem> menuItems = new ArrayList<>();`
- [x] : 반복문으로 `menuItems`를 탐색하며 하나씩 접근 - `for`

</details>

<details>
<summary>Lv3. 객체지향 설계를 적용한 순서 제어의 클래스 관리</summary>

- `main()`에서 관리하던 전체 순서 제어를 `Kiosk` 클래스를 통해 관리


- [x] : `Kiosk` 클래스 생성
  - [x] : 필드 - `MenuItem`을 관리하는 리스트
  - [x] : `main()`에서 관리하던 입력,반복 로직을 `start()`를 만들어 관리
  - [x] : 리스트 `menuItems`는 `Kiosk`클래스 생성자를 통해 값 할당
  - [x] : Lv1, 2에서 구현했던 입력, 반복로직이 실행되는지 검토

</details>

<details>
<summary>Lv4. 객체지향 설계를 적용한 음식 메뉴와 주문 내역의 클래스 기반 관리</summary>

- [x] : `Menu`클래스 생성
  - 각 카테고리 내에 여러 `MenuItem` 포함해 관리하는 클래스(버거 메뉴, 음료 메뉴 등)
  - [x] : `Kiosk`가 관리하던 `List<MenuItem`을 이 클래스가 관리
  - [x] : 필드 - 카테고리 이름
  - [x] : 카테고리 이름을 반환하는 메소드 구현 - `getCategory()`
</details>

<details>
<summary>Lv5. 캡슐화 적용</summary>

- [x] : 각각의 클래스 필드에 직접 접근하지 못하도록 설정
- [x] : Getter, Setter 메소드를 사용해 데이터 관리

</details>

---
### 트러블 슈팅

- <a href="https://heni0717.tistory.com/18">TIL 링크</a>
---
### 🎯 자체 평가
#### 🏆 완성도
- [x] Lv1 기본적인 키오스크 프로그래밍
- [x] Lv2 객체지향 설계를 적용한 햄버거 메뉴의 클래스 관리
- [x] Lv3 객체지향 설계를 적용한 순서 제어의 클래스 관리
- [x] Lv4 객체지향 설계를 적용한 음식 메뉴와 주문 내역의 클래스 기반 관리
- [x] Lv5 캡슐화 적용
- [ ] (도전) Lv1 장바구니 및 구매하기 기능 추가
- [ ] (도전) Lv2 Enum, 람다&스트림을 활용한 주문 및 장바구니 관리

#### 🔍 이해도
- [x] TIL에 트러블 슈팅 과정 기록
- [x] (도전) 쓰임에 따라 명확한 디렉토리 및 파일 분리
- [x] (도전) 변수명 등 코드를 직관적이고 이해하기 쉽게 작성
- [x] (도전) 주석 활용해 코드 설명

#### 🌟 우수성
- [x] 구현 사항에 대한 ReadMe 작성해 정리
- [x] (도전) 특수상황에 대한 예외 처리 2가지 이상 구현
- [ ] (도전) 10회 이상의 컨벤션을 지킨 커밋


---
