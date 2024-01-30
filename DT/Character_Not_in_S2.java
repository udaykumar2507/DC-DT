s1=input().strip()
s2=input().strip()
s1=list(s1)
c=0;
l=len(s1)
for i in range(l):
    if s1[i]!='0':
        if s1.count(s1[i])>s2.count(s1[i]):
            c+=1
        for j in range(l):
            if s1[j]==s1[i]:
                s1[j]='0'
print(c)
