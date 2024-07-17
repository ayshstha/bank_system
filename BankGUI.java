import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.*;

public class BankGUI implements ActionListener{
    //instance variable 
    //Jframe
    private JFrame Front,Debitframe,Creditframe,WITHDRAWframe,CREDITLIMITframe;
    //JPannel
    private JPanel header,Debitheader,Creditheader,Withdrawheader,CreditLimitheader,Body,DebitBody,CreditBody,Withdrawbody,CreditLimitBody;
    //JLabel
    private JLabel NABIL,Slogan,WelcomeMsg,SelectOption,DEBITCARD,clientname,cardid,issuerbank,bankaccount,pinnumber,balanceamount,CREDITCARD,clientnameC,cardidC,
    issuerbankC,bankaccountC,balanceamountC,cvc,expirationdate,interestrate,cardidW,withdrawalamtw,dateofwithdrawalW,pinnumberW,withdrawcash,withdrawcashinfo,cardidCL,
    creditlimitA,graceperiodCL,creditlimitB,creditlimitinfo;
    //JTextField
    private JTextField clientnametxt,cardidtxt,issuerbanktxt,bankaccounttxt,pinnumbertxt,balanceamounttxt,clientnametxtC,cardidtxtC,issuerbanktxtC,bankaccounttxtC,
    balanceamounttxtC,cvctxtC,interestratetxtC,cardidWtxt,withdrawalamtwtxt,pinnumberWtxt,cardidCLTXT,creditlimitCLTXT,graceperiodCLTXT;
    //JButton
    private JButton DEBIT,CREDIT,withdrawamount,display,clear,back,adddebitcard,displayC,clearC,backC,creditlimit,addcreditcard,cancelcredit,clearW,backW,withdraw,
    clearCL,backCL,setcreditlimitCl;
    //font
    private Font NABILfont,Sloganfont,WelcomeMsgfont,Selectoptionfont,DEBITCARDfont,CREDITCARDfont,withdrawcashfont,withdrawcashinfofont,creditlimitBfont,creditlimitinfofont;  
    //JComboBox
    private JComboBox<String>expiration_date_yearC,expiration_date_monthsC,expiration_date_daysC,withdrawal_date_yearD,withdrawal_date_monthsD,withdrawal_date_daysD;
    //creating arraylist
    private  ArrayList<bankcard> userinfo = new ArrayList<bankcard>();

