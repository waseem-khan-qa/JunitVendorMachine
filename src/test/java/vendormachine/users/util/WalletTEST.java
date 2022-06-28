package vendormachine.users.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WalletTEST {

    @Test
    public void testAddCredit(){
    	Wallet wallet1 = new Wallet();
    	wallet1.addCredit(2f);
    	assertEquals(2.5f, wallet1.getAllCredit());
    }
    
    @Test
    public void testGetCreditStored() {
    	Wallet wallet1 = new Wallet();
    	assertEquals(wallet1.getCredit(0.5f), 0.5f);
    }
    
    @Test
    public void testGetCreditExceed() {
    	Wallet wallet1 = new Wallet();
    	assertEquals(wallet1.getCredit(1.5f), 0.0f);
    }
}
