"What will be the result of compiling the following program?
public class MyClass {
long var;
public void MyClass(long param) { var = param; } // (Line no 1)
public static void main(String[] args) {
MyClass a, b;
a = new MyClass(); // (Line no 2) 
}
}"	ANS:				The program will compile without errors.	
"What will happen when you attempt to compile and run this code?
abstract class Base{
        abstract public void myfunc();
        public void another(){
        System.out.println(""Another method"");
        }
}

public class Abs extends Base{
        public static void main(String argv[]){
        Abs a = new Abs();
        a.amethod();
        }
        public void myfunc(){
                System.out.println(""My Func"");
                } 
        public void amethod(){
        myfunc();      
        }
}"	ANS:	The code will compile and run, printing out the words "My Func"				
class A, B and C are in multilevel inheritance hierarchy repectively . In the main method of some other class if class C object is created, in what sequence the three constructors execute?	ANS:	Constructor of A executes first, followed by the constructor of B and C				
"Consider the following code and choose the correct option:
package aj; private class S{ int roll;
 S(){roll=1;} }
package aj; class T 
{ public static void main(String ar[]){ 
System.out.print(new S().roll);}}"	ANS:	Compilation error				
"Here is the general syntax for method definition: 

accessModifier returnType methodName( parameterList )
{
  Java statements

  return returnValue;
}


What is true for the returnType and the returnValue?"	ANS:			The returnValue must be the same type as the returnType, or be of a type that can be converted to returnType without loss of information		
"A) A call to instance method can not be made from static context.
B) A call to static method can  be  made from non static context."	ANS:		Both are TRUE			
"Consider the following code and choose the correct option:
class A{ A(){System.out.print(""From A"");}}
class B extends A{ B(int z){z=2;}
public static void main(String args[]){
  new B(3);}}"	ANS:		Comiples and prints From A			
"class Sample
{int a,b;
Sample()
{ a=1; b=2;
System.out.println(a+""\t""+b);
}
Sample(int x)
{ this(10,20);
a=b=x;
System.out.println(a+""\t""+b);
}
Sample(int a,int b)
{ this();
this.a=a;
this.b=b;
System.out.println(a+""\t""+b);
}
}
class This2
{ public static void main(String args[])
{
Sample s1=new Sample (100);
}
}
What is the Output of the Program?"	ANS:				1 2 10 20 100 100	
"Consider the following code and choose the correct option:
class A{ private static void display(){ System.out.print(""Hi"");}
public static void main(String ar[]){
display();}}"	ANS:	Compiles and display Hi				
"Consider the following code and choose the correct option:
package aj; class A{ protected int j; }
package bj; class B extends A
{ public static void main(String ar[]){ 
System.out.print(new A().j=23);}}"	ANS:			compliation error		
"Consider the following code and choose the correct option:
class A{  int z; A(int x){z=x;} }
class B extends A{ 
public static void main(String arg){
new B();}}"	ANS:	Compilation error				
"class Test{
static void method(){
this.display();
}
static display(){
System.out.println((""hello"");
}
public static void main(String[] args){
new Test().method();
}
}
consider the code above & select the proper output from the options."	ANS:				does not compile	
"What will be the result when you try to compile and run the following code? 
private class Base{
    Base(){
 int i = 100;
 System.out.println(i);
    }
}

public class Pri extends Base{
    static int i = 200;
    public static void main(String argv[]){
 Pri p = new Pri();
 System.out.println(i);
    }
}"	ANS:			Compile time error		
"public class MyClass {
  static void print(String s, int i) {
    System.out.println(""String: "" + s + "", int: "" + i);
  }

  static void print(int i, String s) {
    System.out.println(""int: "" + i + "", String: "" + s);
  }

  public static void main(String[] args) {
    print(""String first"", 11);
    print(99, ""Int first"");
  }
}What would be the output?"	ANS:	String: String first, int: 11 int: 99, String: Int first				
"A) No argument constructor is provided to all Java classes by default
B) No argument constructor is provided to the class only when no constructor is defined.
C) Constructor can have another class object as an argument
D) Access specifiers are not applicable to Constructor"	ANS:			B and C is TRUE		
"Consider the following code and choose the correct option:
class Test{ private static void display(){
System.out.println(""Display()"");}
private static  void show() { display();
System.out.println(""show()"");}
public static void main(String arg[]){
show();}}"	ANS:		Compiles and prints Display() show()			
"Which of the following sentences is true?
A)  Access to data member depends on the scope of the class and the scope of data members
B) Access to data member depends only on the scope of the data members
C) Access to data member depends on the scope of the method from where it is accessed"	ANS:				Only A is TRUE	
"Given:
 public class Yikes {

 public static void go(Long n) {System.out.print(""Long "");}
 public static void go(Short n) {System.out.print(""Short "");}
 public static void go(int n) {System.out.print(""int "");}
 public static void main(String [] args) {
 short y = 6;
 long z = 7;
 go(y);
 go(z);
 }
 }
What is the result?"	ANS:	int Long				
Which of the following will print -4.0	ANS:	System.out.println(Math.ceil(-4.7));				
"Suppose class B is sub class of class A:
A) If class A doesn't have any constructor, then class B also must not have any constructor
B) If class A has parameterized constructor, then class B can have default as well as  parameterized constructor
C) If class A has parameterized constructor then call to class A constructor should be made explicitly by constructor of class B"	ANS:	Only B and C is TRUE				
"class Order{
Order(){
System.out.println(""Cat"");
}
public static void main(String... Args){
System.out.println(""Ant"");
}
static{
System.out.println(""Dog"");
}
{
System.out.println(""Man"");
}}
consider the code above & select the proper output from the options."	ANS:	Dog Ant				
"Consider the following code and choose the correct option:
class A{ private void display(){ System.out.print(""Hi"");}
public static void main(String ar[]){
display();}}"	ANS:			Compilation fails		
"Consider the following code and choose the correct option:
public class MyClass {
 public static void main(String arguments[]) {
  amethod(arguments);
 }
 public void amethod(String[] arguments) {
  System.out.println(arguments[0]);
  System.out.println(arguments[1]);
 }
}
Command Line arguments - Hi, Hello"	ANS:		Compiler Error			
"package QB;
 class Sphere {
             protected int methodRadius(int r) {
      System.out.println(""Radious is: ""+r);
   return 0;
    }
   }
package QB;
public class MyClass {
 public static void main(String[] args) {
 double x = 0.89;
  Sphere sp = new Sphere();
  // Some code missing
}
} to get the radius value what is the code of line to be added ?"	ANS:		sp.methodRadius(x);			
"class One{
int var1;
One (int x){
var1 = x;
}}
class Derived extends One{
int var2;
void display(){
System.out.println(""var 1=""+var1+""var2=""+var2);
}}
class Main{
public static void main(String[] args){
Derived obj = new Derived();
obj.display();
}}
consider the code above & select the proper output from the options."	ANS:			compile error		
"Consider the following code and choose the correct option:
class Test{ private void display(){
System.out.println(""Display()"");}
private static  void show() { display();
System.out.println(""show()"");}
public static void main(String arg[]){
show();}}"	ANS:				Compilation error	
"Consider the following code and choose the best option:
class Super{ int x; Super(){x=2;}}
class Sub extends Super { void displayX(){
System.out.print(x);}
public static void main(String args[]){
   new Sub().displayX();}}"	ANS:			Compiles and display 2		
"class One{
int var1;
One (int x){
var1 = x;
}}
class Derived extends One{
int var2;
Derived(){
super(10);
var2=10;
}
void display(){
System.out.println(""var1=""+var1+"" , var2=""+var2);
}}
class Main{
public static void main(String[] args){
Derived obj = new Derived();
obj.display();
}}
consider the code above & select the proper output from the options."	ANS:	var1=10 , var2=10				
"public class MyAr {
 static int i1;
 public static void main(String argv[]) {
  MyAr m = new MyAr();
  m.amethod();
 }
 public void amethod() {
  System.out.println(i1);
 }
}
What is the output of the program?"	ANS:					
"What will be printed out if you attempt to compile and run the following code ? 
public class AA {
 public static void main(String[] args) {
  int i = 9;
  switch (i) {
  default:
   System.out.println(""default"");
  case 0:
   System.out.println(""zero"");
   break;
  case 1:
   System.out.println(""one"");
  case 2:
   System.out.println(""two"");
  }
 }
}"	ANS:			default zero		
Which modifier is used to control access to critical code in multi-threaded programs?	ANS:				synchronized	
"Given:
package QB;

class Meal {
  Meal() {
    System.out.println(""Meal()"");
  }
}
class Cheese {
  Cheese() {
    System.out.println(""Cheese()"");
  }
}
class Lunch extends Meal {
  Lunch() {
    System.out.println(""Lunch()"");
  }
}
class PortableLunch extends Lunch {
  PortableLunch() {
    System.out.println(""PortableLunch()"");
  }
}
class Sandwich extends PortableLunch {
    private Cheese c = new Cheese();

  public Sandwich() {
    System.out.println(""Sandwich()"");
  }
}
public class MyClass7 {
  public static void main(String[] args) {
    new Sandwich();
  }
} What would be the output?"	ANS:	Meal() Lunch() PortableLunch() Cheese() Sandwich()				
"Consider the following code and choose the correct option:
class A{ int a; A(int a){a=4;}}
class B extends A{ B(){super(3);} void displayA(){
System.out.print(a);}
public static void main(String args[]){
  new B().displayA();}}"	ANS:	compiles and display 0				
"Given the following code what will be output? 
public class Pass{
    static int j=20;
    public static void main(String argv[]){
 int i=10;
 Pass p = new Pass();
 p.amethod(i);
 System.out.println(i);
 System.out.println(j);
    }

    public void amethod(int x){
 x=x*2;
 j=j*2;
    }
}"	ANS:			10 and 40		
What will happen if a main() method of a "testing" class tries to access a private instance variable of an object using dot notation?	ANS:		The compiler will find the error and will not make a .class file			
"11. class Mud {
12. // insert code here
13. System.out.println(""hi"");
14. }
15. }
And the following five fragments:
public static void main(String...a) {
public static void main(String.* a) {
public static void main(String... a) {
public static void main(String[]... a) {
public static void main(String...[] a) {
How many of the code fragments, inserted independently at line 12, compile?"	ANS:				3	
"class Order{
Order(){
System.out.println(""Cat"");
}
public static void main(String... Args){
Order obj = new Order();
System.out.println(""Ant"");
}
static{
System.out.println(""Dog"");
}
{
System.out.println(""Man"");
}}
consider the code above & select the proper output from the options."	ANS:			Dog Man Cat Ant		
"abstract class MineBase {
 abstract void amethod();
 static int i;
}
public class Mine extends MineBase {
 public static void main(String argv[]){
 int[] ar=new int[5];
 for(i=0;i < ar.length;i++)
 System.out.println(ar[i]);
 }
}"	ANS:				Compilation Error occurs and to avoid them we need to declare Mine class as abstract	
"public class Q {
 public static void main(String argv[]) {
  int anar[] = new int[] { 1, 2, 3 };
  System.out.println(anar[1]);
 }
}"	ANS:		2			
A constructor may return value including class type	ANS:		false			
"Consider the following code and choose the correct option:
package aj; class S{ int roll =23;
private S(){} }
 class T 
{ public static void main(String ar[]){ 
System.out.print(new S().roll);}}"	ANS:	Compilation error				
"public class c123 {
 private c123() {
  System.out.println(""Hellow"");
 }
 public static void main(String args[]) {
  c123 o1 = new c123();
  c213 o2 = new c213();
 }
}
class c213 {
 private c213() {
  System.out.println(""Hello123"");
 }
}

What is the output?"	ANS:			Compilation Error		
"class MyClass1
 {
  private int area(int side)
  {
   return(side * side);
  }
  public static void main(String args[ ])
  {
   MyClass1 MC = new MyClass1( );
   int area = MC.area(50);
   System.out.println(area);
  }
 }
  What would be the output?"	ANS:			2500		
"public class MyAr {
 public static void main(String argv[]) {
  MyAr m = new MyAr();
  m.amethod();
 }
 public void amethod() {
  static int i1;
  System.out.println(i1);
 }
}
What is the Output of the Program?"	ANS:				It is not possible to declare a static variable in side of non static method or instance method. Because Static variables are class level dependencies.	
"public class MyAr {
 public static void main(String argv[]) {
  MyAr m = new MyAr();
  m.amethod();
 }
 public void amethod() {
  final int i1;
  System.out.println(i1);
 }
}
What is the Output of the Program?"	ANS:		Unresolved compilation problem: The local variable i1 may not have been initialized			
"public class c1 {
private c1()
{
 System.out.println(""Hello"");
}
public static void main(String args[])
{
 c1 o1=new c1();
}
}

