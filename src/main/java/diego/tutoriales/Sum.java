package diego.tutoriales;

public class Sum implements Expression {
    Expression augmend;
    Expression addend;

    public Sum(Expression augmend, Expression addend) {
        this.augmend = augmend;
        this.addend = addend;
    }
    @Override
    public Money reduce(Bank bank,String toCurrency){
        int amount = augmend.reduce(bank,toCurrency).amount + addend.reduce(bank, toCurrency).amount;
        return new Money(amount,toCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
