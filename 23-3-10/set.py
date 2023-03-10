Python 3.11.0 (main, Oct 24 2022, 18:26:48) [MSC v.1933 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
market = {'beef', 'pork', 'lamb', 'beef', 'pork', 'lamb','beef', 'pork', 'lamb','beef', 'pork', 'lamb',}
market
{'beef', 'lamb', 'pork'}
len(merket)
Traceback (most recent call last):
  File "<pyshell#2>", line 1, in <module>
    len(merket)
NameError: name 'merket' is not defined. Did you mean: 'market'?
len(market)
3
\
'beef' in market   # beef 가 마켓 안에 있냐
True
'pear1' in market   # pear1 이 마켓 안에 있냐
False
a = set('12345678)
        
SyntaxError: unterminated string literal (detected at line 1)
a = set('12345678')
        
b=set('4567890')
        
a
        
{'3', '2', '5', '6', '1', '7', '8', '4'}
b
        
{'9', '6', '5', '7', '8', '0', '4'}
>>> # set 은 순서가 보장 되지 않음
...         
>>> c = list(a|b)
...         
>>> c.sort()
...         
>>> c
...         
['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
>>> c
...         
['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
>>> sorted(-c)
...         
Traceback (most recent call last):
  File "<pyshell#16>", line 1, in <module>
    sorted(-c)
TypeError: bad operand type for unary -: 'list'
>>> c
...         
['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
>>> c = list(a|b)
...         
>>> c
...         
['3', '2', '9', '5', '6', '1', '7', '8', '0', '4']
>>> sorted(c)
...         
['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
>>> c
...         
['3', '2', '9', '5', '6', '1', '7', '8', '0', '4']
>>> c
...         
['3', '2', '9', '5', '6', '1', '7', '8', '0', '4']
>>> c
...         
['3', '2', '9', '5', '6', '1', '7', '8', '0', '4']
