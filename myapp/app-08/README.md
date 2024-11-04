# 08. 기능 단위로 명령문 묶기 : 메서드 사용법

## 학습목표

- 스태틱 메서드를 정의하고 사용할 수 있다.
- 스태틱 필드(변수)를 정의하고 사용할 수 있다.
- import 명령문을 사용할 수 있다.
- 리팩토링 기법 중 'extract method'를 수행할 수 있다.

## 요구사항 

- 중복 코드를 메서드로 분리
  - 효과: 기능 변경이 쉽다.
- 기능 단위로 명령어를 묶어 메서드로 분리
  - 효과: 코드의 기능을 이해하기 쉽다. = 가독성이 좋다.
- 이를 통해 코드의 재사용성을 강화
  - 효과: 재작성 없이 다른 프로젝트에서도 사용할 수 있다. = 개발 비용 절감.

## 실행 결과

변경 없음.

## 작업

- 1) 메뉴를 출력하는 코드를 printMenu() 메서드로 묶어 사용한다.
- 2) 사용자로부터 명령을 입력 받는 코드를 prompt() 메서드로 묶어 사용한다.
- 3) 메뉴 번호의 유효성을 검증하는 코드를 isValidateMenu() 메서드로 묶어 사용한다.
- 4) 메뉴 타이틀을 알아내는 코드를 getMenuTitle() 메서드로 묶어 사용한다.
- 5) 메뉴를 처리하는 조건문(유효한 번호, 유효하지 않은 번호, 종료)을 정리한다.

## 소스 파일

- App.java
