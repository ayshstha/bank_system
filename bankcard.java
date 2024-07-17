public class bankcard// parent class bankcard//
{
    //instance variable//
    
    private int cardID;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
     //constructor //
     
    public bankcard(int balanceAmount,int cardID,String issuerBank,String bankAccount)
        {
        this.clientName="";
        this.balanceAmount=balanceAmount;
        this.cardID=cardID;
        this.issuerBank= issuerBank;
        this.bankAccount=bankAccount;
    }
    // getter method //
    
        public int getcardId(){
        return this.cardID;
    }
        public String getClientName(){
        return this.clientName;
    }
        public String getissuerBank(){
        return this.issuerBank;
    }
        public String getbankAccount(){
        return this.bankAccount;
    }
        public int getbalanceAmount(){
        return this.balanceAmount;
    }
    //setter method//
    
        public void setclientName(String clientName){
        this.clientName=clientName;
    }
        public void setbalanceAmount(int balanceAmount){
        this.balanceAmount=balanceAmount;
    }
    //display method//
        public void display()
    {
        if(clientName=="")
        {
            System.out.println("Your name is not provided,Please provide your name.");
        }
        else{
            System.out.println("Hello "+getClientName());
            System.out.println("Welcome to the ATM of "+getissuerBank());
            System.out.println("Your Account no. is "+getbankAccount());
            System.out.println("Your cardID no. is "+getcardId());
            System.out.println("Your Current Balance is "+getbalanceAmount());
        }
    
        
    }
}
//end //DD