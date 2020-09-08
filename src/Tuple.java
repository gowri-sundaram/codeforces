class Tuple implements Comparable<Tuple>  {
    int a;
    int b;

    public Tuple(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Tuple o) {
        return this.a - o.a;
    }

    @Override public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result*PRIME) + a;
        result = (result*PRIME) + b;
        return result;
    }

    @Override public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Tuple)) return false;
        Tuple other = (Tuple) o;
        return (this.a == other.a) && (this.b == other.b);
    }
}