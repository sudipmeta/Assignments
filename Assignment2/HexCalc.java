package Assignment2;
import java.util.*;
public class HexCalc {
	private int deciNum1 = 0, deciNum2 = 0;
	public static HashMap<Character, Integer> value = new HashMap<Character,Integer>();
    public void initValue(){
    	value.put('0', 0);
    	value.put('1', 1);
    	value.put('2', 2);
    	value.put('3', 3);
    	value.put('4', 4);
    	value.put('5', 5);
    	value.put('6', 6);
    	value.put('7', 7);
    	value.put('8', 8);
    	value.put('9', 9);
    	value.put('A', 10);
    	value.put('B', 11);
    	value.put('C', 12);
    	value.put('D', 13);
    	value.put('E', 14);
    	value.put('F', 15);
    }
	
	HexCalc(String n1,String n2, int base){
		this.initValue();
		this.deciNum1 = toDecimal(n1, base);
		this.deciNum2 = toDecimal(n2, base);
		System.out.println("Decimal Values: "+deciNum1+" , "+deciNum2);
		
	}
	public static int toDecimal(String s, int base){
		int num = 0,i,len=s.length();
		for(i=0;i<len;i++){
			num+=value.get(s.charAt(i))* Math.pow(base, len-i-1);
		}
		return num;
	}

	private static String toHex(int n){
		return Integer.toHexString(n);
	}
	private String addNum(){
		int temp = deciNum1+deciNum2;
		return (HexCalc.toHex(temp)+ " // decimal value " + temp);
	}
	
	private String subNum(){
		int temp = deciNum1-deciNum2;
		return (HexCalc.toHex(temp)+ " // decimal value " + temp);
	}
	
	private String mulNum(){
		int temp = deciNum1*deciNum2;
		return (HexCalc.toHex(temp)+ " // decimal value " + temp);
	}
	
	private String divNum(){
			int temp = deciNum1/deciNum2;
			return (HexCalc.toHex(temp)+ " // decimal value " + temp);
	}
	private boolean checkEquals(){
		if(deciNum1==deciNum2){
			return true;
		}else{
			return false;
		}	
	}
	private boolean checkGreater(){
		if(deciNum1>deciNum2){
			return true;
		}else{
			return false;
		}
	}
	private boolean checkSmaller(){
		if(deciNum1<deciNum2){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		String a,b;
		int base;
		System.out.println("Enter two number: ");
		a=input.nextLine();
		b=input.nextLine();
		System.out.println("Enter base");
		base = input.nextInt();
		input.close();
		HexCalc obj = new HexCalc(a,b,base);
		System.out.println("\nSum is: "+obj.addNum());
		System.out.println("Subtraction is: "+obj.subNum());
		System.out.println("Multiply is: "+obj.mulNum());
		System.out.println("Division is: "+obj.divNum());
		System.out.println("\nNumbera 1 == Number 2: "+obj.checkEquals());
		System.out.println("Number 1 > Number 2: "+obj.checkGreater());
		System.out.println("Number 1 < Number 2: "+obj.checkSmaller());	
	}
}