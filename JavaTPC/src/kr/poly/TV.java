package kr.poly;
public class TV implements RemoCon{
	int currCH=70;
	@Override
	public void chUp() {
		// 100  < 100
		if(currCH<RemoCon.MAXCH) {
		  currCH++;	
		  System.out.println("TV�� ä���� �ö󰣴�.:"+currCH);
		}else {
		  currCH=1;	
		  System.out.println("TV�� ä���� �ö󰣴�.:"+currCH);
		}
	}
	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
		   currCH--;	
		   System.out.println("TV�� ä���� ��������.:"+currCH);
		}else {
		   currCH=100;
		   System.out.println("TV�� ä���� ��������.:"+currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("���׳��� �ȴ�.");
	}
	// �߰����� ����� ����....
}
