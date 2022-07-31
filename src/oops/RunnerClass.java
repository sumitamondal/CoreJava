package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Employee E1 = new Employee();
		
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display();
		
		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.Display();

     Bank B=new Bank();
     B.DisplayBalance();
     int Bal =B.GetBalance();
     
     System.out.println("The Balance is "+ Bal);
     System.out.println("The Balance is "+ B.GetBalance());
	
     BOABank B1=new BOABank();
     B1.CCBalance();
     B1.DisplayBalance();
     
     OverLoadingExample obj=new OverLoadingExample();
     int RecArea=obj.GetArea(4,5);
     int SqArea=obj.GetArea(5);
     double CircleArea=obj.GetArea(5.62d);
     System.out.println("The area of Rec is "+RecArea);
     System.out.println("The area of Square is "+SqArea);
     System.out.println("The area of circle is "+CircleArea);
     
     
     B1.CloseAccount(123456);
     B.CloseAccount(1234);
     
     Chrome ch=new Chrome();
     ch.OpenBrowser();
     
     Browser Br=new Chrome();
     Br.OpenBrowser();
     Br.CloseBrowser();
     Br.DisplayName();
     
     
     
     HondaCar car1=new HondaCar();
     
     CarInterface car2=new HondaCar();
     
     
     
     
     EncapsulationExample En=new EncapsulationExample();
     En.setBalane(3000);
     System.out.println("The Balance is " + En.getBalane());
     
     
	}

}
