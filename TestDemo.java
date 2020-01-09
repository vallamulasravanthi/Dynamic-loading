import java.lang.reflect.*;
class TestDemo
{

public static void main(String args[])
{
try
{
Class c = Class.forName(args[0]);
Class c1 = Class.forName(args[1]);
Constructor constructor =
        c.getConstructor(new Class[]{String.class});
Object ob = constructor.newInstance("10");
System.out.println("The name of constructor is " + 
                            constructor.getName()); 
  
 constructor =
        c.getConstructor(new Class[]{int.class,int.class});
 ob = constructor.newInstance(10,20);
System.out.println("The name of constructor is " + 
                            constructor.getName()); 
  constructor =
        c.getConstructor(new Class[]{int.class,int.class,String.class});
 ob = constructor.newInstance(10,20,"abc");
System.out.println("The name of constructor is " + 
                            constructor.getName()); 
  


Method[] methods = c.getMethods(); 
for (Method method:methods) 
            System.out.println(method.getName()); 
Method methodcall1 = c.getDeclaredMethod("setValues", 
                                                 String.class); 
methodcall1.invoke(ob, "abc"); 
  
methodcall1 = c.getDeclaredMethod("setValues", int.class,int.class,
                                                 String.class); 
methodcall1.invoke(ob, 10,20,"abc"); 

methodcall1 = c.getDeclaredMethod("setValues", 
                                                 int.class,int.class); 
methodcall1.invoke(ob,10,20);   
  
  Field[] field = c.getDeclaredFields(); 
for(Field f:field){
f.setAccessible(true);
System.out.println(f);
  }
Field f = c.getDeclaredField("a");
f.setAccessible(true);
f.set(ob, 20);
 methodcall1 = c.getDeclaredMethod("printValueOfA"); 
                                               
methodcall1.invoke(ob); 

 f = c.getDeclaredField("b");
f.setAccessible(true);
f.set(ob, 30);
 methodcall1 = c.getDeclaredMethod("printValueOfB"); 
                                               
methodcall1.invoke(ob);

f = c.getDeclaredField("c");
f.setAccessible(true);
f.set(ob,"def");
 methodcall1 = c.getDeclaredMethod("printValueOfC"); 
                                               
methodcall1.invoke(ob);


//Object ob1 = c1.newInstance();


Constructor constructor1 =
        c1.getConstructor(new Class[]{int.class});
Object ob1 = constructor1.newInstance(10);
System.out.println("The name of constructor is " + 
                            constructor1.getName()); 
  
 constructor1 =
        c1.getConstructor(new Class[]{int.class,int.class});
 ob1 = constructor1.newInstance(10,20);
System.out.println("The name of constructor is " + 
                            constructor1.getName()); 
  constructor1 =
        c1.getConstructor(new Class[]{int.class,int.class,int.class});
 ob1 = constructor1.newInstance(10,20,30);
System.out.println("The name of constructor is " + 
                            constructor1.getName()); 
  


Method[] methods1 = c1.getMethods(); 
for (Method method:methods1) 
            System.out.println(method.getName()); 
 methodcall1 = c1.getDeclaredMethod("setValues", 
                                                 int.class); 
methodcall1.invoke(ob1, 20); 
  
methodcall1 = c1.getDeclaredMethod("setValues", int.class,int.class,
                                                 int.class); 
methodcall1.invoke(ob1, 10,20,30); 

methodcall1 = c1.getDeclaredMethod("setValues", 
                                                 int.class,int.class); 
methodcall1.invoke(ob1,10,20);   
  
  Field[] field2 = c1.getDeclaredFields(); 
for(Field f3:field2){
f3.setAccessible(true);
System.out.println(f3);
  }
Field f2 = c1.getDeclaredField("x");
f2.setAccessible(true);
f2.set(ob1, 20);
 methodcall1 = c1.getDeclaredMethod("printX"); 
                                               
methodcall1.invoke(ob1); 

 f2 = c1.getDeclaredField("y");
f2.setAccessible(true);
f2.set(ob1, 30);
 methodcall1 = c1.getDeclaredMethod("printY"); 
                                               
methodcall1.invoke(ob1);

f2 = c1.getDeclaredField("z");
f2.setAccessible(true);
f2.set(ob1,40);
 methodcall1 = c1.getDeclaredMethod("printZ"); 
                                               
methodcall1.invoke(ob1);

}
catch(NoSuchFieldException e)
{

System.out.println(e);
}
catch(NoSuchMethodException e)
{

System.out.println(e);
}
catch(InvocationTargetException e)
{

System.out.println(e);
}
catch(ClassNotFoundException e)
{

System.out.println(e);

}
catch(InstantiationException e)
{

System.out.println(e);

}
catch(ArrayIndexOutOfBoundsException e)
{

System.out.println(e);

}
catch(IllegalAccessException e)
{

System.out.println(e);

}

}



}
 public class Test
{
int a,b;
String c;
public Test()
{
System.out.println("no arg constructor called");
}
public Test(String c)
{
this.c=c;
System.out.println("1 arg constructor called");
System.out.println(c);
}
public Test(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("2 arg constructor called");
System.out.println(a);
System.out.println(b);
}
public Test(int a,int b,String c)
{
this.a=a;
this.b=b;
this.c=c;
System.out.println("3 arg constructor called");
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
public void setValues(int a,int b,String name)
{

System.out.println("3 arg method called");
this.a = a;
this.b = b;
this.c = name;


}
public void setValues(int a,int b)
{
this.a = a;
this.b = b;

System.out.println("2 arg method called");

}
public void setValues(String name)
{

System.out.println("1 arg methood called");
this.c = name;

}
public void printValueOfA()
{

System.out.println(this.a);



}
public void printValueOfB()
{

System.out.println(this.b);



}
public void printValueOfC()
{

System.out.println(this.c);



}

}
public class Test2 {
	public int x;
	public int y;
	public int z;
	
	public Test2(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Three arguments constuctor call"+x +y +z);
	}
	public Test2(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		System.out.println("Two arguments constuctor call" +x +y);
	}
	public Test2(int x) {
		
		this.x = x;
		System.out.println("one arguments constuctor call" +x);
	}
	public void printX() {
		System.out.println(x);
	}
	public void setValues(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
       System.out.println("Three arguments method call"+x +y +z);
	}
	public void printY() {
		System.out.println(y);
	}
	public void setValues(int y,int z) {
		this.y = y;
		this.z = z;
       System.out.println("Two arguments method call"+ y +z);
	}
	public void printZ() {
		System.out.println(z);
	}
	public void setValues(int z) {
		this.z = z;
        System.out.println("One argument method call"+z);
	
	}
	

}
