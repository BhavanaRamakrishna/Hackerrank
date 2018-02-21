#include <bits/stdc++.h>

using namespace std;

vector <int> cutTheSticks(vector <int> arr) {


	if (arr.empty()) return arr;

	cout << arr.size() << endl;
	int small = arr[0];
	arr.erase(arr.begin());
	for (auto it = arr.begin(); it != arr.end();)
		if (small == *it)
			it = arr.erase(it);
		else
			*it++ -= small;

	return cutTheSticks(arr);

}

int main() {
	int n;
	cin >> n;
	vector<int> arr(n);
	for(int arr_i = 0; arr_i < n; arr_i++){
	   cin >> arr[arr_i];
	}
	sort(arr.begin(), arr.end());
	vector <int> result = cutTheSticks(arr);
	for (ssize_t i = 0; i < result.size(); i++) {
		cout << result[i] << (i != result.size() - 1 ? "\n" : "");
	}
	cout << endl;


	return 0;
}
