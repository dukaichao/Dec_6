package exception1;
/*
 	异常处理之抛出处理
 	抛出处理  （throw  和   throws）
 	
 	
 	抛出处理要注意的细节：
 		1.如果一个方法的内部抛出一个编译时的异常对象，那么必须要在方法上声明抛出
 		2.如果调用了一个声明抛出编译时的异常的方法，那么调用者必须要处理异常
 		3.如果一个方法内部抛出一个异常对象，那么throw语句后面的代码都不在执行。
 			（一个方法遇见throw关键字，也不会执行后面的语句）
 		4.在一种情况下，只能抛出一种类型异常
 	何时使用抛出处理？何时捕获处理？原则是什么？
 		1.如果你需要通知到调用者，你代码出了问题，那么这时候就使用抛出处理
 		2.如果代码时直接与用户打交道晕倒异常千万不要再抛，再抛的话，就给了用户
			这时候就要用捕获处理
 */
public class Demo3 {
	public static void main(String [] args) {
		try{
			div(4,0);
		}catch(Exception e) {
			System.out.println("出现异常");
			e.printStackTrace();
		}
	}
	public static void div(int a,int b) throws Exception{
		if(b == 0) {
			throw new Exception();//抛出一个异常对象
		}
		int c = a/b;
		System.out.println(c);
	}
}
