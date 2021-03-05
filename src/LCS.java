public class LCS {

    public static String lcs(String x, String y) {

/*1*/   int m = x.length(), n = y.length();  //def-use: m, n, opt, x, y
        int[][] opt = new int[m+1][n+1];
        
/*2*/    for (int i = m-1; i >= 0; i--) {  // strings of length > 0 needed to enter for loops
/*3*/         for (int j = n-1; j >= 0; j--) {
/*4*/           if (x.charAt(i) == y.charAt(j)) {
/*5*/              opt[i][j] = opt[i+1][j+1] + 1;
/*6*/           }else{
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
                }
            }
        }
                
/*7*/   String lcs = "";  //def-use: lcs, i, j
        int i = 0, j = 0;
        
/*8*/   while (i < m && j < n) {
/*9*/      if (x.charAt(i) == y.charAt(j)) {
/*10*/          lcs += x.charAt(i);
                i++;
                j++;
/*11*/      }else if (opt[i+1][j] >= opt[i][j+1]) {
                i++;
/*12*/      }else {
                j++;
            }
        }

/*13*/  return lcs;
    
    }

    public static void main(String[] args){
     

    }

}
