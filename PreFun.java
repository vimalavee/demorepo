package tech;

import java.util.function.*;

@FunctionalInterface
interface Demo
{
	void sample();
}
@FunctionalInterface
interface Demo1 extends Demo
{
	void sample();
	static void method()
	{
		System.out.println("satatic method");
	}
	 default int method2()
	{
		return 1000;
	}
}
public class PreFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Demo1 d=()->System.out.println("demo");
	d.sample();
	Demo1.method();
	System.out.println(d.method2());
	
	
	Predicate<Integer> p=a->a>10;
	System.out.println(p.test(2));
	
	BiPredicate<Integer,String> bp=(i,s)->i<s.length();
	System.out.println(bp.test(10,"java"));
	System.out.println(bp.test(5, "program"));

	
	Function<String,String> f=g->g;
	System.out.println(f.apply("java8"));
	
	
	BiFunction<String,Integer,String> bf=(s1,i1)->s1+i1;
	System.out.println(bf.apply("java", 8));
	
	
	Consumer<String> c=c1->System.out.println(c1+"Predefined functional interface");
	c.accept("hello");
	
	BiConsumer<String,Integer> c2=(c3,c4)->System.out.println(c3+" "+c4+" class");
	c2.accept("java", 8);
	
	
	Supplier<String> s2=()->"Hiii";
	System.out.println(s2.get());
	
	UnaryOperator<Integer> u=u1->u1;
	System.out.println(u.apply(500));
	
	BinaryOperator<String> bo=(j,l)->j.concat(l);
	System.out.println(bo.apply("The  ", "end"));
	
	}
}
