import java.util.*;
class bal_paranthesis{
	public static void main(String args[]){
		Stack<Character> st = new Stack<Character>();
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j=0;j<t;j++){
		String inp = s.next();
		for(int i=0;i<inp.length();i++){

			if(inp.charAt(i)=='[' || inp.charAt(i)=='{' || inp.charAt(i)=='('){
				st.push(inp.charAt(i));
			}
			else if(inp.charAt(i)=='}' && st.peek()=='{' && !st.empty()){
				st.pop();
			}
			else if(inp.charAt(i)==')' && st.peek()=='(' && !st.empty()){
				st.pop();
			}
			else if(inp.charAt(i)==']' && st.peek()=='[' && !st.empty()){
				st.pop();
			}
		}
	
		if(st.empty()==true)
			System.out.println("YES");
		else{
			System.out.println("No");
			st.clear();
		}
	}
	}
}