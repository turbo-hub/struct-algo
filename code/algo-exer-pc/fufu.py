def version_scort(version_list):

    version_list.sort(key=lambda x:tuple(v for v in x.split(".")))

    print(version_list)


import itertools
def combain(n,k):

    # 根据k生成所有面数的list
    k_list = []
    for i in range(1,k+1):
        k_list.append(i)

    # 有放回排列数
    combain_list =  [d for d in itertools.product(k_list,repeat = n)]

    print(combain_list)

    count_dic = {}
    for e in combain_list:

        sum_e = e[0]+e[1]

        if sum_e not in count_dic.keys() and sum_e >=n:
            count_dic[sum_e] = 1

        elif sum_e in count_dic.keys() and sum_e>=n:
            count_dic[sum_e] = count_dic[sum_e]+1

    res_list = []
    for k,v in count_dic.items():
        #计算概率
        res_list.append([k,round(v/len(combain_list), 2)])

    print(res_list)

version_scort(["1.2.0.1234", "0.1", "1.0.0", "1.0", "1.0.0.build-160217"])
combain(2,6)