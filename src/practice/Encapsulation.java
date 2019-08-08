package practice;

 class Encapsulation extends Encaps {
	
	public static void main(String []arg)
	{
		Encaps scr = new Encaps();
		scr.setName("sharda");
		System.out.println(scr.getName());
	}

}

 class Encaps {
	 private String clgName;
	 public String getName()
	 {
		 return clgName;
	 }
	 public void setName(String clgName)
	 {
		 this.clgName = clgName;
	 }
	 
 }
