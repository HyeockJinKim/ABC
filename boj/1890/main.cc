#include <iostream>
#include <vector>

using namespace std;

int **map;
unsigned long **dp;
int n;

int main() {
    ios::sync_with_stdio(false);
    cin >> n;
    map = new int*[n];
    dp = new unsigned long*[n];

    for (int i = 0; i < n; ++i) {
        map[i] = new int[n];
        dp[i] = new unsigned long[n];
        for (int j = 0; j < n; ++j)
            cin >> map[i][j];
    }
    dp[0][0] = 1;
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            int dis = map[i][j];
            if (dis == 0)
                continue;

            if (dis + i < n)
                dp[dis+i][j] += dp[i][j];
            if (dis + j < n)
                dp[i][dis+j] += dp[i][j];
        }
    }

    cout << dp[n-1][n-1];
    return 0;
}
