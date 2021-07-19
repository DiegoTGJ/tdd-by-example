package diego.cursos;

import java.util.HashMap;

public class Bank {
    private final HashMap<Pair, Integer> rateMap = new HashMap<>();
    public Money reduce(Expression source, String toCurrency){
        return source.reduce(this, toCurrency);
    }

    public int rate(String from, String to){
        if(!from.equals(to)){
            return rateMap.get(new Pair(from,to));
        }else return 1;
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from,to), rate);
    }
}
