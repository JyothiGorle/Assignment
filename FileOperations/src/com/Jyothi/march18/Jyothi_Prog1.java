package com.Jyothi.march18;
/*Write a Java program that reads a text file named "input.txt" and counts the frequency of each word in the file. 
 * Then, write these word frequencies along with the corresponding words to another text file named "word_frequencies.txt", 
 * sorted in descending order of frequency. Ensure that your program handles file IO exceptions appropriately.
 */
import java.io.*;
import java.util.*;
public class Jyothi_Prog1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(FileWriter fw=new FileWriter("D:\\jyothi\\input.txt")){
			System.out.println("Enter the no of words");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				String s=sc.next();
				fw.write(s);
				fw.write("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		HashMap<String,Integer>mp=new HashMap<>();
		try(BufferedReader br=new BufferedReader(new FileReader("D:\\jyothi\\input.txt"))){
			String line;
			while((line=br.readLine())!=null)
			{
				if(mp.containsKey(line))
				{
					int count=mp.get(line).intValue();
					mp.put(line, ++count);
				}
					
				else
					mp.put(line, 1);
				
			}
			/*for(HashMap.Entry<String,Integer>en:mp.entrySet()) {
				System.out.println(en.getKey()+" "+en.getValue());
			}*/
			
			try(FileWriter fw1=new FileWriter("D:\\jyothi\\word_frequencies.txt")){
				for(HashMap.Entry<String,Integer>en:mp.entrySet()){
					fw1.write(en.getKey());
					fw1.write(" ");
					fw1.write(en.getValue());
					fw1.write("\n");
					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			sc.close();	
		}
	}
}