What is the output?"	ANS:	Hello				
Which modifier indicates that the variable might be modified asynchronously, so that all threads will get the correct value of the variable.	ANS:		volatile			
"class A {
  int i, j;

   A(int a, int b) {
    i = a;
    j = b;
  }
  void show() {
    System.out.println(""i and j: "" + i + "" "" + j);
  }
}
class B extends A {
  int k;

  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }
  void show(String msg) {
    System.out.println(msg + k);
  }
}
class Override {
  public static void main(String args[]) {
    B subOb = new B(3, 5, 7);
    subOb.show(""This is k: ""); // this calls show() in B
    subOb.show(); // this calls show() in A
  }
} What would be the ouput?"	ANS:				This is k: 7 i and j: 3 7	
"Consider the following code and choose the correct option:
class X { int x; X(int x){x=2;}}
class Y extends X{ Y(){} void displayX(){
System.out.print(x);}
public static void main(String args[]){
 new Y().displayX();}}"	ANS:				Compilation error	
"class Order{
Order(){
System.out.println(""Cat"");
}
public static void main(String... Args){
Order obj = new Order();
System.out.println(""Ant"");
}
static{
System.out.println(""Dog"");
}}
consider the code above & select the proper output from the options."	ANS:		Dog Cat Ant			
"What will be the result when you attempt to compile this program? 
public class Rand{
    public static void main(String argv[]){
 int iRand;
 iRand = Math.random();
 System.out.println(iRand);
    }
}"	ANS:	Compile time error referring to a cast problem				
If no retention policy is specified for an annotation, then the default policy of __________ is used.	ANS:		class			
All annotation types should maually extend the Annotation interface. State TRUE/FALSE	ANS:		false			
Custom annotations can be created using	ANS:	@interface				
"Given:
10. interface A { void x(); }
11. class B implements A { 
     public void x() { } 
     public void y() { }        }
12. class C extends B { 
     public void x() {}         }
And:
20. java.util.List<a> list = new       java.util.ArrayList</a>();
21. list.add(new B());
22. list.add(new C());
23. for (A a:list) {
24. a.x();
25. a.y();;
26. }
What is the result?"	ANS:	Compilation fails because of an error in line 25				
"Given:
 public static Collection get() {
 Collection sorted = new LinkedList();
 sorted.add(""B""); sorted.add(""C""); sorted.add(""A"");
 return sorted;
 }
 public static void main(String[] args) {
 for (Object obj: get()) {
 System.out.print(obj + "", "");
 }
 }
What is the result?"	ANS:		B, C, A,			
"Which statement is true about the following program?
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class WhatISThis {
public static void main(String[] na){
List<StringBuilder> list=new ArrayList<StringBuilder>();
list.add(new StringBuilder(""B""));
list.add(new StringBuilder(""A""));
list.add(new StringBuilder(""C""));
Collections.sort(list,Collections.reverseOrder());
System.out.println(list.subList(1,2));
}
}"	ANS:			The program will compile and throw a runtime exception		
"Consider the following code and choose the correct option:
public static void before() {
Set set = new TreeSet();
set.add(""2"");
set.add(3);
set.add(""1"");
Iterator it = set.iterator();
while (it.hasNext())
System.out.print(it.next() + "" "");
}"	ANS:			The before() method will throw an exception at runtime		
"import java.util.StringTokenizer;
class ST{
public static void main(String[] args){
String input = ""Today is$Holiday"";
StringTokenizer st = new StringTokenizer(input,""$"");
while(st.hasMoreTokens()){
System.out.println(st.nextElement());
}}"	ANS:		Today is Holiday			
"Given:
 public static Iterator reverse(List list) {
 Collections.reverse(list);
 return list.iterator();
 }
 public static void main(String[] args) {
 List list = new ArrayList();
 list.add(""1""); list.add(""2""); list.add(""3"");
 for (Object obj: reverse(list))
 System.out.print(obj + "", "");
 }
What is the result?"	ANS:			Compilation fails.		
"Which collection class allows you to grow or shrink its size and provides indexed access to
its elements, but its methods are not synchronized?"	ANS:				java.util.ArrayList	
int indexOf(Object o) - What does this method return if the element is not found in the List?	ANS:		-1			
"What is the result of attempting to compile and run the following code?
 import java.util.Vector; import java.util.LinkedList; public class Test1{ public static void main(String[] args) { Integer int1 = new Integer(10); Vector vec1 = new Vector(); LinkedList list = new LinkedList(); vec1.add(int1); list.add(int1); if(vec1.equals(list)) System.out.println(""equal""); else System.out.println(""not equal""); } } 1. The code will fail to compile. 2. Runtime error due to incompatible object comparison 3. Will run and print ""equal"". 4. Will run and print ""not equal""."	ANS:			3		
"Consider the following code and choose the correct option:
class Test{
  public static void main(String args[]){
   Integer arr[]={3,4,3,2};
   Set<Integer> s=new TreeSet<Integer>(Arrays.asList(arr));
   s.add(1);
   for(Integer ele :s){
    System.out.println(ele);   }  }}"	ANS:			prints 1,2,3,4		
"Inorder to remove one element from the given Treeset, place the appropriate line of code 
public class Main {
  public static void main(String[] args) {
    TreeSet<Integer> tSet = new TreeSet<Integer>();
    System.out.println(""Size of TreeSet : "" + tSet.size());
    tSet.add(new Integer(""1""));
    tSet.add(new Integer(""2""));
    tSet.add(new Integer(""3""));
   System.out.println(tSet.size());
   // remove the one element from the Treeset
    System.out.println(""Size of TreeSet after removal : "" + tSet.size());
  }
}"	ANS:			tSet.remove(new Integer("1"));		
"Consider the code below  & select the correct  ouput from the options:
public class Test{
 public static void main(String[] args) {
  String []colors={""orange"",""blue"",""red"",""green"",""ivory""};
  Arrays.sort(colors);
 int s1=Arrays.binarySearch(colors, ""ivory"");
  int s2=Arrays.binarySearch(colors, ""silver"");
  System.out.println(s1+"" ""+s2); }}"	ANS:			2 -6		
"Consider the following code and choose the correct output:
class Test{
  public static void main(String args[]){
   TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
  hm.put(2,""Two"");
 hm.put(4,""Four"");
 hm.put(1,""One"");
 hm.put(6,""Six"");
 hm.put(7,""Seven"");
 SortedMap<Integer, String> sm=hm.subMap(2,7);
 SortedMap<Integer,String> sm2=sm.tailMap(4);
 System.out.print(sm2);
 }}"	ANS:			{4=Four, 6=Six}		
next() method of Scanner class will return _________	ANS:				String	
"Given:
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

  public static void main(String[] a) {
    String elements[] = { ""A"", ""B"", ""C"", ""D"", ""E"" };
    Set set = new HashSet(Arrays.asList(elements));

    elements = new String[] { ""A"", ""B"", ""C"", ""D"" };
    Set set2 = new HashSet(Arrays.asList(elements));

    System.out.println(set.equals(set2));
  }
} What is the result of given code?"	ANS:		false			
"A)Property files help to decrease coupling
B) DateFormat class allows you to format dates and times with customized styles.
C) Calendar class allows to perform date calculation and conversion of dates and times between timezones.
D) Vector class is not synchronized"	ANS:			A and C is TRUE		
Which interface does java.util.Hashtable implement?	ANS:	Java.util.Map				
Object get(Object key) - What does this method return if the key is not found in the Map?	ANS:			null		
"Consider the following code and choose the correct option:
class Test{
  public static void main(String args[]){
   TreeSet<Integer> ts=new TreeSet<Integer>();
   ts.add(1);
   ts.add(8);
   ts.add(6);
   ts.add(4);
   SortedSet<Integer> ss=ts.subSet(2, 10);
   ss.add(9);
   System.out.println(ts);
   System.out.println(ss);
 }}"	ANS:			[1,4,6,8,9] [4,6,8,9]		
"A) Iterator does not allow to insert elements during traversal
B) Iterator allows bidirectional navigation.
C) ListIterator allows insertion of elements during traversal
D) ListIterator does not support bidirectional navigation"	ANS:			A and C is TRUE		
static void sort(List list) method is part of ________	ANS:		Collections class			
static int binarySearch(List list, Object key) is a method of __________	ANS:				Collections class	
Which collection class allows you to access its elements by associating a key with an element's value, and provides synchronization?	ANS:				java.util.Hashtable	
"Consider the following code and select the correct output:
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Lists {
public static void main(String[] args) {
List<String> list=new ArrayList<String>();
list.add(""1"");
list.add(""2"");
list.add(1, ""3"");
List<String> list2=new LinkedList<String>(list);
list.addAll(list2);
list2 =list.subList(2,5);
list2.clear();
System.out.println(list);
}
}"	ANS:	[1,3,2]				
"Given:
 import java.util.*;

 public class LetterASort{
 public static void main(String[] args) {
 ArrayList<String> strings = new ArrayList<String>();
 strings.add(""aAaA"");
 strings.add(""AaA"");
 strings.add(""aAa"");
 strings.add(""AAaa"");
 Collections.sort(strings);
 for (String s : strings) { System.out.print(s + "" ""); }
 }
 }
What is the result?"	ANS:			AAaa AaA aAa aAaA		
"A) It is a good practice to store heterogenous data in a TreeSet.
B) HashSet has default initial capacity (16) and loadfactor(0.75)
C)HashSet  does not maintain order of Insertion
D)TreeSet maintains order of Inserstion"	ANS:				B and C is TRUE	
"Consider the following code was executed on June 01, 1983. What will be the output?
class Test{
 public static void main(String args[]){
   Date date=new Date();
   SimpleDateFormat sd;
  sd=new SimplpeDateFormat(""E MMM dd yyyy"");
  System.out.print(sd.format(date));}}"	ANS:	Wed Jun 01 1983				
"Given:
 public class Venus {
 public static void main(String[] args) {
 int [] x = {1,2,3};
 int y[] = {4,5,6};
 new Venus().go(x,y);
 }
 void go(int[]... z) {
 for(int[] a : z)
 System.out.print(a[0]);
 }
 } What is the result?"	ANS:			14		
"You wish to store a small amount of data and make it available for rapid access. You do not have a need for the data to be sorted, uniqueness is not an issue and the data will remain fairly static Which data structure might be most suitable for this requirement?

1) TreeSet
2) HashMap
3) LinkedList
4) an array"	ANS:				4	
"What will be the output of following code?
class Test{
 public static void main(String args[]){
  TreeSet<Integer> ts=new TreeSet<Integer>();
  ts.add(2);
  ts.add(3);
  ts.add(7);
  ts.add(5);
SortedSet<Integer> ss=ts.subSet(1,7);
  ss.add(4);
  ss.add(6);
System.out.print(ss);}}"	ANS:				[2,3,4,5,6]	
"Consider the following code and choose the correct option:
class Data{ Integer data; Data(Integer d){data=d;}
 public boolean equals(Object o){return true;}
 public int hasCode(){return 1;}}
class Test{
 public static void main(String ar[]){
   Set<Data> s=new HashSet<Data>();
   s.add(new Data(4));
   s.add(new Data(2));
    s.add(new Data(4));
    s.add(new Data(1));
   s.add(new Data(2));
  System.out.print(s.size());}}"	ANS:		5			
