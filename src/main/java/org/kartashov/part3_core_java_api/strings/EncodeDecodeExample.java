package org.kartashov.part3_core_java_api.strings;

import java.util.Base64;
import java.util.UUID;

public class EncodeDecodeExample {

    public static void main(String[] args) {

        // whenStringIsEncodedWithoutPadding_thenOk
        final String originalInput1 = "test input";
        final String encodedString1 = Base64.getEncoder().withoutPadding().encodeToString(originalInput1.getBytes());

        // without padding
        final String originalInput2 = "test input";
        final String encodedString2 = Base64.getEncoder().withoutPadding().encodeToString(originalInput2.getBytes());

        final byte[] decodedBytes2 = Base64.getDecoder().decode(encodedString2);
        final String decodedString2 = new String(decodedBytes2);

        // url
        final String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFVf&gws_rd=ssl#q=java";
        final String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());

        // mime type
        final StringBuilder buffer = getMimeBuffer();

        final byte[] forEncode = buffer.toString().getBytes();
        final String encodedMime = Base64.getMimeEncoder().encodeToString(forEncode);

    }

    private static StringBuilder getMimeBuffer() {
        final StringBuilder buffer = new StringBuilder();
        for (int count = 0; count < 10; ++count) {
            buffer.append(UUID.randomUUID().toString());
        }
        return buffer;
    }
}
