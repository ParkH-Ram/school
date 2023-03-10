#set 연습 문제
'''
오른쪽 그림과 같은 집합을 생성하고 다음 물음에 답하라
    집합 A,B,C를 각각 선언하라
    집합 A와 B의 합집합을 구하라
    집합 A와 C의 차집합을 구하라
    집합 A와 B,C의 교집합을 구하라

과일에 대한 데이터를 다음과 같이 입력했을 때 중복된 값이 제외된
상태로 출력되도록 변수를 선언하고 출력하십시오
    입력 : melon  banana strawberry melon banana blueberry banana strawberry
    출력 : {'strawberry', 'blueberry', 'melon', 'banana'}'''




    #집합 A,B,C를 각각 선언하라
setA = set('aaabbcdefgghh')
setB = set('defhhikkllmmo')
setC = set('efggijjnnpp')
    #집합 A와 B의 합집합을 구하라
print('setA와 setB의 합집합은 -> ', setA|setB) 
    #집합 A와 C의 차집합을 구하라
print('setA와 setC의 차집합은 -> ', setA-setC) 
    #집합 A와 B,C의 교집합을 구하라
print('setA와 setB, setC의 교집합은 -> ', setA & setC & setB) 


#과일에 대한 데이터를 다음과 같이 입력했을 때 중복된 값이 제외된
#상태로 출력되도록 변수를 선언하고 출력하십시오

str1 = input("입력 : ")
#str1.split()     # 입력받은 str1을 공백 기준으로 배열 형태로 바꿈
print("중복 제거한 후 목록 : ", set(str1.split()))
