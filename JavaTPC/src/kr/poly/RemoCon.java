package kr.poly;
public interface RemoCon { // 객체생성X ; RemoCon r=new RemoCon();
   // final static(상수)를 사용가능
   public int MAXCH=100; // RemoCon.MAXCH
   public final static int MINCH=1;  // RemoCon.MINCH
   // 추상메서드
   public void chUp();
   public void chDown();
   public void internet() ;
}
