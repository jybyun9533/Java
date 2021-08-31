package chatting.step2.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/*
 * 키보드로 데이터를 읽어서 서버로 보낸다.
 * 다시 서버가 보낸 메세지를 읽는다.
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
				System.out.println("서버 :: " + serverMsg);
			}
		} catch (Exception e) {
			System.out.println("서버와의 연결이 끊어졌습니다.");
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
