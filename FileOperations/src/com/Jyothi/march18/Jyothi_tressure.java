package com.Jyothi.march18;
import java.io.*;
import java.util.Scanner;
/*Imagine you're a treasure hunter exploring a mysterious island filled with hidden treasures. You have a map that contains the
 *  locations of various treasures, represented by coordinates (x, y). Your task is to write a Java program that reads this map file 
 *  and helps you locate the treasures.Create a Java program that reads a text file containing treasure coordinates (x, y) in the 
 *  format "x y", where x and y are integers separated by a space.The program should prompt the user to enter their current location
 *   on the island as "Current X coordinate" and "Current Y coordinate".After receiving the user's input, the program should 
 *   calculate and display the distance between the user's location and each treasure location, sorted from nearest to farthest.
 *   Finally, the program should ask the user if they want to continue searching for more treasures or exit.*/
import java.util.*;
public class Jyothi_tressure {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x1-coordinate:");
		int x1=sc.nextInt();
		System.out.println("Enter the y1-coordinate:");
		int y1=sc.nextInt();
		ArrayList<Integer>al=new ArrayList<>();
		try(FileReader fr=new FileReader("D:\\workspace\\FileOperations\\src\\com\\Jyothi\\march18\\tressure.txt")) {
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				//System.out.println("line:"+line);
				String []s1=line.split(" ");
				int x2=Integer.parseInt(s1[0]);
				int y2=Integer.parseInt(s1[1]);
				System.out.println(x2+" "+y2);
				al.add((int)Math.sqrt(((int)Math.pow(x2-x1, 2)+((int)Math.pow(y2-y1, 2)))));
			}
			HashMap<Integer,Integer>mp=new HashMap<>();
			int i=0;
			for(int j=0;j<al.size();j++)
			{
				Integer it=al.get(j);
				mp.put(++i,it);
			}
			System.out.println("Distance values");
			for(Integer a:al)
				System.out.println(a);
			
			for(HashMap.Entry<Integer,Integer>en:mp.entrySet()) {
				System.out.println(en.getKey()+" "+en.getValue());
			}
			int mini=Collections.min(mp.values());
			System.out.println("The nearset treasure value to treassure hunt is:"+mini);
			for(HashMap.Entry<Integer, Integer> entry: mp.entrySet()) {
			      if(entry.getValue() == mini) {
			        System.out.println("The nearest tressure is:" +entry.getKey()+" and its nearest value is:"+mini);
			        break;
			      }
			    }	
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}
}
