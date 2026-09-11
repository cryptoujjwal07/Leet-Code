class Solution{
    public int totalNumbers(int[] digits){
        boolean[][][] used=new boolean[10][10][10];
        int count=0;
        for(int i=0;i<digits.length;i++){
            int a=digits[i];
            if(a==0)continue;
            for(int j=0;j<digits.length;j++){
                if(j==i)continue;
                int b=digits[j];
                for(int k=0;k<digits.length;k++){
                    if(k==i||k==j)continue;
                    int c=digits[k];
                    if(c%2!=0)continue;
                    if(!used[a][b][c]){
                        used[a][b][c]=true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}