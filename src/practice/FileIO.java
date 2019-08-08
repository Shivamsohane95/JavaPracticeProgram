package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileIO {
	
	public static void main(String[] args) throws IOException  {
		
//		FileWriter writer = new FileWriter("C:\\\\Users\\\\shivamsohane\\\\Desktop\\\\FileInputOut.txt");
//		BufferedWriter buffer = new BufferedWriter(writer);
//		buffer.write("Shivam Sohane");
//		buffer.newLine();
//		buffer.write("Sohane shivam");
//		buffer.close();
		
		FileReader reader = new FileReader("C:\\\\Users\\\\shivamsohane\\\\Desktop\\\\FileInputOut.txt");
		BufferedReader buffer = new BufferedReader(reader);
		int i;
		while((i=buffer.read())!=-1)
		{
		System.out.print((char)i);
		}
		buffer.close();
		
		//Write();
		//read();
	//	FileOutputStream f1 = new FileOutputStream("C:\\\\Users\\\\shivamsohane\\\\Desktop\\\\FileInputOut.txt");
		//FileOutputStream f2 = new FileOutputStream("C:\\\\Users\\\\shivamsohane\\\\Desktop\\\\FileInputOut1.txt");
	//	ByteArrayOutputStream file = new ByteArrayOutputStream();
		//file.write(65);
		//file.writeTo(f1);
		//file.writeTo(f2);
	}
}


		
		
		
		
		//Writer file = new FileWriter("C:\\\\Users\\\\shivamsohane\\\\Desktop\\\\FileInputOut.txt");
	    // Reader file = new FileReader("C:\\\\Users\\\\shivamsohane\\\\Desktop\\\\FileInputOut.txt");
		//String s = "Shivam Sohane";
		//file.write(s);
	   //  int s;
//		while((s=file.read())!=-1)
//		{
//			System.out.print((char)s);
//		}
//	 
//	     file.close();
//	}
//}


////		public static void Write() throws IOException {
////	    FileOutputStream file = new FileOutputStream("C:\\Users\\shivamsohane\\Desktop\\FileInputOut.txt");
////        String s = "shivam sohane";
////        byte[] b = s.getBytes();
////        file.write(b);
////        file.close();
////        System.out.println("success");
//	//}
//		public static void read() throws IOException
//		{
//			 //FileInputStream file = new FileInputStream("C:\\Users\\shivamsohane\\Desktop\\FileInputOut.txt");
//			Reader file = new FileReader("C:\\Users\\shivamsohane\\Desktop\\FileInputOut.txt");
//			 //String s = "I love my India";
//			// file.write(s);
//			int s =file.read();
//			 file.close();  
//			 System.out.println((char)s);
//		     }

//}
