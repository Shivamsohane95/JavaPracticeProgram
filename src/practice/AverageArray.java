package practice;

public class AverageArray {

	public static void main(String[] args) {
		double avg=0;
		double[] arr = {3,4,6,2,7};
		for(int i=0;i<arr.length;i++)
		{
           avg = avg+arr[i];
				}
            double k = avg/arr.length;
            System.out.println(k);
		}

	}


