package practice;
//thisKeyword

 class Testthis1{
	public static void main(String []a)
	{
		student S1 = new student(111,"shivam",500f);
		student S2 = new student(112,"vinay",600f);
		S1.display();
		S2.display();
	}
		
	}

class student {
	int rollno;
	String name ;
	float fee;
	student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+""+name+""+fee);
	}

	

}
