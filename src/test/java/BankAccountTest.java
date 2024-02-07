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
    private int initialBalance = 500;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount(initialFirstName, initialLastName, initialDateOfBirth, initialAccountNumber, initialBalance);
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
}
