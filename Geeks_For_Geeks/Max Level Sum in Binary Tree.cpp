class Solution{
  public:
    /*You are required to complete below method */
    
    int maxLevelSum(Node* root) {
        // Your code here
        int maxi = INT_MIN;//-79222222
        queue<Node*>q;//queue define kiya
        q.push(root);//root push idhr.
        while(!q.empty()){//jab tak queue empty nahi hota
            int size = q.size();//q ki size
            int sum = 0;
            while(size--){
                Node* temp = q.front();//q.poll() in java
                q.pop();
                sum += temp->data;
                if(temp->left!=NULL)q.push(temp->left);
                if(temp->right!=NULL)q.push(temp->right);
            }
            maxi = max(maxi,sum);//max lele maxi nahi tho sum;
        }
        return maxi;
    }
};
