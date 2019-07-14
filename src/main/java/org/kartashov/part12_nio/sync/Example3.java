package org.kartashov.part12_nio.sync;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;

/**
 * SocketChannelExample
 */
public class Example3 {
    public static final String GET_REQUEST = "GET / HTTP/1.1\n";

    public static void main(String[] args) {
        String host = (args.length > 0) ? args[0] : "www.kth.se";
        String hostHeader = "Host: " + host + "\n\n";
        int port = (args.length > 1) ? Integer.parseInt(args[1]): 80;
        WritableByteChannel out = Channels.newChannel(System.out);
        try {
            SocketChannel channel = SocketChannel.open(new InetSocketAddress(host, port));
            ByteBuffer buf = ByteBuffer.wrap(GET_REQUEST.getBytes());
            channel.write(buf);
            buf = ByteBuffer.wrap(hostHeader.getBytes());
            channel.write(buf);
            buf = ByteBuffer.allocate(1024);
            while (buf.hasRemaining() && channel.read(buf) != -1){
                buf.flip();
                out.write(buf);
                buf.clear();
            }
        } catch (IOException e){
            e.printStackTrace();
            System.exit(0);
        }
    }
}
