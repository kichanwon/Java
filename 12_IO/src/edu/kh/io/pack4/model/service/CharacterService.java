package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterService {
	
	public void fileInput() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("/io_test/20250305/lyrics.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while (true) {
				line = br.readLine();
				
				if (line==null) break;
				
				System.out.println(line);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOutput() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("/io_test/20250305/FileWritter_test.txt");
			bw = new BufferedWriter(fw);

			StringBuilder sb = new StringBuilder();
			sb.append("¿Hello world?\n");
			sb.append("¿Que pasa?\n");
			sb.append("¿De donde eres?\n");
			sb.append("¿Por favor?\n");
			String content = sb.toString();
			
			
			bw.write(content);
//			bw.flush();			//	close 구문 있으면 굳이 할 필요 X
			
			System.out.println("print complete");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bw!=null)
				try {
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}
	
	
}
