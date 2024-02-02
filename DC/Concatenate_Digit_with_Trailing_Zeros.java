ULL concatenateDigitsWithTrailingZeros(int arr[], int N)
{   int cnt=0;
    long rem=0;
    for (int i=0;i<N;i++){
        if (arr[i]==0){
            cnt++;
        }else{
            rem=arr[i]+(rem*10);
        }
    }
    if (cnt>=1){
    return rem*(pow(10,cnt));
    }else{
        return rem;
    }
}
