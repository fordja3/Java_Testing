public class LCS {

    public static String lcs(String x, String y) {

/*1*/   int m = x.length(), n = y.length();  //def-use: m, n, opt, x, y
        int[][] opt = new int[m+1][n+1];
        
/*2*/    for (int i = m-1; i >= 0; i--) {  // defined at the entry of the block
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

//     Complete the following tasks:
// 1. Draw a control flow graph for the lcs method. 
//    Choose something reasonable for the node numbers in the graph.
// 2. Label the control graph with defs and uses at the appropriate nodes.
// 3. Compute the all-def-use paths criteria for the graph.
// 4. Implement a set of JUnit tests that cover as many of the all-def-use 
//    paths (test requirements) as possible.
// 5. Reflecting on the JUnit test you have written in the previous task, are there any tests 
//    that you would have written if you only used your intuition and 
//    did not follow the all-def-use criteria?
//    Are there any tests that you ended up writing that you would not have otherwise thought of?

}
