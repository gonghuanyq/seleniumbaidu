	private String username;
	private int password;
	private double zhye;
	private double jye;
public void hy() {
	System.out.println("��������1");
	System.out.println("�������2");
	System.out.println("ȡ������3");
	System.out.println("�˳�����4");
	}
//����
public void kh() {
	this.zhye=zhye;
	System.out.println("�������˻�����");
	Scanner s=new Scanner(System.in);
	String username=s.next();
	System.out.println("���������룺");
	int password=s.nextInt();
	pdmm();
	System.out.println(username+"�����ɹ����˻����Ϊ��"+zhye);
	
}
//���
public void ck() {
	System.out.println("���������");
	Scanner s=new Scanner(System.in);
	double jye=s.nextDouble();
	zhye=zhye+jye;
	System.out.println("���"+jye+"�˻����Ϊ��"+zhye);
}
//ȡ��
public void qk() {
	System.out.println("������ȡ���");
	Scanner s=new Scanner(System.in);
	double jye=s.nextDouble();
	zhye=zhye-jye;
	if(zhye<0) {
		System.out.println("�˻����㣬�˻����Ϊ"+(zhye+jye));
	}
	else {
	System.out.println("ȡ��"+jye+"�˻����Ϊ��"+zhye);
	}
}
//�ж�����
public void pdmm() {
	if(this.password!=password) {
		System.out.println("������󣬻���2�λ�����������");
	}
}
//�˳�
public void tc(){
	System.out.println("��Я����������Ʒ����ӭ�´ι���");
}
}

Yhyw y=new Yhyw();
System.out.println("��ӭ������ʿ����");
y.hy();
int a=0;
while(a<4) {
Scanner s=new Scanner(System.in);
a=s.nextInt();
switch(a) {
case 1:
	y.kh();
	y.hy();
	break;
case 2:
	y.ck();
	y.hy();
	break;
case 3:
	y.qk();
	y.hy();
}
}
y.tc();
}
}