#include <bits/stdc++.h>

using namespace std;

vector < int > solve(vector < int > grades){
    // Complete this function
    //Now you have a vector of grades...
    //each grade should be rounded off only if it is less that 3 units less than the next multiple of the 5....
    //if less than 38 fail and no change in the grade...
    for(int i=0;i<grades.size();i++)
    {
        if(grades[i]<38){continue;}
        else 
        {
            int r = grades[i]%5;
            int dist = 5 - r;
            if(dist < 3)
            {
                grades[i] += dist;
            }
        }    
    }
    return grades;
}

int main() {
    int n;
    cin >> n;
    vector<int> grades(n);
    for(int grades_i = 0; grades_i < n; grades_i++){
       cin >> grades[grades_i];
    }
    vector < int > result = solve(grades);
    for (ssize_t i = 0; i < result.size(); i++) {
        cout << result[i] << (i != result.size() - 1 ? "\n" : "");
    }
    cout << endl;
    

    return 0;
}
