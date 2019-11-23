
  public class Checking extends Account {
    //List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPIN;

    //Constructor to initilize checking account properties
      public Checking(String name,String sSn,double initDeposit){
        super(name, sSn,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
      }

    //List any methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));
    }
    @Override
    public void setRate(){
      rate = getBaseRate() * .15;
    }

     public void showInfo(){
        super.showInfo();
       System.out.println("Your Checking Account Features" +
               "\n Debit Card Number: " + debitCardNumber +
               "\n Debit Card PIN: " + debitCardPIN);
     }


  }
