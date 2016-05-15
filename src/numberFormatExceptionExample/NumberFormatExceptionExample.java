package numberFormatExceptionExample;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		int num;
		String data="Rohit";
		try{
			num=Integer.parseInt(data);
			System.out.println(num);	
		}
		catch (NumberFormatException e) {
			
			// TODO: handle exception
			System.out.println("yor trying to prase string to int,it is exception not pharse");
		}
		
		
	}

}
