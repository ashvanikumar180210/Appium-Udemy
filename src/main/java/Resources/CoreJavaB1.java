package Resources;

import java.util.ArrayList;

public class CoreJavaB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Mynum=6;
		double num =5.66;
		
		String a="My Name is Ashvani";
		char letter='A';
		//boolean MyCard=true;
		System.out.println(Mynum+ " " + num+ " "+a+ " "+letter);
		
	//Arrays 1.predefining array size 
		int[] arr =new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//System.out.println(arr[0]);
		
		//creating loop for access
		for (int i=0;i<arr.length;i++)
		{

		System.out.println(arr[i]);
		
		}
		
		//Arrays 2.defining the value in array
		
		int [] arr2= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0;i<arr2.length;i++)
		{

		System.out.println(arr2[i]);
		
		}
		
		//Arrays 3.storing string values in an array
		String [] name = {"this","is","String","array"};
		String [] name2 = {"Ashvani","is","making","string"};
		
		for (int i=0;i<name.length;i++)
		{

		System.out.println(name[i]);
		
		}
		//in henced for loop
		for(String s:name2)
		{
			System.out.println(s);
		}
		
		//String as defining literal way
		
		String s1="Framework";
		System.out.println(s1);
		//String s2="Framework";//no new memory allocation for second string 
		
		String s3=new String("Defining string as object");
		//String s4=new String("Defining string as object");
		//new memory allocation created for second string even having same name
		String[] splitted1=s3.split(" ");
		
		for(String p:splitted1) {
		
		System.out.println(p);
		
		}
		
		// splitting with around value
		String[] splitted2=s3.split("as");
		
		for(String q:splitted2) {
		
		System.out.println(q);
		
		
		}
		System.out.println(splitted2[1].trim());
		
		//concept of ArrayList
		ArrayList<String> al=new ArrayList <String>();
		al.add("arraylist");
		al.add("concepts");
		al.add("dynamicArray");
		
		//System.out.println(al.get(0));
		for(String item : al) 
		{
		System.out.println(item);
		}
		
		CoreJavaB1 d =new CoreJavaB1();
		d.getdata();
		System.out.println(d.getdata2());
		
		System.out.println(d.getdata4());
		d.getdata5();
		
		
		CoreJavaB2 d2=new CoreJavaB2();
		d2.getdata6();
		System.out.println(d2.getdata7());
		
	
		
	}
	//Method1: no return type
	public void getdata()
	{
		System.out.println("getdata");
	}
	//method2: with string type return
	public String getdata2()
	{
		return "getdata2";
	}

	//methiod3: Static method so can get directly access without creating the object
	public static String getdata4()
	{
		return "getdata4";
	}
	//method4: static method 
	public static void getdata5() 
	{
		System.out.println("getdata5");
	}
	
}