    public BankGUI(){
         //initializing panel and frame
        Front= new JFrame();
        Debitframe= new JFrame();
        Creditframe = new JFrame();
        WITHDRAWframe= new JFrame();
        CREDITLIMITframe= new JFrame();
        header= new JPanel();
        Debitheader= new JPanel();
        Creditheader= new JPanel();
        Body= new JPanel();
        DebitBody= new JPanel();
        CreditBody= new JPanel();
        Withdrawbody=new JPanel();
        CreditLimitBody=new JPanel();
        CreditLimitheader = new JPanel();
        Withdrawheader= new JPanel();
        
        
        
        
        
        /////////////////////////////////////////////////  CREDITFrame INFO  //////////////////////////////////////////////////////////
        //setting frame Creditframe
        //setting label of Creditbody
        CREDITCARD=new JLabel("CREDIT CARD");
        CREDITCARDfont = new Font("Arial", Font.BOLD, 18);
        CREDITCARD.setFont(CREDITCARDfont);
        clientnameC =new JLabel("Client Name-");
        cardidC =new JLabel("Card ID-");
        issuerbankC = new JLabel("Issuer Bank-");
        bankaccountC = new JLabel("Bank Account-");       
        balanceamountC = new JLabel("Balance Amount-");
        cvc = new JLabel("CVC Number-");  
        expirationdate= new JLabel("Expiration Date-");
        interestrate= new JLabel("Interest Rate-");
        //setting bounds for label of Credittbody
        CREDITCARD.setBounds(242,120,180,30);
        clientnameC.setBounds(35,180,80,30);
        cardidC.setBounds(330,180,80,30);
        issuerbankC.setBounds(35,260,80,30);
        bankaccountC.setBounds(330,260,120,30);
        balanceamountC.setBounds(35,340,120,30);
        cvc.setBounds(330,340,120,30);
        expirationdate.setBounds(35,420,120,30);
        interestrate.setBounds(330,420,120,30);
        //adding label to pannel CreditBody
        CreditBody.add(CREDITCARD);
        CreditBody.add(clientnameC);
        CreditBody.add(cardidC);
        CreditBody.add(issuerbankC);
        CreditBody.add(bankaccountC);
        CreditBody.add(balanceamountC);
        CreditBody.add(cvc);
        CreditBody.add(expirationdate);
        CreditBody.add(interestrate);
        
        //setting textfield to pannel CreditBody
        clientnametxtC= new JTextField("");
        cardidtxtC= new JTextField("");
        issuerbanktxtC = new JTextField("");
        bankaccounttxtC = new JTextField("");
        balanceamounttxtC= new JTextField("");
        cvctxtC= new JTextField("");
        interestratetxtC= new JTextField("");
        //setting bounds for textField of pannel CreditBody
        clientnametxtC.setBounds(65,215,180,30);
        cardidtxtC.setBounds(365,215,180,30);
        issuerbanktxtC.setBounds(65,295,180,30);
        bankaccounttxtC.setBounds(365,295,180,30);
        balanceamounttxtC.setBounds(65,375,180,30);
        cvctxtC.setBounds(365,375,180,30);
        interestratetxtC.setBounds(365,455,180,30);
        //adding textfield to pannel CreditBody
        CreditBody.add(clientnametxtC);
        CreditBody.add(cardidtxtC);
        CreditBody.add(issuerbanktxtC);
        CreditBody.add(bankaccounttxtC);
        CreditBody.add(balanceamounttxtC);
        CreditBody.add(cvctxtC);
        CreditBody.add(interestratetxtC);
        
        //setting ComboBox expiration_date to pannel Creditbody  
        //setting year
        String[]Years= {"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};       
        expiration_date_yearC = new JComboBox<String>(Years);
        expiration_date_yearC.setBounds(65,455,53,27);
        CreditBody.add(expiration_date_yearC);
        //setting month
        String[]Months= {"January","February","March","April","May","June","July","August","September","October","November","December"};       
        expiration_date_monthsC = new JComboBox<String>(Months);
        expiration_date_monthsC.setBounds(120,455,87,27);
        CreditBody.add(expiration_date_monthsC);
        //setting days
        String[]Days= {"1","2","3","4","5","6","7","8","9","10"};       
        expiration_date_daysC = new JComboBox<String>(Days);
        expiration_date_daysC.setBounds(208,455,35,27);
        CreditBody.add(expiration_date_daysC);
        
        //setting button to pannel creditBody
        addcreditcard = new JButton("Add Credit");
        addcreditcard.addActionListener(this);
        clearC = new JButton("CLEAR");
        clearC.addActionListener(this);
        backC = new JButton("<-BACK");
        backC.addActionListener(this);
        displayC = new JButton("DISPLAY");
        displayC.addActionListener(this);
        creditlimit = new JButton("Set Credit Limit");
        creditlimit.addActionListener(this);
        //setting bounds for button of pannel CreditBody
        displayC.setBounds(25,540,130,37);
        backC.setBounds(40,120,80,30);
        clearC.setBounds(450,540,130,37);
        addcreditcard.setBounds(168,510,130,60);
        creditlimit.setBounds(307,510,130,60);
        //adding Jbutton to pannel CreditBody
        CreditBody.add(creditlimit);
        CreditBody.add(clearC);
        CreditBody.add(backC);
        CreditBody.add(displayC);
        CreditBody.add(addcreditcard);

                                                                
        
        ////////////////////////////////////////////////////////  DEBITFrame INFO///////////////////////////////////////////
        //setting frame Debitframe
        //setting label of Debitbody
        DEBITCARD=new JLabel("DEBIT CARD");
        CREDITCARDfont = new Font("Arial", Font.BOLD, 18);
        DEBITCARD.setFont(CREDITCARDfont);
        clientname =new JLabel("Client Name-");
        cardid =new JLabel("Card ID-");
        issuerbank = new JLabel("Issuer Bank-");
        bankaccount = new JLabel("Bank Account-");
        pinnumber = new JLabel("PIN Number-");       
        balanceamount = new JLabel("Balance Amount-");
        //setting bounds for label of Debitbody
        DEBITCARD.setBounds(242,120,120,30);
        clientname.setBounds(35,200,80,30);
        cardid.setBounds(330,200,80,30);
        issuerbank.setBounds(35,280,80,30);
        bankaccount.setBounds(330,280,120,30);
        pinnumber.setBounds(35,360,120,30);
        balanceamount.setBounds(330,360,120,30);
        //adding label to pannel DebitBody
        DebitBody.add(DEBITCARD);
        DebitBody.add(clientname);
        DebitBody.add(cardid);
        DebitBody.add(issuerbank);
        DebitBody.add(bankaccount);
        DebitBody.add(pinnumber);
        DebitBody.add(balanceamount);
        
    
        //setting textfield to pannel DebitBody
        clientnametxt= new JTextField("");
        cardidtxt= new JTextField("");
        issuerbanktxt = new JTextField("");
        bankaccounttxt = new JTextField("");
        pinnumbertxt= new JTextField("");
        balanceamounttxt= new JTextField("");
        //setting bounds for textField of pannel DebitBody
        clientnametxt.setBounds(65,235,180,30);
        cardidtxt.setBounds(365,235,180,30);
        issuerbanktxt.setBounds(65,315,180,30);
        bankaccounttxt.setBounds(365,315,180,30);
        pinnumbertxt.setBounds(65,395,180,30);
        balanceamounttxt.setBounds(365,395,180,30);
        //adding textfield to pannel DebitBody
        DebitBody.add(clientnametxt);
        DebitBody.add(cardidtxt);
        DebitBody.add(issuerbanktxt);
        DebitBody.add(bankaccounttxt);
        DebitBody.add(pinnumbertxt);
        DebitBody.add(balanceamounttxt);
        
        //setting button to pannel DebitBody
        withdrawamount = new JButton("WITHDRAW");
        withdrawamount.addActionListener(this);
        clear = new JButton("CLEAR");
        clear.addActionListener(this);
        back = new JButton("<-BACK");
        back.addActionListener(this);
        display = new JButton("DISPLAY");
        display.addActionListener(this);
        adddebitcard = new JButton("Add Debit Card");
        adddebitcard.addActionListener(this);
        //setting bounds for button of pannel DebitBody
        withdrawamount.setBounds(152,470,130,60);
        display.setBounds(40,540,90,37);
        back.setBounds(40,120,80,30);
        clear.setBounds(470,540,90,37);
        adddebitcard.setBounds(320,470,130,60);
        //adding Jbutton to pannel DebitBody
        DebitBody.add(withdrawamount);
        DebitBody.add(clear);
        DebitBody.add(back);
        DebitBody.add(display);
        DebitBody.add(adddebitcard);
        
        
    
    
        ///////////////////////////////////////////////////////////// FrontFrame info////////////////////////////////////////////////
        //setting frame Front
        //setting label of pannel Body
        WelcomeMsg=new JLabel("Welcome to NABIL Bank");
        WelcomeMsgfont = new Font("Arial", Font.BOLD,19);
        WelcomeMsg.setFont(WelcomeMsgfont);
        SelectOption= new JLabel("Please select the option below to continue:");
        Selectoptionfont = new Font("Arial", Font.BOLD,14);
        SelectOption.setFont(Selectoptionfont);
        //setting bounds for label of pannel Body
        WelcomeMsg.setBounds(185,145,280,70);
        SelectOption.setBounds(165,310,320,70);
        //adding label to pannel body 
        Body.add(WelcomeMsg);
        Body.add(SelectOption);
        //setting button to pannel Body
        DEBIT = new JButton("DEBIT CARD");
        CREDIT = new JButton("CREDIT CARD");
        //setting bounds of button
        DEBIT.setBounds(108,403,180,80);
        CREDIT.setBounds(330,403,180,80);
        //adding button to pannel Body
        Body.add(DEBIT);
        DEBIT.addActionListener(this);
        Body.add(CREDIT);
        CREDIT.addActionListener(this);
        
        
        
        ////////////////////////////////////////////////WITHDRAWframe info///////////////////////////////////
        //setting frame WITHDRAWframe 
        //setting label of pannel withdrawbody
        cardidW=new JLabel("CARD ID-");
        withdrawalamtw=new JLabel("WITHDRAWAL AMOUNT-");
        dateofwithdrawalW=new JLabel("DATE OF WITHDRAWAL");
        pinnumberW=new JLabel("PIN NUMBER-");
        withdrawcashinfo=new JLabel("Fill the details below to withdraw money-");
        withdrawcashinfofont = new Font("Arial", Font.BOLD,13);
        withdrawcashinfo.setFont(withdrawcashinfofont);
        withdrawcash=new JLabel("WITHDRAW CASH");
        withdrawcashfont = new Font("Arial", Font.BOLD,18);
        withdrawcash.setFont(withdrawcashfont);
         //setting bounds for label of pannel WITHDRAWbody
        cardidW.setBounds(263,190,280,70);
        withdrawalamtw.setBounds(225,260,280,70);        
        dateofwithdrawalW.setBounds(230,337,280,70);    
        pinnumberW.setBounds(256,406,280,70);
        withdrawcash.setBounds(220,105,320,70);   
        withdrawcashinfo.setBounds(163,150,320,70);   
        //adding label to pannel WITHDRAWbody
        Withdrawbody.add(cardidW);
        Withdrawbody.add(withdrawalamtw);
        Withdrawbody.add(dateofwithdrawalW);
        Withdrawbody.add(pinnumberW);
        Withdrawbody.add(withdrawcash);
        Withdrawbody.add(withdrawcashinfo);
        
        //setting textfield to pannel WITHDRAWbody
        cardidWtxt= new JTextField("");
        withdrawalamtwtxt= new JTextField("");
        pinnumberWtxt = new JTextField("");
        //setting bounds for textField of pannel WITHDRAWbody
        cardidWtxt.setBounds(165,240,250,30);
        withdrawalamtwtxt.setBounds(165,315,250,30);
        pinnumberWtxt.setBounds(165,456,250,30);
        //adding textfield to pannel WITHDRAWbody
        Withdrawbody.add(cardidWtxt);
        Withdrawbody.add(withdrawalamtwtxt);
        Withdrawbody.add(pinnumberWtxt);
        
        //setting ComboBox expiration_date to pannel WITHDRAWbody  
        //setting year
        withdrawal_date_yearD = new JComboBox<String>(Years);
        withdrawal_date_yearD.setBounds(165,389,60,27);
        Withdrawbody.add(withdrawal_date_yearD);
        //setting month
        withdrawal_date_monthsD = new JComboBox<String>(Months);
        withdrawal_date_monthsD.setBounds(245,389,100,27);
        Withdrawbody.add(withdrawal_date_monthsD);
        //setting days
        withdrawal_date_daysD = new JComboBox<String>(Days);
        withdrawal_date_daysD.setBounds(366,389,45,27);
        Withdrawbody.add(withdrawal_date_daysD);
        
        //setting button to pannel WITHDRAWbody
        withdraw = new JButton("WITHDRAW AMOUNT");
        withdraw.addActionListener(this);
        clearW = new JButton("CLEAR");
        clearW.addActionListener(this);
        backW = new JButton("<-BACK");
        backW.addActionListener(this);
        //setting bounds for button of pannel WITHDRAWbody
        withdraw.setBounds(218,508,160,58);
        backW.setBounds(40,120,80,30);
        clearW.setBounds(470,540,80,30);
        //adding Jbutton to pannel WITHDRAWbody
        Withdrawbody.add(withdraw);
        Withdrawbody.add(clearW);
        Withdrawbody.add(backW);
        
        
        ///////////////////////////////////////////////CREDITLIMITframe info ///////////////////////////////////
        //setting frame CREDITLIMITframe
        //setting label of pannel CreditLimitBody
        cardidCL=new JLabel("CARD ID-");
        creditlimitA=new JLabel("CREDIT LIMIT-");
        graceperiodCL=new JLabel("GRACE PERIOD-");
        creditlimitB=new JLabel("SET CREDIT LIMIT");
        creditlimitBfont = new Font("Arial", Font.BOLD,18);
        creditlimitB.setFont(withdrawcashfont);
        creditlimitinfo=new JLabel("Fill the details below to set Credit Limit-");
        creditlimitinfofont = new Font("Arial", Font.BOLD,13);
        creditlimitinfo.setFont(creditlimitinfofont);
        //setting bounds for label of pannel CreditLimitBody
        cardidCL.setBounds(263,220,280,70);
        creditlimitA.setBounds(247,294,280,70);        
        graceperiodCL.setBounds(240,366,280,70);    
        creditlimitB.setBounds(225,105,320,70);   
        creditlimitinfo.setBounds(180,150,320,70);   
        //adding label to pannel CreditLimitBody
        CreditLimitBody.add(cardidCL);
        CreditLimitBody.add(creditlimitA);
        CreditLimitBody.add(graceperiodCL);
        CreditLimitBody.add(creditlimitB);
        CreditLimitBody.add(creditlimitinfo);
        
        //setting textfield to pannel CreditLimitBody
        cardidCLTXT= new JTextField("");
        creditlimitCLTXT= new JTextField("");
        graceperiodCLTXT= new JTextField("");
        //setting bounds for textField of pannel CreditLimitBody
        cardidCLTXT.setBounds(165,275,250,30);
        creditlimitCLTXT.setBounds(165,350,250,30);
        graceperiodCLTXT.setBounds(165,425,250,30);
        //adding textfield to pannel CreditLimitBody
        CreditLimitBody.add(cardidCLTXT);
        CreditLimitBody.add(creditlimitCLTXT);
        CreditLimitBody.add(graceperiodCLTXT);
        
        //setting button to pannel CreditLimitBody
        setcreditlimitCl = new JButton("SET CREDIT LIMIT");
        setcreditlimitCl.addActionListener(this);
        clearCL = new JButton("CLEAR");
        clearCL.addActionListener(this);
        backCL = new JButton("<-BACK");
        backCL.addActionListener(this);
        cancelcredit = new JButton("Cancel Credit");
        cancelcredit.addActionListener(this);
        //setting bounds for button of pannel CreditLimitBody
        setcreditlimitCl.setBounds(140,508,150,58);
        backCL.setBounds(40,120,80,30);
        clearCL.setBounds(470,540,80,30);
        cancelcredit.setBounds(315,508,120,58);
        //adding Jbutton to pannel CreditLimitBody
        CreditLimitBody.add(setcreditlimitCl);
        CreditLimitBody.add(backCL);
        CreditLimitBody.add(clearCL);
        CreditLimitBody.add(cancelcredit);
        
        
        
        
        
        
        
        ///////////////////////////////////////////////////// adding info to  Header/////////////////////////
        //setting panel
        //setting  panel header 
        NABIL=new JLabel("NABIL BANK");
        Slogan=new JLabel("-TOGETHER AHEAD-");
        NABIL.setBounds(219,8,240,50);
        Slogan.setBounds(229,55,157,50);
        NABILfont = new Font("Arial", Font.BOLD, 30);
        Sloganfont = new Font("Arial", Font.ITALIC, 15);
        NABIL.setFont(NABILfont);
        Slogan.setFont(Sloganfont);
        header.add(NABIL);
        header.add(Slogan);
        //setting  panel Debitheader 
        NABIL=new JLabel("NABIL BANK");
        Slogan=new JLabel("-TOGETHER AHEAD-");
        NABIL.setBounds(219,8,240,50);
        Slogan.setBounds(229,55,157,50);
        NABILfont = new Font("Arial", Font.BOLD, 30);
        Sloganfont = new Font("Arial", Font.ITALIC, 15);
        NABIL.setFont(NABILfont);
        Slogan.setFont(Sloganfont);
        Debitheader.add(NABIL);
        Debitheader.add(Slogan);
        //setting  panel Creditheader 
        NABIL=new JLabel("NABIL BANK");
        Slogan=new JLabel("-TOGETHER AHEAD-");
        NABIL.setBounds(219,8,240,50);
        Slogan.setBounds(229,55,157,50);
        NABILfont = new Font("Arial", Font.BOLD, 30);
        Sloganfont = new Font("Arial", Font.ITALIC, 15);
        NABIL.setFont(NABILfont);
        Slogan.setFont(Sloganfont);
        Creditheader.add(NABIL);
        Creditheader.add(Slogan);
          //setting  panel CreditLimitheader 
        NABIL=new JLabel("NABIL BANK");
        Slogan=new JLabel("-TOGETHER AHEAD-");
        NABIL.setBounds(219,8,240,50);
        Slogan.setBounds(229,55,157,50);
        NABILfont = new Font("Arial", Font.BOLD, 30);
        Sloganfont = new Font("Arial", Font.ITALIC, 15);
        NABIL.setFont(NABILfont);
        Slogan.setFont(Sloganfont);
        CreditLimitheader.add(NABIL);
        CreditLimitheader.add(Slogan);
          //setting  panel Withdrawheader 
        NABIL=new JLabel("NABIL BANK");
        Slogan=new JLabel("-TOGETHER AHEAD-");
        NABIL.setBounds(219,8,240,50);
        Slogan.setBounds(229,55,157,50);
        NABILfont = new Font("Arial", Font.BOLD, 30);
        Sloganfont = new Font("Arial", Font.ITALIC, 15);
        NABIL.setFont(NABILfont);
        Slogan.setFont(Sloganfont);
        Withdrawheader.add(NABIL);
        Withdrawheader.add(Slogan);
        
        
        
        
        //////////////////////////////////////////// Setting Pannel Body////////////////////////////////
        //setting  pannel body
        Body.setLayout(null);
        Body.setBounds(0,0,596,600);
        Body.setBackground(Color.WHITE);
        Body.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //setting  pannel DebitBody
        DebitBody.setLayout(null);
        DebitBody.setBounds(0,0,596,600);
        DebitBody.setBackground(Color.WHITE);
        DebitBody.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //setting  pannel CreditBody
        CreditBody.setLayout(null);
        CreditBody.setBounds(0,0,596,600);
        CreditBody.setBackground(Color.WHITE);
        CreditBody.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //setting  pannel CreditLimitBody
        CreditLimitBody.setLayout(null);
        CreditLimitBody.setBounds(0,0,596,600);
        CreditLimitBody.setBackground(Color.WHITE);
        CreditLimitBody.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //setting  pannel Withdrawbody
        Withdrawbody.setLayout(null);
        Withdrawbody.setBounds(0,0,596,600);
        Withdrawbody.setBackground(Color.WHITE);
        Withdrawbody.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        
        
        ///////////////////////////////////////// setting pannel header////////////////////////
        //setting  pannel header
        header.setLayout(null);
        header.setBounds(0,0,596,100);
        header.setBackground(Color.LIGHT_GRAY);
        header.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //setting  pannel Debitheader
        Debitheader.setLayout(null);
        Debitheader.setBounds(0,0,596,100);
        Debitheader.setBackground(Color.LIGHT_GRAY);
        Debitheader.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //setting  pannel Creditheader
        Creditheader.setLayout(null);
        Creditheader.setBounds(0,0,596,100);
        Creditheader.setBackground(Color.LIGHT_GRAY);
        Creditheader.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
         //setting  pannel CreditLimitheader
        CreditLimitheader.setLayout(null);
        CreditLimitheader.setBounds(0,0,596,100);
        CreditLimitheader.setBackground(Color.LIGHT_GRAY);
        CreditLimitheader.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
         //setting  pannel Withdrawheader
        Withdrawheader.setLayout(null);
        Withdrawheader.setBounds(0,0,596,100);
        Withdrawheader.setBackground(Color.LIGHT_GRAY);
        Withdrawheader.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
     
     
     
        
        
        
        
        
        //setting frames
        //setting frame Front
        Front.add(header);
        Front.add(Body);
        Front.setSize(610,640);
        Front.setLayout(null);
        Front.setVisible(true);
        Front.setTitle("BankGUI");
        Front.setResizable(false);
        Front.setLocationRelativeTo(null);
        Front.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting frame Debitframe
        Debitframe.add(Debitheader);
        Debitframe.add(DebitBody);
        Debitframe.setSize(610,640);
        Debitframe.setLayout(null);
        Debitframe.setVisible(false);
        Debitframe.setLocationRelativeTo(null);
        Debitframe.setTitle("DEBIT CARD");
        Debitframe.setResizable(false);
        //setting frame Creditframe
        Creditframe.add(Creditheader);
        Creditframe.add(CreditBody);
        Creditframe.setSize(610,640);
        Creditframe.setLayout(null);
        Creditframe.setVisible(false);
        Creditframe.setLocationRelativeTo(null);
        Creditframe.setTitle("CREDIT CARD");
        Creditframe.setResizable(false);
         //setting frame WITHDRAWframe
        WITHDRAWframe.add(Withdrawheader);
        WITHDRAWframe.add(Withdrawbody);
        WITHDRAWframe.setSize(610,640);
        WITHDRAWframe.setLayout(null);
        WITHDRAWframe.setVisible(false);
        WITHDRAWframe.setLocationRelativeTo(null);
        WITHDRAWframe.setTitle("WITHDRAW");
        WITHDRAWframe.setResizable(false);
         //setting frame CREDITLIMITframe
        CREDITLIMITframe.add(CreditLimitheader);
        CREDITLIMITframe.add(CreditLimitBody);
        CREDITLIMITframe.setSize(610,640);
        CREDITLIMITframe.setLayout(null);
        CREDITLIMITframe.setVisible(false);
        CREDITLIMITframe.setLocationRelativeTo(null);
        CREDITLIMITframe.setTitle("CREDIT LIMIT");
        CREDITLIMITframe.setResizable(false);
        
    }
    public void actionPerformed(ActionEvent a){
        //DEBIT button
        if(a.getSource() == DEBIT){
               Debitframe.setVisible(true);
        }
        else
        //CREDIT button
        if(a.getSource() == CREDIT){
                Creditframe.setVisible(true);
        }
        //BACK button of DEBIT frame
        if(a.getSource() == back){
            Debitframe.setVisible(false);   
        }
        else
        //BACK button of CREDIT frame
        if(a.getSource() == backC){
                Creditframe.setVisible(false);
        }
        //BACK button of WITHDRAWframe
        if(a.getSource() == backW){
            WITHDRAWframe.setVisible(false);   
        }
        else
        //BACK button of  CREDITLIMITframe
        if(a.getSource() == backCL){
            CREDITLIMITframe.setVisible(false);
        }
        //WITHDRAW amountlast button
        if(a.getSource()== withdraw)
            {
               if(
                pinnumberWtxt.getText().isEmpty()||
                cardidWtxt.getText().isEmpty()||
                withdrawalamtwtxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(WITHDRAWframe,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE);
                }
             else
            {
                try{
                    int PIN=Integer.parseInt(pinnumberWtxt.getText());
                    int C_ID=Integer.parseInt(cardidWtxt.getText());
                    int amtwithdraw=Integer.parseInt(withdrawalamtwtxt.getText());
                    String yearW =(String)withdrawal_date_yearD.getSelectedItem();
                    String monthW =(String)withdrawal_date_monthsD.getSelectedItem();
                    String daysW =(String)withdrawal_date_daysD.getSelectedItem();
                    String dateW=(yearW+monthW+daysW);
                    for (bankcard user :userinfo) {
                        if (user instanceof Debitcard) {
                               Debitcard debit=(Debitcard) user;
                               if (debit.getPINnumber()==PIN && debit.getcardId()==C_ID)
                               {       
                                    debit.Withdraw(amtwithdraw,dateW,PIN);
                                    if(debit.gethasWithdrawn()==true)
                                        {
                                        JOptionPane.showMessageDialog(Debitframe,"Amount has been Withdrawn!");
                                        }
                                    else{       
                                        JOptionPane.showMessageDialog(Debitframe,"insufficient balance");
                                        }
                                }
                        else
                            {
                                 JOptionPane.showMessageDialog(Debitframe,"invalid Pin-number or cardID");
                            }
                                }
                            }
                        }
                        catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(Debitframe,"Please enter valid input");
                            }
            }
        }
        //setcreditlimitCl button
        if
        (a.getSource()== setcreditlimitCl)
            {
                String yearW =(String)withdrawal_date_yearD.getSelectedItem();
                String monthW =(String)withdrawal_date_monthsD.getSelectedItem();
                String daysW =(String)withdrawal_date_daysD.getSelectedItem();
                String dateW=(yearW+monthW+daysW);
                int ID=-1;
                Double Creditlimit=0.0;
                int graceperiod=-1;
                if(
                    cardidCLTXT.getText().isEmpty()||
                    creditlimitCLTXT.getText().isEmpty()||
                    graceperiodCLTXT.getText().isEmpty()
                )
                    {
                     JOptionPane.showMessageDialog(WITHDRAWframe,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE);
                    }
                else
                     {
                    try {
                        ID = Integer.parseInt(cardidCLTXT.getText());
                        Creditlimit = Double.parseDouble(creditlimitCLTXT.getText());
                        graceperiod = Integer.parseInt(graceperiodCLTXT.getText());
                            for (bankcard user : userinfo) {
                                if (user instanceof CreditCard) {
                                     CreditCard credit=(CreditCard) user;
                                    if (credit.getcardId() == ID) 
                                        {
                                        credit.setCreditlimit(Creditlimit, graceperiod);
                                        if(credit.getisgranted()==true)
                                            {
                                            JOptionPane.showMessageDialog(null, "Credit Limit has been Set");
                                            }
                                        else{
                                             JOptionPane.showMessageDialog(null, "Credit Limit cannot be Set");
                                            }
                                        } 
                                    else {
                                            JOptionPane.showMessageDialog(null, "Card ID is Incorrect");
                                        }
                                    }
                                }
                    } 
                    catch (NumberFormatException e) {
                         JOptionPane.showMessageDialog(null, "Please enter valid input");
                        }
                    }
             }
        //Withdraw amount Button
        if(a.getSource() == withdrawamount){
            WITHDRAWframe.setVisible(true);
        }
         //set credit limit button
        else if (a.getSource() == creditlimit){
                CREDITLIMITframe.setVisible(true);
        }
        //CLEAR Button
        if(a.getSource() == clear){
                clientnametxt.setText("");
                cardidtxt.setText("");
                issuerbanktxt.setText("");
                bankaccounttxt.setText("");
                pinnumbertxt.setText("");
                balanceamounttxt.setText("");
        }
        else if(a.getSource() == clearC){
                clientnametxtC.setText("");
                cardidtxtC.setText("");
                issuerbanktxtC.setText("");
                bankaccounttxtC.setText("");
                balanceamounttxtC.setText("");
                cvctxtC.setText("");
                interestratetxtC.setText("");
        }
        else if(a.getSource() == clearCL){
                cardidCLTXT.setText("");
                creditlimitCLTXT.setText("");
                graceperiodCLTXT.setText("");
        }
        else if(a.getSource() == clearW){
                cardidWtxt.setText("");
                withdrawalamtwtxt.setText("");
                pinnumberWtxt.setText("");
        }
        //add debit card BUTTON
        if (a.getSource() == adddebitcard)
        {
            if (
               clientnametxt.getText().isEmpty()||
               cardidtxt.getText().isEmpty()||
               issuerbanktxt.getText().isEmpty()||
               bankaccounttxt.getText().isEmpty()||
               pinnumbertxt.getText().isEmpty()||
               balanceamounttxt.getText().isEmpty())
               {
                JOptionPane.showMessageDialog(Debitframe,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE);
                }
            else
               {
                try{
                    int ID=Integer.parseInt(cardidtxt.getText());
                    int PINnbr=Integer.parseInt(pinnumbertxt.getText());
                    String name=clientnametxt.getText(); 
                    String bank=issuerbanktxt.getText();
                    String bankAcc=bankaccounttxt.getText();
                    int balanceamt=Integer.parseInt(balanceamounttxt.getText());
                    Debitcard DEBITcardinfo = new Debitcard(PINnbr, balanceamt, ID, bankAcc, bank, name);
                    userinfo.add(DEBITcardinfo);
                    JOptionPane.showMessageDialog(Debitframe,"Debit Card has been Added Succesfully");
                }
                catch(NumberFormatException e){
                     JOptionPane.showMessageDialog(null,"Alert: Please enter valid input");
                }
               
            }
        }
        //add credit card BUTTON
        if(a.getSource() == addcreditcard)
        {
            if(
                clientnametxtC.getText().isEmpty()||
                cardidtxtC.getText().isEmpty()||
                issuerbanktxtC.getText().isEmpty()||
                bankaccounttxtC.getText().isEmpty()||
                balanceamounttxtC.getText().isEmpty()||
                cvctxtC.getText().isEmpty()||
                interestratetxtC.getText().isEmpty())
                 JOptionPane.showMessageDialog(Creditframe,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE);
            else
                {
                try{
                    int cardID=Integer.parseInt(cardidtxtC.getText());
                    }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"CARD iD: You must enter an integer");
                    }
                 try{
                    int cvc=Integer.parseInt(cvctxtC.getText());
                    }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"CVC number: You must enter an integer");
                    }
                    try{
                    int balanceamt=Integer.parseInt(balanceamounttxtC.getText());
                    }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Balance Amount: You must enter an integer");
                    }
                    try{
                    int interestrate=Integer.parseInt(interestratetxtC.getText());
                    }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Interest Rate: You must enter an integer");
                    }
                String clientname=clientnametxtC.getText(); 
                int cardID=Integer.parseInt(cardidtxtC.getText());
                String issuerbank=issuerbanktxtC.getText();
                String bankacc=bankaccounttxtC.getText();
                int balanceamt=Integer.parseInt(balanceamounttxtC.getText());
                int cvc=Integer.parseInt(cvctxtC.getText());
                Double interestrate=Double.parseDouble(interestratetxtC.getText());
                String year =(String)expiration_date_yearC.getSelectedItem();
                String month=(String)expiration_date_monthsC.getSelectedItem();
                String days=(String)expiration_date_daysC.getSelectedItem();
                String date=(year+month+days);
                CreditCard CREDITcardinfo= new CreditCard(cardID, clientname, issuerbank, bankacc, balanceamt, cvc,interestrate,date);
                userinfo.add(CREDITcardinfo);
                JOptionPane.showMessageDialog(Creditframe,"Credit Card added  successfully");
            }
        }
        //cancel credit card
          if(a.getSource() == cancelcredit)
              {
               
                if(cardidCLTXT.getText().isEmpty()){
                     JOptionPane.showMessageDialog(null,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE);  
              }
              else{   
                 try{
                     int ID=Integer.parseInt(cardidCLTXT.getText());
                     for (bankcard user :userinfo) {
                    if (user instanceof CreditCard) {
                    CreditCard credit=(CreditCard) user;
                    if (credit.getcardId()==ID)
                       {       
                            credit.cancelCreditCard();
                            JOptionPane.showMessageDialog(null,"Credit Limit has been Cancelled");
                        }
                    else
                       {
                             JOptionPane.showMessageDialog(null,"Card ID is Incorrect");
                        }
                    }
                    }
                 }
                catch(NumberFormatException e) {
                     JOptionPane.showMessageDialog(null,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE);  
                }
                }
          }
        //Display button credit
        if(a.getSource() == displayC){
            if(userinfo.isEmpty()){
                JOptionPane.showMessageDialog(null,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                int cardID=Integer.parseInt(cardidtxtC.getText());
              for (bankcard user :userinfo) {
                    if (user instanceof CreditCard) {
                    CreditCard credit=(CreditCard) user;
                    if (credit.getcardId()==cardID){       
                        credit.DISPLAY();
                        JOptionPane.showMessageDialog(null,"Hello "+credit.getClientName()+"\n"+"your Card is- "+credit.getcardId()+"\n"+
                        "your Bank Account is- "+credit.getbankAccount()+"\n"+"your Cureent Balance Amount is- "+credit.getbalanceAmount()+"\n"+"Your CVC number is- "
                        +credit.getCVC_number()+"\n"+"Your Interest rate is- "+credit.getInterest_rate()+"\n"+"your credit will expire on"+credit.getExpiration_date());}
                    }
                    }
            }
        }
        //Display button debit
         if(a.getSource() == display){ 
            if(userinfo.isEmpty()){
                JOptionPane.showMessageDialog(null,"Please fill the Form Properly!","Empty TextField",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                int cardID=Integer.parseInt(cardidtxt.getText());
                int pinnumber=Integer.parseInt(pinnumbertxt.getText());
              for (bankcard user :userinfo) {
                    if (user instanceof Debitcard) {
                    Debitcard debit=(Debitcard) user;
                    if (debit.getcardId()==cardID){       
                        debit.Display();
                        JOptionPane.showMessageDialog(null,"Hello "+debit.getClientName()+"\n"+"your Card is- "+debit.getcardId()+"\n"+"Your issuer bank is-"
                        +debit.getissuerBank()+"\n"+"your Bank Account is- "+debit.getbankAccount()+"\n"+"Your PIN number is- "+debit.getPINnumber()+"\n"
                        +"Your Current Balance Amount- "+debit.getbalanceAmount());}
                    }
                    }
            }
        }
}
    public static void main(String[]args)
{
     new BankGUI();
}
}