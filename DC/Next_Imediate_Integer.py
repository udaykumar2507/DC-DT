n=list(input());
l=[int(i) for i in n]
pivot=0
flag=False
for i in range(len(l)-1,-1,-1):
    if (i==0):
        flag=True;
        break;
    if (l[i]>l[i-1]):
        pivot=i-1
        break;
if (flag==True):
    print(-1);
else:
    smallEl=0;
    for i in range(len(l)-1,0,-1):
        if (l[i]>l[pivot]):
            smallEl=i;
            break;
    l[pivot],l[smallEl]=l[smallEl],l[pivot]
    rev=l[:pivot+1]+l[pivot+1:][::-1]
    for i in rev:
        print(i,end="")
