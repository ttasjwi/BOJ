# n이 주어질 때
# 1번 : 공백 1-1 , 별 2 *n -1
# 2번 : 공백 2-1, 별 2*n-(2*2-1)
# 3번 : 공백 3-1, 별 2*n-(2*3-1)

n = int(input())
print('\n'.join([' ' * (i - 1) + '*' * (2 * n - (2 * i - 1)) for i in range(1, n + 1)]))
