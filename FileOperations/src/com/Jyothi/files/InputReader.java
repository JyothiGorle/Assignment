package com.Jyothi.files;
import java.io.*;
public class InputReader {
	public static void main(String[] args) {
		try(InputStreamReader is=new InputStreamReader(System.in))
		{
			int letter=is.read();
			while(is.ready())
			{
				System.out.println((char)letter);
				letter=is.read();
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