"Consider the code below  & select the correct  ouput from the options:
public class Test{
public static void main(String[] args) {
 String num="""";
 z: for(int x=0;x<3;x++)
  for(int y=0;y<2;y++){
   if(x==1) break;
   if(x==2 && y==1) break z;
   num=num+x+y;
  }System.out.println(num);}}"	ANS:		000120			
"Given:
 public class Test {
 public enum Dogs {collie, harrier};
 public static void main(String [] args) {
 Dogs myDog = Dogs.collie;
 switch (myDog) {
 case collie:
 System.out.print(""collie "");
 case harrier:
 System.out.print(""harrier "");
 }
 }
 }
What is the result?"	ANS:				collie harrier	
"Consider the following code and choose the correct output:
class Test{
 public static void main(String args[]){
   boolean flag=true;
   if(flag=false){
   System.out.print(""TRUE"");}else{
   System.out.print(""FALSE"");}}}"	ANS:		false			
"Cosider the following code and choose the correct option: 
class Test{
  public static void main(String args[]){    System.out.println(Integer.parseInt(""2147483648"", 10));
  }}"	ANS:			NumberFormatException at run time		
"Given:
 public class Test {
 public enum Dogs {collie, harrier, shepherd};
 public static void main(String [] args) {
 Dogs myDog = Dogs.shepherd;
 switch (myDog) {
 case collie:
 System.out.print(""collie "");
 case default:
 System.out.print(""retriever "");
 case harrier:
 System.out.print(""harrier "");
 }
 }
 }
What is the result?"	ANS:				Compilation fails.	
"Given:
static void myFunc()
   {
   int i, s = 0;
   for (int j = 0; j < 7; j++) {
   i = 0;
   do {
   i++;
   s++;
   } while (i < j);
   }
   System.out.println(s);
   }
     } What would be the result"	ANS:			22		
"What is the range of the random number r generated by the code below?
int r = (int)(Math.floor(Math.random() * 8)) + 2;"	ANS:	2 <= r <= 9				
"class Test{
 public static void main(String[] args) {
  int x=-1,y=-1;   
  if(++x=++y)      
   System.out.println(""R.T. Ponting""); 
  else        
   System.out.println(""C.H. Gayle"");
 }
}
consider the code above & select the proper output from the options."	ANS:			Compile error		
"Given:
 public class Breaker2 {
 static String o = """";
 public static void main(String[] args) {
 z:
 for(int x = 2; x < 7; x++) {
 if(x==3) continue;
 if(x==5) break z;
 o = o + x;
 }
 System.out.println(o);
 }
 }
What is the result?"	ANS:		24			
"Consider the following code and choose the correct output:
class Test{
  public static void main(String args[]){
    int a=5;
   if(a=3){
   System.out.print(""Three"");}else{
  System.out.print(""Five"");}}}"	ANS:	Compilation error				
"Given:
 public class Batman {
 int squares = 81;
 public static void main(String[] args) {
 new Batman().go();
 }
 void go() {
 incr(++squares);
 System.out.println(squares);
 }
 void incr(int squares) { squares += 10; }
 }
What is the result?"	ANS:		82			
"public void foo( boolean a, boolean b)
{ 
    if( a ) 
    {
        System.out.println(""A""); /* Line 5 */
    } 
    else if(a && b) /* Line 7 */
    { 
        System.out.println( ""A && B""); 
    } 
    else /* Line 11 */
    { 
        if ( !b ) 
        {
            System.out.println( ""notB"") ;
        } 
        else 
        {
            System.out.println( ""ELSE"" ) ; 
        } 
    } 
}

What would be the result?"	ANS:				If a is false and b is true then the output is "ELSE"	
"What is the value of ’n’ after executing the following code?
int n = 10;
int p = n + 5;
int q = p - 10;
int r = 2 * (p - q);
switch(n)
{
case p: n = n + 1;
case q: n = n + 2;
case r: n = n + 3;
default: n = n + 4;
}"	ANS:			Compilation Error		
"public class While 
{
    public void loop() 
    {
        int x= 0;
        while ( 1 ) /* Line 6 */
        {
            System.out.print(""x plus one is "" + (x + 1)); /* Line 8 */
        }
    }
}

Which statement is true?"	ANS:				There is a syntax error on line 6	
"Which of the following loop bodies DOES compute the product from 1 to 10 like (1 * 2 * 3 * 4 * 5 *
6 * 7 * 8 * 9 * 10)?
int s = 1;
for (int i = 1; i <= 10; i++)
{
<What to put here?>
}"	ANS:				s *= i;	
"Given:
 class Atom {
 Atom() { System.out.print(""atom ""); }
 }
 class Rock extends Atom {
 Rock(String type) { System.out.print(type); }
}
 public class Mountain extends Rock {
 Mountain() {
 super(""granite "");
 new Rock(""granite "");
 }
 public static void main(String[] a) { new Mountain(); }
 }
What is the result?"	ANS:				atom granite atom granite	
"What are the thing to be placed to complete the code?
class Wrap {
  public static void main(String args[]) {

    _______________ iOb = ___________ Integer(100);

    int i = iOb.intValue();

    System.out.println(i + "" "" + iOb); // displays 100 100
  }
}"	ANS:		Integer, new			
"public class SwitchTest 
{  
    public static void main(String[] args) 
    {
        System.out.println(""value ="" + switchIt(4)); 
    } 
    public static int switchIt(int x) 
    {
        int j = 1;  
        switch (x) 
        { 
            case 1: j++; 
            case 2: j++;  
            case 3: j++; 
            case 4: j++; 
            case 5: j++; 
            default: j++; 
            } 
        return j + x;  
    } 
}
What will be the output of the program?"	ANS:	value = 8				
"Given:
 public class Barn {
 public static void main(String[] args) {
 new Barn().go(""hi"", 1);
 new Barn().go(""hi"", ""world"", 2);
 }
 public void go(String... y, int x) {
 System.out.print(y[y.length - 1] + "" "");
 }
 }
What is the result?"	ANS:				Compilation fails.	
"Consider the following code and choose the correct option:
class Test{
  public static void main(String args[]){    int x=034;
    int y=12;    
    int ans=x+y;
    System.out.println(ans);
  }}"	ANS:	40				
"11. double input = 314159.26;
12. NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
13. String b;
14. //insert code here

Which code, inserted at line 14, sets the value of b to 314.159,26?"	ANS:		b = nf.format( input );			
"Consider the following code and choose the correct option:
class Test{
public static void main(String ar[]){
 TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
 tree.put(1, ""one"");
 tree.put(2, ""two"");
 tree.put(3, ""three"");
 tree.put(4,""Four"");
    System.out.println(tree.higherKey(2));
    System.out.println(tree.ceilingKey(2));
    System.out.println(tree.floorKey(1));
    System.out.println(tree.lowerKey(1));
}}"	ANS:	3 2 1 null				
"Consider the following code and choose the correct option: 
class Test{
  public static void main(String args[]){
 Long data=23;
  System.out.println(data); }}"	ANS:		Compilation error			
"class AutoBox {
   public static void main(String args[]) {
  
  int i = 10;  
  Integer iOb = 100; 
     i = iOb; 
     System.out.println(i + "" "" + iOb); 
   }
 } whether this code work properly, if so what would be the result?"	ANS:				Yes, 100, 100	
"Consider the following code and choose the correct option: 
class Test{
  public static void main(String args[]){
  Long l=0l;
  System.out.println(l.equals(0));}}"	ANS:			false		
"int I = 0;
    outer:
    while (true) 
    {
        I++;
        inner:
        for (int j = 0; j < 10; j++) 
        {
            I += j;
            if (j == 3)
                continue inner;
            break outer;
        }
        continue outer;
    }
System.out.println(I);

What will be thr result?"	ANS:				1	
"what will be the result of attempting to compile and run the following class?
Public class IFTest{
public static void main(String[] args){
int i=10;
if(i==10)            
if(i<10)
System.out.println(""a"");
else
System.out.println(""b"");
}}"	ANS:				The code will compile correctly and display the letter b,when run	
"What is the output of the following code :
class try1{
 public static void main(String[] args) {
  System.out.println(""good"");
  while(false){
   System.out.println(""morning"");
  }
 }
}"	ANS:			compiler error		
"Consider the following code and choose the correct output:
class Test{
  public static void main(String args[]){
   int num=3;   switch(num){
   case 1: case 3: case 4:  {
    System.out.println(""bat man"");  }     
   case 2: case 5: {
    System.out.println(""spider man"");  }break;  } }}"	ANS:			bat man spider man		
"Given:
int n = 10;
switch(n)
{
case 10: n = n + 1;
case 15: n = n + 2;
case 20: n = n + 3;
case 25: n = n + 4;
case 30: n = n + 5;
}
System.out.println(n);
What is the value of ’n’ after executing the following code?"	ANS:			25		
"What will be the output of following code? 

TreeSet map = new TreeSet();
map.add(""one"");
map.add(""two"");
map.add(""three"");
map.add(""four"");
map.add(""one"");
Iterator it = map.iterator();
while (it.hasNext() ) 
{
    System.out.print( it.next() + "" "" );
}"	ANS:			four one three two		
"public class Test {
 public static void main(String [] args) {
 int x = 5;
 boolean b1 = true;
 boolean b2 = false;

 if ((x == 4) && !b2 )
 System.out.print(""1 "");
 System.out.print(""2 "");
 if ((b2 = true) && b1 )
System.out.print(""3 "");
 }
 }
What is the result?"	ANS:			2 3		
"Given:
 import java.util.*;
 public class Explorer3 {
 public static void main(String[] args) {
 TreeSet<Integer> s = new TreeSet<Integer>();
 TreeSet<Integer> subs = new TreeSet<Integer>();
 for(int i = 606; i < 613; i++)
 if(i%2 == 0) s.add(i);
 subs = (TreeSet)s.subSet(608, true, 611, true);
 subs.add(629);
 System.out.println(s + "" "" + subs);
 }
 }
What is the result?"	ANS:			An exception is thrown at runtime.		
"What is the output :
class try1{
 public static void main(String[] args) {
  int x=1;   
  if(x--)     
   System.out.println(""good"");
  else       
  System.out.println(""bad"");
   }
 }"	ANS:			compile error		
"Consider the following code and choose the correct output:
class Test{
  public static void main(String args[]){
   int num='b';   switch(num){
   default :{
   System.out.print(""default"");}
   case 100 : case 'b' : case 'c' :  {
    System.out.println(""brownie"");  break;}     
   case 200: case 'e': {
    System.out.println(""pastry"");  }break;  } }}"	ANS:	brownie				
"Given:
 Float pi = new Float(3.14f);
 if (pi > 3) {
 System.out.print(""pi is bigger than 3. "");
 }
 else {
 System.out.print(""pi is not bigger than 3. "");
 }
 finally {
 System.out.println(""Have a nice day."");
 }
