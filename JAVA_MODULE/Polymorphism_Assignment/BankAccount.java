package Polymorphism;

import java.time.LocalDate;

class BankAccount {
    int accountNumber;
    String accHolderName;
    double currentBalance;
    double interestRate;

    BankAccount() {
        System.out.println("Default Constructor Called");
        this.accountNumber = 123456789;
        this.accHolderName = "Siya";
        this.currentBalance = 8643;
        this.interestRate = 10;
    }

    BankAccount(int id, String name, double balance, double rate) {
        System.out.println("Parameterized Constructor Called");
        this.accountNumber = id;
        this.accHolderName = name;
        this.currentBalance = balance;
        this.interestRate = rate;
    }

    void withdraw(double amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + currentBalance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println();
    }
}

class SavingAccount extends BankAccount {
    double minBalance;

    SavingAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate, double minBalance) {
        super(accountNumber, accHolderName, currentBalance, interestRate);
        this.minBalance = minBalance;
    }

    void withdraw(double amount) {
        if (currentBalance - amount >= minBalance) {
            currentBalance -= amount;
            System.out.println(amount + " withdrawn from Saving Account. New balance: " + currentBalance);
        } else {
            System.out.println("Cannot withdraw below minimum balance of " + minBalance);
        }
    }

    public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	void display() {
        super.display();
        System.out.println("Minimum Balance: " + minBalance);
        System.out.println();
    }
}

class CurrentAccount extends BankAccount {
    double limit;

    CurrentAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate, double limit) {
        super(accountNumber, accHolderName, currentBalance, interestRate);
        this.limit = limit;
    }

    
    void withdraw(double amount) {
        if (currentBalance - amount >= -limit) {
            currentBalance -= amount;
            System.out.println(amount + " withdrawn from Current Account. New balance: " + currentBalance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit of " + limit);
        }
    }

    
    public double getLimit() {
		return limit;
	}


	public void setLimit(double limit) {
		this.limit = limit;
	}


	void display() {
        super.display();
        System.out.println("Overdraft Limit: " + limit);
        System.out.println();
    }
}

class SalaryAccount extends BankAccount {
    LocalDate lastTransactionDate;

    SalaryAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate, LocalDate lastDate) {
        super(accountNumber, accHolderName, currentBalance, interestRate);
        this.lastTransactionDate = lastDate;
    }

    
    void display() {
        super.display();
        System.out.println("Last Transaction Date: " + lastTransactionDate);
        System.out.println();
    }
}

class BankMain {
    public static void main(String[] args) {
        BankAccount acc;

        acc = new SavingAccount(111, "Siya", 10000, 5.5, 2000);
        acc.display();
        acc.withdraw(9000);  

        acc = new CurrentAccount(222, "Riya", 15000, 4.5, 5000);
        acc.display();
        acc.withdraw(19000);

        acc = new SalaryAccount(333, "Diya", 12000, 6.0, LocalDate.of(2025, 11, 10));
        acc.display();
        acc.withdraw(5000);  
    }
}
