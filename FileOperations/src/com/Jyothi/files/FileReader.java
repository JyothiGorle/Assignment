package com.Jyothi.files;
import java.io.*;
public class FileReader {
	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("D:\\jyothi\\file.txt.txt",false)) { //The boolean values in the parameter if it is true the 
			                                                                  //the data will be appended again if it if false the
			                                                                     //the data will be removed
			fw.write("hi");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
