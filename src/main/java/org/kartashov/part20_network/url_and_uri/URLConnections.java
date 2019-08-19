package org.kartashov.part20_network.url_and_uri;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnections {

    public static void main(String[] args) throws IOException {
        // http://tutorials.jenkov.com/java-networking/url-urlconnection.html
        // https://stackoverflow.com/questions/2793150/how-to-use-java-net-urlconnection-to-fire-and-handle-http-requests?answertab=votes#tab-top

        URL url = new URL("http://jenkov.com");

        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();

        int data = input.read();
        while(data != -1){
            System.out.print((char) data);
            data = input.read();
        }
        input.close();


        // To file
        /*
        URL url = new URL("file:/c:/data/test.txt");

        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();

        int data = input.read();
        while(data != -1){
            System.out.print((char) data);
            data = input.read();
        }
        input.close();
         */

        // To jar file
        /*
        String urlString = "http://butterfly.jenkov.com/"
                 + "container/download/"
                 + "jenkov-butterfly-container-2.9.9-beta.jar";

        URL jarUrl = new URL(urlString);
        JarURLConnection connection = new JarURLConnection(jarUrl);

        Manifest manifest = connection.getManifest();


        JarFile jarFile = connection.getJarFile();

        //do something with Jar file...
         */

    }
}
