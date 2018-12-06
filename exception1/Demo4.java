package exception1;
/*
 finally块：
	finally块的使用前提是必须要存在try块才能使用
*/
public class Demo4 {
	public static void main(String [] args) {
		div(4,0);
	}
	
	public static void div(int a,int b) {
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("出现除数为0的异常");
		}finally {
			System.out.println("finally块代码执行了");
		}
	}
}
