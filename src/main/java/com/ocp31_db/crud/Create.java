
package com.ocp31_db.crud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) throws Exception{
        // 1.載入JDBC驅動程式
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // 2.建立資料庫連線
        String url = "jdbc:derby://localhost:1527/demo"; // 資料庫位置
        String user = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.printf("資料庫連線是否關閉: %b\n", conn.isClosed());
        // 3. 建立 Statement 敘述(用來敘述撰寫 SQL 語法)物件
        // ResultSet.TYPE_SCROLL_INSENSITIVE 非敏感(不會立即取得修正後的資料)
        // ResultSet.TYPE_SCROLL_SENSITIVE 非敏感(會立即取得修正後的資料)
        // ResultSet.CONCUR_UPDATABLE 可修改 ResultSet
        // 一般多用於查詢
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        // 4. 取得最大 id 值 + 1
        String sql = "SELECT MAX(d.ID) as id From app.drink d";
        ResultSet rs = stmt.executeQuery(sql);
        rs.next(); // 游標移動到該筆紀錄
        int nextId = rs.getInt("id") + 1; // 取得最大 id 值 + 1
        
        // 5. 建立新增的查詢
        sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d";
        rs = stmt.executeQuery(sql);
        // 6. 指標移動到可新增的紀錄
        rs.moveToInsertRow();
        // 7. 加入要新增的內容
        rs.updateInt("id", 5);
        rs.updateString("name", "Tea");
        rs.updateInt("price", 15);
        rs.updateInt("amount", 100);
        rs.updateDate("tdate", new Date(new java.util.Date().getTime()));
        // 8. 新增資料
        rs.insertRow();
        System.out.println("新增成功!!");
        //while (rs.next()) {            
        //     System.out.println(rs.getInt("id"));
        //}
        
       
        // 關閉資源
        rs.close();
        stmt.close();
        conn.close();
    }
}