What is the result?"	ANS:	Compilation fails.				
"Given:
 public void go() {
 String o = """";
 z:
 for(int x = 0; x < 3; x++) {
 for(int y = 0; y < 2; y++) {
 if(x==1) break;
 if(x==2 && y==1) break z;
 o = o + x + y;
 }
 }
 System.out.println(o);
 }
What is the result when the go() method is invoked?"	ANS:			000120		
"Examine the following code: 

    int count =  1;                                  
    while (  ___________ )  
    {
      System.out.print( count + "" "" );
      count = count + 1;
    }
    System.out.println(  );

What condition should be used so that the code prints: 

1 2 3 4 5 6 7 8"	ANS:	count < 9				
"What will be the output of the program? 

public class Switch2 
{
    final static short x = 2;
    public static int y = 0;
    public static void main(String [] args) 
    {
        for (int z=0; z < 3; z++) 
        {
            switch (z) 
            {
                case y: System.out.print(""0 "");   /* Line 11 */
                case x-1: System.out.print(""1 ""); /* Line 12 */
                case x: System.out.print(""2 "");   /* Line 13 */
            }
        }
    }
}"	ANS:			Compilation fails at line 11		
"Given:
 int x = 0;
 int y = 10;
 do {
 y--;
 ++x;
 } while (x < 5);
 System.out.print(x + "","" + y);
What is the result?"	ANS:		5,5			
"What is the output :
class Test{
 public static void main(String[] args) {
   int a=5,b=10,c=1;    
   if(a>c){         
    System.out.println(""success"");  
    }    
   else{ 
    break;    
    }
   }
 }"	ANS:			compiler error		
"Consider the following code and choose the correct output:
public class Test{
public static void main(String[] args) {
 int x = 0;
  int y = 10;
  do {
  y--;
  ++x;
  } while (x < 5);
  System.out.print(x + "","" + y);
}
}"	ANS:		5,5			
"Consider the following code and choose the correct option:
class Test{
  public static void main(String args[]){
   int l=7;
   Long  L = (Long)l;   
   System.out.println(L);  }}"	ANS:		Compilation error			
"Given:
double height = 5.5;
   if(height-- >= 5.0)
   System.out.print(""tall "");
   if(--height >= 4.0)
   System.out.print(""average "");
   if(height-- >= 3.0)
   System.out.print(""short "");
   else
   System.out.print(""very short "");
  }
What would be the Result?"	ANS:		tall short			
"Consider the following code and choose the correct option:
class Test{
 public static void main(String args[]){
   String hexa    = ""0XFF"";  
  int number = Integer.decode(hexa);  
   System.out.println(number);  }}"	ANS:			255		
"Consider the following code and choose the correct option:
int i = l, j = -1; 
switch (i) 
{
    case 0, 1: j = 1;
    case 2: j = 2; 
    default: j = 0; 
} 
System.out.println(""j = "" + j);"	ANS:				Compilation fails	
Which of the following statements about arrays is syntactically wrong?	ANS:		Person p[5];			
"What will be the output of following code? 

import java.util.*; 
class I 
{
    public static void main (String[] args) 
    {
        Object i = new ArrayList().iterator(); 
        System.out.print((i instanceof List)+"",""); 
        System.out.print((i instanceof Iterator)+"",""); 
        System.out.print(i instanceof ListIterator); 
    } 
}"	ANS:			Prints: false, true, false		
"Given:
 public static void test(String str) {
 int check = 4;
 if (check = str.length()) {
 System.out.print(str.charAt(check -= 1) +"", "");
 } else {
 System.out.print(str.charAt(0) + "", "");
 }
 }
and the invocation:
 test(""four"");
 test(""tee"");
 test(""to"");
What is the result?"	ANS:			Compilation fails.		
"What will be the output of the program? 
int x = 3; 
int y = 1; 
if (x = y) /* Line 3 */
{
    System.out.println(""x ="" + x); 
}"	ANS:			Compilation fails.		
"import java.util.SortedSet;
import java.util.TreeSet;

public class MCQ {

  public static void main(String[] args) {
    TreeSet<String> tSet = new TreeSet<String>();
    tSet.add(""1"");
    tSet.add(""2"");
    tSet.add(""3"");
    tSet.add(""4"");
    tSet.add(""5"");
    SortedSet sortedSet =_____________(""3"");
    System.out.println(""Head Set Contains : "" + sortedSet);
  }
} What is the missing method in the code to get the head set of the tree set?"	ANS:	tSet.headSet				
"Consider the following code and choose the correct output:
class Test{
  public static void main(String args[]){
   int num=3;   switch(num){
   default :{
   System.out.print(""default"");}
   case 1: case 3: case 4:  {
    System.out.println(""apple"");  break;}     
   case 2: case 5: {
    System.out.println(""black berry"");  }break;  } }}"	ANS:	apple				
"Consider the following code and choose the correct option:
class Test{
  public static void main(String args[]){
   Long  L = null;    long  l = L;
  System.out.println(L); 
  System.out.println(l);
  }}"	ANS:			Compiles but error at run time		
"What does the following code fragment write to the monitor? 


int sum =  21; 
if ( sum != 20 )
  System.out.print(""You win "");
else
  System.out.print(""You lose  "");

System.out.println(""the prize."");

What does the code fragment prints?"	ANS:	You win the prize				
Which collection implementation is suitable for maintaining an ordered sequence of objects,when objects are frequently inserted in and removed from the middle of the sequence?	ANS:				LinkedList	
"What is the output :
class One{
 public static void main(String[] args) {
  int a=100;  
  if(a>10)     
   System.out.println(""M.S.Dhoni"");  
  else if(a>20)       
   System.out.println(""Sachin"");  
  else if(a>30)        
   System.out.println(""Virat Kohli"");}
 }"	ANS:	M.S.Dhoni				
Which of the following statements is TRUE regarding a Java loop?	ANS:			A loop may have multiple exit points		
"switch(x) 
{ 
 default: 
 System.out.println(""Hello""); 
}
Which of the following are acceptable types for x? 
1.byte 
2.long 
3.char 
4.float 
5.Short 
6.Long"	ANS:	1 ,3 and 5				
"What will happen when you attempt to compile and run the following code?
public class Bground extends Thread{
public static void main(String argv[]){
                Bground b = new Bground();
                b.run();
        }
        public void start(){
                for (int i = 0; i <10; i++){
                        System.out.println(""Value of i = "" + i);
                }
        }
}"	ANS:				Clean compile but no output at runtime	
"Given:
 public void testIfA() {
 if (testIfB(""True"")) {
 System.out.println(""True"");
 } else {
 System.out.println(""Not true"");
 }
 }
 public Boolean testIfB(String str) {
 return Boolean.valueOf(str);
 }
What is the result when method testIfA is invoked?"	ANS:	true				
"public class MyProgram 
{
    public static void throwit() 
    {
        throw new RuntimeException();
    }
    public static void main(String args[])
    {
        try 
        {
            System.out.println(""Hello world "");
            throwit();
            System.out.println(""Done with try block "");
        }
        finally 
        {
            System.out.println(""Finally executing "");
        }
    }
}
which answer most closely indicates the behavior of the program?"	ANS:				The program will print Hello world, then will print Finally executing, then will print that a RuntimeException has occurred.	
If a method is capable of causing an exception that it does not handle, it must specify this behavior using throws so that callers of the method can guard themselves against such Exception	ANS:		true			
"A) Checked Exception must be explicity caught or propagated to the calling method 
B) If runtime system can not find an appropriate method to handle the exception, then the runtime system terminates and uses the default exception handler."	ANS:			Bothe A and B is TRUE		
"public class RTExcept 
{
    public static void throwit () 
    {
        System.out.print(""throwit "");
        throw new RuntimeException();
    }
    public static void main(String [] args) 
    {
        try 
        {
            System.out.print(""hello "");
            throwit();
        }
        catch (Exception re ) 
        {
            System.out.print(""caught "");
        }
        finally 
        {
            System.out.print(""finally "");
        }
        System.out.println(""after "");
    }
}"	ANS:	hello throwit caught finally after				
"class s implements Runnable 
{ 
    int x, y; 
    public void run() 
    { 
        for(int i = 0; i < 1000; i++) 
            synchronized(this) 
            { 
                x = 12; 
                y = 12; 
            } 
        System.out.print(x + "" "" + y + "" ""); 
    } 
    public static void main(String args[]) 
    { 
        s run = new s(); 
        Thread t1 = new Thread(run); 
        Thread t2 = new Thread(run); 
        t1.start(); 
        t2.start(); 
    } 
} What is the output?"	ANS:				prints 12 12 12 12	
"What is wrong with the following code?

Class MyException extends Exception{}
public class Test{
public void foo() {
try {
bar();
} finally {
baz();
} catch(MyException e) {}
}
public void bar() throws MyException {
throw new MyException();
}
public void baz() throws RuntimeException {
throw new RuntimeException();
}
}"	ANS:				A catch block cannot follow a finally block	
"Consider the following code and choose the correct option:
class Test{
static void test() throws RuntimeException {
  try {  System.out.print(""test "");
  throw new RuntimeException();
  }  catch (Exception ex) {      System.out.print(""exception ""); }
  }  public static void main(String[] args) {
  try { test(); }  catch (RuntimeException ex) { System.out.print(""runtime ""); }  System.out.print(""end"");  }  }"	ANS:				test exception end	
"Which four can be thrown using the throw statement? 

1.Error 
2.Event 
3.Object 
4.Throwable 
5.Exception 
6.RuntimeException"	ANS:			1, 4, 5 and 6		
"class X implements Runnable 
{ 
    public static void main(String args[]) 
    {
        /* Missing code? */
    } 
    public void run() {} 
}
Which of the following line of code is suitable to start a thread ?"	ANS:			X run = new X(); Thread t = new Thread(run); t.start();		
"Given:
 class X { public void foo() { System.out.print(""X ""); } }

 public class SubB extends X {
 public void foo() throws RuntimeException {
 super.foo();
 if (true) throw new RuntimeException();
 System.out.print(""B "");
 }
 public static void main(String[] args) {
 new SubB().foo();
 }
 }
What is the result?"	ANS:	X, followed by an Exception.				
"What will the output of following code?

try 
{ 
    int x = 0; 
    int y = 5 / x; 
} 
catch (Exception e) 
{
    System.out.println(""Exception""); 
} 
catch (ArithmeticException ae) 
{
    System.out.println("" Arithmetic Exception""); 
} 
System.out.println(""finished"");"	ANS:			compilation fails		
"Consider the following code and choose the correct option:
class Test{
  static void display(){
   throw new RuntimeException();
  }  public static void main(String args[]){
      try{display();
      }catch(Exception e){ throw new NullPointerException();}       
       finally{try{ display();         
       }catch(NullPointerException e){   System.out.println(""caught"");}
       finally{ System.out.println(""exit"");}}}}"	ANS:			exit RuntimeException thrown at run time		
"class Test{
public static void main(String[] args){
try{
Integer.parseInt(""1.0"");
}
catch(Exception e){
System.out.println(""Exception occurred"");
}
catch(RuntimeException ex){
System.out.println(""RuntimeException"");
}
} }
consider the code above & select the proper output from the options."	ANS:				does not compile	
"Which three of the following are methods of the Object class? 

1.notify(); 
2.notifyAll(); 
3.isInterrupted(); 
4.synchronized(); 
5.interrupt(); 
6.wait(long msecs); 
7.sleep(long msecs); 
8.yield();"	ANS:			1, 2, 6		
"class Trial{
public static void main(String[] args){
try{
System.out.println(""One"");
int y = 2 / 0;
System.out.println(""Two"");
} 
catch(RuntimeException ex){
System.out.println(""Catch"");
} 
finally{
System.out.println(""Finally"");
}
} }"	ANS:			One Catch Finally		
"Which digit,and in what order,will be printed when the following program is run?

Public class MyClass {
  public static void main(String[] args) {
   int k=0;
  try {
         int i=5/k;
        }
catch(ArithmeticException e) {
   System.out.println(""1"");
    }
catch(RuntimeException e) {
   System.out.println(""2"");
  return;
    }
catch(Exception e) {
   System.out.println(""3"");
    }
finally{
System.out.println(""4"");
}
System.out.println(""5"");
}
}"	ANS:				The program will only print 1 ,4 and 5 in order	
"class Trial{
public static void main(String[] args){
try{
System.out.println(""Java is portable"");
} } }"	ANS:			We cannot have a try block block without a catch / finally block		
"class Animal { public String noise() { return ""peep""; } }
 class Dog extends Animal {
 public String noise() { return ""bark""; }
 }
 class Cat extends Animal {
 public String noise() { return ""meow""; }
 }
class try1{
public static void main(String[] args){
Animal animal = new Dog();
 Cat cat = (Cat)animal;
 System.out.println(cat.noise());
}}
consider the code above & select the proper output from the options."	ANS:				An exception is thrown at runtime.	
"Given:
class X implements Runnable 
{ 
    public static void main(String args[]) 
    {
        /* Some code */
    } 
    public void run() {} 
}
Which of the following line of code is suitable to start a thread ?"	ANS:	X run = new X(); Thread t = new Thread(run); t.start();				
Which statement is true?	ANS:		If a class has synchronized code, multiple threads can still access the nonsynchronized code.			
"Consider the following code and choose the correct option:
class Test{
  static void display(){
   throw new RuntimeException();
  }
     public static void main(String args[]){
      try{display();
      }catch(Exception e){ }
       catch(RuntimeException re){}
       finally{System.out.println(""exit"");}}}"	ANS:			Compilation fails		
"Given:
public class ExceptionTest 
{ 
    class TestException extends Exception {} 
    public void runTest() throws TestException {} 
    public void test() /* Line X */ 
    { 
        runTest(); 
    } 
}
At Line X, which code is necessary to make the code compile?"	ANS:		throws Exception			
Choose the correct option:	ANS:				Except in case of VM shutdown, if a try block starts to execute, a corresponding finally block will always start to execute.	
"class PropagateException{
public static void main(String[] args){
try{
method();
System.out.println(""method() called"");
}
catch(ArithmeticException ex){
System.out.println(""Arithmetic Exception"");
}
catch(RuntimeException re){
System.out.println(""Runtime Exception"");
}}
static void method(){
int y = 2 / 0;
}}
consider the code above & select the proper output from the options."	ANS:	Arithmetic Exception				
"Given:
 static void test() {
 try {
 String x = null;
 System.out.print(x.toString() + "" "");
 }
 finally { System.out.print(""finally ""); }
 }
 public static void main(String[] args) {
 try { test(); }
 catch (Exception ex) { System.out.print(""exception ""); }
 }
What is the result?"	ANS:			finally exception		
"Consider the following code:

System.out.print(""Start "");
try 
{
    System.out.print(""Hello world"");
    throw new FileNotFoundException();
}
System.out.print("" Catch Here ""); /* Line 7 */
catch(EOFException e) 
{
    System.out.print(""End of file exception"");
}
catch(FileNotFoundException e) 
{
    System.out.print(""File not found"");
}

given that EOFException and FileNotFoundException are both subclasses of IOException. If this block of code is pasted in a method, choose the best option."	ANS:	The code will not compile.				
Which of the following statements is true?	ANS:	catch(X x) can catch subclasses of X where X is a subclass of Exception.				
"Consider the following code and choose the correct option:
int array[] = new int[10];
array[-1] = 0;"	ANS:			runtime error		
"What will be the output of the program? 

public class RTExcept 
{
    public static void throwit () 
    {
        System.out.print(""throwit "");
        throw new RuntimeException();
    }
    public static void main(String [] args) 
    {
        try 
        {
            System.out.print(""hello "");
            throwit();
        }
        catch (Exception re ) 
        {
            System.out.print(""caught "");
        }
        finally 
        {
            System.out.print(""finally "");
        }
        System.out.println(""after "");
    }
}"	ANS:				hello throwit caught finally after	
What is the keyword to use when the access of a method has to be restricted to only one thread at a time	ANS:		synchronized			
"Consider the following code and choose the correct option:
class Test{
 public static void parse(String str) {
   try {   int num = Integer.parseInt(str);
   } catch (NumberFormatException nfe) {
   num = 0;   } finally {   System.out.println(num);
   } }  public static void main(String[] args) {
   parse(""one"");   }"	ANS:			Compilation fails		
"public static void parse(String str) {
try {
float f = Float.parseFloat(str);
} catch (NumberFormatException nfe) {
f = 0;
} finally {
System.out.println(f);
}
}
public static void main(String[] args) {
parse(""invalid"");
}"	ANS:		Compilation fails			
"Which can appropriately be thrown by a programmer using Java SE technology to create
a desktop application?"	ANS:				NumberFormatException	
Which of the following is a checked exception?	ANS:		IOException			
"Given:
11. class A {
12. public void process() { System.out.print(""A,""); }
13. class B extends A {
14. public void process() throws IOException {
15. super.process();
16. System.out.print(""B,"");
17. throw new IOException();
18. }
19. public static void main(String[] args) {
20. try { new B().process(); }
21. catch (IOException e) { System.out.println(""Exception""); }
22. }
What is the result?"	ANS:				Compilation fails because of an error in line 14.	
Which statement is true?	ANS:	The notifyAll() method must be called from a synchronized context				
"class Trial{
public static void main(String[] args){
try{
System.out.println(""Try Block"");
} 
finally{
System.out.println(""Finally Block"");
}
} }"	ANS:		Try Block Finally Block			
"consider the code & choose the correct output:
class Threads2 implements Runnable {

  public void run() {
  System.out.println(""run."");
  throw new RuntimeException(""Problem"");
  }
  public static void main(String[] args) {
  Thread t = new Thread(new Threads2());
  t.start();
  System.out.println(""End of method."");
  }
 }"	ANS:				End of method. run. java.lang.RuntimeException: Problem	
The exceptions for which the compiler doesn’t enforce the handle or declare rule	ANS:		Unchecked exceptions			
"Consider the code below  & select the correct  ouput from the options:
public class Test{
 Integer i;
 int x; 
 Test(int y){
  x=i+y;
  System.out.println(x);
 }
public static void main(String[] args) {
 new Test(new Integer(5));
}}"	ANS:			Compiles but error at run time		
"Given:
 public class TestSeven extends Thread {
 private static int x;
 public synchronized void doThings() {
 int current = x;
 current++;
 x = current;
 }
 public void run() {
 doThings();
 }
}
Which statement is true?"	ANS:			Declaring the doThings() method as static would make the class thread-safe.		
"Consider the following code and choose the correct option:
class Test{
  static void display(){
   throw new RuntimeException();
  }  public static void main(String args[]){
      try{ display(); }catch(Exception e){
       throw new NullPointerException();}       
      finally{try{ display();         
       }catch(NullPointerException e){ System.out.println(""caught"");}
System.out.println(""exit"");}}}"	ANS:				Compiles but exception at runtime	
"Which statement is true?
A. A class's finalize() method CANNOT be invoked explicitly.
B. super.finalize() is called implicitly by any overriding finalize() method.
C. The finalize() method for a given object is called no more than once by the garbage collector.
D. The order in which finalize() is called on two objects is based on the order in which the two
objects became finalizable."	ANS:			C		
Which of the following allows a programmer to destroy an object x?	ANS:				Only the garbage collection system can destroy an object.	
"class X2 
{
    public X2 x;
    public static void main(String [] args) 
    {
        X2 x2 = new X2();  /* Line 6 */
        X2 x3 = new X2();  /* Line 7 */
        x2.x = x3;
        x3.x = x2;
        x2 = new X2();
        x3 = x2; /* Line 11 */       
    }
}

after line 11 runs, how many objects are eligible for garbage collection?"	ANS:			2		
"Given :
public class MainOne {
    public static void main(String args[]) {
      String str = ""this is java"";
      System.out.println(removeChar(str,'s'));
    }

    public static String removeChar(String s, char c) {
      String r = """";
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != c)
          r += s.charAt(i);
      }
      return r;
    }
  } What would be the result?"	ANS:				Thi i java	
