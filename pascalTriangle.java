//118. Pascal's Triangle


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList<>(numRows);
        for(int i = 0; i < numRows; i++){
            if(i == 0){
                List<Integer> ncr = new ArrayList<>(1);
                ncr.add(1);
                row.add(ncr);
            }
            else{
                List<Integer> ncr = new ArrayList<>(i+1);
                for(int k = 0; k < i + 1; k++){
                    ncr.add(k, 0);
                }
                ncr.set(0, 1); ncr.set(i, 1);
                row.add(ncr);
                if(i > 1){
                    for(int j = 1; j < i; j++){
                        row.get(i).set(j, row.get(i-1).get(j-1) + row.get(i-1).get(j));
                    }
                }
            }
        }
        return row;
    }
}
