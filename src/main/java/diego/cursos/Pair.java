package diego.cursos;

import java.util.Objects;

public class Pair {

    private final String from;
    private final String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (!from.equals(pair.from)) return false;
        return to.equals(pair.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
