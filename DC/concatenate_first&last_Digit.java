ULL concatenateFirstAndLastXDigits(int N, int X)
{ int cnt=0;
   unsigned n=N;
   while(n>0){
       cnt++;
       n/=10;
   }
   unsigned long long pw=1;
   for (int i=0;i<X;i++){
       pw*=10;
   }
   unsigned long long pw1=1;
   for (int i=0;i<cnt-X;i++){
       pw1*=10;
   }
   unsigned long long st=N/pw1;
   unsigned long long end=N%pw;
   return st*pw+end;
}
