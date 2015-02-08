import java.util.Scanner;


public class _02_InstructionSetCorrect {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();
        
        while (!opCode.equals("END")) {
            String[] codeArgs = opCode.split(" ");

            long result = 0;
            switch (codeArgs[0]) {
                case "INC": {
                    long operandOne = Integer.parseInt(codeArgs[1]);
                    operandOne++;
                    result = operandOne;
                    break;
                }
                case "DEC": {
                    long operandOne = Integer.parseInt(codeArgs[1]);
                    operandOne--;
                    result = operandOne;
                    break;
                }
                case "ADD": {
                    long operandOne  = Integer.parseInt(codeArgs[1]);
                    long operandTwo = Integer.parseInt(codeArgs[2]);
                    result = operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                    long operandOne  = Integer.parseInt(codeArgs[1]);
                    long operandTwo = Integer.parseInt(codeArgs[2]);
                    result = operandOne * operandTwo;
                    break;
                }
                default:
                    break;
            }

            System.out.println(result);
            opCode = input.nextLine();
        }
    }
}
