package exception1;

import java.util.InputMismatchException;

/*
 	异常：
 		我们的Java程序也是会存在不正常的情况的，这些不正常的情况
 		我们就统称为异常
 	异常体系：
 		------|Throwable
 		---------|Error
 		---------|Exception
 		
 	Throwable常用方法：
 		toString（）   //显示异常类名和产生异常原因
 		getMessage（）   //显示异常原因，不显示类名
 		printStackTrace（）//用来跟踪异常事件发生时堆栈的内容
 */
public class Demo1 {
	public static void main(String [] args) {
		/*Throwable throwable = new Throwable("laji");
		String t = throwable.toString();
		String t1 = throwable.getMessage();
		//String t2 = throwable.printStackTrace();
		System.out.println(t);   //java.lang.Throwable   包名+类名 =  完整类名
		System.out.println(t1); 
		//System.out.println(t2); */
		tes(-1);
	}
	public static void tes(int a){
		/*Throwable throwable = new Throwable("laji");
		throwable.printStackTrace();*/
		try{
			if(a<1||a>4) {
				System.out.println("n");
			}
		}catch(InputMismatchException e) {
			System.out.println("In");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
