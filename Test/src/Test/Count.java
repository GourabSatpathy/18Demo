package Test;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		StringBuilder sd=new StringBuilder();
		for(String st : s.split("(?<=(.))(?!\\1)")) {
//		for(String st : sd.toString().split("(?<=(.))(?!\\\\1)")){
			sd.append(st.charAt(0));
			if(st.length()>1) {
				sd.append(st.length());
			}
			System.out.println(sd.toString());
		}
	}
}
