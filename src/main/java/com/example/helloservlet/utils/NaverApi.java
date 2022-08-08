package com.example.helloservlet.utils;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverApi {
    public static List<String> movie() {

        List<String> list = new ArrayList<>();
        String URL = "https://movie.naver.com/movie/sdb/rank/rmovie.naver";
        Document doc = null;

        try {
            doc = Jsoup.connect(URL).get();
            Elements movieList = doc.select(".tit3 > a");
            int i = 0;
            for (Element e : movieList) {
//                System.out.println(e.attr("title"));
//                System.out.println(e.attr("href"));
                String code = e.attr("href");
                String[] codeArr = code.split("=");
//                System.out.println("https://movie.naver.com/movie/bi/mi/photoViewPopup.naver?movieCode=" + codeArr[1]);
                if (i >= 9) break;
                list.add("https://movie.naver.com/movie/bi/mi/photoViewPopup.naver?movieCode=" + codeArr[1]);
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}