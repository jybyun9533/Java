package com.encore.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;

public class BookClient {

	BufferedReader br;
	ObjectInputStream ois;
	Socket s;

	public void net() {
		try {
			s = new Socket("127.0.0.1", 60000);
			System.out.println("Socket Creating...");

			//br = new BufferedReader(new ObjectInputStream());

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
