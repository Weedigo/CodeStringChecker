public class CodeWordChecker implements StringChecker{
    private int maximum;
    private int minimum;
    private String keyword;
    public CodeWordChecker(int maximum, int minimum, String keyword){
        this.maximum = maximum;
        this.minimum = minimum;
        this.keyword = keyword;
    }
    public CodeWordChecker(String Keyword){
        this.keyword = keyword;
        this.minimum = 6;
        this.maximum = 20;
    }
}

