package entities;

public class SavingsAccount extends Account{
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	//abaixo o metodo para atualizar o saldo com base na taca de juros multiplicando saldo * juros
	//se a taca de juros for 0,01 o saldo recebe ele mesmo * juros
	public void updateBalance() {
		balance += balance * interestRate;
	}
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
