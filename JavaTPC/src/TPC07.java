public class TPC07 {
	public static void main(String[] args) {
		int a=20;
		float b=56.7f;
		// a+b=?
        float v=sum(a,b); // Call By Value(값)
        System.out.println(v); // 76.7
        
        int[] arr= {1,2,3,4,5};
        // 배열의 총합=?
        int vv=arrSum(arr); // Call By Reference(번지)
        System.out.println(vv); // 15
	}
	private static int arrSum(int[] x) {
		int hap=0;
		for(int i=0;i<x.length;i++) {
			hap+=x[i];			
		}
		return hap;
	}
	public static float sum(int a, float b) {
		float v=a+b;
		return v;		
	}
}
