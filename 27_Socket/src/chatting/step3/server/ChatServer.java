package chatting.step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * 여러명의 클라이언트의 접속을 받아서 문자기반의 메세지를 주고받을 수 있는 서버측 로직
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

// 작업쓰레드 클래스
class ChatThread extends Thread {
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChatServer chatServer;

	ChatThread(Socket s, ChatServer chatServer) {
		this.s = s;
		this.chatServer = chatServer;

		System.out.println(s.getInetAddress() + "님이 접속하셨습니다.");
		chatServer.broadcast(s.getInetAddress() + "님이 접속하셨습니다.");
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
			// 연결이 끊어지면 로직이 이곳으로 ...
			System.out.println(s.getInetAddress() + "님 접속이 끊겼습니다.");
			chatServer.broadcast(s.getInetAddress() + "님 접속이 끊겼습니다.");

			chatServer.list.remove(this);
		}
	}
}