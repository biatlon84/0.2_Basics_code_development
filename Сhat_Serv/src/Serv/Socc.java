package Serv;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Socc {
	private ServerSocket server;
	private Socket client;
	private Socket pppp;
	private BufferedReader inn; // socket read stream
	private BufferedWriter outn; // поток записи в соке
	public boolean flagErr = false;
	public boolean flagErrSS = false;

	// DataOutputStream out = new DataOutputStream(clientDialog.getOutputStream());
	// DataInputStream in = new DataInputStream(clientDialog.getInputStream());
	public void Sockini() {
		try {
			server = new ServerSocket(7728);
			System.out.println("Start serv -> success");
			flagErrSS = false;
		} catch (Exception e) {
			flagErrSS = true;
			System.out.println("Sockini err");
		}
	}

	public void ClCon() {
		try {
			pppp = server.accept();
			System.out.println("Connect cl -> success");
			flagErr = false;
		} catch (Exception e) {
			flagErr = true;
			/// System.out.println("ClCon err");
		}

	}

	// send File
	public void sendFile(String str) {
		byte[] b = new byte[1024];
		File f = new File(str);
		try {// Поток вывода данных
			OutputStream dout = new DataOutputStream(new BufferedOutputStream(client.getOutputStream())); // Поток
																											// чтения
																											// файла
			InputStream ins = new FileInputStream(f);
			int n = ins.read(b);
			while (n != -1) {// Запись данных в сеть
				dout.write(b); // Отправить содержимое файла
				dout.flush(); // снова прочитать n байтов
				n = ins.read(b);
			} // Закрыть поток
			ins.close();
			dout.close();
			System.out.println("Send File -> success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendT(String ss) {

		try {
			outn = new BufferedWriter(new OutputStreamWriter(pppp.getOutputStream()));
			outn.write(" " + ss + "\n");
			outn.flush();
			flagErr = false;
		} catch (IOException e) {
			// System.err.println(e);
			flagErr = true;
		} catch (NullPointerException e) {
			flagErr = true;
		}

	}

	public String getT(int j) {
		String mes = "";
		try {
			inn = new BufferedReader(new InputStreamReader(pppp.getInputStream()));
			mes = inn.readLine(); // ждём, что скажет сервер
			flagErr = false;
		} catch (IOException e) {
			flagErr = true;
		} catch (NullPointerException e) {
			flagErr = true;
		}
		return mes;
	}

	public void stop() {
		// в любом случае необходимо закрыть сокет и потоки
		System.out.println("Server sockets were close");
		// clientSocket.close();
		// in.close();
		// out.close();
		// server.close();

	}

}
