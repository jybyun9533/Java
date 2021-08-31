package chatting.step2.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/*
 * Ű����� �����͸� �о ������ ������.
 * �ٽ� ������ ���� �޼����� �д´�.
 */
import java.net.Socket;
import java.util.ArrayList;

public class ChatClient {
	// Field
	BufferedReader br, br1;
	PrintWriter pw;
	Socket s;

	// NetWork Function
	public void net() {
		try {
			s = new Socket("127.0.0.1", 5500);
			System.out.println("Socket Creating...");

			// C -> S
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);

			// S -> C
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("Client Stream Creating...");

			while (true) {
				String line = br.readLine();
				pw.println(line);

				// BLOCKING //

				String serverMsg = br1.readLine();
				System.out.println("���� :: " + serverMsg);
			}
		} catch (Exception e) {
			System.out.println("�������� ������ ���������ϴ�.");
		} finally {
			try {
				br.close();
				pw.close();
				br1.close();
			} catch (IOException e) {

			}
		}
	}// net()

	public static void main(String[] args) {
		ChatClient cc = new ChatClient();
		cc.net();
		
	}// main

}// class
