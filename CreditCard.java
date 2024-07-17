 public class CreditCard extends bankcard// sub class of parent class//
{
    //instance variable//
    
    private int CVC_number;
    private double Credit_limit;
    private double Interest_rate;
    private String Expiration_date;
    private int Grace_period;
    private boolean isGranted;
    //constructor//
    
    public CreditCard(int cardID,String clientName,String issuerBank,String bankAccount,int balanceAmount,int CVC_number,double Interest_rate,String Expiration_date)
    {
         super(balanceAmount,cardID,issuerBank,bankAccount);
         super.setclientName(clientName);
         super.setbalanceAmount(balanceAmount);
         this.CVC_number=CVC_number;
         this.Interest_rate=Interest_rate;
         this.Expiration_date=Expiration_date;
         this.isGranted=false;
         
    }
    //getter method//
        public int getCVC_number(){
        return this.CVC_number;
    }
        public double getInterest_rate(){
         return this.Interest_rate;  
    }   
        public String getExpiration_date(){
        return this.Expiration_date;
    }
         public double getCredit_limit(){
        return this.Credit_limit;
    }
        public boolean getisgranted(){
        return this.isGranted;    
    }
    //setCreditlimit method//
        public void setCreditlimit(double Credit_limit,int Grace_period){
        if(Credit_limit<=2.5*(getbalanceAmount()))
        {
            this.Credit_limit=Credit_limit;
            this.Grace_period=Grace_period;
            this.isGranted=true;
            System.out.print("  credit card is issued ");
        }
        else
        {
            System.out.print(" Sorry! credit card cannot be issued ");
        }
    }
    //cancelCreditCard method//
        public void cancelCreditCard(){
        this.CVC_number=0;
        this.Credit_limit=0;
        this.Grace_period=0;
        this.isGranted=false;
    } 
    //DISPLAY method//
       public void DISPLAY(){
        if(isGranted==true)
        {
             super.display();
            System.out.println("Your credit limit is "+Credit_limit);
            System.out.println("Your CVC number is "+getCVC_number());
            System.out.println("Your Interest rate is "+getInterest_rate());
            System.out.println("Your Grace period is "+Grace_period);
            System.out.println("Your credit will expire on "+getExpiration_date());
            
        }       
         else
         {
            super.display();
            System.out.println("Your CVC number is "+CVC_number);
            System.out.println("Sorry! Your Credit is not granted"); 
         }
     }
}
//end//