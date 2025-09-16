import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        HashMap<Integer,Integer[]> secretKnown = new HashMap<>();
        int num=2;
        secretKnown.put(1,new Integer[]{delay-1,forget-1});
        for(int j= 2 ; j<=n ; j++){
            int temp =0;
            ArrayList<Integer> del = new ArrayList<>();
            for(Integer i : secretKnown.keySet()) {
                if (secretKnown.get(i)[1] > 0) {
                    if (secretKnown.get(i)[0] <= 0) {
                        temp += 1;
                    }
                    secretKnown.get(i)[1]--;
                    secretKnown.get(i)[0]--;
                } else {
                    del.add(i);
                }

            }
            for (int i = 0 ; i <temp ; i++){
                secretKnown.put(num,new Integer[]{delay-1,forget-1});
                num++;
            }
            for (Integer i : del) {
                secretKnown.remove(i);
            }
        }
        return secretKnown.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.peopleAwareOfSecret(4,1,3));
    }
}