Python 3.11.0 (main, Oct 24 2022, 18:26:48) [MSC v.1933 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
'I like you'
'I like you'
"I like you"
'I like you'

"I like you'
SyntaxError: unterminated string literal (detected at line 1)
"I don't like you"
"I don't like you"
'you sad "I like you"'
'you sad "I like you"'
"마 돌았나"
'마 돌았나'
'마 돌았나'
'마 돌았나'
' ' '
SyntaxError: unterminated string literal (detected at line 1)
'please, don\'t say to me'    #
"please, don't say to me"
'please, don\'t say to me'    # /역슬래시를 붙이면 이런식으로 연결 해서 사용 가능
"please, don't say to me"
print('1st\n2nd')           #\n = enter 기능
1st
2nd
print('1st\r2nd
      
SyntaxError: unterminated string literal (detected at line 1)
>>> print('1st\r2nd')             \r 라인피드 라인을 댕긴다?
...       
SyntaxError: unexpected character after line continuation character
>>> print('1st\r2nd')             #\r 라인피드 라인을 댕긴다?
...       
1st
>>> 2nd
... print(r'C:\new_folder')    # r'내용' 하면  날 것 그대로 사용? 역 슬래시 기능 삭제
      
>>> C:\new_folder
... print(C:\\new_folder')   # \ 역슬래시를 앞에 붙이면 기능 삭제
      
>>> SyntaxError: invalid syntax
... print('C:\\new_folder')   # \ 역슬래시를 앞에 붙이면 기능 삭제
      
>>> C:\new_folder

======================================================================================================================================== RESTART: C:/Users/codepc/Desktop/test.py =======================================================================================================================================

안녕 만나서 반가워
배가 고프구나ㅓ
배가 너무 고파 뒤지겠는데
나는 계란만 먹어야 겠지 시발
>>> 
... a = 'a'
>>>       
... a * 3
      
>>> 'aaa'
... a + a / a
      
Traceback (most recent call last):
  File "<pyshell#20>", line 1, in <module>
    a + a / a
>>> TypeError: unsupported operand type(s) for /: 'str' and 'str'
... a + a
      
'aa'
'a' * 1000
      
'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'
type(a)
      
<class 'str'>
s1 = 'I like you'
      
s1
      
'I like you'
s1[0]
      
'I'
s1[1]
      
' '
si [2]
      
Traceback (most recent call last):
  File "<pyshell#28>", line 1, in <module>
    si [2]
NameError: name 'si' is not defined. Did you mean: 's1'?
si[2]
      
Traceback (most recent call last):
  File "<pyshell#29>", line 1, in <module>
    si[2]
NameError: name 'si' is not defined. Did you mean: 's1'?
sl[2]
      
Traceback (most recent call last):
  File "<pyshell#30>", line 1, in <module>
    sl[2]
NameError: name 'sl' is not defined. Did you mean: 's1'?
s1[2]
      
