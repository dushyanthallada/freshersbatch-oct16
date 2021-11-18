package assignment_2;
class Bank{

    void totalMoneyInBank()
    {
        System.out.println("The Employee incremented salary is :" );
    }
}
class SavingAcoount extends Bank{
    float fixedDeposits =150000;
    void totalMoneyInBank()
    {
        System.out.println("total money in savings account :" +((fixedDeposits)));
    }
}
class CurrentAcccount extends SavingAcoount{
    double cashCredit=59000;
    void totalMoneyInBank()
    {
        System.out.println("The total money in current account "+(cashCredit));
    }
}
public class TotalCash {

	public static void main(String[] args) {
		CurrentAcccount m=new CurrentAcccount();
        SavingAcoount s=new SavingAcoount();


        
        m.totalMoneyInBank(); 
        s.totalMoneyInBank(); 

        System.out.println("Total money in the bank  is "+( m.fixedDeposits+m.cashCredit));

	}

}
