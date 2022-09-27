class Solution:
    def isPalindrome(self, s: str) -> bool:

        # 문자열을 리스트로 변환
        chars = []
        for char in s:
            if char.isalnum():  # 알파벳 또는 숫자니?
                chars.append(char.lower())  # 소문자화

        while len(chars) > 1:  # 1보다 길이가 길면
            if chars.pop(0) != chars.pop():  # 양쪽 끝을 pop하여 비교
                return False # 다른게 하나라도 있으면 거짓
        return True
