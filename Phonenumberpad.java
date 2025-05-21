class Phonenumberpad {
    /*public List<String> letterCombinations(String digits) {
        
    }*/
    public static void main(String[] args) {
        String num="";
        StringBuilder va=new StringBuilder();
        solution(va,num,num.length());
    }
    public static void solution(StringBuilder value,String num,int n){
        if (n==0){
            System.out.println(value);
            return;
        }
        char A='a';
        int start=(num.charAt(0)-'2')*3;
        int end=start+3;
        int numberInFirst=num.charAt(0)-'0';
        if (numberInFirst==7){
            end+=1;
        }
        else if (numberInFirst>7){
            start+=1;
            end=(numberInFirst>8)? end+2:end+1;
        }
        for (int i = start; i < end; i++) {
            char toAdd=(char)(A+i);
            value.append(toAdd);
            solution(value,num.substring(1),n-1);
            value.deleteCharAt(value.length()-1);
        }
    }
}
