class Solution {
    public static int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> xorValues = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) matrix[i][j] ^= matrix[i - 1][j];
                if (j > 0) matrix[i][j] ^= matrix[i][j - 1];
                if (i > 0 && j > 0) matrix[i][j] ^= matrix[i - 1][j - 1];
                xorValues.add(matrix[i][j]);
            }
        }
        Collections.sort(xorValues, Collections.reverseOrder());
        return xorValues.get(k - 1); 
    }
}