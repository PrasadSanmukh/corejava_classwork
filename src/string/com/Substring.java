package string.com;

public class Substring {

	public static void main(String[] args) {
		 String s="hello i am prasad";
		 System.out.println(s.substring(5));
		 System.out.println(s.substring(10,17));
		 System.out.println(s.replace('s','m'));
		 System.out.println(s.replaceAll("am","was"));
		 String s1="prasad";
		 String s2="pramad";
		 String s3="prasad";
		 System.out.println(s1.equals(s2));
		 System.out.println(s1==s3);
		 String number="143";
		 int num=Integer.parseInt(number);
		 System.out.println(num);
			int a=456;
			String x=String.valueOf(a);
			System.out.println(x.concat(number));
			
			
			StringBuffer sb=new StringBuffer("Pras");
			sb=sb.append("ad");
			System.out.println(sb);
			StringBuilder sb1=new StringBuilder("pra");
			sb1=sb1.append("mad");
			System.out.println(sb1);
	}

}
