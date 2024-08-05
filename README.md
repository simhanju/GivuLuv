# :heart:GivuLuv 프로젝트:heart:
---
### :blush: 프로젝트 소개
사용자들이 온라인 상에서 다양한 사회적 이슈와 공익 프로젝트를 지원할 수 있도록 돕는 사이트 입니다.

이 사이트는 기부, 펀딩, 가게, 사용자 유형(사용자, 판매자, 기업, 관리자)에 따른 로그인, 사용자 유형에 따른 마이페이지, 관리자 페이지 등의 기능을 제공합니다.
사용자들은 GivuLuv를 통해 다양한 사람들과 소통하고 지역사회에 기여할 수 있습니다.

---

## :clap: 팀원 구성
* 민동민
* 신재빈
* 심한주
* 안경진
* 안성현
* 이예나

## :hammer: 기술스택
<div> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
  <br>

  <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
  <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> 
  <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> 
  <br>
  
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> 
  <br>
  
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
  <img src="https://camo.githubusercontent.com/938da2d5b4f6f0e7c664f2d85f2fcd52d7660f6200507e41649bece913e6421a/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f5468796d656c6561662d3030354630463f7374796c653d666f722d7468652d6261646765266c6f676f3d5468796d656c656166266c6f676f436f6c6f723d7768697465">
  <br>
  
  <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">
  <br>
</div>

## :wrench: 구현 기능
1. 프로젝트 기부 / 펀딩 / 가게 기능: 다양한 공익 프로젝트를 카테고리별로 정렬하여 소개하고, 사용자들이 직접 후원 및 구매할 수 있는 결제 기능을 제공, 프로젝트별로 목표 금액, 현재 모액, 후원자 수 등을 투명하게 표시
2. 캠페인 참여 및 소통 기능: 사용자들이 다양한 사회적 이슈에 대한 캠페인에 참여할 수 있도록 기부자들 간의 소통과 정보 공유를 위한 커뮤니티 기능을 제공
3. AJAX 비동기처리: 페이지 새로고침 없이 데이터 갱신을 가능하게 하고 카테고리 정렬, 댓글 작성, 좋아요 기능 등 구현
4. 상점, 사회단체 승인 기능: 사용자에게 더욱 신뢰할 수 있는 서비스를 제공하기 위해 관리자에게 승인을 받도록 설계
5. 자활기업의 위치와 정보 파악: 공공데이터 오픈 API를 활용하여 전국 자활기업 현황을 카카오지도의 마커를 이용하여 사용자들에게 한 눈에 보기 쉽게 설계
6. 회원 정보에 대한 마이페이지: 사용자 유형(사용자, 판매자, 사회단체, 관리자)에 따라 세션을 구분하여 뷰를 각각에 맞게 구현하고 CRUD를 이용하여 설계

## :pencil: 개발 기간 및 작업 관리
### 개발기간
* 2024.05.08 ~ 2024.06.21

