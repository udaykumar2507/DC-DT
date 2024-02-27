n,k=map(int,input().split())
n=str(n)
l=len(n)
c=0;
for i in range(l):
    if n[i]!='0' and c<k:
        n=n[:i]+'0'+n[i+1:]
        c+=1
print(int(n))
