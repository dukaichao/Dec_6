package exception1;
/*
 	�쳣����֮�׳�����
 	�׳�����  ��throw  ��   throws��
 	
 	
 	�׳�����Ҫע���ϸ�ڣ�
 		1.���һ���������ڲ��׳�һ������ʱ���쳣������ô����Ҫ�ڷ����������׳�
 		2.���������һ�������׳�����ʱ���쳣�ķ�������ô�����߱���Ҫ�����쳣
 		3.���һ�������ڲ��׳�һ���쳣������ôthrow������Ĵ��붼����ִ�С�
 			��һ����������throw�ؼ��֣�Ҳ����ִ�к������䣩
 		4.��һ������£�ֻ���׳�һ�������쳣
 	��ʱʹ���׳�������ʱ������ԭ����ʲô��
 		1.�������Ҫ֪ͨ�������ߣ������������⣬��ô��ʱ���ʹ���׳�����
 		2.�������ʱֱ�����û��򽻵��ε��쳣ǧ��Ҫ���ף����׵Ļ����͸����û�
			��ʱ���Ҫ�ò�����
 */
public class Demo3 {
	public static void main(String [] args) {
		try{
			div(4,0);
		}catch(Exception e) {
			System.out.println("�����쳣");
			e.printStackTrace();
		}
	}
	public static void div(int a,int b) throws Exception{
		if(b == 0) {
			throw new Exception();//�׳�һ���쳣����
		}
		int c = a/b;
		System.out.println(c);
	}
}
