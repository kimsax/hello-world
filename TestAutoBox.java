package cn.txt.test;
/**
 * �Զ�װ�� ����
 * @author 30979
 *
 */
public class TestAutoBox {
    public static void main(String[] args) {
    	Integer a = 234;
    	int b = a;
    	
    	Integer c = null;
    /*	if(c!=null) {
    		int d = c; //�Զ����� ����c.intValue()
    	}*/
    	
    	//����[-128��127]֮������� 
    	Integer in1 = Integer.valueOf(-128);
    	Integer in2 = -128;
    	System.out.println(in1 == in2);
    	System.out.println(in1.equals(in2));
    	System.out.println("###########");
    	Integer in3 = 1234;
    	Integer in4 = 1234;
    	System.out.println(in3 == in4);
    	System.out.println(in3.equals(in4));
    }
}
