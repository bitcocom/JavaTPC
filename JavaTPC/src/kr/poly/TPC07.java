package kr.poly;
public class TPC07 {
	public static void main(String[] args) {
       int a=20;
       float b=56.7f;
       // a+b=?
       float v=sum(a,b); //Call By Value
       System.out.println(v); // 76.7
       
       int[] arr= {1,2,3,4,5};
       int vv=arrSum(arr); // Call By Reference(¹øÁö)
       System.out.println(vv); // 15
	}
	
	private static int arrSum(int[] a) {
		int hap=0;
		for(int i=0;i<a.length;i++) {
			hap+=a[i];
		}		
		return hap;
	}

	public static float sum(int a, float b) {
		float v=a+b;
		return v;
	}
	
	
}
