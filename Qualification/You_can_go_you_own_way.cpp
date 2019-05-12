#include <iostream>
#include <string>
using namespace std;

int main(){
    cout<<"Scrivi in input tutti i dati:"<<endl;
    string movement="";
    int row;
    int moves;
    cin>>row;
    string result="";
    for(int i=0;i<row;i++){
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
