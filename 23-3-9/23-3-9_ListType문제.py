#1. 정수 1, 2, 3과 문자열 'string'을 포함하는 리스트를 생성하고 다음 내용을 진행하라
    # 생성한 리스트에 'a', 'b', 'c', 1, 2, 3원소를 추가하라
    
# 생성한 리스트에 'a', 'b', 'c', 1, 2, 3원소를 추가하라ㅇ
# 생성한 리스트에 'a', 'b', 'c', 1, 2, 3원소를 추가하라ㅇ



# 생성한 리스트에 'a', 'b', 'c', 1, 2, 3원소를 추가하라#1. 정수 1, 2, 3과 문자열 'string'을 포함하는 리스트를 생성하고 다음 내용을 진행하라


#1. 정수 1, 2, 3과 문자열 'string'을 포함하는 리스트를 생성하고 다음 내용을 진행하라
	# 생성한 리스트에 'a', 'b', 'c', 1, 2, 3원소를 추가하라
	# 리스트의 1~3의 위치를 조회하라
	# 'string'의 위치를 파악하라.
	# 리스트에 1의 개수를 파악하라.

#2. "I love you, ram!"이라는 문자열을 생성하고 다음을 구현하라.
	# 위 문자열을 공백을 기준으로 나누는 배열 a에 저장하라
	# ram이 들어있는 배열은 a의 몇 번째 배열에 저장되어 있는가
	# 배열 a 의 길이를 구하라



#1. 정수 1, 2, 3과 문자열 'string'을 포함하는 리스트를 생성하고 다음 내용을 진행하라
a = [1, 2, 3, 'string']
print(a)
	# 생성한 리스트에 'a', 'b', 'c', 1, 2, 3원소를 추가하라
a += ['a', 'b', 'c', 1, 2, 3]
print('1-1문제 : ', a)     # 파이썬 에서는 + 대신 ,(콤마)를 써줌 
	# 리스트의 1~3의 위치를 조회하라
print('1~3의 위치 : ', a[1:4])
	# 'string'의 위치를 파악하라.
print('string 위치 : ', a.index('string'))
	# 리스트에 1의 개수를 파악하라.#1. 정수 1, 2, 3과 문자열 'string'을 포함하는 리스트를 생성하고 다음 내용을 진행하라
print('1의 개수 : ', a.count(1))
print()

#2. "I love you, ram!"이라는 문자열을 생성하고 다음을 구현하라.
ram ="I love you, ram!"
	# 위 문자열을 공백을 기준으로 나누는 배열 a에 저장하라
ram = ram.split()
print(ram)
	# ram이 들어있는 배열은 a의 몇 번째 배열에 저장되어 있는가
print("ram의 위치는 : ", ram.index('ram!'))
	# 배열 a 의 길이를 구하라
print("ram의 길이는 : ", len(ram))   # 파이썬에서 길이 함수 len(변수명)


      

      
