class Sort:
    # ============================冒泡
    def popsort(num):
        # 外循环表示循环次数
        for i in range(len(num)-1):

            flag = False
            # 内循环表示实际冒泡过程
            for j in range(len(num)-i-1):

                if num[j] > num[j+1]:
                    num[j], num[j + 1] = num[j + 1], num[j]
                    flag = True


            if not flag:return num


    # =========================插入
    def insertSort(num):
        print()

    def merge_sort(arr):
        if len(arr) == 1: return arr
        mid = len(arr) // 2
        left = arr[:mid]
        right = arr[mid:]
        return marge(merge_sort(left), merge_sort(right))

    def marge(left, right):
        res = []
        while len(left) > 0 and len(right) > 0:
            # 左右两个数列第一个最小放前面
            if left[0] <= right[0]:
                res.append(left.pop(0))
            else:
                res.append(right.pop(0))
        # 只有一个数列中还有值，直接添加
        res += left
        res += right
        return res











    nums = [3,2,1]

    num = popsort(nums)

    print(num)











