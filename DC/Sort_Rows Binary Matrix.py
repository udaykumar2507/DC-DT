n,m=map(int,input().split())
l=[]
for i in range(n):
    l.append(list(map(int,input().split())))
l.sort()
for i in l:
     for j in i:
         print(j,end=" ")
     print()
