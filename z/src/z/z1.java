	private String username;
	private int password;
	private double zhye;
	private double jye;
public void hy() {
	System.out.println("开户请输1");
	System.out.println("存款请输2");
	System.out.println("取款请输3");
	System.out.println("退出请输4");
	}
//开户
public void kh() {
	this.zhye=zhye;
	System.out.println("请输入账户名：");
	Scanner s=new Scanner(System.in);
	String username=s.next();
	System.out.println("请输入密码：");
	int password=s.nextInt();
	pdmm();
	System.out.println(username+"开户成功，账户余额为："+zhye);
	
}
//存款
public void ck() {
	System.out.println("请输入存款金额：");
	Scanner s=new Scanner(System.in);
	double jye=s.nextDouble();
	zhye=zhye+jye;
	System.out.println("存款"+jye+"账户余额为："+zhye);
}
//取款
public void qk() {
	System.out.println("请输入取款金额：");
	Scanner s=new Scanner(System.in);
	double jye=s.nextDouble();
	zhye=zhye-jye;
	if(zhye<0) {
		System.out.println("账户余额不足，账户余额为"+(zhye+jye));
	}
	else {
	System.out.println("取款"+jye+"账户余额为："+zhye);
	}
}
//判断密码
public void pdmm() {
	if(this.password!=password) {
		System.out.println("密码错误，还有2次机会重输密码");
	}
}
//退出
public void tc(){
	System.out.println("请携带好随身物品，欢迎下次光临");
}
}

Yhyw y=new Yhyw();
System.out.println("欢迎来到瑞士银行");
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