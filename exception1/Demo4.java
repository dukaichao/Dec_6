package exception1;
/*
 finally�飺
	finally���ʹ��ǰ���Ǳ���Ҫ����try�����ʹ��
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
			System.out.println("���ֳ���Ϊ0���쳣");
		}finally {
			System.out.println("finally�����ִ����");
		}
	}
}
