# 🖥️ comento-backend 프로젝트 소개
* Spring Boot 프레임워크 사용하여 "SW활용 현황 통계 API" 개발

***

##  ✏️1주차 진행 내용
1. 개발 환경 셋팅
   * Java
     + JDK11
   * Framework
     + Spring 5.3.20
     + Spring을 사용하면서 무수한 xml파일 작성, WAS(Tomcat)설정, 라이브러리 의존성 관리 등 번거로움을 느낌 ->  Spring Boot를 선호하는 이유
   * WAS
     + Tomcat 9.0.80
   * IDE
     + IntelliJ
   * DB
     + mysql, mysql workbench 8.0.34
   * Maven dependancy
     + org.springframework:spring-web5.3.20
     + org.mybatis:mybatis:3.5.6
     + org.mybatis:mybatis-spring:1.3.2
     + org.slf4j:slf4j-api:1.7.25
     + org.apache.tomcat:tomcat-juli:10.1.7
     + org.apache.tomcat:tomcat-dbcp:10.1.7
     + mysql:mysql-connector-java:8.0.28
     + javax.inject:javax.inject:1
     + commons-fileupload:commons-fileupload:1.3.1
     + javax.servlet.jsp:jsp-api:2.1
     + javax.servlet:javax.servlet-api:3.1.0
   
  
2. VO 작성
    ![ss1.png](img%2Fss1.png)
     + getter, setter method 작성


3. 실행 결과
    ![ss2.png](img%2Fss2.png)

***

##  ✏️2주차 진행 내용
1. API 가이드 문서 작성
   * [api_guide.docx](api_guide.docx)
2. REST API 개념 학습

***

## ✏️3주차 진행 내용

1. Spring Boot 프로젝트 생성 및 개발 환경 설정
    * JAVA
        + JDK 17
    * Spring Boot
        + Spring Boot 3.1.4
        + 이전에 사용해 보았던 경험을 바탕으로 3.x.x 버전 사용
    * Build Tool
        + Gradle 사용
        + Gradle 언어 : groovy
    * DB
        + H2 Database - mysql 대신 내장 데이터베이스 H2사용
        + JPA 방식을 사용하여 매핑 
    * 기타 Dependency
        + spring-boot-starter-web
        + spring-boot-devtools
        + spring-boot-starter-data-jpa
        + spring-boot-starter-thymeleaf
        + org.projectlombok:lombok

2. 프로젝트 개발 환경 변경 이유
    * 과제 가이드의 설정대로 세팅 시도를 하였으나 실패함.
    * 기존에 접해 보았던 Spring boot3 및 gradle 사용으로 대체 함
    * Mysql 스키마 및 테이블 생성 시 외래키 참조 무결성 에러 발생
        +  --> 내장 DB인 H2 Database로 변경
        +  --> JPA 활용하여 JAVA Class로 엔티티 작성
    
    
3. 엔티티 생성 및 DB 테이블 생성
-- 엔티티--

![d1.png](img%2Fd1.png)


![d2.png](img%2Fd2.png)


![d3.png](img%2Fd3.png)


-- H2 DataBase 생성 확인


![d4.png](img%2Fd4.png)



***
## ✏️4주차 진행 내용

진행중.......