"""
sys.stdin의 특징

sys.stdin은 입력 스트림으로, 기본적으로 사용자 키보드로부터 입력을 받습니다. 즉, 프로그램 실행 중에 사용자가 입력한 데이터는 sys.stdin을 통해 전달됩니다.
일반적으로 파이썬에서는 input() 함수를 사용하여 사용자 입력을 받습니다. 하지만 sys.stdin을 사용하면 입력을 더 효율적으로 읽을 수 있습니다. 특히 많은 양의 데이터를 처리할 때 유리합니다.

사용방법 

import sys
data = sys.stdin.read()
print(data)
"""

import sys

data = sys.stdin.read().splitlines() # 입력값을 전부 읽어 한줄한줄 분리해서 리스트로 반환한다.

for line in data:
    print(line)