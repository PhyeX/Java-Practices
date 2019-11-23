
 public class Savings extends  Account {
    //List properties specific to the Savings account.
  private int safetyDepositBoxID;
  private int safetyDepositBoxKey;

  // Constructor to initilalize setting for the Savings properties
   public Savings(String name,String sSN,double initDeposit){
    super(name,sSN,initDeposit);
    accountNumber = "1"+ accountNumber;
     setSafetyDepostBox();
   }

  @Override
  public void setRate() {
   rate = getBaseRate() - .25;
  }

  private void setSafetyDepostBox(){
         safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
         safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }
     //List Any methos Specific to saving account
     public void showInfo(){
      System.out.println("Account Type: Savings");
      super.showInfo();
      System.out.println(
              "Your Saving Account Features" +
              "\n Safety Deposit Box ID: " + safetyDepositBoxID +
              "\n Safety Deposit Box Key: " + safetyDepositBoxKey
      );
     }

 }
