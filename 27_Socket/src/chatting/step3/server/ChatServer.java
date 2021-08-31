package chatting.step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * �������� Ŭ���̾�Ʈ�� ������ �޾Ƽ� ���ڱ���� �޼����� �ְ���� �� �ִ� ������ ����
 * ::
 * ChatServer --- Process
 *  -> ServerSocket, ArrayList, Socket, Broadcast
 * ChatThread --- Thread
 *  -> Socket, BufferdReader, PrintWriter
 */

public class ChatServer {
	// Process Field
	ServerSocket server;
	Socket s;
	ArrayList<ChatThread> list;

	public ChatServer() {
		list = new ArrayList<ChatThread>();
	}

	public void broadcast(String message) {
		for (ChatThread t : list) {
			t.sendMessage(message);
		}
	}

	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready..");

			while (true) {
				s = server.accept();
				ChatThread ct = new ChatThread(s, this);
				list.add(ct);
				ct.start();

			}
		} catch (Exception e) {

		} finally {

		}
	}

	public static void main(String[] args) {
		ChatServer process = new ChatServer();
		process.net();

	}// main
} // class

// �۾������� Ŭ����
class ChatThread extends Thread {
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChatServer chatServer;

	ChatThread(Socket s, ChatServer chatServer) {
		this.s = s;
		this.chatServer = chatServer;

		System.out.println(s.getInetAddress() + "���� �����ϼ̽��ϴ�.");
		chatServer.broadcast(s.getInetAddress() + "���� �����ϼ̽��ϴ�.");
	}

	public void sendMessage(String str) {
		pw.println(str);
	}

	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);

			while (true) {
				String line = br.readLine();
				chatServer.broadcast(line);
			}

		} catch (IOException e) {
			// ������ �������� ������ �̰����� ...
			System.out.println(s.getInetAddress() + "�� ������ ������ϴ�.");
			chatServer.broadcast(s.getInetAddress() + "�� ������ ������ϴ�.");

			chatServer.list.remove(this);
		}
	}
}