# Todo mini Project
Spring boot 를 이용한 todo project 최종본 입니다.  <br>
<br>

## 기술/구조
[![Bootstrap][Bootstrap.com]][Bootstrap-url]
[![JQuery][JQuery.com]][JQuery-url]
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white">
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">
<img alt="Html" src ="https://img.shields.io/badge/HTML5-E34F26.svg?&style=for-the-badge&logo=HTML5&logoColor=white"/> 

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
두 개의 테이블을 만들고 Todo 를 실행합니다. 

    CREATE TABLE `todo` (
      `tno` int NOT NULL AUTO_INCREMENT,
      `todo` varchar(45) COLLATE utf8mb3_bin NOT NULL,
      `duedate` datetime DEFAULT CURRENT_TIMESTAMP,
      `finished` int DEFAULT '0',
      `idx` int DEFAULT NULL,
      PRIMARY KEY (`tno`),
      KEY `fk_idx_idx` (`idx`),
      CONSTRAINT `fk_idx` FOREIGN KEY (`idx`) REFERENCES `todomember` (`idx`)
    )
    
 <br>

    CREATE TABLE `todomember` (
      `idx` int NOT NULL AUTO_INCREMENT,
      `userid` varchar(45) COLLATE utf8mb3_bin NOT NULL,
      `password` varchar(145) COLLATE utf8mb3_bin NOT NULL,
      `username` varchar(45) COLLATE utf8mb3_bin NOT NULL,
      `role` varchar(45) COLLATE utf8mb3_bin DEFAULT 'USER',
      `regdate` datetime DEFAULT CURRENT_TIMESTAMP,
      PRIMARY KEY (`idx`),
      UNIQUE KEY `userid_UNIQUE` (`userid`)
    )



## 버전설명
* v0
   * CRUD 가 가능한 Todo 
   
<!-- MARKDOWN LINKS & IMAGES -->
<!-- 뱃지 사이트 https://shields.io/ -->
<!-- 뱃지 리스트!!! https://github.com/Ileriayo/markdown-badges -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 

