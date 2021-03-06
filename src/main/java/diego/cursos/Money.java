package diego.cursos;

public class Money implements Expression {
    protected final int amount;
    protected final String currency;

    public Money(int amount, String currency) {
        this.amount=amount;
        this.currency = currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }
    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }
    protected  String currency(){
        return this.currency;
    }

    @Override
    public Expression times(int multiplier){
        return new Money(this.amount*multiplier,this.currency);
    }

    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }
    @Override
    public boolean equals(Object object) {
        if (getClass() != object.getClass())
            return false;
        return amount == ((Money) object).amount &&
                this.currency.equals(((Money) object).currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        return new Money(this.amount/bank.rate(this.currency,toCurrency), toCurrency);
    }
}
