# 단어 뒤집기 
# n개의 글자를 스택에 넣었다가 뺴면 순서가 역순이되도록 출력하라
# abcd 1234 -> dcba 4321

import sys

data = sys.stdin.read().splitlines()

def reverse_words(input):
    words = input.split()
    reversed_words = []
    for word in words:
        reversed_word = ''
        alphabets = list(word)

        while(len(alphabets) != 0):
            reversed_word = reversed_word + alphabets.pop()

        reversed_words.append(reversed_word)
    
    return ' '.join(reversed_words)

for line in data:
    print(reverse_words(line))
        