### ERD
![기부러부 ERD](https://github.com/user-attachments/assets/8bb5204d-efae-4e05-a3ae-7f1a5b45a732)

### Usecase Diagram
![기부러부 UsecaseDiargram](https://github.com/user-attachments/assets/e90eb873-2feb-4841-aacd-06ecb4bab43f)

## :camera: 주요 화면
### 인덱스 화면
<img src="https://private-user-images.githubusercontent.com/108271458/338857560-563af964-5baa-4964-9019-2c33bb2b9bb1.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI4MjY4NDUsIm5iZiI6MTcyMjgyNjU0NSwicGF0aCI6Ii8xMDgyNzE0NTgvMzM4ODU3NTYwLTU2M2FmOTY0LTViYWEtNDk2NC05MDE5LTJjMzNiYjJiOWJiMS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODA1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgwNVQwMjU1NDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yMmM2MDRlZGM0NTY4ZGViNTdhZGNkNzA3OTQxNmFhYTUyOGI5ODU0MWJlODgwNWM0OTBjYWY2ZTRlZTQ5ZTY4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.fbou8-oVg9241nYwv-GqjkWLOiNzx2xAjHTEXZ_I_bE">

### 기부, 펀딩화면
<img src="https://private-user-images.githubusercontent.com/108271458/337885848-102c10d5-3b94-415b-b598-9db96a6b0e1c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI4MjY4NDUsIm5iZiI6MTcyMjgyNjU0NSwicGF0aCI6Ii8xMDgyNzE0NTgvMzM3ODg1ODQ4LTEwMmMxMGQ1LTNiOTQtNDE1Yi1iNTk4LTlkYjk2YTZiMGUxYy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODA1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgwNVQwMjU1NDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0wN2FkOTU1YjVhYTY5NGZhOTE0YTE2Njg5Zjc3ZTI5ZWQ4ODU0NDhhMjMwZDNhMjQzZDM1MzMzNWVkYjNkMjgyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.KKo8IEiw42w0iaBYz46SMTBbnv4-shCxVY3R3KnZV_Q">
<img src="https://private-user-images.githubusercontent.com/108271458/337885856-55e123fd-2c29-4b7c-ba50-ffd759bf86aa.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI4MjY4NDUsIm5iZiI6MTcyMjgyNjU0NSwicGF0aCI6Ii8xMDgyNzE0NTgvMzM3ODg1ODU2LTU1ZTEyM2ZkLTJjMjktNGI3Yy1iYTUwLWZmZDc1OWJmODZhYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODA1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgwNVQwMjU1NDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00N2I4YjUzNGIwOWI1ODZhNjI1YzI0M2U3YTA5YWMzMTVlOWU3MGJjYjcyNjY2MTUzYWI1Mzg1OGVkNWZhZTk2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.mEbUZKtsEjFh5jQZ418Kdo6I_c6sWxH8yliJ_yACNa8">

### 기부, 펀딩 상세
<img src="https://private-user-images.githubusercontent.com/108271458/337885995-33f778ef-34df-4a75-b4a2-5f33c1c71b1a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI4MjY4NDUsIm5iZiI6MTcyMjgyNjU0NSwicGF0aCI6Ii8xMDgyNzE0NTgvMzM3ODg1OTk1LTMzZjc3OGVmLTM0ZGYtNGE3NS1iNGEyLTVmMzNjMWM3MWIxYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODA1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgwNVQwMjU1NDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yODZmZDZjNGQ1OWVkZjBhZTQ1MjAyNDIzMzFkNjExZTQzMTlmNGIwYjhjYTU0Y2Y0YWNlNGRjZTJmMzBiMmQyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.5v_i6wNNKflB4Xc2CZktXMYRz4T6Y62YCTw7SkrGTf8">
<img src="https://private-user-images.githubusercontent.com/108271458/337886091-e9cc5d6a-dbc8-482b-9442-daacda7f09d3.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI4MjY4NDUsIm5iZiI6MTcyMjgyNjU0NSwicGF0aCI6Ii8xMDgyNzE0NTgvMzM3ODg2MDkxLWU5Y2M1ZDZhLWRiYzgtNDgyYi05NDQyLWRhYWNkYTdmMDlkMy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODA1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgwNVQwMjU1NDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jYThkYmJiYTIzNmUwYjcwMWJjZTQwYmI3YTE1YTFmZmM3YjA1OGZjZmRmNTcxODhjN2I3ZmZiNzVlOWU1Yzg5JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.8ud-c7jWFE_wJINyczm_PIV7ILOCxQb0AUNaImjYhk4">

### 기부(일반/정기 결제), 펀딩 결제 페이지
<img src="https://private-user-images.githubusercontent.com/108271458/337886225-49ff1e0b-c43a-455b-8ed6-157c4f1b3f79.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI4MjY4NDUsIm5iZiI6MTcyMjgyNjU0NSwicGF0aCI6Ii8xMDgyNzE0NTgvMzM3ODg2MjI1LTQ5ZmYxZTBiLWM0M2EtNDU1Yi04ZWQ2LTE1N2M0ZjFiM2Y3OS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODA1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgwNVQwMjU1NDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT01ODUxMjk3ZjkzODAwMzQ4YzFiMGEwYzc2YzUzY2RiMWQ1YWUyZjYyYjYxZDJjN2I1ZjZkNmU4YmFkOTk4MGEyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.Kc-C0sCv8C_6tt2pxwNpDB69zP92sQGv-DAyqZ0Oja8">
<img src="https://private-user-images.githubusercontent.com/108271458/337886272-7ecfe1c9-9362-4b5a-80c6-229243b32682.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI4MjY4NDUsIm5iZiI6MTcyMjgyNjU0NSwicGF0aCI6Ii8xMDgyNzE0NTgvMzM3ODg2MjcyLTdlY2ZlMWM5LTkzNjItNGI1YS04MGM2LTIyOTI0M2IzMjY4Mi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODA1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgwNVQwMjU1NDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04MjhkNzZiNjAwY2JiNTM0MGNjYzExNTVkMTRkNGQ4NmM2ZDg5Njk1YTc4NGM5YTI4ZTk0NDNmNGU2NDQyNTc3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.-c4_RzGYfVfX7KlBZ71dzgLQUC_KaneHn5-QMs-v7ZA">
