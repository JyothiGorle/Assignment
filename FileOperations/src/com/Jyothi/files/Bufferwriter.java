package com.Jyothi.files;
import java.io.*;
public class Bufferwriter {
	public static void main(String[] args) {
		try(BufferedWriter br=new BufferedWriter(new FileWriter("D:\\jyothi\\file.txt",true))) {
			br.write("hello");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
