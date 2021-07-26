import java.util.HashMap;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(int account) {
        super("Insufficient Balance in "+account); 
    }
}

public class Bank{
    HashMap<Integer,Integer> accounts;

    public Bank() {
        this.accounts = new HashMap<Integer,Integer>();
    }

    public void creatAccount (int account, int balance) {
        accounts.put(account,balance);

    }
    public int withdraw (int account, int amount) throws InsufficientBalanceException{
        if(!accounts.containsKey(account)){
            System.out.println ("account not found");
        }else{
            if(account.get(account)<amount)
                throw new InsufficientBalanceException(account);
            accounts.put(account,balance-amount);
        }
    }
    
}
