#include <iostream>
#include <string>
using namespace std;

int main(){
    string movement="";
    int row;
    int moves;
    cin>>row;
    for(int i=0;i<row;i++){
        string result="";
        cin>>moves;
        cin>>movement;
        for(int j=0;j<movement.length();j++){
            if(movement.at(j)=='S')
                result+='E';
            else 
                result+='S';
        }
        cout<<"Case #"<<i+1<<": "<<result<<endl;
    }
    return 0;
}
