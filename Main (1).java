/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		// S and T are the two strings we want to compare
    int n = s.length(); // length of s
    int m = t.length(); // length of t
    if (n == 0) {
        return m;
                }
    else if (m == 0){
        return n;
                    }
    int p[] = new int[n+1];
    int d[] = new int[n+1];
    int _d[];
    int i;
    int j;
    char t_j;
    int cost;
    for (i = 0; i<=n; i++) {
    p[i] = i;
    }
    for (j = 1; j<=m; j++) {
        t_j = t.charAt(j-1);
        d[0] = j;
        for (i=1; i<=n; i++) {
            cost = s.charAt(i-1)==t_j ? 0 : 1;
            d[i] = Math.min(Math.min(d[i-1]+1, p[i]+1), p[i-1]+cost);
                            }
        _d = p;
        p= d;
        d = _d;
    }
    return p[n]; // Levenshtein Distance between S and T
	}
}
