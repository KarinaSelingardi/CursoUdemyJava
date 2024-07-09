//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//BankAccount bobsAccount = new BankAccount("12345",900,
  //      "Bob Brown", "myemail@bob.com","(087) 123-4567");
            BankAccount bobsAccount = new BankAccount();
System.out.println(bobsAccount.getNumber());
System.out.println(bobsAccount.getBalance());
//bobsAccount.setNumber("12345");
//bobsAccount.setBalance(1000.00);
//bobsAccount.setCustomerName("Bob Brown");
//bobsAccount.setCustomerEmail("myemail@bob.com");
//bobsAccount.setCustomerPhone("(087) 123-4567");

bobsAccount.withDrawFunds(100.0);
bobsAccount.depositFunds(250);
bobsAccount.withDrawFunds(50);
bobsAccount.withDrawFunds(200);
bobsAccount.depositFunds(100);
bobsAccount.withDrawFunds(45.55);
bobsAccount.withDrawFunds(54.46);
bobsAccount.withDrawFunds(54.45);
    }
}