"Consider the following code and choose the correct option:
public class X 
{
    public static void main(String [] args) 
    {
        X x = new X();
        X x2 = m1(x); /* Line 6 */
        X x4 = new X();
        x2 = x4; /* Line 8 */
        doComplexStuff();    }
    static X m1(X mx)     {
        mx = new X();
        return mx;    }}
After line 8 runs. how many objects are eligible for garbage collection?"	ANS:		1			
"interface interface_1 {
 void f1();
}
class Class_1 implements interface_1 {
 void f1() {
  System.out.println(""From F1 funtion in Class_1 Class"");
 }
}
public class Demo1 {
 public static void main(String args[]) {
  Class_1 o11 = new Class_1();
  o11.f1();
 }
}"	ANS:		Compile time error			
"Given:
class A {
     final void meth() {
      System.out.println(""This is a final method."");
    }
  }
   class B extends A {
    void meth() {
      System.out.println(""Illegal!"");
    }
  }
  class MyClass8{
   public static void main(String[] args) {
    A a = new A();
    a.meth();
    B b= new B();
    b.meth();
   }
  }What would be the result?"	ANS:			Compilation error		
"Which Man class properly represents the relationship ""Man has a best friend who is a Dog""?
A)class Man extends Dog { }
B)class Man implements Dog { }
C)class Man { private BestFriend dog; }
D)class Man { private Dog bestFriend; }"	ANS:				D	
"What will be the output of the program? 

class SuperClass 
{ 
    public Integer getLength() 
    {
        return new Integer(4); 
    } 
} 

public class SubClass extends SuperClass 
{ 
    public Long getLength() 
    {
        return new Long(5); 
    } 

    public static void main(String[] args) 
    { 
        SuperClass sp = new SuperClass(); 
        SubClass sb = new SubClass(); 
        System.out.println( 
        sp.getLength().toString() + "","" + sub.getLength().toString() ); 
    } 
}"	ANS:				Compilation fails	
"Consider the code below  & select the correct  ouput from the options:
abstract class Ab{ public int getN(){return 0;}}
class Bc extends Ab{ public int getN(){return 7;}}
class Cd extends Bc { public int getN(){return 47;}}
class Test{
 public static void main(String[] args) {
  Cd cd=new Cd();
  Bc bc=new Cd();
  Ab ab=new Cd();
  System.out.println(cd.getN()+"" ""+
    bc.getN()+"" ""+ab.getN()); }}"	ANS:				47 47 47	
"interface A{}
class B implements A{}
class C extends B{}
public class Test extends C{
public static void main(String[] args) {
 C c=new C();
 /* Line6 */}}

Which code, inserted at line 6, will cause a java.lang.ClassCastException?"	ANS:				A a1=(Test)c;	
"Given :
What would be the result of compiling and running the following program?
// Filename: MyClass.java
public class MyClass {
public static void main(String[] args) {
C c = new C();
System.out.println(c.max(13, 29));
}
}
class A {
int max(int x, int y) { if (x>y) return x; else return y; }
}
class B extends A{
int max(int x, int y) { return super.max(y, x) - 10; }
}
class C extends B {
int max(int x, int y) { return super.max(x+10, y+10); }
}"	ANS:				The code will compile and print 29, when run.	
"The concept of multiple inheritance is implemented in Java by

(A) extending two or more classes
(B) extending one class and implementing one or more interfaces
(C) implementing two or more interfaces
(D) all of these"	ANS:				(B) & (C)	
"Given:
interface DoMath 
{
    double getArea(int r); 
}
interface MathPlus 
{
    double getVolume(int b, int h); 
}
/* Missing Statements ? */
Select the correct missing statements."	ANS:			abstract class AllMath implements DoMath, MathPlus { public double getArea(int rad) { return rad * rad * 3.14; } }		
"Consider the following code and choose the correct option:
class A{
 void display(byte a, byte b){
  System.out.println(""sum of byte""+(a+b)); }
 void display(int a, int b){
  System.out.println(""sum of int""+(a+b)); }
  public static void main(String[] args) {
  new A().display(3, 4); }}"	ANS:			sum of int7		
"Consider the following code and choose the correct option:
interface Output{
 void display();
 void show();
}
class Screen implements Output{ 
  void display(){ System.out.println(""display""); }public static void main(String[] args) {
  new Screen().display();}}"	ANS:		Compilation error			
"class Animal {
void makeNoise() {System.out.println(""generic noise""); }
}
class Dog extends Animal {
void makeNoise() {System.out.println(""bark""); }
void playDead() { System.out.println(""roll over""); }
}
class CastTest2 {
public static void main(String [] args) {
Dog  a = (Dog) new Animal();
a.makeNoise();
}
}
consider the code above & select the proper output from the options."	ANS:	run time error				
"Consider the following code and choose the correct option:
interface employee{
 void saldetails();
 void perdetails();
}
abstract class perEmp implements employee{
 public void perdetails(){
  System.out.println(""per details""); }}
 class Programmer extends perEmp{
 public void saldetails(){
  perdetails();
  System.out.println(""sal details""); }
 public static void main(String[] args) {
  perEmp emp=new Programmer();
  emp.saldetails(); }}"	ANS:				per details sal details	
"Consider the code below  & select the correct  ouput from the options:
class A{
 static int sq(int n){
  return n*n; }}
public class Test extends A{
 static int sq(int n){
  return super.sq(n); }
 public static void main(String[] args) {
  System.out.println(new Test().sq(3)); }}"	ANS:		Compilation error			
"Given:
public static void main( String[] args ) { SomeInterface x; ... } 
Can an interface name be used as the type of a variable"	ANS:				Yes—the variable can refer to any object whose class implements the interface	
"Consider the following code and choose the correct option:
interface A{
 int i=3;} 
interface B{
 int i=4;}
class Test implements A,B{
 public static void main(String[] args) {
  System.out.println(i);
 }
}"	ANS:			compilation error		
"What is the output for the following code:
abstract class One{
private abstract void test();
}
class Two extends One{
void test(){
System.out.println(""hello"");
}}
class Test{
public static void main(String[] args){
Two obj = new Two();
obj.test();
}
}"	ANS:		compile time error			
"Consider the code below  & select the correct  ouput from the options:

class Money {
private String country = ""Canada"";
 public String getC() { return country; } }
 class Yen extends Money {
 public String getC() { return super.country; } 
 public static void main(String[] args) {
 System.out.print(new Yen().getC() ); } }"	ANS:		Compilation error			
When we use both implements & extends keywords in a single java program then what is the order of keywords to follow?	ANS:	we must use always extends and later we must use implements keyword.				
"Consider the code below & select the correct ouput from the options:
1. public class Mountain {
2. protected int height(int x) { return 0; }
3. }
4. class Alps extends Mountain {
5. // insert code here
6. }
Which five methods, inserted independently at line 5, will compile? (Choose three.)
A. public int height(int x) { return 0; }
B. private int height(int x) { return 0; }
C. private int height(long x) { return 0; }
D. protected long height(long x) { return 0; }
E. protected long height(int x) { return 0; }"	ANS:		A,C,D			
"Given:
 interface DeclareStuff {
 public static final int Easy = 3;
void doStuff(int t); }
public class TestDeclare implements DeclareStuff {
 public static void main(String [] args) {
int x = 5;
 new TestDeclare().doStuff(++x);
}
 void doStuff(int s) {
 s += Easy + ++s;
System.out.println(""s "" + s);
 }
} What is the result?"	ANS:				Compilation fails.	
"Given:
interface A { public void methodA(); }
interface B { public void methodB(); }
interface C extends A,B{ public void methodC(); } //Line 3
class D implements B {
public void methodB() { } //Line 5
}
class E extends D implements C { //Line 7
public void methodA() { }
public void methodB() { } //Line 9
public void methodC() { }
}
What would be the result?"	ANS:		If you define D e = (D) (new E()), then e.methodB() invokes the version of methodB() defined at line 9			
Which of the following statements is true regarding the super() method?	ANS:				It must be used in the first statement of the constructor.	
"Consider the following code and choose the correct option:
interface Output{
 void display();
 void show();
}
class Screen implements Output{
 void show() {System.out.println(""show"");}
  void display(){ System.out.println(""display""); }public static void main(String[] args) {
  new Screen().display();}}"	ANS:		Compilation error			
"Consider the following code and choose the correct option:
class A{
 void display(){  System.out.println(""Hello A""); }}
class B extends A{
 void display(){
  System.out.println(""Hello B""); }}
public class Test {
 public static void main(String[] args) {  
  B b=(B)  new A();
  b.display(); }}"	ANS:				Compiles but error at runtime	
"Consider the following code: 
// Class declarations:
class Super {}
class Sub extends Super {}
// Reference declarations:
Super x;
Sub y;
Which of the following statements is correct for the code: y = (Sub) x?"	ANS:		Legal at compile time, but might be illegal at runtime			
"Consider the following code and choose the correct option:
abstract class Car{
 abstract void accelerate(); 
}
class Lamborghini extends Car{
 @Override
 void accelerate() {
  System.out.println(""90 mph"");   }
  void nitroBooster(){
  System.out.print(""150 mph""); }
  public static void main(String[] args) {
  Car mycar=new Lamborghini();
  Lamborghini lambo=(Lamborghini) mycar;
  lambo.nitroBooster();}}"	ANS:	150 mph				
"Consider the following code and choose the correct option:
class A{
 void display(){  System.out.println(""Hello A""); }}
class B extends A{
 void display(){
  System.out.println(""Hello B""); }}
public class Test {
 public static void main(String[] args) {
  A a=new B();
  B b=  (B)a;
  b.display(); }}"	ANS:			Hello B		
A class Animal has a subclass Mammal. Which of the following is true:	ANS:		Because of single inheritance, Mammal can have no other parent than Animal			
"class Animal {
void makeNoise() {System.out.println(""generic noise""); }
}
class Dog extends Animal {
void makeNoise() {System.out.println(""bark""); }
void playDead() { System.out.println(""roll over""); }
}
class CastTest2 {
public static void main(String [] args) {
Animal  a = new Dog();
a.makeNoise();
}
}
consider the code above & select the proper output from the options."	ANS:			bark		
"What will be the result when you try to compile and run the following code? 
class Base1 {
 Base1() {
  int i = 100;
  System.out.println(i);
 }
}

