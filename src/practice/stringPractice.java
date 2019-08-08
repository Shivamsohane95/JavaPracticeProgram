package practice;
import java.lang.*;

public class stringPractice {
	 static void getOccuringchar()
	 {
		 String Str = "shivamsohane";
		 int count[] = new int[256];
		 int len = Str.length();
		 for(int i=0;i<len;i++)
		 {
			 //count[Str.charAt(i)]++;
			 System.out.print(count[Str.charAt(i)]++);
		 }
		 char[] ch = new char[Str.length()];
		 for(int i=0;i<len;i++)
		 {
			 ch[i] =Str.charAt(i);
			 int find =0;
			 for(int j=0;j<i;j++)
			 {
				 if(Str.charAt(i)==ch[j])
				 {
					 find++;
				 }
			 }
			 if(find==1)
			 {
				 System.out.println("Number of Occurrence of " + 
		                 Str.charAt(i) + " is:" + count[Str.charAt(i)]);
			 }
		 }
	 }
	 public static void main(String[] args) 
	    { 
	       
	       // String Str = "shivamsohane"; 
	        getOccuringchar(); 
	    } 
	} 
	
	
	

	 
//	public static void main(String[] args) {
//		String st = "shivamsohane";
//	  char[] arr = st.toCharArray();
//	  		
//	 
//	  for(int i =0;i<arr.length-1;i++)
//	  { 
//		  
//		  for(int j=i+1;j<arr.length-1;j++)
//		  	{
//			  if(arr[j]==arr[i])
//			  {
//				 // temp[i] = arr[i];
//				  System.out.println(arr[i]+""+arr[j]);
//				 
//			  }
//		  }
//	  }
//	}
//}