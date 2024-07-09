public class BankAccount {
    private String number;
    private double balance;//saldo
    private String customerName;
    private String CustomerEmail;
    private String customerPhone;
//constructor chaining : contrutor dentro de outro construtor
    // se sentar criar um obj dessa classe e não passar nenhum argumento
    //configure esse novo objeto com esses valores chamando outro construto especificado
    public BankAccount(){
        this("56789", 2.50,"Default name",
                "Default adress","Default phone");
        System.out.println("Empity constructor called");
    }
    public BankAccount(String number, double balance,String customerName,String email,
                       String phone ){
        System.out.println("Account constructor with  parameters called");
        this.number =number;
        this.balance = balance;
        this.customerName = customerName;
      CustomerEmail = email;
      customerPhone = phone;
    }
    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made.New balance is $" +
                balance);

    }
    public void withDrawFunds(double withdrawAmount){
        if(balance - withdrawAmount < 0 ){
            System.out.println("Isufficient Funds! You only have $" + balance +
                    " in your account.");
        }else{
            balance -= withdrawAmount;
            System.out.println("Withdraw of $" + withdrawAmount +
                    " processed, Remaining balance = $" + balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}