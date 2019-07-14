package org.kartashov.part21_network.url_and_uri;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*
Characters used in URLs must come from a fixed subset of ASCII
- The capital letters A-Z
- The lowercase letters a-z
- The digits 0-9
- The punctuation characters - _ . ! ~ * ' (and ,)
 */
public class QueryString {

    private StringBuffer query = new StringBuffer( );

    public QueryString(String name, String value) {
        encode(name, value);
    }

    public synchronized void add(String name, String value) {
        query.append('&');
        encode(name, value);
    }

    private synchronized void encode(String name, String value) {
        try {
            query.append(URLEncoder.encode(name, "UTF-8"));
            query.append('=');
            query.append(URLEncoder.encode(value, "UTF-8"));
        }

        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("Broken VM does not support UTF-8");
        }
    }

    public String getQuery( ) {
        return query.toString( );
    }

    public String toString( ) {
        return getQuery( );
    }

    public static void main(String[] args) {
        QueryString qs = new QueryString("pg", "q");
        qs.add("kl", "XX");
        qs.add("stype", "stext");
        qs.add("q", "+\"Java I/O\"");
        qs.add("search.x", "38");
        qs.add("search.y", "3");
        String url = "http://www.altavista.com/cgi-bin/query?" + qs;
        System.out.println(url);

        String input = "http://www.altavista.com/cgi-bin/" +
                "query?pg=q&kl=XX&stype=stext&q=%2B%22Java+I%2FO%22&search.x=38&search.y=3";
        try {
            String output = URLDecoder.decode(input, "UTF-8");
            System.out.println(output);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
