#include <iostream>

using namespace std;
int * map;
int * s, *result;
int n, number;

int dfs(int index) {
    if (map[s[index]] == number) {
        map[index] = number;
        return s[index];
    }
    if (map[index] != 0)
        return -1;

    map[index] = number;
    int res = dfs(s[index]);
    if (res == index) {
        number++;
        return -1;
    } else if (res == -1) {
        map[index] = -1;
        return -1;
    } else {
        return res;
    }
}

int main() {
    ios::sync_with_stdio(false);
    int T;
    cin >> T;
    result = new int[T];
    for (int i = 0; i < T; ++i) {
        cin >> n;
        s = new int[n+1];
        map = new int[n+1];
        number = 1;

        for (int j = 1; j <= n; ++j)
            cin >> s[j];

        for (int j = 1; j <= n; ++j)
            dfs(j);

        int count = 0;
        for (int j = 1; j <= n; ++j)
            if (map[j] == -1)
                ++count;

        result[i] = count;
    }

    for (int i = 0; i < T; ++i)
        cout << result[i] << '\n';
    return 0;
}
