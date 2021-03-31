import java.util.HashMap;
import java.util.Map;

public class TextCalculator
{
    private String operator;
    private Integer operand1;
    private Integer operand2;
    private Map<String, Integer> numberMap = new HashMap<String,Integer>(){{
        put("one",1);
        put("two",2);
        put("three",3);
        put("four",4);
        put("five",5);
        put("six",6);
        put("seven",7);
        put("eight",8);
        put("nine",9);
        put("ten",10);
        put("eleven",11);
        put("twelve",12);
        put("thirteen",13);
        put("fourteen",14);
        put("fifteen",15);
        put("sixteen",16);
        put("seventeen",17);
        put("eighteen",18);
        put("nineteen",19);
        put("twenty",20);
        put("thirty",30);
        put("forty",40);
        put("fifty",50);
        put("sixty",60);
        put("seventy",70);
        put("eighty",80);
        put("ninety",90);
        put("hundred",100);
        put("thousand",1000);
        put("million",1000000);

    }};

    public String calculate(String input) {
        String[] words = input.split(" ");
        operator = words[0].toLowerCase();
        operand1 = numberMap.get(words[1]);
        operand2 = numberMap.get(words[3]);
        Integer result = performArithmeticoperation(operator, operand1, operand2);

        return result.toString();
    }

    private Integer performArithmeticoperation(String operator, Integer operand1, Integer operand2) {
        switch (operator) {
            case "add" : return operand1 + operand2;
            case "subtract" : return operand1 - operand2;
            case "divide" : return operand1 / operand2;
            case "multiply" : return operand1 * operand2;
        }
        return null;
    }

    public static void main(String[] args) {
        TextCalculator calculator = new TextCalculator();
        System.out.println(calculator.calculate("Add forty to two"));
    }
}
