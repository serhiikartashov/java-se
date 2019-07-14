package org.kartashov.part21_network.url_and_uri;

import java.net.URI;

public class URIClass {

    public static void main(String[] args) {
        // scheme:scheme-specific-part:fragment
        URI uri = URI.create("ftp://anonymous:elharo%40metalab.unc.edu@ftp.oreilly.com:21/pub/stylesheet?search=Serhii#id=_hbc");
        System.out.println(uri.getPath());
        System.out.println(uri.getScheme());
        System.out.println(uri.getSchemeSpecificPart());
        System.out.println(uri.getRawSchemeSpecificPart());
        System.out.println(uri.getFragment());
        System.out.println(uri.getRawFragment());
        System.out.println(uri.getAuthority());
        System.out.println(uri.getHost());
        System.out.println(uri.getPort());
        System.out.println(uri.getQuery());
        System.out.println(uri.getUserInfo());

    }
}
