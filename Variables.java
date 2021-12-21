package datatype;

import java.awt.dnd.Autoscroll;
import java.util.Scanner;

// lowercase all time 

public class Variables {
	// camel case 
	//camel case starting with capital letter 
	//premetive and non-premitive


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x = -1;
		System.out.println(Math.sqrt(x));
		//System.out.println(res);
		int v = 20;
		v--;
		System.out.println(v);
		System.out.println(++v);
		System.out.println(v);
		String name1,name2,name3;
		Scanner stdin=new Scanner(System.in);
		//char x = 'N';
		 boolean d = stdin.hasNextDouble();
		 System.out.println(d);
		
		
		if (x>= 'A' && x <='Z')
			System.out.println("ok");
		
	/*	name1=stdin.nextLine();
		name2=stdin.nextLine();
		name3=stdin.nextLine();
		System.out.println(name1+", "+name2+", and "+name3);
		System.out.println(name1+", "+name3+", and "+name2);
		System.out.println(name2+", "+name1+", and "+name3);
		System.out.println(name2+", "+name3+", and "+name1);
		System.out.println(name3+", "+name2+", and "+name1);
		System.out.println(name3+", "+name1+", and "+name2);
		*/
		
		String s= "NABIL";
		s.valueOf(1);
		System.out.println(s.valueOf('o'));
		int b= 10;
		int c=2;
		System.out.println(Integer.toString(c)+" " +Integer.toString(b));
		
		
		
		
		
	//	 double  res= (float)(1.0+(1.0/2.0)+(1.0/3.0)+(1.0/4.0)+(1.0/5.0)+(1.0/6.0)+(1.0/7.0)+(1.0/8.0));
		//System.out.println(res);
		/*String name1="nabil";
		String name2="nassim";
		String name3="amine";
		Scanner stdin = new Scanner(System.in);
		
		name1=stdin.nextLine();
		name2=stdin.nextLine();
		name3=stdin.nextLine();
		System.out.print(name1+", "+name2+", and "+name3+","+name1+", "+name3+", and "+name2+","+name2+", "+name1+", and "+name3+","+name2+", "+name3+", and "+name1+","+name3+", "+name2+", and "+name1+","+name3+", "+name1+", and "+name2);
		  */
	}

}
