n=int(input())
nums=list(map(int,input().split()))
cnt=0
while(len(nums)>1):
    temp=[]
    for i in range(0,len(nums),3):
        temp.append((max,min)[cnt%2](nums[i:i+3]))
    nums=temp
    cnt+=1
print(nums[0])
