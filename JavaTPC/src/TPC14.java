import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
      
		MemberVO m=new MemberVO();
		
		m.setName("ȫ�浿");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("����");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr()+"\t");
		/*
		m.name="ȫ�浿";
		m.age=1000;
		m.tel="010-1111-1111";
		m.addr="����";
		
		System.out.print(m.name+"\t");
		System.out.print(m.age+"\t");
		System.out.print(m.tel+"\t");
		System.out.println(m.addr+"\t"); */
		
		

	}
}
