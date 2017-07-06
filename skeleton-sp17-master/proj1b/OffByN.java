public class OffByN implements CharacterComparator{
    public int n;

    public void OffByN(int N){
        n = N;
    }
    @Override
    public boolean equalChars(char x, char y){
        return (x - y == n || x - y == -n);
    }
    public static void main(String[] args) {
        OffByN offBy5 = new OffByN(5);
        offBy5.equalChars('a', 'f');  // true
        offBy5.equalChars('f', 'h');  // false
    }
}