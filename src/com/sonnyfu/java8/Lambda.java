package com.sonnyfu.java8;

<<<<<<< HEAD
import java.util.Comparator;

/**
 * 
 * @author sonny
 * 1 简化回调模式
 * 
 */
public class Lambda {
	   public static void main(String args[]){
		    Lambda tester = new Lambda();
		    
		    //表达实例  
		    MathOperation add_noLambda=new MathOperation() {
				
				@Override
				public int operation(int a, int b) {
					return a+b;
				}
			};
		      
		      // 类型声明
		      MathOperation addition = (int a, int b) -> a + b;
		        
		      // 不用类型声明
		      MathOperation subtraction = (a, b) -> a - b;
		        
		      // 大括号中的返回语句
		      MathOperation multiplication = (int a, int b) -> { return a * b; };
		        
		      // 没有大括号及返回语句
		      MathOperation division = (int a, int b) -> a / b;
		      System.out.println("没用到lambda的回调模式 10 + 5 = " + tester.operate(10, 5, add_noLambda));
		      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		      System.out.println("另一种表达式10 + 5 = " + addition.operation(10, 5));
		      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		        
		      // 不用括号
		      GreetingService greetService1 = message ->
		      System.out.println("Hello " + message);
		        
		      // 用括号
		      GreetingService greetService2 = (message) ->
		      System.out.println("Hello " + message);
		        
		      greetService1.sayMessage("Runoob");
		      greetService2.sayMessage("Google");
		      
		      /***************************************/
		      
		      int num = 1;  
		      Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
		      s.convert(2);
		      //num = 5;不能修改num,因为前面的num自带隐形的final 
		      
		      String first = "";  
		      //lambda的参数不能和外部变量同名，改成third不报错
		      Comparator<String> comparator = (third,second) -> Integer.compare(first.length(), second.length());
		      
		   }
		    
		   interface MathOperation {
		      int operation(int a, int b);
		   }
		    
		   interface GreetingService {
		      void sayMessage(String message);
		   }
		    
		   private int operate(int a, int b, MathOperation mathOperation){
		      return mathOperation.operation(a, b);
		   }
		   
		   //变量作用域
		    public interface Converter<T1, T2> {
		        void convert(int i);
		    }		   
}
