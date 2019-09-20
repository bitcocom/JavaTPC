import kr.infrine.IntArray;

public class TPC36 {
	public static void main(String[] args) {
        // 정수 3개를 배열에 저장하고 출력하시오.
		int[] a=new int[3];		
		a[0]=10;
		a[1]=20;
		a[2]=30;		
		int v=a[1];		
		int len=a.length;		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//-------------------------------------
		IntArray arr=new IntArray(5); // 10
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
}
