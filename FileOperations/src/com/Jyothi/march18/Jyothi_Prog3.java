package com.Jyothi.march18;
/*Write a Java program that reads a text file named "input.txt" and reverses the order of characters in each line. 
 * Write the modified text to another file named "reversed.txt".
 *  Ensure that your program handles file IO exceptions and empty lines gracefully.
 */
import java.io.*;
public class Jyothi_Prog3 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		try(FileReader fr=new FileReader("D:\\Jyothi\\input.txt"))
		{
			int i=fr.read();
			while(fr.ready())
			{
				sb.append((char)i);
				i=fr.read();
			}
			sb=sb.reverse();
			System.out.println(sb);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try(FileWriter fw=new FileWriter("D:\\Jyothi\\reversed.txt")){
			fw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
