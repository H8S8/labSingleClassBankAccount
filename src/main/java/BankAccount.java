public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance; //In pennies
    private String accountType;

    //Constructor
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber,
                       String inputAccountType){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
        this.accountType = inputAccountType;
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    //Other Methods
    public void deposit(int amount){
        this.balance += amount;
    }
    public void withdrawal(int amount){
        this.balance -= amount;
    }
    public void payInterest(){
        if(this.accountType.equals("Current")){
            this.balance = (int) Math.round(this.balance * 1.05);
        }
        if(this.accountType.equals("Savings")){
            this.balance = (int) Math.round(this.balance * 1.10);
        }
    }

}
