package com.Jyothi.files;
import java.io.*;
public class Files_2 {
	public static void main(String[] args) {
		try(OutputStreamWriter os=new OutputStreamWriter(System.out))
		{
			os.write("hello");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}