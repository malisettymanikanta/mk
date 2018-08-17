Which of the following declarations are correct?(Choose TWO)ANS:->String s=“null”;int i=new Integer(“56”);"Which statements, when inserted at (1), will not result in compile-time errors?

public class ThisUsage {
	int planets;
	static int suns;

	public void gaze() {
		int i;
// (1) INSERT STATEMENT HERE
	}}"	ANS:->	i = this.planets;	i = this.suns;			this.suns = planets;

	Choose the
	meta annotations.(Choose THREE)
	ANS:->
	Retention Documented
	Target
Select
	the variable
	which are
	in java.lang.annotation.RetentionPolicy class.(Choose THREE)ANS:->
	SOURCE RUNTIME
	CLASS
Select
	the Uses
	of annotations.(Choose THREE)ANS:->
	Information For
	the Compiler
	Compile time
	and deploytime
	processing	Runtime processing"TreeSet<String> s = new TreeSet<String>();
	TreeSet<String> subs = new TreeSet<String>();s.add(""a"");s.add(""b"");s.add(""c"");s.add(""d"");s.add(""e"");

	subs=(TreeSet)s.subSet(""b"",true,""d"",true);s.add(""g"");s.pollFirst();s.pollFirst();s.add(""c2"");System.out.println(s.size()+""""+subs.size());"	ANS:->		The size of s is 5	The size of subs is 3		
	Which of
	the following
	statements are true
	regarding wrapper classes?(Choose TWO)ANS:->
	Double has

	a compareTo() method		Byte extends Number	
Which of these statements are true?	ANS:->	HashTable is a sub class of Dictionary			Stack is a subclass of Vector	
Which statements are true about maps? (Choose TWO)	ANS:->		Changes made in the Set view returned by keySet() will be reflected in the original map		All keys in a map are unique	
Choose TWO correct options:	ANS:->	OutputStream is the abstract superclass of all classes that represent an outputstream of bytes.	Subclasses of the class Reader are used to read character streams.			
Which  are true with respect to finally block? (Choose THREE)	ANS:->	Used to release the resources which are obtained in try block.	Writing finally block is optional.	When an exception occurs then a part of try block will execute one appropriate catch block and finally block will be executed.		When no exception occurs then complete try block and finally block will execute but no catch block will execute.
Which of the following statements are true? (Choose TWO)	ANS:->		The wait() method is overloaded to accept a duration	A thread will resume execution as soon as its sleep duration expires.		Both wait() and notify() must be called from a synchronized context.
Choose TWO correct options:	ANS:->			The main() method of a program can declare that it throws checked exception	A method declaring that it throws a certain exception class may throw instances of any subclass of that exception class	
Which of the following methods are static?	ANS:->			yield()	sleep()	
Which of the following statements regarding static methods are correct? (2 answers)	ANS:->		static methods can be called using an object reference to an object of the class in which this method is defined.		static methods do not have direct access to non-static methods which are defined inside the same class.	
"In the given code snippet
try { int a = Integer.parseInt(""one""); }
what is used to create an appropriate catch block? (Choose all that apply.)
A. ClassCastException
B. IllegalStateException
C. NumberFormatException
D. IllegalArgumentException"	ANS:->		NumberFormatException		IllegalArgumentException	
Which two can be used to create a new Thread?	ANS:->	Implement java.lang.Runnable and implement the run() method.	Extend java.lang.Thread and override the run() method.			
"Given two programs:
1. package pkgA;
2. public class Abc {
3. int a = 5;
4. protected int b = 6;
5. public int c = 7;
6. }

3. package pkgB;
4.

import pkgA.*;5.

public class Def {
	6.
	public static void main(String[] args) {
		7. Abc f=new Abc();8. System.out.print(""""+f.a);9. System.out.print(""""+f.b);10. System.out.print(""""+f.c);11.
	}12.}

	What is
	the result
	when the
	second program
	is run?(Choose all
	that apply)"	ANS:->				Compilation fails with an error on line 8	Compilation fails with an error on line 9"Given the following program,which statements are true? (Choose TWO)Public

	class Exception {
 public static void main(String[] args) {
   try {
  if(args.length == 0) return;
System.out.println(args[0]);
}finally {
System.out.println(""The end"");
}}}"	ANS:->		If run with no arguments,the program will produce "The end"			If run with one arguments,the program will print the given argument followed by "The end"
Which statements
	describe guaranteed
	behaviour of
	the garbage
	collection and
	finalization mechanisms?(Choose TWO)ANS:->

	The finalize() method will never be called more than once on an object	An object will not be garbage collected as long as it possible for a live thread to access it through a reference.	
