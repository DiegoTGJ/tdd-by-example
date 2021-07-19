package diego.cursos;

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
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augmend.times(multiplier),addend.times(multiplier));
    }
}
