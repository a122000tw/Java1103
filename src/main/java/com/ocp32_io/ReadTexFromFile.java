
package com.ocp32_io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTexFromFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ocp32_io\\files\\data.txt");
        // 使用 try-with-resource 的語法
        try(FileReader r = new FileReader(file)){ // true: 保留之前的資料
           int data = 0;
           String allData = "";
            while ( (data = r.read()) != -1 ) {                
                //System.out.print((char)data);
                allData += (char)data;
            }
            System.out.printf("檔案內容: %s\n", allData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
