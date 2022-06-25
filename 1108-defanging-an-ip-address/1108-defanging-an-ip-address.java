class Solution {
    public String defangIPaddr(String address) {
        String newone="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)!='.'){
                newone=newone+address.charAt(i);
            }
            else{
                newone=newone+'['+'.'+']';
            }
        }
        return newone;
    }
}