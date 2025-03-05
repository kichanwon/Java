package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ByteService {
	
	
	public void fileByteOutput() {
		FileOutputStream fos = null;
		
		try {	//FOS 닫으려고 try 구문 밖엣서 정의 finally 에서 
//			파일 존재 X 시 생성 (폴더는 생성 불가) -> 파일 존재시 내용덮어쓰기
//			fos = new FileOutputStream("/io_test/20250305/byte_test.txt");
			fos = new FileOutputStream("/io_test/20250305/byte_test1.txt");
			StringBuilder sb = new StringBuilder();
			
			sb.append("Hello World?\n");
			sb.append("¿Que pasa?\n");
			sb.append("¿몰루?\n");
			
			String content = sb.toString();
//			for (int i=0; i<content.length();i++) {
//				char ch = content.charAt(i);
//				fos.write(ch);
//			}
			
			
			long start = System.nanoTime();
			fos.write(content.getBytes());
			long fin = System.nanoTime();
			
			
			
			fos.flush();	//	선택사항

			System.out.println("수행시간 : "+(fin-start));
			System.out.println("출력 완료!");
			
		
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(fos!= null)fos.close();	//	try 실패시 초기에 fos를 null 로 생성했으니 if 로 검사
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		
	public void bufferdFileByteOutput() {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("/io_test/20250305/byte_test_bufferd.txt");
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World?\n");
			sb.append("¿Que pasa?\n");
			sb.append("¿몰루?\n");
			String content = sb.toString();

//		Buffer 에 작성
			long start = System.nanoTime();
			bos.write(content.getBytes());
			long fin = System.nanoTime();
//		Buffer 에 남은 데이터 밀어서 작성		필수 사항
			bos.flush();
			
			System.out.println("수행시간 : "+(fin-start));
			System.out.println("출력 완료!");

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(fos!= null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
		
	
	
	public void fileByteInput() {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("/io_test/20250305/lyrics.txt");
			
//			int value = 0;
//			
//			StringBuilder sb = new StringBuilder();
//
//			while (true) {
//				value = fis.read();	//	1byte 씩 읽어오기 -> 더이상 읽을 값 없을 시 -1 return
//				
//				if(value == -1) break;
//				
//				sb.append( (char)value );
//			}
//			
//			System.out.println(sb.toString());
			
			byte[] bytes = fis.readAllBytes();

			String content = new String(bytes);
			
			System.out.println(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void bufferedFileByteInput() {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("/io_test/20250305/lyrics.txt");
			
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();	//	보조스트림 close() 시 기반 스트림도 같이 close 됨
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	public void readProperties() {
		
		Properties properties = new Properties();
		
		FileInputStream fis = null;
		
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("/io_test/20250305/config.properties");
			
			properties.load(fis);
			
			System.out.println("username : "+properties.getProperty("username"));
			System.out.println("password : "+properties.getProperty("password"));
			System.out.println("language : "+properties.getProperty("language"));
			
			fos = new FileOutputStream("/io_test/20250305/config.properties");
			properties.setProperty("theme", "dark");
			
			properties.store(fos, "write comment here");
			
			System.out.println("theme : "+properties.getProperty("theme"));

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(fis!=null) fis.close();
					if(fos!=null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

	public void filecopy() {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("파일 경로 입력 : ");
			String target = br.readLine();
			
			File file = new File(target);
			
			if(!file.exists()) {
				System.out.println("[해당경로에 파일이 존재하지 않습니다.]");
				return;
			}
			
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			StringBuilder sb = new StringBuilder();
			sb.append(target);
			
//			'.' 위치 찾기
			int insertPoint = target.lastIndexOf(".");
			sb.insert(insertPoint, "_copy");
			
			String copy = sb.toString();
			
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);
			
			bos.write(bytes);
			bos.flush();
			
			System.out.println("복사완료 : "+copy);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

