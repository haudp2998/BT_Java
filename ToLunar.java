/**
 * Converting from Solar Year to Lunar Year
 * Updated date: Aug 22, 2018
 * @author A.Prof. Tran Van Lang, PhD
 */

public class ToLunar{
	int y;
	String canChi;
	ToLunar( int year ){
		y = year;
		String can[] = { "Quy","Giap","At","Binh","Dinh","Mau","Ky","Canh","Tan","Nham" };
		String chi[] = { "Hoi","Ty","Suu","Dan","Mao","Thin","Ti","Ngo","Mui","Than","Dau","Tuat" };
		canChi = can[(y-3) % 10] + " " + chi[(y-3) % 12];
	}
	public String getLunarYear(){
		return canChi;
	}
	public int getYear(){
		return y;
	}
}