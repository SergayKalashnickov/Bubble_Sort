
def Sorting(ob):
    sort=ob
    n=len(sort)
    for i in range(n-1):
        for j in range(n-i-1):
            if sort[j+1]>sort[j]:
                temp = sort[j]
                sort[j]=sort[j+1]
                sort[j+1]=temp
    return sort

def Datain():
    data = []
    stop=True
    while stop:
        try:
            s=int(input())
            if type(s)==type(1):  
                data.append(s)
        except ValueError as e:
            stop=False
    return data

#example

dataTest=Datain()
print(Sorting(dataTest))


