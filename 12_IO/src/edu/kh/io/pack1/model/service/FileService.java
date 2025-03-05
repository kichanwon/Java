package edu.kh.io.pack1.model.service;

public class FileService {
	/* File 클래스
	 *
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리 존재 유무 관계 없음)
	 *
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 *
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String   getName()        : 파일 이름 반환
	 * String   parent()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */
	
	/* [개발자 상식!]
	 *
	 * OS : 운영 체제
	 *
	 *  (Windows)    /     (Linux, Mac)
	 *    폴더       /      디렉토리
	 *
	 * - 경로 표기 방법(하위 폴더, 파일 표시)
	 *
	 * 백슬래시 (\, Windows)     -> C:\workspace\01_Java
	 * 슬래시   (/, Linux, Mac ) -> C:/workspace/01_Java
	 *
	 *
	 * - Java 언어의 특징 : 플랫폼(OS)에 독립적
	 * -> OS 관계 없이 똑같은 코드 작성이 가능
	 *
	 * -> 이 특징을 유지하기 위해 /, \ 둘다 호환 가능
	 *   (런타임 시 실행되는 OS에 맞게 자동으로 변경)
	 *
	 *
	 * -------------------------------------------------------------
	 *
	 * - 경로 표기 방법
	 *
	 * 1) 절대 경로 : 하나의(절대적인) 기준으로 부터
	 * 				 목표까지의 경로를 모두 표기하는 방법
	 *
	 * - 기준
	 * [Windows] :   C:/  , D:/
	 * [Linux, Mac] : /Users ,   /
	 *
	 *
	 * 2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법
	 *
	 *
	 * */
	



}
