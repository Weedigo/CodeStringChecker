public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String keyWord;

    public CodeWordChecker(int min, int max, String keyWord) {
        this.min = min;
        this.max = max;
        this.keyWord = keyWord;
    }

    public CodeWordChecker(String keyWord) {
        this.min = 6;
        this.max = 20;
        this.keyWord = keyWord;
    }

    public boolean isValid(String str) {
        if (str.length() < min || str.length() > max || str.indexOf(this.keyWord) > -1) {
            return false;
        }
        return true;
    }
}

