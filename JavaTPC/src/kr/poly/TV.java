package kr.poly;
public class TV implements RemoCon{
	int currCH=70;
	@Override
	public void chUp() {
		// 100  < 100
		if(currCH<RemoCon.MAXCH) {
		  currCH++;	
		  System.out.println("TV의 채널이 올라간다.:"+currCH);
		}else {
		  currCH=1;	
		  System.out.println("TV의 채널이 올라간다.:"+currCH);
		}
	}
	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
		   currCH--;	
		   System.out.println("TV의 채널이 내려간다.:"+currCH);
		}else {
		   currCH=100;
		   System.out.println("TV의 채널이 내려간다.:"+currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("인테넷이 된다.");
	}
	// 추가적인 기능을 구현....
}
