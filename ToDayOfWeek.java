/**
 * Converting from Date to Day of Week
 * Updated date: Aug 22, 2018
 * @author A.Prof. Tran Van Lang, PhD
 */

public class ToDayOfWeek{
	int d, m, y;
	String date;
	ToDayOfWeek( int d, int m, int y ){
		String Days[] = {"Saturday","Sunday","Monday","Tuesday","Wenesday","Thurday","Friday"};
		int year = y, A;
		if ( m < 3 ){
			year--;
			m += 12;
		}
		A = d + 2*m + 3*(m+1)/5 + y + year/4 - year/100 + year/400 + 2; 
		date = Days[A%7];
	}
	public String getDayOfWeek(){
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