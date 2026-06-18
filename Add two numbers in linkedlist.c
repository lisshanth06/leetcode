 struct ListNode* create(int value){
    struct ListNode* temp=malloc(sizeof(struct ListNode));
    temp->val=value;
    temp->next=NULL;
    return temp;
 }
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* result = create(0);
    struct ListNode* ptr = result;
    int carry = 0;
        while(l1!=NULL || l2!=NULL){
            int sum=0;
            if(l1!=NULL){
                sum=sum+l1->val;
                l1=l1->next;
            }
            if(l2!=NULL){
                sum=sum+l2->val;
                l2=l2->next;
            }
            carry=sum/10;
            sum=sum%10;
            ptr->next=create(sum);
            ptr=ptr->next;
        }
        if(carry==1){
            ptr->next=create(1);
        }
        return result->next;
}