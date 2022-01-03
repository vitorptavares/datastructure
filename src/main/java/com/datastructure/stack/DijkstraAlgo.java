package stack;

import java.util.Stack;

public class DijkstraAlgo {
    private Stack<Character> operationStack;
    private Stack<Double> valueStack;

    public DijkstraAlgo() {
        this.operationStack = new Stack<>();
        this.valueStack = new Stack<>();
    }

    public void interpretExpression(String expression){
        char[] expressionArray = expression.toCharArray();

        for (char c :
                expressionArray) {
            //if c== '(' do nothing
            if(c=='('){

            }
            else if(c=='+' || c=='*'){
                operationStack.push(c);
            }
            else if(c==')'){
                Character operation = operationStack.pop();
                if(operation.equals('*')){
                    valueStack.push(valueStack.pop() * valueStack.pop());
                }
                if(operation.equals('+')){
                    valueStack.push(valueStack.pop() + valueStack.pop());
                }
            }
            else{
                valueStack.push(Double.valueOf(String.valueOf(c)));
            }
        }
        System.out.println(valueStack.pop());
    }
}
