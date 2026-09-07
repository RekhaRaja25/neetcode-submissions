class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int l=st.pop();
                st.push(l);
                st.push(2*l);
            }
            else if(op.equals("+")){
                int l=st.pop();
                int s=st.peek();
                st.push(l);
                int res=l+s;
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
            int total=0;
            for(int score:st){
                total+=score;
                
            }
     return total;
    }
}