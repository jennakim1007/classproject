
# Todo mini Project
Spring boot 를 이용한 todo project 최종본 입니다.  <br>
<br>

## 기술/구조
* Spring, JavaScript, Ajax, BootStrap, MySql

<br>

## 프로젝트 구조
> 1. 로그인 후 할 일을 입력, 조회, 수정 삭제 할 수 있습니다. <br>
> 2. 페이징 처리를 하여 10페이지씩 리스트를 조회할 수 있습니다. <br>
> 3. 회원가입시 아이디 중복 검사와 비밀번호 암호화를 할 수 있습니다. <br>
> 4. 로그인시 권한에 따른 페이지 확인을 할 수 있습니다. 
<br>

* 회원
    * 로그인
    * 회원가입  
    ![image](https://user-images.githubusercontent.com/113006966/209281078-6f79a145-7282-415d-af1a-cee24e9c7826.png)

* Todo
    * 진행중, 완료한 Todo 확인
    ![image](https://user-images.githubusercontent.com/113006966/209281506-36dedfea-fd77-4065-af01-354950b445ac.png)
    * 입력  
    * 수정
    * 삭제
    ![image](https://user-images.githubusercontent.com/113006966/209281556-a6a8ff17-9b5e-4cc6-8177-1fd93d2d4b32.png)
<br>

## 구현하면서 겪었던 어려움 
* **문제/해결** <br>
1. 파라미터가 넘어오지 않는다. -> 콘솔에서 로그를 확인하거나 개발자 도구의 headers 값을 확인하여, 코드에서 빠진 부분을 확인하고 수정하였다. 
2. service 에서 entity 컬럼 값을 받지 못하였다. -> dto를 별도로 만들어 service 에 연결하였다.  
3. security 에서 사용자 지정 로그인 페이지 사용시 로그인이 되지 않았다. -> customSercurityConfig 클래스를 만들고, username 과 password 파라미터를 받을 수 있도록 하였다.
<br>

## 테스트 안내 
**데이터베이스 초기세팅이 필요합니다.** 

**1. 데이터베이스 세팅 :**
* 설명
* 설명
<br>

**2. 사용자 계정 :**
* ID : aaa
* PW : aaa
<br>

## 버전설명
* v0
   * CRUD 가 가능한 Todo 
   
