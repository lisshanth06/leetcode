class Solution {
    public List<List<Integer>> generate(int numRows) {
        int row = numRows;
        int n = numRows;
        int[][] arr = new int[row][row];
        for(int i=0;i<n;i++){
            arr[i][0]=1;
            arr[i][i]=1;
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(arr[i][j]);
            }
            result.add(temp);
        }
        return result;
    }
}