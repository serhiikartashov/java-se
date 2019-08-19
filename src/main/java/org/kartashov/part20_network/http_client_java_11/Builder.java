package org.kartashov.part20_network.http_client_java_11;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.net.*;
import java.net.http.HttpClient;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.concurrent.Executors;

public class Builder {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        HttpClient client = HttpClient.newBuilder()
//                .authenticator(Authenticator.getDefault())
                .authenticator(new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(
                                "username",
                                "password".toCharArray());
                    }
                })
                .connectTimeout(Duration.ofSeconds(42))
                .cookieHandler(CookieHandler.getDefault())
                .executor(Executors.newSingleThreadExecutor())
                .followRedirects(HttpClient.Redirect.NORMAL)
                .proxy(ProxySelector.of(new InetSocketAddress("www-proxy.com", 8080)))
                .sslContext(SSLContext.getDefault())
                .sslParameters(new SSLParameters())
                .version(HttpClient.Version.HTTP_2)
                .build();
    }
}
