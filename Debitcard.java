      public class Debitcard extends bankcard//sub class of parent class//
{
    //instance variable //
    
    private int PINnumber;
    private int Withdrawal_Amount;
    private String Date_of_Withdrawal;
    private boolean hasWithdrawn;
    //constructor//
    
    public Debitcard(int PINnumber,int balance_amount,int cardID,String bankAccount,String issuerBank,String clientName)
    {
        super(balance_amount,cardID,issuerBank,bankAccount);
        this.PINnumber=PINnumber;
        super.setclientName(clientName);
        this.hasWithdrawn=false;
    
    }
    //getter method//
    
        public int getPINnumber(){
        return this.PINnumber;
    }
        public int getWithdrawal_Amount(){
        return this.Withdrawal_Amount;
    }
        public String getDate_of_Withdrawal(){
        return this.Date_of_Withdrawal;
    }
        public boolean gethasWithdrawn(){
        return this.hasWithdrawn;
    }
    //setter method//
    
        public void setWithdrawal_Amount(int Withdrawal_Amount){
        this.Withdrawal_Amount=Withdrawal_Amount;
    }
    //withdraw method//
    
public void Withdraw(int Withdrawal_Amount,String Date_of_Withdrawal,int PINnumber){
            if(this.PINnumber==PINnumber)
        {
            if(Withdrawal_Amount<=getbalanceAmount()){
            System.out.print("Your withdrawn amount is "+getWithdrawal_Amount());
            this.hasWithdrawn=true;
            setbalanceAmount(getbalanceAmount()-Withdrawal_Amount);
            this.Withdrawal_Amount=Withdrawal_Amount;
            this.Date_of_Withdrawal=Date_of_Withdrawal;
        }
        else
        {
            System.out.print(" Sorry! insufficent balance ");
            
        }
        }
        else
        {
            System.out.print(" Incorrect PIN number" );
        }
        }
        //display method//
         public void Display(){
        if(hasWithdrawn==false)
        {
                System.out.println(" Your current amount is "+getbalanceAmount());
            
        }
         else
        {
                super.display();
                System.out.println("you withdrawed RS."+getWithdrawal_Amount());
                System.out.println(" On Date "+getDate_of_Withdrawal());
                System.out.println( "your PIN number is "+getPINnumber());
        }
             
        }
    } 
    //end//
