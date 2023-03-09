Python 3.11.0 (main, Oct 24 2022, 18:26:48) [MSC v.1933 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
a = [1, 2, 3, 'string']
a
[1, 2, 3, 'string']
a.
SyntaxError: invalid syntax
a.append['a','b','c',1,2,3]
Traceback (most recent call last):
  File "<pyshell#3>", line 1, in <module>
    a.append['a','b','c',1,2,3]
TypeError: 'builtin_function_or_method' object is not subscriptable

a[0]
1
a[1]
2
a[5]
Traceback (most recent call last):
  File "<pyshell#7>", line 1, in <module>
    a[5]
IndexError: list index out of range
a[3] = 100
a
[1, 2, 3, 100]
a[3] = 50   # index 값도 변경 가능
a.append(6)
a
[1, 2, 3, 50, 6]
a.append(5)   # .append(value)를 적으면 뒤에 값이 추가 되어 저장 됨
a.append('바보')
a
[1, 2, 3, 50, 6, 5, '바보']


a = [1, 2, 3, 4, 5, 6]
a
[1, 2, 3, 4, 5, 6]
b = ['a', 'b', 'c', 'd', 'e']
c = [1, 2, 3, 4, [5, 6], ['
                          
SyntaxError: unterminated string literal (detected at line 1)
c = [1, 2, 3, 4, [5, 6], 'b', 'cc']    # 배열안에 배열도 삽입 가능
                          
c
                          
[1, 2, 3, 4, [5, 6], 'b', 'cc']
'a' in 5
                          
Traceback (most recent call last):
  File "<pyshell#24>", line 1, in <module>
    'a' in 5
TypeError: argument of type 'int' is not iterable
'a' in [5]
                          
False
'a' in [[5]]
                          
False
'a' in [4]
                          
False
a in [4]
                          
False
a in [5,6]
                          
False
c in [5,6]
                          
False
c int [[5,6]]
                          
SyntaxError: invalid syntax
c in [[5,6]]
                          
False
c in [4]
                          
False
c in 4
                          
Traceback (most recent call last):
  File "<pyshell#34>", line 1, in <module>
    c in 4
TypeError: argument of type 'int' is not iterable
'c' in [4]
                          
False
[5] in c
                          
False
5 in c
                          
False
[5] in 'c'
                          
Traceback (most recent call last):
  File "<pyshell#38>", line 1, in <module>
    [5] in 'c'
TypeError: 'in <string>' requires string as left operand, not list
'cc' in c
                          
True
2 in c
                          
True
'cc' in c
                          
True
[5,6] in c
                          
True
[5] in [5,6] in c
                          
False
[[5]] in c
                          
False
File "<pyshell#24>", line 1, in <module>
                          
SyntaxError: invalid syntax
5 in c[4]
                          
True
6 in c[4]
                          
True
6 in c[3]
                          
Traceback (most recent call last):
  File "<pyshell#48>", line 1, in <module>
    6 in c[3]
TypeError: argument of type 'int' is not iterable
5,6 in c[4]
                          
(5, True)
6 in c[4]  # 배열안에 배열은 인덱스 위치로 확인 가능한듯
                          
True
Tru
                          
Traceback (most recent call last):
  File "<pyshell#51>", line 1, in <module>
    Tru
NameError: name 'Tru' is not defined. Did you mean: 'True'?

ㅊ * 2
                          
Traceback (most recent call last):
  File "<pyshell#54>", line 1, in <module>
    ㅊ * 2
NameError: name 'ᄎ' is not defined
c * M2
                          
Traceback (most recent call last):
  File "<pyshell#55>", line 1, in <module>
    c * M2
NameError: name 'M2' is not defined
c * 2
                          
[1, 2, 3, 4, [5, 6], 'b', 'cc', 1, 2, 3, 4, [5, 6], 'b', 'cc']
[1, 2, 3, 4, [5, 6], 'b', 'cc', 1, 2, 3, 4, [5, 6], 'b', 'cc']
                          
[1, 2, 3, 4, [5, 6], 'b', 'cc', 1, 2, 3, 4, [5, 6], 'b', 'cc']

data = '''Im in trouble not because I don't know something. It's because of the illusion that you know something for sure.
-Mark Twain'''
                          
data
                          
"Im in trouble not because I don't know something. It's because of the illusion that you know something for sure.\n-Mark Twain"
data.split()  # 따로 입력 없이 괄호만 하면 자동으로 공백으로 구분
                          
['Im', 'in', 'trouble', 'not', 'because', 'I', "don't", 'know', 'something.', "It's", 'because', 'of', 'the', 'illusion', 'that', 'you', 'know', 'something', 'for', 'sure.', '-Mark', 'Twain']
['Im', 'in', 'trouble', 'not', 'because', 'I', "don't", 'know', 'something.', "It's", 'because', 'of', 'the', 'illusion', 'that', 'you', 'know', 'something', 'for', 'sure.', '-Mark', 'Twain']
                          
['Im', 'in', 'trouble', 'not', 'because', 'I', "don't", 'know', 'something.', "It's", 'because', 'of', 'the', 'illusion', 'that', 'you', 'know', 'something', 'for', 'sure.', '-Mark', 'Twain']
data[5]
...                           
' '
>>> data[4]
...                           
'n'
>>> list1[0]
...                           
Traceback (most recent call last):
  File "<pyshell#65>", line 1, in <module>
    list1[0]
NameError: name 'list1' is not defined. Did you mean: 'list'?
>>> list1 = data.split()
...                           
>>> list1[9]
...                           
"It's"
>>> "It's"
...                           
"It's"
>>> list1.sort()
...                           
>>> list1
...                           
['-Mark', 'I', 'Im', "It's", 'Twain', 'because', 'because', "don't", 'for', 'illusion', 'in', 'know', 'know', 'not', 'of', 'something', 'something.', 'sure.', 'that', 'the', 'trouble', 'you']
>>> list1.sort(-1)
...                           
Traceback (most recent call last):
  File "<pyshell#72>", line 1, in <module>
    list1.sort(-1)
TypeError: sort() takes no positional arguments
>>> list1.reverse()
...                           
>>> list1
...                           
['you', 'trouble', 'the', 'that', 'sure.', 'something.', 'something', 'of', 'not', 'know', 'know', 'in', 'illusion', 'for', "don't", 'because', 'because', 'Twain', "It's", 'Im', 'I', '-Mark']
