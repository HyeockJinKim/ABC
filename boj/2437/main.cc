#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    cin.tie(nullptr);
    ios::sync_with_stdio(false);

    int n;
    cin >> n;
    int* a = new int[n];
    for (int i = 0; i < n; ++i)
        cin >> a[i];

    sort(a, a+n);
    int sum = 0;
    for (int i = 0; i < n; ++i) {
        if (sum+1 < a[i]) {
            break;
        }
        sum += a[i];
    }
    cout << sum+1;
}