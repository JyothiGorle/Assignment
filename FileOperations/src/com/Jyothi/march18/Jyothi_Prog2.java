package com.Jyothi.march18;
/*Create a Java program that concatenates the contents of two text files, "file1.txt" and "file2.txt", into a new file 
 * named "concatenated.txt". Make sure to handle file not found exceptions and any other relevant IO exceptions.
 */
import java.io.*;
public class Jyothi_Prog2 {
	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("D:\\Jyothi\\file1.txt")){
			fw.write("Hi Jyothi!!..this is file1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try(FileWriter fw=new FileWriter("D:\\Jyothi\\file2.txt")){
			fw.write("Hi Jyothi!!..this is file2");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try(FileWriter fw=new FileWriter("D:\\Jyothi\\concatenated.txt")){
			BufferedReader br=new BufferedReader(new FileReader("D:\\Jyothi\\file1.txt"));
			fw.write(br.readLine());
			fw.write("\n");
			BufferedReader br1=new BufferedReader(new FileReader("D:\\Jyothi\\file2.txt"));
			fw.write(br1.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
