package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {
	
	
	public void objectOutput() {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
//			.dat		data 를 담고 있는 확장자
			fos = new FileOutputStream("/io_test/20250305/Member.dat");
			oos = new ObjectOutputStream(fos);
			
			Member member = new Member("member01","pass01","조미현",20);
			
			
			
			oos.writeObject(member);
			
			System.out.println("data out");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void objectInput() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("/io_test/20250305/Member.dat");
			ois = new ObjectInputStream(fis);
			
			Member member = (Member)ois.readObject();
			
			System.out.println(member);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null)ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
