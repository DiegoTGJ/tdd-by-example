package diego.tutoriales;

public interface Expression {
    Money reduce(Bank bank, String toCurrency);
    Expression plus(Expression addend);
}
