package edu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
// TCP Socket 프로그래밍
	// - TCP는 신뢰성 있는 연결을 보장하며
	// 소켓은 이 연결의 끝점 역할을 하며, 데이터 송수신 통로가 됨
	// 즉,  TCP 통신 = 소켓 간 연결 + 데이터 주고받기
	
	/*
	 * TCP
	 * - 서버, 클라이언트간 1:1 소켓통신 (연결 지향적 프로토콜)
	 * - 서버가 먼저 실행되어 있는 상태에서
	 *   클라이언트가 연결해야 함.
	 *  
	 *  
	 * - 데이터 전송 순서가 보장되고,
	 *   수신 여부를 판단하여 오류 발생 시 재전송함.
	 *  
	 *  
	 * * java.net 패키지에서 제공하는
	 *   Socket, ServerSocket 클래스를 사용해야함.
	 *  
	 *   Socket
	 * - 프로세스의 양 끝단(프로세스간의 통신을 담당)
	 * - Input/OutputStream 보유하고 있음.
	 *
	 *
	 *   ServerSocket
	 * - 포트와 연결되어 외부 요청을 기다리는 객체
	 * - 클라이언트의 연결 요청이 들어오면
	 *   클라이언트의 소켓을 얻어와 연결하게 된다.
	 *
	 * - 하나의 포트에는 하나의 ServerSocket만 연결 가능
	 * 
	 *
	 * */
	
	public void serverStart() {
// * 1) 서버의 포트번호 정하기
		int port = 3000;
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		try {
// * 2) 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			
			
// * 3) 클라이언트 쪽에서 접속 요청이 오길 기다림
//			C:\workspace\JavaWorkspace_Network\13_network_client
			
			
// * 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			System.out.println("[Server]");
			System.out.println("waiting for client...");
			
			clientSocket = serverSocket.accept();

			System.out.println("client connected");
			
			
// * 5) 연결된 클라이언트와 입출력 스트림 생성
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			
// * 6) 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);

			
// * 7) 스트림을 통해 읽고 쓰기
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM/dd HH:mm.ss");
			String str = sdf.format(now);
			
			pw.printf("%s\t[Server Connected]\n",str);
			pw.flush();
			
			String clientMessage = br.readLine();
			
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			
			System.out.printf("[%s] : %s",clientIP,clientMessage);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
// * 8) 통신 종료
				try {
					if(br!=null) br.close();
					if(pw!=null) pw.close();
					
					if(serverSocket!=null) serverSocket.close();
					if(clientSocket!=null) clientSocket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}
		
		
		
	}

}
