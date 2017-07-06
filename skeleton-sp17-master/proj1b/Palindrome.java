public class Palindrome{
    public static Deque<Character> wordToDeque(String word){
        Deque<Character> wordDeque = new ArrayDequeSolution<Character>();

        for(int i = 0; i < word.length(); i++){
            wordDeque.addLast(word.charAt(i));
        }
        return wordDeque;
    }
    public static boolean isPalindrome(String word){
        for(int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String word, CharacterComparator cc){
        for(int i = 0; i < word.length() / 2; i++){
            char a = word.charAt(i);
            char b = word.charAt(word.length() - 1 - i);

            if(!cc.equalChars(a,b)){
                return false;
            }
        }
        return true;
    }

}