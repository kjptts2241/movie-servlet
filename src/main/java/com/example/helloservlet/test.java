package com.example.helloservlet;

import java.io.IOException;
import java.text.ParseException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
    public static void main(String[] args) throws ParseException {

        String URL = "https://movie.naver.com/movie/sdb/rank/rmovie.naver";
        Document doc = null;

        try {
            doc = Jsoup.connect(URL).get();
            Elements movieList = doc.select(".tit3 > a");
            for (Element e : movieList) {
                System.out.println(e.attr("title"));
                System.out.println(e.attr("href"));
                String code = e.attr("href");
                String [] codeArr = code.split("=");
                System.out.println("https://movie.naver.com/movie/bi/mi/photoViewPopup.naver?movieCode=" + codeArr[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//
//
//        try {
//            doc = Jsoup.connect(URL).userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")
//                    .header("Accept", "text/html")
//                    .header("Accept-Encoding", "gzip,deflate")
//                    .header("Accept-Language", "it-IT,en;q=0.8,en-US;q=0.6,de;q=0.4,it;q=0.2,es;q=0.2")
//                    .header("Connection", "keep-alive")
//                    .ignoreContentType(true)
//                    .timeout(30000).get();
//
//            Elements movielist =doc.select(".tab4");
//            for (Element e: movielist) {
//                System.out.println(e);
//            }
//
//
//
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

    }
}