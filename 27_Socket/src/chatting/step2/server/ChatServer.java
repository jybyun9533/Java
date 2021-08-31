package chatting.step2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/*
 * Ŭ���̾�Ʈ�� ���� �޼����� �޾Ƽ�
 * �ٽ� �� �޼����� Ŭ���̾�Ʈ���� ������.
 */
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	// �ʵ弱��
	ServerSocket server;
	Socket s;

	BufferedReader br;
	PrintWriter pw;

	// ��Ʈ��ũ ��ɱ���
	public void net() {
		try {
			server = new ServerSocket(5500);
			System.out.println("Server Ready..");

			s = server.accept(); // Client Socket ����.
			System.out.println(s.getInetAddress() + " ���� �����ϼ̽��ϴ�."); // ������ �ּ� ��ȯ

			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);
			System.out.println("Stream Creating...");

			String line = null;
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
		} catch (Exception e) {
			System.err.println("Client���� ������ ���������ϴ�.");
		} finally {
			try {
				br.close();
				pw.close();
			} catch (IOException e) {

			}
		}
	}

	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
		cs.net();
	}

}