public class Pri1 extends Base1 {
 static int i = 200;

 public static void main(String argv[]) {
  Pri1 p = new Pri1();
  System.out.println(i);
 }
}"	ANS:			100 followed by 200		
"What is the output :
interface A{
void method1();
void method2();
}
class Test implements A{
public void method1(){
System.out.println(""hello"");}}
class RunTest{
public static void main(String[] args){
Test obj = new Test();
obj.method1();
}}"	ANS:		compile error			
Given a derived class method which overrides one of it’s base class methods. With derived class object you can invoke the overridden base method using:	ANS:	super keyword				
"Consider the following code and choose the correct option:
abstract class Car{
 abstract void accelerate(); 
}class Lamborghini extends Car{
 @Override
 void accelerate() {
  System.out.println(""90 mph"");  
 } void nitroBooster(){
  System.out.print(""150 mph""); } 
 public static void main(String[] args) {
  Car mycar=new Lamborghini();
  mycar.nitroBooster(); }}"	ANS:	Compilation error				
"Given:
 class Pizza {
 java.util.ArrayList toppings;
 public final void addTopping(String topping) {
 toppings.add(topping);
 }
 }
 public class PepperoniPizza extends Pizza {
 public void addTopping(String topping) {
 System.out.println(""Cannot add Toppings"");
 }
 public static void main(String[] args) {
 Pizza pizza = new PepperoniPizza();
 pizza.addTopping(""Mushrooms"");
 }
 }
What is the result?"	ANS:	Compilation fails.				
"Consider the following code and choose the correct option:
interface console{ 
  int line=10;
 void print();}
class a implements console{
   void print(){
  System.out.print(""A"");}
 public static void main(String ar[]){
  new a().print();}}"	ANS:		Compilation error			
"Given :  

Day d;
BirthDay bd = new BirthDay(""Raj"", 25);
d = bd;   //  Line X

Where Birthday is a subclass of Day. State whether the code given at Line X is correct:"	ANS:			Yes—an object can be assigned to a reference variable of the parent type.		
Select the correct statement:	ANS:		If both a subclass and its superclass do not have any declared constructors, the implicit default constructor of the subclass will call super() when run			
Choose the correct declaration of variable in an interface:	ANS:	public final data type varaibale=intialization;				
"Consider the following code and choose the correct option:
abstract class Fun{
 void time(){
  System.out.println(""Fun Time""); }}
class Run extends Fun{
 void time(){
  System.out.println(""Fun Run""); }
 public static void main(String[] args) {
  Fun f1=new Run();
  f1.time(); }}"	ANS:			Fun Run		
"interface Vehicle{
void drive();
}
final class TwoWheeler implements Vehicle{
int wheels = 2;
public void drive(){
System.out.println(""Bicycle"");
}
}
class ThreeWheeler extends TwoWheeler{
public void drive(){
System.out.println(""Auto"");
}}
class Test{
public static void main(String[] args){
ThreeWheeler obj = new ThreeWheeler();
obj.drive();
}}
consider the code above & select the proper output from the options."	ANS:			compile error		
"Consider the following code and choose the correct option:
interface employee{
 void saldetails();
 void perdetails();
}
abstract class perEmp implements employee{
 public void perdetails(){
  System.out.println(""per details""); }}
 class Programmer extends perEmp{ 
 public static void main(String[] args) {
  perEmp emp=new Programmer();
  emp.saldetails(); }}"	ANS:			compilation error		
All data members in an interface are by default	ANS:			public ,static and final		
"Consider the following code and choose the correct option:
interface console{ 
  int line;
 void print();}
class a implements console{
   public void print(){
  System.out.print(""A"");}
 public static void main(String ar[]){
  new a().print();}}"	ANS:		Compilation error			
"Consider the code below  & select the correct  ouput from the options:

class Mountain{
 int height;
 protected Mountain(int x) {  height=x; }
 public int getH(){return height;}}

class Alps extends Mountain{
 public Alps(int h){  super(h); } 
 public Alps(){  this(100); }
 public static void main(String[] args) {
 System.out.println(new Alps().getH());
 }
}"	ANS:	100				
"Consider the given code and select the correct output: 

class SomeException {
}

class A {
public void doSomething() { }
}

class B extends A {
public void doSomething() throws SomeException { }
}"	ANS:				Compilation of class B will fail. Compilation of class A will succeed	
Is it possible if a class definition implements two interfaces, each of which has the same definition for the constant?	ANS:			Yes— either of the two variables can be accessed through : interfaceName.variableName		
Select the correct statement:	ANS:	Private methods cannot be overridden in subclasses				
"Consider the following code and choose the correct option:
class A{
 void display(){  System.out.println(""Hello A""); }}
class B extends A{
 void display(){
  System.out.println(""Hello B""); }}
public class Test {
 public static void main(String[] args) {
  A a=new B();
  B b=  a;
  b.display(); }}"	ANS:		Compilation error			
Which of the following option gives one possible use of the statement 'the name of the public class should match with its file name'?	ANS:		Helps the compiler to find the source file that corresponds to a class, when it does not find a class file while compiling			
Which of the following statement gives the use of CLASSPATH?	ANS:			Holds the location of User Defined classes, packages and JARs		
The term 'Java Platform' refers to ________________.	ANS:		Java Runtime Environment (JRE)			
Which of the following methods are needed for loading a database driver in JDBC?	ANS:			registerDriver() method and Class.forName()		
how to register driver class in the memory?	ANS:			Either forName() or registerDriver()		
"Give Code snipet:
{// Somecode
ResultSet rs = st.executeQuery(""SELECT * FROM survey"");

    while (rs.next()) {
      String name = rs.getString(""name"");
      System.out.println(name);
    }

    rs.close();
// somecode
} What should be imported related to ResultSet?"	ANS:	java.sql.ResultSet				
"Consider the following code & select the correct option for output.
String sql =""select empno,ename from emp"";  
  PreparedStatement pst=cn.prepareStatement(sql);
    System.out.println(pst.toString());
  ResultSet rs=pst.executeQuery();
   System.out.println(rs.getString(1)+ "" ""+rs.getString(2));"	ANS:			Compiles but error at run time		
Which of the following methods finds the maximum number of connections that a specific driver can obtain?	ANS:			DatabaseMetaData.getMaxConnections		
By default all JDBC transactions are autocommit. State TRUE/FALSE.	ANS:	true				
getConnection() is method available in?	ANS:	DriverManager Class				
"A) By default, all JDBC transactions are auto commit
B) PreparedStatement suitable for dynamic sql and requires one time compilation
C) with JDBC it is possible to fetch information about the database"	ANS:				All are TRUE	
What is the use of wasNull() in ResultSet interface?	ANS:		It returns true when last read column contain SQL NULL else returns false			
"Given :
public class MoreEndings {
  public static void main(String[] args) throws Exception {
    Class driverClass = Class.forName(""sun.jdbc.odbc.JdbcOdbcDriver"");
DriverManager.registerDriver((Driver) driverClass.newInstance());
// Some code
} Inorder to compile & execute this code, what should we import?"	ANS:			java.sql.Driver java.sql.DriverManager		
Which of the following method can be used to execute to execute all type of queries i.e. either Selection or Updation SQL Queries?	ANS:			execute()		
Which method will return boolean when we try to execute SQL Query from a JDBC program?	ANS:			execute()		
"Cosider the following code & select the correct output.
String sql =""select rollno, name from student""; 
  PreparedStatement pst=cn.prepareStatement(sql);
  System.out.println(pst.toString());
  ResultSet rs=pst.executeQuery();
   while(rs.next()){
   System.out.println(rs.getString(3));  }"	ANS:				Compiles but error at run time	
It is possible to insert/update record in a table by using ResultSet. State TRUE/FALSE	ANS:	true				
What is the default type of ResultSet in JDBC applications?	ANS:	Read Only, Forward Only				
An application can connect to different Databases at the same time. State TRUE/FALSE.	ANS:	true				
"A) It is not possible to execute select query with execute() method
B) CallableStatement can executes store procedures  only but not functions"	ANS:	Both A and B is FALSE				
"A) When one use callablestatement, in that case only parameters are send over network not sql query. 
B) In preparestatement sql query will compile for first time only"	ANS:		Both A and B is TRUE			
"Consider the code below  & select the correct  ouput from the options:

String sql =""select * from ?"";
  String table="" txyz "";
  PreparedStatement pst=cn.prepareStatement(sql);
  pst.setString(1,table );
  ResultSet rs=pst.executeQuery();
   while(rs.next()){
   System.out.println(rs.getString(1));  }"	ANS:			Compiles but error at run time		
Sylvy wants to develop Student management system, which requires frequent insert operation about student details.  In order to insert student record which statement interface will give good performance	ANS:			PreparedStatement		
Which of the following options contains only JDBC interfaces?	ANS:			1) Driver 2) Connection 3) ResultSet 4) ResultSetMetaData 5) Statement 6) PreparedStatement 7) Callablestatement 8) DataBaseMetaData		
"Consider the code below  & select the correct  ouput from the options:

 public class Test {
 public static void main(String [] args) {
 int x = 5;
 boolean b1 = true;
 boolean b2 = false;
 if ((x == 4) && !b2 )
 System.out.print(""1 "");
 System.out.print(""2 "");
 if ((b2 = true) && b1 )
 System.out.print(""3 ""); }"	ANS:	2 3				
"Consider  the given code and select the correct output:
class Test{  
 public static void main(String[] args){
  int num1 = 012;
  int num2 = 0x110;
  int sum =num1+=num2;   
  System.out.println(""Ans = ""+sum); }}"	ANS:		282			
"Say that class Rodent has a child class Rat and another child class Mouse. Class Mouse has a child class PocketMouse. Examine the following 

Rodent rod;
Rat rat = new Rat();
Mouse mos = new Mouse();
PocketMouse pkt = new PocketMouse();

Which one of the following will cause a compiler error?"	ANS:		pkt = rat			
"Consider the code below  & select the correct  ouput from the options:
class Test{
 public static void main(String[] args) {
  parse(""Four""); } 
 static void parse(String s){
  try {
   double d=Double.parseDouble(s);
  }catch(NumberFormatException nfe){
   d=0.0;  }finally{
   System.out.println(d);  } }}"	ANS:		Compilation error			
"Consider the code below  & select the correct  ouput from the options:
class A{
 public int a=7; 
 public void add(){
  this.a+=2; System.out.print(""a""); }}

public class Test extends A{
 public int a=2;
 public void add(){
  this.a+=2; System.out.print(""t""); }
 public static void main(String[] args) {
  A a =new Test();
  a.add();
  System.out.print(a.a); }}"	ANS:	t 7				
"What will be the output of the program? 

public class CommandArgsTwo 
{
    public static void main(String [] argh) 
    {
        int x;
        x = argh.length;
        for (int y = 1; y <= x; y++) 
        {
            System.out.print("" "" + argh[y]);
        }
    }
}

and the command-line invocation is 

> java CommandArgsTwo 1 2 3"	ANS:				An exception is thrown at runtime	
"What will be the result of the following program?
public class Init {
String title;
boolean published;
static int total;
static double maxPrice;
public static void main(String[] args) {
Init initMe = new Init();
double price;
if (true)
price = 100.00;
System.out.println(""|"" + initMe.title + ""|"" + initMe.published + ""|"" +
Init.total + ""|"" + Init.maxPrice + ""|"" + price+ ""|"");
}
}"	ANS:				The program will compile, and print |null|false|0|0.0|100.0|, when run	
"Here is the general syntax for method definition: 

accessModifier returnType methodName( parameterList )
{
  Java statements

  return returnValue;
}


What is true for the returnType and the returnValue?"	ANS:				The returnValue must be the same type as the returnType, or be of a type that can be converted to returnType without loss of information.	
"Consider the following code and choose the correct option:
class Test{ 
 class A{  static int x=3; } 
 static void display(){
  System.out.println(A.x); }
  public static void main(String[] args) {
  display(); }}"	ANS:		Compilation error			
"Consider the following code and choose the correct option: 
class Test{  
 interface Y{
  void display(); } 
 public static void main(String[] args) {
  new Y(){
   public void display(){
    System.out.println(""Hello World""); }
  }.display(); }}"	ANS:	Hello World				
"Consider the following code and choose the correct option:
class Test{ 
  static class A{  
   interface X{
    int z=4;   } } 
 static void display(){
  System.out.println(A.X.z); }
  public static void main(String[] args) {
  display(); }}"	ANS:	4				
"What is the output of the following program?
public class MyClass
{
public static void main( String[] args )
{
private static final int value =9;
float total;
total = value + value / 2;
System.out.println( total );
}
}"	ANS:				Compilation Error	
"Which of the given options is similar to the following code: 

value += sum++ ;"	ANS:	value = value + sum; sum = sum + 1;				
"What will happen if you attempt to compile and run the following code? 
Integer ten=new Integer(10);
Long nine=new Long (9);
System.out.println(ten + nine);
int i=1;
System.out.println(i + ten);"	ANS:	19 followed by 11				
"Identify the statements that are correct:
(A) int a = 13, a>>2 = 3
(B) int b = -8, b>>1 = -4
(C) int a = 13, a>>>2 = 3
(D) int b = -8, b>>>1 = -4"	ANS:	(A), (B) & (C)				
"Consider the following code: 
int x, y, z;
y = 1;
z = 5;
x = 0 - (++y) + z++;
After execution of this, what will be the values of x, y and z?"	ANS:		x = 3, y = 2, z = 6			
"Here is the general syntax for method definition: 

accessModifier returnType methodName( parameterList )
{
  Java statements

  return returnValue;
}


What is true for the accessModifier?"	ANS:		It can be omitted, but if not omitted there are several choices, including private and public			
"What will be the output of the program? 

public class CommandArgs 
{
    public static void main(String [] args) 
    {
        String s1 = args[1];
        String s2 = args[2];
        String s3 = args[3];
        String s4 = args[4];
        System.out.print("" args[2] = "" + s2);
    }
}

and the command-line invocation is 

> java CommandArgs 1 2 3 4"	ANS:				An exception is thrown at runtime	
"Consider the following code snippet: 
int i = 10;
int n = ++i%5;
What are the values of i and n after the code is executed?"	ANS:		11, 1			
Which will legally declare, construct, and initialize an array?	ANS:				int myList [] = {4, 3, 7};	
"Consider the code below  & select the correct  ouput from the options:
public class Test { 
 public static void main(String[] args) {
  int x=5;
  Test t=new Test();
  t.disp(x);
  System.out.println(""main X=""+x);
 }
void disp(int x) {
  System.out.println(""disp X = ""+x++);
 }}"	ANS:		disp X = 5 main X=5			
"How many objects and reference variables are created by the following lines of code?
Employee emp1, emp2;
emp1 = new Employee() ;
Employee emp3 = new Employee() ;"	ANS:	Two objects and three reference variables.				
"A) The purpose of the method overriding is to perform different operation, though input remains the same.
B) one of the important Object Oriented principle is the code  reusability that can be achieved using abstraction"	ANS:	Only A is TRUE				
"class Test{  
 public static void main(String[] args){
  byte b=(byte) (45 << 1);
  b+=4;
  System.out.println(b); }}
