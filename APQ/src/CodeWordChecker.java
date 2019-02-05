/**
 * 
 * @author Kyle Parke
 *
 * +1 point declares header
 */
public class CodeWordChecker implements StringChecker {
	
	private int minLength;
	private int maxLength;
	private String notAllowed;
/**
 * 
 * +1 declared private variables	+3 points declares headers, uses all parameters in both constructors 
 * @param minLen +1/3
 * 
 * @param maxLen +1/3
 * @param symbol+1/3
 */
	public CodeWordChecker(int minLen, int maxLen, String symbol) {
		minLength=minLen;
		maxLength=maxLen;
		notAllowed = symbol;
	
	}
	public CodeWordChecker(String symbol) {
		minLength=6;
		maxLength=20;
		notAllowed=symbol;
	}
	/**
	 * +1 declare header +1 checked min max length inclusive +1 checked unwanted string +1 returns true/false when appropriate
	 */
	public boolean isValid(String str) {
		return str.length()>=minLength && str.length() <= maxLength &&
				str.indexOf(notAllowed)==-1;
	}
	public static void main(String[] args) {
		StringChecker sc1=new CodeWordChecker(5,8, "$");
		System.out.println(sc1.isValid("happy"));
	}
}