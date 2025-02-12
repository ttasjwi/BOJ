# 문제
- 플랫폼 : 프로그래머스
- 번호 : 131127
- 제목 : 할인 행사
- 난이도 : Level 2
- 문제 : <a href="https://school.programmers.co.kr/learn/courses/30/lessons/131127" target="_blank">링크</a>

---

# 필요 지식
- 해시

---

# 풀이
```python
def solution(want, number, discount):
    answer = 0
    want_counter = {} # 희망 구매 목록
    daily_counter = {} # 현재 수량

    # want-number 쌍을 순회하면서 목록 초기화
    for w, n in zip(want, number):
        want_counter[w] = n
        daily_counter[w] = 0

    # discount 를 순회하면서 목록 초기화
    for item in discount:
        if item not in want_counter:
            want_counter[item] = 0
        if item not in daily_counter:
            daily_counter[item] = 0

    # 날짜 경과하면서 그날 할인품목을 추가(첫날부터), 제거(10일차부터)
    # 그날 할인품목과 희망 할인품목 비교(9 일차부터)
    for day in range(len(discount)):
        daily_counter[discount[day]] += 1
        if day >= 10:
            daily_counter[discount[day - 10]] -= 1
        if day >= 9 and want_counter == daily_counter:
            answer += 1
    return answer
```
- want_counter : 내가 원하는 갯수를 가리키는 카운터
- daily_counter : 최근 10일간, 각 제품 할인일수 누적 카운터
- 카운터를 비교하기 위해서는 각 카운터가 가진 제품군의 종류를 맞춘다.
- 날짜가 경과할 때마다 다음 작업을 수행한다.
  - 오늘 할인 품목을 daily_counter 에서 찾아 1 증가
  - 10일 전 할인 품목을 daily_counter 에서 찾아 1 감소
  - daily_counter 와 want_counter 비교 후 같으면 1 증가

---
