//Rezolva urmatoarea problema intr-un limbaj de programare (la alegerea ta, dar codul sa fie compilabil/executabil, deci nu se accepta pseudocod): Se dau a) un numar intreg i si b) o colectie arbitrar de lunga (f1, f2, ..., fn) de functii care accepta ca argument un numar intreg si intorc tot un numar intreg. Sa se scrie un program care intoarce o colectie de numere intregi reprezentand rezultatele aplicarii acelor functii asupra valorii i. Exemplu de input: 4 si [add_one, multiply_by_five] => output-ul va fi [5, 20]. Alt exemplu de input: 7 si [subtract_three, add_two, multiply_by_three] => output-ul va fi [4, 9, 21].

// @author:Stefan Alexandru
//for webdev preselection
//Java Compiler 1.7

import java.util.ArrayList;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println("example 1:");
	
		ArrayList<OneMethodClass> methodArray1= new ArrayList<OneMethodClass>();  //init an array o classes that contain only one method.This is the most intuitive and organized solution I could think of. 
	     methodArray1.add(new same()); methodArray1.add(new PlusOne());//adding the "functions"
		int i1= 4;  
	ArrayList<Integer>result1=apply(i1,methodArray1);  //calling our method
	
  System.out.print("[");
	for(int j=0;j<result1.size();j++)
		{System.out.print(result1.get(j)+"");                 //printing the result
	       if(j<result1.size()-1) System.out.print(", ");}
	System.out.println("]");
	
	
	System.out.println("example 1:");
	
	ArrayList<OneMethodClass> methodArray2= new ArrayList<OneMethodClass>();  //init an array o classes that contain only one method 
     methodArray2.add(new same()); methodArray2.add(new PlusOne());methodArray2.add(new triple()); methodArray2.add(new MinusOne());methodArray2.add(new same()); methodArray2.add(new HowShouldIGradeThisSolution());//adding the "functions"
	int i2= 10;  
ArrayList<Integer>result2=apply(i2,methodArray2);  //calling our method

System.out.print("[");
for(int j=0;j<result2.size();j++)
	{System.out.print(result2.get(j)+"");                 //printing the result
       if(j<result2.size()-1) System.out.print(", ");}
System.out.println("]");
	
	}
	
	
	public static ArrayList<Integer> apply(int i, ArrayList<OneMethodClass> array)
	{ArrayList<Integer> results=new ArrayList<Integer>();
	
	for(int j=0;j<array.size();j++)
	{results.add(array.get(j).DO(i));}
	
	return results;
		}

}

interface OneMethodClass
{int DO(int i);}


class same implements OneMethodClass
{public int DO (int i)
	{return i;}}

class triple implements OneMethodClass
{public int DO (int i)
	{return i*3;}}

class PlusOne implements OneMethodClass
{public int DO (int i)
	{return i+1;}}

class MinusOne implements OneMethodClass
{public int DO (int i)
	{return i-1;}}

class HowShouldIGradeThisSolution implements OneMethodClass
{public int DO (int i)
	{return 100;}}


