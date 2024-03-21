package com.Jyothi.march18;
/*Implement a simple encryption and decryption program in Java. Prompt the user to enter a message, then encrypt the message
 *  using a simple substitution cipher, and write the encrypted message to a text file named "encrypted.txt".
 *   Provide a decryption program that reads the encrypted message from "encrypted.txt", decrypts it, and 
 *   prints the original message to the console. Make sure to handle IO exceptions and invalid input gracefully.
 */
import java.io.*;
import java.util.*;
public class Jyothi_prog4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message to encrypt:");
		String encrypt=sc.next();
		System.out.print("enter the key:");
		int key=sc.nextInt();
		String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		HashMap<Character,Character>mp=new HashMap<>();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			mp.put(s.charAt(i),s.charAt((i+key)%len));
		}
		/*for(Map.Entry<Character, Character>e:mp.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}*/
		StringBuilder sb=new StringBuilder();
		for(char c:encrypt.toCharArray())
		{
			if(s.indexOf(c)!=-1)
			{
				sb.append(mp.get(c));
			}
			else
				sb.append(c);
		}
		try(FileWriter fw=new FileWriter("D:\\Jyothi\\encrypted.txt")) {
			fw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The encrypted msg is:"+sb);
		HashMap<Character,Character>mp1=new HashMap<>();
		for(int i=0;i<len;i++)
		{
			mp1.put(s.charAt(i), s.charAt((i-key+len)%len));
		}
		/*for(Map.Entry<Character, Character>e:mp1.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}*/
		StringBuilder sb1=new StringBuilder();
		for(char c:sb.toString().toCharArray())
		{
			if(s.indexOf(c)!=-1)
				sb1.append(mp1.get(c));
			else
				sb1.append(c);
		}
		System.out.println("The decrypted message is:"+sb1);
	}
}
