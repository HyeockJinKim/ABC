#include <iostream>

using namespace std;
int main() {
    ios::sync_with_stdio(false);
    const long M = 1234567891;
    long r = 1;
    long H = 0;
    int base = 'a'-1;

    int len;
    string s;
    cin >> len >> s;

    for (char t : s) {
        H = (H + (t-base)*r) % M;
        r = (r * 31) % M;
    }
    cout << H;
    return 0;
}
