package exception1;
/*
 	异常体系：
 		------|Throwable  所有异常或者错误类的超类
 		---------|Error   错误
 		---------|Exception   异常
 	jvm运行到a/b这个语句时，发现b为0，除数为0在我们的现实生活中是属于不正常
 	情况的，jvm一旦发现这种不正常的情况是后，那么jvm就会马上创建一个对应的异常
 	对象；并且会调用这个异常对象的printStackTrance的方法处理异常
 		
 	异常的处理：
 		方式一：捕获处理
 				捕获处理格式：
 					try{
 						可能发生异常的代码
 					}catch（捕获的异常类型 变量名）{
 						处理异常的代码....
 					}
 			
 				
 			捕获处理要注意的细节：
 				1.如果try块中代码出了异常经过了处理之后那么try——catch代码可以正常执行
 				2.如果try快中出现了异常代码，那么try块中出现异常代码后面的代码是不会执行的
 				3.一个try块后面可以跟多个catch块的，也就是一个try块可以捕获多种异常的类型
 				4.一个try块可以捕获多种异常的类型，但是捕获类型必须从小到大进行捕获，否则编译报错
 				
 		方式二：抛出处理
 */
public class Demo2 {
	public static void main(String [] args) {
		div(4,0);
	}
	public static void div(int a,int b) {
		int c = 0;
		try {
			c = a/b;
			System.out.println("哈哈哈，能执行吗？");
		}catch(ArithmeticException e) {
			//处理异常的代码
			System.out.println("异常处理了....");
			System.out.println("toString :"+e.toString());
		}catch(Exception e) {
			System.out.println("hahah");
		}
		
		
		System.out.println(+c);
	}
}