What should be the output for the code written above?"	ANS:		94			
"What is the value of y when the code below is executed?
int a = 4;
   int b = (int)Math.ceil(a % 3 + a / 3.0);"	ANS:			3		
"Consider the following code and choose the correct option:
class Test{ 
  class A{  
   interface X{
    int z=4;   } }
  static void display(){
  System.out.println(new A().X.z); }
  public static void main(String[] args) {
  display(); }}"	ANS:		Compilation error			
"Consider the code below  & select the correct  ouput from the options:
public class Test { 
 public static void main(String[] args) {
  String[] elements = { ""for"", ""tea"", ""too"" };
  String first = (elements.length > 0) ?elements[0] : null;
  System.out.println(first); }}"	ANS:			The variable first is set to elements[0].		
"Given the following piece of code:
public class Test {
public static void main(String args[]) {
int i = 0, j = 5 ;
for( ; (i < 3) && (j++ < 10) ; i++ ) {
System.out.print("" "" + i + "" "" + j );
}
System.out.print("" "" + i + "" "" + j );
}
}
what will be the output?"	ANS:	0 6 1 7 2 8 3 8				
"Given 
class MybitShift 
{
    public static void main(String [] args) 
    {
        int a = 0x5000000;
        System.out.print(a + "" and  "");
        a = a >>> 25;
        System.out.println(a);
    }
}"	ANS:				83886080 and 2	
"Consider the code below  & select the correct  ouput from the options:

public class Test {
 int squares = 81;
 public static void main(String[] args) {
 new Test().go(); }
void go() {
 incr(++squares);
 System.out.println(squares); }
 void incr(int squares) { squares += 10; } }"	ANS:				82	
