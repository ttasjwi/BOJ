l = int(input())

answer = (l // 5) if l % 5 == 0 else (l // 5 + 1)
print(answer, end='')
