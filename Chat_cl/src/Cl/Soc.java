package Cl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;

public class Soc {
	public boolean flagErr;
	private Socket s;
	// private BufferedReader inn; // socket read stream
	private BufferedWriter outn; // поток записи в соке
	private BufferedReader inn; // socket read stream

	public void Socin() {

		try {
			s = new Socket("localhost", 7728); // Подключиться к серверу
			flagErr = false;
		} catch (IOException e) {
			System.out.println("Connection falls");
			flagErr = true;
			// e.printStackTrace();
		}

	} // чтение файла из SocketClient

	public void getFile() {
		byte[] b = new byte[1024];
		try {// Определим входной поток,
			InputStream in = s.getInputStream();
			DataInputStream din = new DataInputStream(new BufferedInputStream(in)); // Создать файл для сохранения
			File f = new File("copy.jpg");
			RandomAccessFile fw = new RandomAccessFile(f, "rw");
			int num = din.read(b);
			while (num != -1) {// Записать 0 ~ num байтов в файл
				fw.write(b, 0, num); // Пропустить num байтов и снова записать в файл
				fw.skipBytes(num); // Чтение num байтов
				num = din.read(b);
			} // Закрыть входной и выходной потоки
			din.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendT(String ss) {
		long l = 0;
		byte[] b = new byte[1024];
		byte[] q = new byte[8];
		byte[] k = new byte[1011];

		try {

			OutputStream datO = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));

			q = longToBytes(System.currentTimeMillis());

			for (int i = 0; i < 8; i++) {
				b[i] = q[i];
			}
			k = ss.getBytes();
			for (int i = 0; i < k.length; i++) {
				b[i + 8] = k[i];
			}
			datO.write(b); // Отправить содержимое файла
			datO.flush();
			// outn = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			// outn.write(" " + ss + "\n");
			// outn.flush();
			flagErr = false;
		} catch (IOException e) {
			System.err.println(e);
			flagErr = true; // Warning! Think, if you put this hire
			// it can block enter in the loop and sending forever!
		}
	}

	public String getT() {
		String mes = "";
		try {
			InputStream in = s.getInputStream();
			DataInputStream din = new DataInputStream(new BufferedInputStream(in));
			byte[] b = new byte[1024];
			byte[] q = new byte[8];
			int num = din.read(b);// ------------
			long l = 0;
			for (int i = 0; i < 8; i++) {
				q[i] = b[i];
			}
			for (int i = 8; i < 1024; i++) {
				mes += b[i];
			}
			l = bytesToLong(q, 0);
			// System.out.println(mes);
			// inn = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// mes = inn.readLine(); // ждём, что скажет сервер
			System.out.println(l);
			flagErr = false;
		} catch (IOException e) {
			System.err.println(e);
			flagErr = true;
		}
		return mes;
	}

	public void Check() {

		try {
			if (s.isConnected()) {

				flagErr = false;
			} else {
				System.out.print("disconn");
				flagErr = true;
			}
		} catch (NullPointerException e) {

			flagErr = true;
		}

	}

	public void down() {

		try {
			s.shutdownInput();

		} catch (IOException e) {
			System.err.println(e);
			flagErr = true;
		} catch (NullPointerException e) {
			flagErr = true;
		}

	}

	public void sendTime() {

		try {
			OutputStream datO = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
			byte[] b = new byte[8];
			byte[] q = new byte[8];
			long l = 0;
			InputStream in = s.getInputStream();
			DataInputStream din = new DataInputStream(new BufferedInputStream(in));
			b = longToBytes(System.currentTimeMillis());
			datO.write(b); // Отправить содержимое файла
			datO.flush();

			System.out.println("sendd time");

			// int num = din.read(q);
			// b[7] = 0;
			// l = bytesToLong(q, 0);
			// System.out.println(l);
			flagErr = false;
		} catch (IOException e) {
			System.err.println(e);
			flagErr = true; // Warning! Think, if you put this hire
			// it can block enter in the loop and sending forever!
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
