import java.io.IOException;

public class Ibis {

	public static void main(String[] args) {
	try {
		Integer x =100;
	//Car c = new Car();
	
	String s = new String("This is session in JAVA");
	System.out.print(s);
	s.concat("And apex   \r");
	System.out.print(s.charAt(10));
	StringBuffer sb = new StringBuffer("This is session in JAVA");
	System.out.print(sb);
	sb.append("And apex   \r");
	System.out.print(sb);
	
	
		
	
	//	c.getobjectval();
		//throw new IOException("ERror in IO");
	//	System.out.print(x/0);
		
	}catch(Exception e) {
		System.out.print(e.getMessage() +e.getClass());
	}finally {
		System.out.print("Send email to team about error");
	}

	}

}
