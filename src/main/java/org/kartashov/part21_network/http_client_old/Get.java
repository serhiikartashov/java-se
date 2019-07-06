package org.kartashov.part21_network.http_client_old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Get {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://searhiy.github.io/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Java 1.1");
        if (con.getResponseCode() == 200) {
//            System.out.println(IOUtils.toString(con.getInputStream())); // apache commons-io
            System.out.println(readInputStream(con.getInputStream()));
        } else {
            System.out.println("Something wrong here!");
        }
    }

    public static String readInputStream(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String inputLine;
        StringBuffer streamContent = new StringBuffer();
        while ((inputLine = br.readLine()) != null) {
            streamContent.append(inputLine);
        }
        br.close();
        return streamContent.toString();
    }
}
