n, a, b = map(int, input().split())

# 16, 8, 9
# 8번 참가자 -> 4번 -> 2번 => 1번 -> 1번??
# 9번 참가자 -> 5번 -> 3번 -> 2번 -> 1번?? (모순이 발생. 앞에서 둘이 부딪히게 된 상황)
# 5번 참가자 -> 3번 -> 2번
# 1번 참가자 -> 1번 -> 1번
# ...

cnt = 0
while a != b:
    a = (a + 1) // 2
    b = (b + 1) // 2
    cnt += 1
print(cnt)
