package fabric;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketException;

public class SerClThread extends Thread {

	private static Socket clientDialog;
	BufferedReader inn;
	BufferedWriter outn;
	public boolean flagErr = false;

	public SerClThread(Socket client) {
		SerClThread.clientDialog = client;
	}

	@Override
	public void run() {
		try {
			String ww = "";
			OutputStream datO = new DataOutputStream(new BufferedOutputStream(clientDialog.getOutputStream()));
			InputStream in = clientDialog.getInputStream();
			DataInputStream din = new DataInputStream(new BufferedInputStream(in));
			while (!clientDialog.isClosed()) {
				ww = "";
				long l = 0;
				byte[] b = new byte[1024];
				byte[] q = new byte[8];
				byte[] k = new byte[1011];
				int num = din.read(b);
				for (int i = 0; i < 8; i++) {
					q[i] = b[i];
				}
				// System.out.println(q[0]);
				for (int i = 8; i < 1024; i++) {
					if (b[i] != 0)
						ww = ww + (char) b[i];
				}
				l = bytesToLong(q, 0);
				System.out.println(ww);
				System.out.println(l);
//--------------------------------------------- Sending
				q = longToBytes(System.currentTimeMillis());
				Pull.ww = "TESTtttttretetetetet";
				for (int i = 0; i < 8; i++) {
					b[i] = q[i];
				}
				/// k = Pull.ww.getBytes();
				// System.out.println(k);
				for (int i = 0; i < k.length; i++) {
					b[i + 8] = k[i];
				}
				datO.write(b); // Отправить содержимое файла
				datO.flush();

				// b[7] = 0;
				// l = bytesToLong(b, 0);
				// l = - l;

				// System.out.println(l);

				// String entry = inn.readLine();

				// if (entry.equalsIgnoreCase("w")) {
				// }
				// System.out.println("Server Wrote message to clientDialog.");
			}
			inn.close();
			outn.close();
			clientDialog.close();
			System.out.println("Client disconnected");
			flagErr = false;
		} catch (SocketException e) {
			/// e.printStackTrace();
			flagErr = true;
		} catch (IOException e) {
			// e.printStackTrace();
			flagErr = true;
		}

	}

	public void sendT(String ss) {

		try {
			outn = new BufferedWriter(new OutputStreamWriter(clientDialog.getOutputStream()));
			outn.write(" " + ss + "\n");
			outn.flush();
			flagErr = false;
		} catch (IOException e) {
			flagErr = true;
		} catch (NullPointerException e) {
			flagErr = true;
		}

	}

	public void chek() {

		try {
			if (!clientDialog.isClosed()) {
				flagErr = false;
			}
		} catch (NullPointerException e) {
			flagErr = true;
		}

	}

	public static byte[] longToBytes(long l) {
		byte[] result = new byte[8];
		for (int i = 7; i >= 0; i--) {
			result[i] = (byte) (l & 0xFF);
			l >>= 8;
		}
		return result;
	}

	public static long bytesToLong(final byte[] bytes, final int offset) {
		long result = 0;
		for (int i = offset; i < Long.BYTES + offset; i++) {
			result <<= Long.BYTES;
			result |= (bytes[i] & 0xFF);
		}
		return result;
	}

}