"class C{
public static void main (String[] args) {
byte b1=33;              //1
b1++;                    //2
byte b2=55;              //3
b2=b1+1;                 //4
System.out.println(b1+""""+b2);
}}
Consider the code above & select the correct output."	ANS:		compile time error at line 4			
"What will be the output of the program ? 

public class Test 
{
    public static void main(String [] args) 
    {
        signed int x = 10;
        for (int y=0; y<5; y++, x--)
            System.out.print(x + "", "");
    }
}"	ANS:			Compilation fails		
"1. public class LineUp {
2. public static void main(String[] args) {
3. double d = 12.345;
4. // insert code here
5. }
6. }
Which code fragment, inserted at line 4, produces the output | 12.345|?

A. System.out.printf(""|%7f| \n"", d);
B. System.out.printf(""|%3.7f| \n"", d);
C. System.out.printf(""|%7.3d| \n"", d);
D. System.out.printf(""|%7.3f| \n"", d);"	ANS:				D	
"Consider the following code and choose the correct option:
class Test{  
 interface Y{
  void display(); } 
 public static void main(String[] args) {
  Y y=new Y(){
   public void display(){
    System.out.println(""Hello World"");   }  };
  y.display(); }}"	ANS:	Hello World				
"class Test{
public static void main(String[] args){
int var;
var = var +1;
System.out.println(""var =""+var);
}}
consider the code above & select the proper output from the options."	ANS:			does not compile		
"State the class relationship that is being implemented by the following code:
class Employee
{
private int empid;
private String ename;
public double getBonus()
{
Accounts acc = new Accounts();
return acc.calculateBonus();
}
}

class Accounts
{
public double calculateBonus(){//method's code}
}"	ANS:			Dependency		
"Given classes A, B, and C, where B extends A, and C extends B, and where all classes
implement the instance method void doIt(). How can the doIt() method in A be
called from an instance method in C?"	ANS:	It is not possible				
Which of the following will declare an array and initialize it with five numbers?	ANS:		int [] a = {23,22,21,20,19};			
"What is the output of the following: 

int a = 0;
int b = 10;

a = --b ;
System.out.println(""a: "" + a + ""  b: "" + b );"	ANS:			a: 9 b:9		
"As per the following code fragment, what is the value of a?
String s;
int a;
s = ""Foolish boy."";
a = s.indexOf(""fool"");"	ANS:	-1				
"Consider the following code snippet: 
int i = 10;
int n = i++%5;
What are the values of i and n after the code is executed?"	ANS:				11 , 0	
"Consider the following code and choose the correct output:

int value = 0;
int count = 1;
value = count++ ;
System.out.println(""value: ""+ value  + "" count: "" + count);"	ANS:				value: 1 count: 2	
"Consider the following code and select the correct output:
class Test{  
 interface Y{
  void display(); } 
 public static void main(String[] args) {
  new Y(){
   public void display(){
    System.out.println(""Hello World"");   }  };
 }}"	ANS:				Compiles but run without output	
"What is the output of the following program?
public class demo {
 public static void main(String[] args) {
 int arr[5];
 for (int i = 0; i < arr.length; i++) {
 arr[i] = arr[i] + 10;
 }
 for (int j = 0; j < arr.length; j++)
 System.out.println(arr[j]);

 }
}"	ANS:			compile time Error		
Which of the following methods registers a thread in a thread scheduler?	ANS:			start();		
"class PingPong2 {
synchronized void hit(long n) {
for(int i = 1; i < 3; i++)
System.out.print(n + ""-"" + i + "" "");
}
}
 public class Tester implements Runnable {
 static PingPong2 pp2 = new PingPong2();
 public static void main(String[] args) {
 new Thread(new Tester()).start();
 new Thread(new Tester()).start();
 }
 public void run() { pp2.hit(Thread.currentThread().getId()); }
 }
Which statement is true?"	ANS:		The output could be 6-1 6-2 5-1 5-2			
"Consider the following code and choose the correct option:
class Cthread extends Thread{  
  public void run(){
  System.out.print(""Hi"");}
public static void main (String args[]){
 Cthread th1=new Cthread();
 th1.run();
 th1.start();
th1.run();
}}"	ANS:		will print Hi Thrice			
"class Cthread extends Thread{  
  public void run(){
  System.out.print(""Hi"");}
public static void main (String args[]){
 Cthread th1=new Cthread();
 th1.run();
 th1.start();
 th1.start();
}}"	ANS:				will print Hi twice and throws exception at runtime	
"Consider the following code and choose the correct option:
class Cthread extends Thread{
   Cthread(){start();}
  public void run(){
  System.out.print(""Hi"");}
public static void main (String args[]){
 Cthread th1=new Cthread();
Cthread th2=new Cthread();
}}"	ANS:	will create two child threads and display Hi twice				
"The following block of code creates a Thread using a Runnable target: 

Runnable target = new MyRunnable();
Thread myThread = new Thread(target);

Which of the following classes can be used to create the target, so that the preceding code compiles correctly?"	ANS:	public class MyRunnable implements Runnable{public void run(){}}				
"What will be the output of the program? 

class MyThread extends Thread 
{ 
    MyThread() {} 
    MyThread(Runnable r) {super(r); } 
    public void run() 
    { 
        System.out.print(""Inside Thread "");
    } 
} 
class MyRunnable implements Runnable 
{ 
    public void run() 
    { 
        System.out.print("" Inside Runnable""); 
    } 
} 
class Test 
{  
    public static void main(String[] args) 
    { 
        new MyThread().start(); 
        new MyThread(new MyRunnable()).start(); 
    } 
}"	ANS:	Prints "Inside Thread Inside Thread"				
"A) Multiple processes share same memory location
B) Switching from one thread to another is easier than switching from one process to another
C) Thread makes it possible to maximize resource utilization
D) Process is a light weight program"	ANS:		Only B and C is TRUE			
"A) Exception is the superclass of all errors and exceptions in the java language
B) RuntimeException and its subclasses are unchecked exception."	ANS:		Only B is TRUE			
"What will be the output of the program? 

class MyThread extends Thread 
{
    public static void main(String [] args) 
    {
        MyThread t = new MyThread();
        t.start();
        System.out.print(""one. "");
        t.start();
        System.out.print(""two. "");
    }
    public void run() 
    {
        System.out.print(""Thread "");
    }
}"	ANS:		An exception occurs at runtime.			
"Consider the following code and choose the correct option:
class A implements Runnable{ int k;
public void run(){
k++; } 
public static void main(String args[]){
A a1=new A();
a1.run();}"	ANS:				a1 is not a Thread	
"Given:
 public class Threads4 {
 public static void main (String[] args) {
 new Threads4().go();
 }
 public void go() {
 Runnable r = new Runnable() {
 public void run() {
 System.out.print(""run"");
 }
 };
 Thread t = new Thread(r);
 t.start();
 t.start();
 }
 }
What is the result?"	ANS:		An exception is thrown at runtime.			
"class Thread2 {
 public static void main(String[] args) {
 new Thread2().go(); }
 public void go(){
 Runnable rn=new Runnable(){
 public void run(){
 System.out.println(""Good Day..""); } };
 Thread t=new Thread(rn);
 t.start();
 }}
what should be the correct output for the code written above?"	ANS:			The code executes normally and prints "Good Day.."		
"public class MyRunnable implements Runnable 
{
    public void run() 
    {
        // some code here
    }
}
which of these will create and start this thread?"	ANS:				new Thread(new MyRunnable()).start();	
"Consider the following code and choose the correct option:
class Nthread extends Thread{
  public void run(){
  System.out.print(""Hi"");}
  public static void main(String args[]){
   Nthread th1=new Nthread();
   Nthread th2=new Nthread();
}"	ANS:			will not create any child thread		
"Assume the following method is properly synchronized and called from a thread A on an object B:

wait(2000);

After calling this method, when will the thread A become a candidate to get another turn at the CPU?"	ANS:	After thread A is notified, or after two seconds.				
wait(), notify() and notifyAll() methods belong to ________	ANS:	Object class				
"Consider the following code and choose the correct option:
class Test {
  public static void main(String[] args) { 
  new Test().display(""hi"", 1);
  new Test().display(""hi"", ""world"", 2); }
  public void display(String... s, int x) {
  System.out.print(s[s.length-x] + "" ""); } }"	ANS:				Compilation error	
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  String name=""Anthony Gomes"";
  int a=111;
  System.out.println(name.indexOf(a));  }}"	ANS:	4				
"Given:
 String test = ""This is a test"";
 String[] tokens = test.split(""\s"");
 System.out.println(tokens.length);
What is the result?"	ANS:				Compilation fails.	
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  String data=""78"";  
  System.out.println(data.append(""abc""));   }}"	ANS:			Compilation error		
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  String name=""ALDPR7882E"";
  System.out.println(name.endsWith(""E"") & name.matches(""[A-Z]{5}[0-9]{4}[A-Z]""));}}"	ANS:		true			
"Examine this code: 

String stringA = ""Hello "";
String stringB = "" World"";
String stringC = "" Java"";
String result;
Which of the following puts a reference to ""Hello World Java"" in result?"	ANS:	result = stringA.concat( stringB.concat( stringC ) );				
"For two string objects obj1 and obj2:
A) Use of obj1 == obj2 tests whether two String object references refer to the same object
B) obj1.equals(obj2) compares the sequence of characters in obj1 and obj2."	ANS:			Both A and B is TRUE		
"What is the result of the following: 

String ring = ""One ring to rule them all,\n"";
String find = ""One ring to find them."";

if ( ring.startsWith(""One"") && find.startsWith(""One"") )
 System.out.println( ring+find );
else
 System.out.println( ""Different Starts"" );"	ANS:	One ring to rule them all, One ring to find them.				
"Consider the following code and choose the correct option:
class MyClass {
String str1=""str1"";
String str2 =""str2"";
String str3=""str3"";
str1.concat(str2);
System.out.println(str3.concat(str1));
}
}"	ANS:				The program will print str3str1,when run	
"class StringManipulation{
public static void main(String[] args){
String str = new String(""Cognizant"");
str.concat("" Technology"");
StringBuffer sbf = new StringBuffer("" Solutions"");
System.out.println(str+sbf);
}}
consider the code above & select the proper output from the options."	ANS:			Cognizant Solutions		
"What does this code write: 

StringTokenizer stuff = new StringTokenizer( ""abc def+ghi"", ""+"");
System.out.println( stuff.nextToken() );
System.out.println( stuff.nextToken() );"	ANS:		abc def ghi			
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  StringBuffer sb = new StringBuffer(""antarctica"");
      sb.delete(0,6);
      System.out.println(sb); }}"	ANS:	tica				
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  String name=""vikaramaditya"";
  System.out.println(name.substring(2, 5).toUpperCase().charAt(2));}}"	ANS:			R		
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  StringBuffer sb = new StringBuffer(""antarctica"");
      sb.reverse();     
      sb.replace(2, 7, ""c"");      
      sb.delete(0,2);
      System.out.println(sb); }}"	ANS:			ctna		
"Consider the following code and choose the correct option:
class Test {
 public static void main(String args[]) {
 String s1 = ""abc"";
 String s2 = ""def"";
 String s3 = s1.concat(s2.toUpperCase( ) );
 System.out.println(s1+s2+s3); } }"	ANS:			     abcdefabcDEF		
"What will be the result when you attempt to compile and run the following code?. 
public class Conv
 {
    public static void main(String argv[]){
 Conv c=new Conv();
 String s=new String(""ello"");
 c.amethod(s);
    }

    public void amethod(String s){
 char c='H';
 c+=s;
 System.out.println(c);
    }
}"	ANS:				Compile time error	
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  String name=""Anthony Gomes"";
  System.out.println(name.replace('n', name.charAt(3)).compareTo(name));  }}"	ANS:	-6				
"Consider the following code and choose the correct option:
class Test {
 public static void main(String args[]) {
 String name=new String(""batman"");
 int ibegin=1;
 char iend=3;
 System.out.println(name.substring(ibegin, iend));
 } }"	ANS:		at			
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  StringBuffer sb=new StringBuffer(""YamunaRiver"");
  System.out.println(sb.capacity()); }}"	ANS:		27			
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  StringBuffer sb = new StringBuffer(""antarctica"");
      sb.reverse();     
      sb.insert(4, 'r');      
      sb.replace(2, 4, ""c"");      
      System.out.println(sb); }}"	ANS:				accrcratna	
"A)A string buffer is a mutable sequence of characters.
B) sequece of characters in the string buffer can not be changed."	ANS:	Only A is TRUE				
"Examine this code: 

String stringA = ""Wild"";
String stringB = "" Irish"";
String stringC = "" Rose"";
String result;

Which of the following puts a reference to ""Wild Irish Rose"" in result?"	ANS:	result = stringA.concat( stringB.concat( stringC ) );				
"Consider the following code and choose the correct option:
class Test {
  public static void main(String[] args) { 
  new Test().display(1,""hi"");
  new Test().display(2,""hi"", ""world"" ); }
  public void display(int x,String... s) {
  System.out.print(s[s.length-x] + "" ""); }}"	ANS:	hi hi				
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  String name=""vikaramaditya"";  System.out.println(name.codePointAt(2)+name.charAt(3));  }}"	ANS:		204			
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  String data=""7882"";
  data+=32;  System.out.println(data);   }}"	ANS:			788232		
"Which code can be inserted at Line X to print ""Equal""?
public class EqTest{
  public static void main(String argv[]){
   EqTest e=new EqTest();
  }

 EqTest(){
   String s=""Java"";
   String s2=""java"";
   // Line X
    {
    System.out.println(""Equal"");
    }else
    {
    System.out.println(""Not equal"");
   }
  }
}"	ANS:			if(s.equalsIgnoreCase(s2))		
"import java.io.*;
public class MyClass implements Serializable {
private int a;
public int getA() { return a; }
publicMyClass(int a){this.a=a; }
private void writeObject( ObjectOutputStream s)
throws IOException {
// insert code here
}
}

Which code fragment, inserted at line 15, will allow Foo objects to be
correctly serialized and deserialized?"	ANS:			s.defaultWriteObject();		
Which of the following opens the file "myData.stuff" for output first deleting any file with that name?	ANS:		FileOutputStream fos = new FileOutputStream( "myData.stuff")			
"import java.io.*;
public class MyClass implements Serializable {

private Tree tree = new Tree();

public static void main(String [] args) {
MyClass mc= new MyClass();
try {
FileOutputStream fs = new FileOutputStream(”MyClass.ser”);
ObjectOutputStream os = new ObjectOutputStream(fs);
os.writeObject(mc); os.close();
} catch (Exception ex) { ex.printStackTrace(); }
} }"	ANS:	Compilation fails				
"Consider the following code and choose the correct option:
class std implements Serializable{
 int call; std(int c){call=c;}
 int getCall(){return call;}
}
public class Test{
  public static void main(String[] args) throws IOException {
   File file=new File(""d:/std.txt"");
  FileOutputStream fos=new FileOutputStream(file);
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  std s1=new std(10);
  oos.writeObject(s1);
  oos.close();
  }}"	ANS:	the state of the object s1 will be store to file std.txt				
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) throws IOException {  
  File file=new File(""D:/jlist.lst"");
  byte buffer[]=new byte[(int)file.length()+1];
  FileInputStream fis=new FileInputStream(file);
  int ch=0;
  while((ch=fis.read())!=-1){
   System.out.print(ch); } }}"	ANS:			reads data from file named jlist.lst in byte form and ascii value		
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) throws IOException {  
  File file=new File(""D:/jlist.lst"");
  byte buffer[]=new byte[(int)file.length()+1];
  FileInputStream fis=new FileInputStream(file);
  int ch=0;
  while((ch=fis.read())!=-1){
   System.out.print((char)ch); } }}"	ANS:	reads data from file one byte at a time and display it on the console.				
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  File file=new File(""d:/prj/lib"");
  file.mkdirs();}}"	ANS:	creates directory d:/prj/lib				
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) throws IOException {  
  String data=""Confidential info"";
  byte buffer[]=data.getBytes();
  FileOutputStream fos=new  FileOutputStream(""d:/temp"");
  for(byte d : buffer){
   fos.write(d);  } }}"	ANS:	writes data to file in byte form.				
"Consider the following code and choose the correct option:
class std{
 int call; std(int c){call=c;}
 int getCall(){return call;}
}
public class Test{
  public static void main(String[] args) throws IOException {
   File file=new File(""d:/std.txt"");
  FileOutputStream fos=new FileOutputStream(file);
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  std s1=new std(10);
  oos.writeObject(s1);
  oos.close();
  }}"	ANS:			Compiles but error at run time		
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {  
  File file=new File(""D:/jlist.lst"");
  byte buffer[]=new byte[(int)file.length()+1];
  FileInputStream fis=new FileInputStream(file);
  fis.read(buffer);
  System.out.println(buffer);
 }
}"	ANS:		Compilation error			
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) throws IOException {  
  File file=new File(""D:/jlist.lst"");
  byte buffer[]=new byte[(int)file.length()+1];
  FileInputStream fis=new FileInputStream(file);
  fis.read(buffer);
  System.out.println(new String(buffer)); }}"	ANS:	reads data from file named jlist.lst in byte form and display it on console.				
What happens when the constructor for FileInputStream fails to open a file for reading?	ANS:		throws a FileNotFoundException			
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) {
  File file=new File(""d:/prj,d:/lib"");
  file.mkdirs();}}"	ANS:				Compiles and executes but directories are not created	
"Consider the following code and choose the correct output:
public class Person{
public void talk(){ System.out.print(""I am a Person ""); }
}
public class Student extends Person {
public void talk(){ System.out.print(""I am a Student ""); }
}
what is the result of this piece of code:
public class Test{
public static void main(String args[]){
Person p = new Student();
p.talk();
}
}"	ANS:		I am a Student			
"Which of these are two legal ways of accessing a File named ""file.tst"" for reading. Select the correct option:
A)FileReader fr = new FileReader(""file.tst""); 
B)FileInputStream fr = new FileInputStream(""file.tst"");
C)InputStreamReader isr = new InputStreamReader(fr, ""UTF8""); 
D)FileReader fr = new FileReader(""file.tst"", ""UTF8"");"	ANS:				A,B	
What is the DataOutputStream method that writes double precision floating point values to a stream?	ANS:				writeDouble()	
"Consider the following code and choose the correct option:
public class Test{
  public static void main(String[] args) {
  File dir = new File(""dir"");
  dir.mkdir();
  File f1 = new File(dir, ""f1.txt"");  try {
  f1.createNewFile();  } catch (IOException e) { ; }
  File newDir = new File(""newDir"");
  dir.renameTo(newDir);}  }"	ANS:				The file system has a directory named newDir, containing a file f1.txt	
"Consider the following code and choose the correct option:
public class Test {
 public static void main(String[] args) throws IOException {
  File file=new File(""d:/data"");
  byte buffer[]=new byte[(int)file.length()+1];
  FileInputStream fis=new FileInputStream(file);
  fis.read(buffer);
  FileWriter fw=new FileWriter(""d:/temp.txt"");
  fw.write(new String(buffer));}}"	ANS:				Compiles and runs but content not transferred to the temp.txt	
"import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class MoreEndings {
public static void main(String[] args) {
try {
FileInputStream fis = new FileInputStream(""seq.txt"");
InputStreamReader isr = new InputStreamReader(fis);
int i = isr.read();
while (i != -1) {
System.out.print((char)i + ""|"");
i = isr.read();
}
} catch (FileNotFoundException fnf) {
System.out.println(""File not found"");
} catch (EOFException eofe) {
System.out.println(""End of stream"");
} catch (IOException ioe) {
System.out.println(""Input error"");
}
}
}
Assume that the file ""seq.txt"" exists in the current directory, has the required
access permissions, and contains the string ""Hello"".
Which statement about the program is true?"	ANS:				The program will compile, print H|e|l|l|o|, and then terminate normally.	
"Consider the following code and choose the correct option:
public class Test{
  public static void main(String[] args) throws IOException {
  File file = new File(""d:/temp.txt"");
  FileReader reader=new FileReader(file);
  reader.skip(7);  int ch;
  while((ch=reader.read())!=-1){
   System.out.print((char)ch);  }  }}"	ANS:	Skip the first seven characters and then starts reading file and display it on console				
"A file is readable but not writable on the file system of the host platform. What will
be the result of calling the method canWrite() on a File object representing this file?"	ANS:		The boolean value false is returned			
Which of following set of functions are example of method overloading	ANS:			void add(int x,int y) char add(char x,char y)		
What is the advantage of runtime polymorphism?	ANS:			Code flexibility at runtime		
Which of the following is an example of  IS A relationship?	ANS:	Ford - Car				
Which of the following is not a valid relation between classes?	ANS:		Segmentation			
Which of the following is not an attribute of object?	ANS:				Identity	
"Given: 
int a = 5;
int b = 5;
int c = 5;
if (a > 3)
if (b > 4)
if (c > 5)
c += 1;
else
c += 2;
else
c += 3;
c += 4;
What is the value of variable c after executing the following code?"	ANS:					11
How can you force garbage collection of an object?	ANS:					Garbage collection cannot be forced
Which of the following defines a legal abstract class?	ANS:					abstract class Vehicle { abstract void display(); }
"Which of the following lines of code will compile without warning or error? 
1) float f=1.3; 
2) char c=""a""; 
3) byte b=257; 
4) boolean b=null; 
5) int i=10;"	ANS:					Line 5
"Given : 
import java.io.*;
 public class ReadingFor {
 public static void main(String[] args) {
 String s;
 try {
 FileReader fr = new FileReader(""myfile.txt"");
 BufferedReader br = new BufferedReader(fr);
 while((s = br.readLine()) != null)
 System.out.println(s);
 br.flush();
  } catch (IOException e) { System.out.println(""io error""); }
 }
}
And given that myfile.txt contains the following two lines of data:
ab
cd
What is the result?"	ANS:					Compilation Error
