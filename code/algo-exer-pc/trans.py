class trans:
    # def getNumber(self,n,m):
    #
    #     if(m==1):
    #         return self.getResult(n,n)
    #
    #     result = 0
    #     for i in range(n-m+1):
    #         result = result.__add__(self.getResult(n,i)).__mul__(self.getNumber(n-i,m-1))
    #     return result
    #
    # def getResult(self,m,n):
    #
    #     result = 1
    #     count = 0
    #     if(n==0):
    #         return 1
    #
    #     for i in range(m,-1,-1):
    #         count+=1
    #         if (count == n):
    #             break
    #
    #     return result

    def find(order):

        i,num = 0,2

        res = []

        while(True):
            if(num % 2 ==0 or num % 3 ==0 or num % 5 ==0):
                res.append(num)
            if len(res) ==1500:
                return res[1500-1]
            num += 1
    num = find(1500)
    print(num)











