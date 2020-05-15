class regexp{
	public static void main(String args[]){
		String inp="123$Aneesh@123";
		String regex="[a-zA-Z]";
		String space=" ";
		String name="",spcl="",b;
		for(int i=0;i<inp.length();i++){
			char c=inp.charAt(i);
			if(inp.valueOf(c).matches(regex)){
				name=name+c;
			}
			else if(inp.valueOf(c).matches("\\s")){
			
			}
			else
				spcl=spcl+c;
		}
		System.out.println(name+spcl);
	}
}