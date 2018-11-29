import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class TestNIO {

	public static void main(String[] args) {
		SocketChannel socketChannel;
		try {
			socketChannel = SocketChannel.open();
//			socketChannel.configureBlocking(false);
			socketChannel.connect(new InetSocketAddress("172.217.20.35", 80));
//			socketChannel.connect(new InetSocketAddress("google.com.sg", 80));
//			ByteBuffer buf = ByteBuffer.allocate(48);
//			int bytesRead = socketChannel.read(buf);
//			System.out.println(bytesRead);
			Socket socket = socketChannel.socket();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
