import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tim = in.next();
	   String[] time = tim.split(":");

		String hours = time[0];
		String minutes = time[1];
		String seconds = time[2].substring(0,2);
		String dayEve = time[2].substring(2,4);
		if(dayEve.equals("AM")){
			System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
		}else{
			System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
		}
	}
}
