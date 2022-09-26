class Solution {
    public boolean isValid(String s) {
        Stack<Character>charStack = new Stack<>();
        for (int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c == '{' || c == '[') {
                charStack.push(c);
            } else if (charStack.size()>0){
                if ((charStack.peek() == '(' && c==')') || (charStack.peek() == '[' && c==']') || (charStack.peek() == '{' && c=='}')){
                    charStack.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        }return charStack.empty();
        
    }
}