import java.util.Stack;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here

		if (input.size() <= 1) {
			 return;
			  }
			   int lastElement = input.pop(); 
			   reverseStack(input, extra);
			    while (!input.isEmpty()) {
					 int top = input.pop(); 
					 extra.push(top);
					  } 
					  input.push(lastElement); 
					  while (!extra.empty()) {
						   int top = extra.pop(); 
						   input.push(top); }
	}
}
