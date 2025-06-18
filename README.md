# Spring Boot 簡易電商 API 專案
<br>


##  專案簡介
本專案是一個使用 Spring Boot 開發的簡易商城後端 API，支援商品瀏覽、下單、用戶註冊／登入與 JWT 認證機制，使用純 Spring JDBC 撰寫資料存取層，模擬一個具備基本購物功能的電商後端系統。
<br>

##  專案架構
專案採用分層設計，包含以下模組與職責：<br>

    * controller：處理 RESTful API 請求，負責接收參數與回傳資料。
    * service / impl：封裝商業邏輯，串接 DAO 操作資料。
    * dao / impl：負責與資料庫互動，使用 JdbcTemplate 執行 SQL。
    * rowmapper：將查詢結果 (ResultSet) 映射為資料模型物件。
    * dto：用於封裝 API 請求與回應資料，例如註冊／登入請求、下單等。
    * model：定義資料庫對應的實體類別。
    * util：工具類，包含 JWT 工具與分頁工具等。
##  安全設計

    * JWT 驗證機制：
    * 使用者登入後，回傳 JWT Token。
    * 使用者後續的 API 請求需附帶 Token 才能存取受保護資源。
    * Token 中包含 userId 及 email，並設有過期時間。

##  已實作功能

 使用者功能

    * 使用者註冊
    * 使用者登入（回傳 JWT Token）
 商品功能

    * 商品查詢（支援條件過濾與分頁）
    * 商品新增/查詢/修改/刪除（CRUD)
 訂單功能

    * 建立訂單
    * 查詢使用者訂單清單與明細

 測試與驗證

    * 使用 MockMvc 撰寫整合測試，模擬登入與下單流程。
    * 登入測試含：
       註冊 → 登入 → 驗證 JWT 回傳內容（包含 token、userId、email）

 技術與工具

    * Java 21
    * Spring Boot
    * Spring JDBC / Data JPA
    * MySQL / H2
    * JUnit 5 + Mockito
    * Maven

 專案結構 rust

      ├── controller
      │   ├── OrderController.java
      │   ├── ProductController.java
      │   └── UserController.java
      ├── service / impl
      ├── dao / impl
      ├── dto
      ├── model
      ├── rowmapper
      ├── util
      └── SpringbootMallApplication.java


 學習收穫

    * 熟悉 Spring Boot 應用的三層架構設計。
    * 實作 JWT 驗證流程並整合於 API 安全機制中。
    * 建立一個具備實際商業邏輯的電商後端系統。