"Given the following classes and declarations, which statements are true?
// Classes
class A {
private int i;
public void f() { /* ... */ }
public void g() { /* ... */ }
}
class B extends A{
public int j;
public void g() { /* ... */ }
}
// Declarations:
A a = new A();
B b = new B();
Select the three correct answers."	ANS:->	The B class is a subclass of A.	The statement b.f(); is legal		The statement a.g(); is legal	
"Which declaration can be inserted at (1) without causing a compilation error?

	interface MyConstants {
		int r = 42;
		int s = 69;
// (1) INSERT CODE HERE
	}"	ANS:->		final double circumference = 2 * Math.PI * r;		int AREA = r * s;	"Given:11.

	class ClassA {
	}12.

	class ClassB extends ClassA {
	}13.

	class ClassC extends ClassA {
	}and:21.

	ClassA p0 = new ClassA();22.
	ClassB p1 = new ClassB();23.
	ClassC p2 = new ClassC();24.
	ClassA p3 = new ClassB();25.
	ClassA p4 = new ClassC();
	Which TWO
	are valid?(Choose two.)"	ANS:->	p0 = p1;		p1 = (ClassB)p3;		"Given the following classes and declarations, which statements are true?

// Classes
	class Foo {
		private int i;

		public void f() {
			/* ... */ }

		public void g() {
			/* ... */ }
	}

	class Bar extends Foo {
		public int j;

		public void g() {
			/* ... */ }
	}

// Declarations:
	Foo a = new Foo();
	Bar b = new Bar();"	ANS:->	The Bar class is a subclass of Foo.		The statement b.f(); is legal.		
	Which of
	these field
	declarations are
	legal in an interface?(
	Choose all applicable)ANS:->
	public int answer = 42;
	final static int answer = 42;
	private final static int answer = 42;
	public static int answer = 42;

	Which of
	the following
	is correct for an abstract class.(
	Choose TWO)ANS:->An

	abstract class is
	one which
	contains general
	purpose methods An

	abstract class is
	one which
	contains some
	defined methods
	and some
	undefined methods
	Which of
	the following are true
	about packages?(Choose 2)ANS:->
	Packages can
	contain both
	Classes and

	Interfaces (Compiled Classes)	Packages can contain non-java elements such as images, xml files etc.		
Which of the following options give the valid argument types for main() method? (Choose 2)	ANS:->				String[] args	String args[]
Which of the following options give the valid package names? (Choose 3)	ANS:->	dollorpack.$pack.$$pack	$$.$$.$$	_score.pack.__pack		
Which of the following statements are true regarding java.lang.Object class? (Choose 2)	ANS:->			Object class has the core methods for thread synchronization	Object class provides the method for Set implementation in Collection framework	
"class CreateFile{
public static void main(String[] args) {
try {
File directory = new File(""c""); //Line 13
File file = new File(directory,""myFile"");
if(!file.exists()) {
file.createNewFile();  //Line 16
}}
catch(IOException e) {
e.printStackTrace }
}}}
If the current direcory does not consists of directory ""c"", Which statements are true ? (Choose TWO)"	ANS:->		An exception is thrown at runtime	Line 13 creates a File object named “c”		
Which three are legal array declarations? (Choose THREE)	ANS:->	int [] myScores [];	char [] myChars;		Dog myDogs [];	
Which of the following are correct variable names? (Choose TWO)	ANS:->			int _;	int $abc;	
Which  of the following methods are defined in class Thread? (Choose TWO)	ANS:->	start()			run()	
Which of the following statements can be used to create a new Thread? (Choose TWO)	ANS:->	Extend java.lang.Thread and override the run() method.			Implement java.lang.Runnable and implement the run() method	
"Given:
public class Theory {
public static void main(String[] args) {
String s1 = ""abc"";
String s2 = s1;
s1 += ""d"";
System.out.println(s1 + "" "" + s2 + "" "" + (s1==s2));

StringBuffer sb1 = new StringBuffer(""abc"");
StringBuffer sb2 = sb1;
sb1.append(""d"");
System.out.println(sb1 + "" "" + sb2 + "" "" + (sb1==sb2));
}
}
Which are true? (Choose all that apply.)"	ANS:->			The first line of output is abcd abc false		The second line of output is abcd abcd true
