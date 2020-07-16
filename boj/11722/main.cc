#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    int n;
    cin >> n;
    int a[n];
    int dp[n];
    for (int i = 0; i < n; ++i)
        cin >> a[i];
    int max_value = 1;
    for (int i = 0; i < n; ++i) {
        dp[i] = 1;
        for (int j = 0; j < i; ++j) {
            if (a[j] > a[i]) {
                dp[i] = max(dp[i], dp[j] + 1);
                max_value = max(max_value, dp[i]);
            }
        }
    }

    cout << max_value;
    return 0;
}
