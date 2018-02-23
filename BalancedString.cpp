#include <iostream>
#include <string.h>
#include <stack>
using namespace std;

int main()
{
	char str[] = "{ab[cd{fvdffd]vd}";
	stack<char> st;
	int flag=0;
	for(int i=strlen(str)-1;i>=0;i--){
		switch(str[i]){
			case '}': st.push(str[i]);
						break;
			case ']': st.push(str[i]);
					break;
			case ')': st.push(str[i]);
						break;
			case '{': if (st.top()!='}') flag=1; else st.pop();
						break;
			case '[': if (st.top()!=']') flag=1; else st.pop();
						break;
			case '(': if (st.top()!=')') flag=1; else st.pop();
						break;
			default:
					continue;
		}
	}
	if(flag==0)
	  cout<<"true";
	  else
	  cout<<"false";

	return 0;
}
