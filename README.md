# project-web-site
🥦 market brokurly 🥦<br>
마켓 컬리 웹 페이지 시스템을 모티브로 한 온라인 웹 사이트 개발

## 🥦 소개
### 프로젝트 진행 기간
> 2021.08.09 ~ 2021.09.07

### 🥦 구현한 기능
> * 회원 가입, 회원 로그인 및 로그아웃, 회원 정보 찾기 및 비밀번호 변경
> * 회원 등급별 차등 혜택 지정
> * 전체 상품 조회, 항목별 상품 리스트 조회, 상품 세부 정보 조회, 상품별 할인율
> * 회원 마이페이지 (주문 내역, 주문 내역 상세 조회, 기간별 조회, 적립 포인트 및 만료 예정 포인트 조회, 쿠폰 조회 및 등록, 회원 정보 수정 및 탈퇴)
> * 장바구니
> * 상품결제

### 🥦 사용한 프로그램
> * [Java SE 11](https://www.oracle.com/kr/java/technologies/javase-downloads.html "java SE 11 link")
> * [Eclipse](https://www.eclipse.org/downloads/ "eclipse IDE link")
> * [Oracle XE](https://www.oracle.com/kr/database/technologies/xe-downloads.html "oracle XE link")
> * [Oracle SQL Developer 20.4.1](https://www.oracle.com/tools/downloads/sqldev-downloads.html "oracle sql developer link")
> * [Spring Framwork](https://spring.io/projects/spring-framework "spring framwork") <br>
>   [Spring Legacy Project] - Spring MVC Project <br>
>   [Maven repository] - Lombok(1.18.20 ver) <br>
>                      - Hikari Connection Pool(4.0.3 ver) <br>
>                      - MyBatis(3.4.6 ver) <br>
>                      - Logging(slf4j, log4j(1.2.17 ver)) <br>
>                      - jstl(1.2 ver) <br>
>                      - junit(4.12 ver) <br>

### 🥦 사용한 외부 API
> * kakaoAPI, KGInesisAPI

### 🥦 flow chart
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/46eef179-106a-4a04-b81f-9cd913affe3b)

### 🥦 diagram
> * usecase diagram
> ![Use case diagram (1)](https://user-images.githubusercontent.com/80576569/129040363-6b5c8bec-a791-4598-b85b-9e5223446256.png)
> * E-R diagram
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/a9cdd297-7750-4d31-98db-6e9936904806)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/44f2fdf8-4b93-4d47-9a1e-5b8c90aafec3)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/8984693c-82d4-4f58-a4f5-18678c7dfca1)

## 🥦 package diagram
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/f268f550-60a5-4669-8f23-a8b7deeee4d8)


## 🥦 구현한 화면 캡쳐
> * 회원가입 창으로 이동
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/3bcff3ff-34d8-46f7-bda6-e4347087cbd7)

> * 회원가입 
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/a9da4345-c777-4e95-9d62-4fa4b3fa60b8)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/21726dda-a2f5-4420-af2d-5cc0377029d6)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/9a86a619-ffeb-4c74-941c-59f4f766cead)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/fca9ff93-30a7-453a-9a94-44a3583d676e)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/c00f5b25-7156-4105-8222-88f9948beeda)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/0a59c1a1-441d-44bc-9903-da76852e3d1d)

> * kakao API를 이용한 주소 입력
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/26b2cdf5-9226-4105-91b2-181d33394626)

> * 회원가입 완료 시 데이터베이스 변화
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/d0e9baa6-d1be-4d05-b623-9e74be6ce97d)

> * 회원가입 완료 후
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/977c83ed-ad99-43fa-b0c6-f9b90b130532)

> * 로그인 시 나오는 알림 및 로그인 후 메인 페이지 이동
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/43083390-b1f9-47fe-a3c2-8e403655c203)

> * 로그인 시 변경되는 요소들
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/22ebcff9-6722-4246-a8a4-c1d731e1af31)

> * 상품 페이지
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/cc2ca7c8-58f3-4530-be2e-b91e027d9dd8)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/55c3f36a-4cce-4df0-892d-6e9c6e042971)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/aa440530-f435-49b6-9447-ee8728d07e07)

> * 상품 검색 시 필터링 적용
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/bd8581d7-1779-495c-8b74-eac556fd2e9e)

> * 상품 상세 페이지
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/8452bb6e-fde7-49f6-b10f-c9e7cd723eb5)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/31356723-d020-4700-b190-c6a96e89f51c)

> * 장바구니 담기
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/b7726cfa-bf18-4ca7-87bb-4a22ae4f6934)

> * 회원/비회원에 따른 장바구니 안내 처리
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/026a6af1-ff57-4c9f-b3c1-1b13713279e0)

> * 선택 수량 0인 경우 안내 처리
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/041e0744-a11d-496d-970c-c9271bc5d9f6)

> * 상품 준비중
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/b2626aea-d243-401e-8419-eccdbcaa71a1)

> * 장바구니 상세 페이지
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/1a4906fe-e8ef-44c0-a208-a10a272546c2)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/b209ccee-592a-4312-8000-640ddd96cc84)

> * 결제
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/c3878f5a-3f5d-4c9f-8595-dccb2e1cfb0e)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/2af87f46-6c2a-4226-9445-30b85a4a36fb)

> * 결제 완료 시 DB 변화
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/e4cf444b-99af-429d-842d-8c7b4612fa8e)

> * 주문 내역 페이지
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/0c7860f7-3f7b-4596-b8e2-89ae88ed1e4b)

> * 적립금 반영
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/19d9f97a-120a-4020-834e-27a87bfe3f06)

> * 적립금 히스토리
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/a19ef6f1-526d-4f4d-a8ee-5641e95025bb)

> * 배송지 관리
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/ed6f1dc3-dd3e-43ae-95ad-ed23a4297436)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/28ff519d-ef7c-4d74-a022-bc115f0315fa)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/0b943565-579a-4691-b9d5-502804a31592)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/29478637-25e1-4678-8f9b-7207d3e363b2)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/b2b29fb1-ee8d-4c26-bc23-10d5ebbeb246)

> * 쿠폰 관리
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/4ab03ce0-d6ee-49d5-ad05-8907616f1c13)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/ba198cc8-d9fd-40ff-9c42-6215adddb612)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/e699cd9a-9cea-4a6e-b749-0c009f5d7465)

> * 개인정보 수정
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/e1c0af00-caba-4c76-b3b2-93c806fc4334)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/4cba1b69-70b4-4b14-94bd-bf26dab838a5)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/68e7cbe8-a90a-454b-b265-67e351ae11f2)

> * 공지사항 및 게시글 작성
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/64a5956a-ea43-4ec1-bb3b-63f394efc600)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/95633cd4-9123-41b1-a825-88f6c1fcdbf1)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/c79edda1-d74c-4934-a596-65441160f8a0)
> ![image](https://github.com/yerimmseo/project-web-site/assets/80576569/adf57c06-200b-4c50-bb7e-15b2b42cc797)
