public class TPC04 {
	public static void main(String[] args) {
       // 4. �����͸� �̵��϶�(���� VS �迭)
	   int a,b,c;
	   a=10;
	   b=20;
	   c=30;
	   // a+b+c=? �޼��� ó��-> hap()
	   hap(a,b,c);
	   
	   int[] arr=new int[3];
	   arr[0]=a;
	   arr[1]=b;
	   arr[2]=c;
	   
	   hap1(arr);
	}
    public static void hap(int x, int y, int z) {
    	    	int sum=x+y+z;
    	    	System.out.println(sum);
    }
    public static void hap1(int[] x) {
    	 // �ݺ��� Ȱ�� - for, while
    	 //int sum=x[0]+x[1]+x[2];
    	 int sum=0;
    	 for(int i=0;i<x.length;i++) {
    		 sum+=x[i];    		 
    	 }
    	 System.out.println(sum);
    }    
}
