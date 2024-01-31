int oddsum=0;
int evensum=0;
for (int i=0;i<N;i++){
    if (arr[i]%2==0){
        evensum+=arr[i];
    }else{
        oddsum+=arr[i];
    }
}
return oddsum%evensum;
