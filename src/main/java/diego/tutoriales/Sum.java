package diego.tutoriales;

public class Sum implements Expression {
    Money augmend;
    Money addend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addend = addmend;
    }
    @Override
    public Money reduce(Bank bank,String toCurrency){
        int amount = augmend.amount + addend.amount;
        return new Money(amount,toCurrency);
    }
}
