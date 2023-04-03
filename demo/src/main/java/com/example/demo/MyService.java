package com.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class MyService {
    private String url = "https://ru.wikipedia.org/wiki/Java";
    private String cssQuery = "#mw-content-text > div.mw-parser-output > p:nth-child(4)";

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResult() {
        return null;
    }

    private Document readWiki(String url) {
        try {
            return Jsoup.connect(url).get();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    private Elements readElement(String cssQuery) {
        Document document = readWiki(url);
        return document.select(cssQuery);
    }

//    private int coutA() {
//        Pattern pattern = Pattern.compile("а");
//        Matcher matcher = null;
//        for (Element element : readWiki(cssQuery).select("a")) {
//            matcher = pattern.matcher(element.text());
//        }
//        while (matcher.find()) {
//            matcher.group();
//        }
//    }
}
