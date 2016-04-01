package code.rpn;

import java.util.Stack;

public class RPNCalc {

	public String calculate(String expr) {
		// TODO Auto-generated method stub
		Stack<String> obj = new Stack<String>();
		String ExprArray []= expr.split(",");
		for(int i=0; i<ExprArray.length;i++)
		{
			if (ExprArray[i].equals("+"))
			{
				obj.push(String.valueOf(Integer.parseInt(obj.pop())+Integer.parseInt(obj.pop())));
				
			}	
			else if (ExprArray[i].equals("-"))
			{
				obj.push(String.valueOf(Integer.parseInt(obj.pop())-Integer.parseInt(obj.pop())));
				
			}	
			else
				obj.push(ExprArray[i]);
		}
		return obj.pop();
	}

}
