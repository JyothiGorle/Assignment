package com.Jyothi.files;
import java.io.*;
public class Files_1 {
	public static void main(String[] args) {
		try(FileReader fw=new FileReader("D:\\jyothi\\file.txt.txt"))
		{
			int letter=fw.read();
			while(fw.ready())
			{
				System.out.println((char)letter);
				letter=fw.read();
			}
			System.out.println((char)letter); //To read the last character
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
