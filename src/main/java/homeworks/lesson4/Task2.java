package homeworks.lesson4;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(checkAnagrams("пила","липа"));
        System.out.println(checkAnagrams("пила","лапа"));

    }

    static boolean checkAnagrams(String word1, String word2) {
        return getCodeByWord(word1) == getCodeByWord(word2);
    }

    static int getCodeByWord(String word) {
        int result = 0;
        for (int i = 0; i < word.length() ; i++) {
            result+= word.charAt(i);
        }
        return result;
    }
}
