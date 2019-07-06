package org.kartashov.part21_network.http_client_old;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.kartashov.part21_network.http_client_old.Get.readInputStream;

public class POST {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://searhiy.github.io/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "Java 1.1");
        con.setDoOutput(true);
        DataOutputStream dos = new DataOutputStream(con.getOutputStream());
        dos.writeBytes("post=something");
        dos.flush();
        dos.close();
        if (con.getResponseCode() == 200) {
            System.out.println(readInputStream(con.getInputStream()));
        } else {
            System.out.println("Something wrong here!");
        }
    }
}
