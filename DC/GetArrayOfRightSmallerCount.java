int *res=(int*)malloc(sizeof(int)*N);
int cnt=0;
for (int i=0;i<N;i++){
    cnt=0;
    for(int j=i;j<N;j++){
        if (arr[i]>arr[j]){
            cnt++;
        }
    }
    res[i]=cnt;
}
return res;
