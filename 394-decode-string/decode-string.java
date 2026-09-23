class Solution {
    public String decodeString(String s) {
        Stack<Integer> num= new Stack<>();
        Stack<String> str =new Stack<>();

        String curr="";
        int n=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isDigit(c)){
                n=n*10+(c-'0');
            }
            else if(c=='['){
                num.push(n);
                str.push(curr);

                n=0;
                curr="";
            }
            else if(c==']'){
                int repeat= num.pop();
                String prev =str.pop();

                String temp="";
                for(int j=0;j<repeat;j++){
                    temp+=curr;
                }
                curr= prev+temp;
            }
            else{
                curr+=c;
            }
        }
        return curr;
    }
}