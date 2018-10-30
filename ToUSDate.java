/**
 * Converting from VN Date to US Date
 * Updated date: Oct 12, 2018
 * @author A.Prof. Tran Van Lang, PhD
 */

public class ToUSDate{
	int d, m, y;
	String date;
	public ToUSDate( int d, int m, int y ){
		String month[] = {"Jan","Feb","Mat","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		date = month[m-1] + " " + d + ", " + y;
	}
	public String getUSDate(){
		return date;
	}
	public int getDay(){
		return d;
	}
	public int getMonth(){
		return m;
	}
	public int getYear(){
		return y;
	}
}
