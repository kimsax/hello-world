package cn.txt.test;
/**
 * 自动装箱 拆箱
 * @author 30979
 *
 */
public class TestAutoBox {
    public static void main(String[] args) {
    	Integer a = 234;
    	int b = a;
    	
    	Integer c = null;
    /*	if(c!=null) {
    		int d = c; //自动拆箱 调用c.intValue()
    	}*/
    	
    	//缓存[-128，127]之间的数字 
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
