package Max;

public class maxWealth {

    public static void main(String[] args) {
int [][]  accounts = {{1,5},{7,3},{3,5}};

        System.out.println(max(accounts));
        System.out.println( Integer.MIN_VALUE);

    }
      static int  max(int[][] accounts){

          // person = rol
          // account = col
          int ans = Integer.MIN_VALUE;

          for (int person=0;person<accounts.length;person++) {
              // when you start a new row, take a new sum for that row
              int sum = 0;
              for (int account=0;account<accounts[person].length;account++) {
                  sum += accounts[person][account];
              }
              // now we have sum of accounts of person
              // check with overall ans
              if (sum > ans) {
                  ans = sum;
              }
          }
          return ans;



      }


}
