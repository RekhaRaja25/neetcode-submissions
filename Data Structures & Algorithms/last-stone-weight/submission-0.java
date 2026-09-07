class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->b-a);
        for(int st:stones){
            p.add(st);
        }
        while(p.size()>1){
            int x=p.poll();
            int y=p.poll();
            if(x!=y){
                p.add(x-y);
            }

        }
        if (p.isEmpty()) {
            return 0;
        }
        return p.peek();
        
    }
}
