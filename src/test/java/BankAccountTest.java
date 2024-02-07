import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    //Define initial values for properties of the object
    private String initialFirstName = "Hannah";
    private String initialLastName = "Riley";
    private String initialDateOfBirth = "01/01/1900";
    private int initialAccountNumber = 123456789;

    //This is hard coded as zero in the BankAccount constructor
    //Include this variable to help with testing, if the hardcoded value is changed remember to change it here as well
    private int initialBalance = 0;
    private String initialAccountType = "Savings";

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount(initialFirstName, initialLastName, initialDateOfBirth, initialAccountNumber,
                initialAccountType);
    }

    //Test all getter functions first
    //The getter functions will need to be working for us to test the setter functions
    @Test
    public void canGetFirstName(){
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo(initialFirstName);
    }
    @Test
    public void canGetLastName(){
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo(initialLastName);
    }
    @Test
    public void canGetDateOfBirth(){
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(initialDateOfBirth);
    }
    @Test
    public void canGetAccountNumber(){
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(initialAccountNumber);
    }
    @Test
    public void canGetBalance(){
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(initialBalance);
    }
    @Test
    public void canGetAccountType(){
        String actual = bankAccount.getAccountType();
        assertThat(actual).isEqualTo(initialAccountType);
    }
    //Now we have confirmed that the getter functions work, we can test the setters

    @Test
    public void canSetFirstName(){
        String newFirstName = "Matthew";
        bankAccount.setFirstName(newFirstName);
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo(newFirstName);
    }
    @Test
    public void canSetLastName(){
        String newLastName = "Louis";
        bankAccount.setLastName(newLastName);
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo(newLastName);
    }
    @Test
    public void canSetDateOfBirth(){
        String newDateOfBirth = "06/02/2024";
        bankAccount.setDateOfBirth(newDateOfBirth);
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(newDateOfBirth);
    }
    @Test
    public void canSetAccountNumber(){
        int newAccountNumber = 100000000;
        bankAccount.setAccountNumber(newAccountNumber);
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(newAccountNumber);
    }
    @Test
    public void canSetBalance(){
        int newBalance = 500;
        bankAccount.setAccountNumber(newBalance);
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(newBalance);
    }
    @Test
    public void canSetAccountType(){
        String newAccountType = "Current";
        bankAccount.setAccountType(newAccountType);
        String actual = bankAccount.getAccountType();
        assertThat(actual).isEqualTo(newAccountType);
    }

    //Now test other methods
    @Test
    public void canDeposit(){
        int amount = 20;

        //Find expected balance after deposit
        int expectedBalance = bankAccount.getBalance() + amount;

        //Make deposit
        bankAccount.deposit(amount);
        int actualBalance = bankAccount.getBalance();

        //Check if current balance is as expected
        assertThat(actualBalance).isEqualTo(expectedBalance);
    }
    @Test
    public void canWithdraw(){
        int amount = 40;
        int expectedBalance = bankAccount.getBalance() - amount;
        bankAccount.withdrawal(amount);
        assertThat(bankAccount.getBalance()).isEqualTo(expectedBalance);
    }
    @Test
    public void canPayInterest(){
        //This checks that 5% interest is added (as defined in the function)
        bankAccount.setBalance(500);
        bankAccount.payInterest();
        //If the balance was initially 500, we would expect it to become 525 after adding 5% interest
        assertThat(bankAccount.getBalance()).isEqualTo(525);
    }
}
