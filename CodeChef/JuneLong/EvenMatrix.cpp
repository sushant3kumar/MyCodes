#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
		int t=0;
		cin>>t;
		while(t-->0)
		{
		    int n = 0;
		    cin>>n;
		   
		    int ans=1;
		    for(int i=1;i<=n;i++)
		    {
		        if(i%2!=0)
		        {
		            if(i!=1)
		            {
		                ans=ans+n+1;
		            }
		            for(int j=1;j<=n;j++)
		            {
		                cout<<ans<<" ";
		                ans++;
		            }
		            cout<<endl;
		            
		        }
		        else
		        {
		            ans=ans+n-1;
		             for(int j=n;j>=1;j--)
		            {
		                cout<<ans<<" ";
		                ans--;
		            }
		            cout<<endl;
		            
		        }
		        
		    }
		    
		}
	return 0;
}
