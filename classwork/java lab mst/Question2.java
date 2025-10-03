class BankAccount {
    private int accNo, pin;
    private double balance;
    private String holderName;

    BankAccount(int accNo,String holderName,double balance,int pin){
        this.accNo=accNo; this.holderName=holderName; this.balance=balance; this.pin=pin;
    }
    public double getBalance(int p){return (p==pin)?balance:0;}
    public void deposit(double amt,int p){if(p==pin) balance+=amt;}
    public void withdraw(double amt,int p){if(p==pin && amt<=balance) balance-=amt;}
}

public class Question2 {
    public static void main(String[] args){
        BankAccount acc=new BankAccount(101,"Charvy",5000,1234);

        acc.deposit(1000,1234);             
        acc.withdraw(2000,1234);           
        System.out.println("Balance: "+acc.getBalance(1234)); 
    }
}