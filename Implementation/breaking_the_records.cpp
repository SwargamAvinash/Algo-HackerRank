#include <bits/stdc++.h>

using namespace std;

vector <int> breakingRecords(vector <int> score) {
    // Complete this function
    vector<int> result;
    int high_score;
    int low_score;
    
    high_score = low_score = score[0];
    int h_b =0,l_b = 0;
    for(int i=1;i<score.size();i++)
    {
        if(score[i] > high_score)
        {
            h_b++;
            high_score = score[i];
        }
        else if(score[i] < low_score)
        {
            l_b++;
            low_score = score[i];
        }
    }
    result.push_back(h_b);
    result.push_back(l_b);
}

int main() {
    int n;
    cin >> n;
    vector<int> score(n);
    for(int score_i = 0; score_i < n; score_i++){
       cin >> score[score_i];
    }
    vector <int> result = breakingRecords(score);
    for (ssize_t i = 0; i < result.size(); i++) {
        cout << result[i] << (i != result.size() - 1 ? " " : "");
    }
    cout << endl;


    return 0;
}
