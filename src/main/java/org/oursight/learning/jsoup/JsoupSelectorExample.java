package org.oursight.learning.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;

/**
 * Created by neyao@github.com on 2016/7/20.
 */
public class JsoupSelectorExample {

    public static void main(String[] args) throws Exception {
        System.out.println("getAbsolutePath() = " + getAbsolutePath());
        String path = getAbsolutePath();
        File input = new File(path + "/test.html");
//      Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
        Document doc = Jsoup.parse(input, "UTF-8");

        Elements elements = doc.select(".searchnav li a");
        System.out.println("elements = " + elements);

    }

    public static String getAbsolutePath() {
        ClassLoader classLoader = JsoupSelectorExample.class.getClassLoader();
        File classpathRoot = new File(classLoader.getResource("").getPath());

        return classpathRoot.getPath();
    }
}
