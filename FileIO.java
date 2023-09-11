package day09;
import java.io.*;
//파일을 읽어서 콘솔에 파일내용을 출력하기
/* 		Object
 * 			|
 * 		Throwable		
 * 		|		|
 * Exception	Error
 * 		|
 * 	IOException
 * 		|
 *  FileNotFoundException
 * 
 * */
import javax.swing.*;

public class FileIO {

	public static void main(String[] args) {
		//절대경로: D:\\multicampus\\JavaWorkspace\\Begin\\src\\day09\\MyGui.java
		//상대경로: src/day09/MyDialog.java
		//src/day09/readme.txt==>예외 발생
		String fname=JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if(fname==null) return;
		System.out.println(fname);
		
		String content=reading(fname);
		System.out.println(content);

	}//main()----------------------
	
	public static String reading(String fileName) {
		String str="";
		FileReader fr=null;
		char[] data=new char[1000];
		try {
			fr=new FileReader(fileName);//데이터소스(파일) o=========o자바프로그램
			//FileNotFoundException
			
			int n=0;
			while((n=fr.read(data))!=-1) {//IOException
				String content=new String(data,0,n);
				str+=content;
			} 
			
			
		}catch(FileNotFoundException e) {
			System.out.println(fileName+"파일을 찾을 수 없어요");
		}catch(IOException e) {
			System.out.println("파일 입출력 중 에러 발생: "+e.getMessage());
		}finally {
			try {
				if(fr!=null) {
					fr.close();//IOException
				}
			}catch(Exception e) {
				e.printStackTrace();//예외가 발생한 지점의 스택기록을 출력해서 보여준다
			}
		}
		
		return str;
	}//--------------------------

}/////////////////////////////////////////




