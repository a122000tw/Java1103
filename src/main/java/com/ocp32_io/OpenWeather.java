
package com.ocp32_io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import org.json.JSONObject;

public class OpenWeather {
    public static void main(String[] args) throws Exception{
        String id = "29f2b281a63b488da3604490be29b298";
        String cityName = "taoyuan,TW";
        String urlstr = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
        urlstr = String.format(urlstr, cityName, id);
        System.out.println(urlstr);
        URL url = new URL(urlstr);
        InputStream is = url.openStream();
        Reader r = new InputStreamReader(is); 
        int data = 0;
        String jsonStr = "";
        while ((data = r.read()) != -1) {            
            jsonStr += (char)data;
        }
        System.out.println(jsonStr);
        // 分析 Json 字串
        JSONObject root = new JSONObject(jsonStr);
        JSONObject main = root.getJSONObject("main");
        double temp = main.getDouble("temp") - 273.15;
        double feels_like = main.getDouble("feels_like") - 273.15;
        int humidity = main.getInt("humidity");
        
        System.out.printf("目前溫度: %.2f\n", temp);
        System.out.printf("體感溫度: %.2f\n", feels_like);
        System.out.printf("目前濕度: %d %%\n", humidity);
    }
}
