package com.Jyothi.files;
import java.io.*;
public class BufferReader {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("hi");
			/*while(br.ready())
			{
				System.out.println(br.readLine());
			}*/
			System.out.println("hii");
			System.out.println(br.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
