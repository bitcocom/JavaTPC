package kr.poly;
public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("Radio ä���� �ö󰣴�.");
	}

	@Override
	public void chDown() {
		System.out.println("Radio ä���� ��������.");
	}

	@Override
	public void internet() {
		System.out.println("Radio�� ���ͳ��� �������� �ʴ´�.");
	}

}
