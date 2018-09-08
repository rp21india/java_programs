package Interview_question;

public class evaluate_expression {
	public static void main(String[] args) {
        String equation = "10+20";
        int result = compute(equation);
        System.out.println(result);
    }
    static int compute(String equation) {
        int result = 0;
        String [] addition = equation.split("\\+");
        for (String multipl : addition) {
        	
            String []byMultipl = multipl.split("\\*");
            int multiplResult = 1;        
            for (String operand : byMultipl) {
                multiplResult *= Integer.parseInt(operand);
            }
            result += multiplResult;
        }
        return result;
    }
}
