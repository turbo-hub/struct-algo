import collections


class arrayexer:

    # ===============================三数之和 题号15========================================
    """
    数组中找出三数之和等0的元素，每三个元素形成一个list list不能重复
    即不可出现 list[-1,0,1]  list[-1,0,1]两个相同的list
    """
    def threeSum(self, num):

        # 不够3个元素 或者 num为空时就是false not num就是true 直接返回
        if (not num or len(num) < 3):
            return num

        # 将数组排序
        num.sort()
        result = []
        for i in range(len(num)):

            # 如果第一个数就大于0 由于数组已经排序 后面肯定大于0 所以直接返回空数组
            if (num[i] > 0):
                return result
            # 如果前后两个数相同 前面的数已经循环过一遍 后面相同的数直接跳过 继续下次循环
            if (i > 0 and num[i] == num[i - 1]):
                continue

            # 设定i之后的范围内的左右两个指针
            l = i + 1
            r = len(num) - 1
            while (l < r):

                if (num[i] + num[l] + num[r] == 0):
                    result.append([num[i], num[l], num[r]])
                    # 如果左指针的 当前数 和 后面的数相同 那么左指针指向后面的数
                    while (l < r and num[l] == num[l + 1]):
                        l = l + 1
                    while (l < r and num[r] == num[r - 1]):
                        r = r - 1
                    # 左指针跳过两个相同数后面的那个
                    l = l + 1
                    r = r - 1
                # 如果三数相加不为0移动左右指针
                elif (num[i] + num[l] + num[r] < 0):
                    l = l + 1
                elif (num[i] + num[l] + num[r] > 0):
                    r = r - 1
        return result

    # ===============================求众数 题号169========================================
    def majorityElement(self,array):
        counts = collections.Counter(array)
        return max(counts.keys(), key=counts.get)

    # ===============================第一个缺失的正整数 题号41========================================






exer = arrayexer()
# list = exer.threeSum([[2,7,11,15]])

print(exer.majorityElement([2,7,11,11,11,11,15]))
