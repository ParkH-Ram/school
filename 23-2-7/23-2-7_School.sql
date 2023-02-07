-- if 문
select if(100>200, '참', '거짓');

-- IFNULL (수식1, 수식2)
-- 수식1 NULL이라면 수식2가 
-- 수식1 NULL이 아니라면 수식1이 반환
SELECT IFNULL(NULL, '널이군'), IFNULL(100, '널이군요');

-- NULLIF(수식1, 수식2) 수식1과 수식2가 같으면 NULL, 다르면 수식1을 반환
SELECT NULLIF(100, 200), NULLIF(100, 100);

-- CASE ~ WHEN ~ ELSE ~ END : 다중 분기
-- SELEST CASE INT << INT 부분에 Value 를 적고 거기에 숫자를 적고 밑에 WHEN 옆에 VALUE 에 따라 THEN VALUE가 출력 됨
SELECT CASE 10
		WHEN 1	THEN '일'
		WHEN 5  THEN '오'
        WHEN 10 THEN '십'
        ELSE '모름'
	END AS 'CASE 연습';
    
-- 문자열
    SELECT ASCII('A'), CHAR(126);
    
-- BIT_LENGTH(문자열): bit 수
-- CHAR_LENGTH(문자열) : 문자 수 글자 수
-- LENGTH(문자열) : byte(8비트) 수

SELECT BIT_LENGTH('abc'), char_length('abc'), length('ABC');
SELECT BIT_LENGTH('가나다'), char_length('가나다'), length('가나다');

-- concat : 문자열 연결 할 때
-- concat_ws : 구분자를 이용해서 문자열을 연결
SELECT concat('2023', '02', '07'), concat_ws('/', '2023', '02', '07');

-- ELT(위치, 문자열1, 문자열2, ...)  		: 위치값이 해당하는 문자열을 반환
-- FIELD(찾을 문자열, 문자열1, 문자열2, ...) 	: 찾을 문자열이 있는 문자열의 위치 값을 반환
-- FIND_IN_SET(찾을문자열, 문자열 리스트) 	: 찾을 문자열이 문자열 리스트에 몇 번째 있는가? 
-- INSTR(기준 문자열, 부분 문자열)			: 부분 문자열이 기준 문자열의 몇 번째 위치하는지 위치 값을 반환
-- LOCATE(부분 문자열, 기준 문자열)			: 부분 문자열이 기준 문자열의 몇 번째 위치하는지 위치 값을 반환

SELECt elt(2, '하나', '둘', '셋'), field('둘', '셋', '넷', '둘'),
find_in_set('둘', '하나,둘,셋'), INSTR('하나둘셋', '둘'), LOCATE('둘', '하나둘셋');

-- FORMAT(숫자, 소수점자리) : 1000단위, 표시 되고 , 표시되고 소소줌자리 수 만큼 소수점 표시
SELECT FORMAT (1234567.123456, 4);
SELECT FORMAT (123456.123456, 2);

-- BIN(숫자) : 숫자 10진수 -> 2진수
-- HEX(숫자) : 숫자 10진수 -> 16진수, 4bit
-- OCT(숫자) : 숫자 10진수 -> 8진수, 3bit
SElect BIN(31), HEX(31), OCT(31);

-- INSERT(기준 문자열, 위치, 길이(만큼 삭제), 삽입할 문자열)
SELECT INSERT('abcdefg',3,4,'@@@@'), INSERT('hellomama',3,2,'@@@@');

-- LEFT 문자열, 길이 : 문자열에서 왼쪽에서 길이 만큼 문자반환
-- RIGHT 문자열, 길이 : 문자열에서 오른쪽으로 길이만큼 문자 반환
SELECT LEFT('abcdefg', 3);

-- UPPER 문자열 : 대문자로 
-- LOWER 문자열 : 소문자로

-- LPAD(문자열, 길이, 채울 문자열) : 문자열을 길이만큼 늘린 후, 빈곳을 채워라 
-- RPAD(문자열, 길이, 채울 문자열)
Select LPAD('이것이', 5, '##');  --  글자 수를 5글자로 바꾼 뒤 왼쪽의 비어있는 칸을 ## 이걸로 채워라  // R은 반대

-- LTRIM, RTRIM  : 왼쪽 or 오른쪽 공백제거
select LTRIM('    이것이');

-- TRIM은 양쪽의 공백을 없앰, 
-- TRIM(문자열),
-- TRIM(방향 자를_문자열 from 문자열)

-- BOTH 양쪽의 모든 제거 ,  
-- LEADING 앞쪽의 지정 문자열 제거,
-- TRAILING 뒤쪽의 지정 문자열 제거
SELECT TRIM(BOTH 'ㅋ' from 'ㅋㅋㅋㅋㅋㅋㅋㅋㅋ존잼이네 ㅅㅋㅋㅋㅋㅋㅋ');
SELECT TRIM(LEADING 'ㅋ' from 'ㅋㅋㅋㅋㅋㅋㅋㅋㅋ존잼이네 ㅅㅋㅋㅋㅋㅋㅋ');
SELECT TRIM(TRAILING 'ㅋ' from 'ㅋㅋㅋㅋㅋㅋㅋㅋㅋ존잼이네 ㅋㅋㅋㅋㅋㅅㅋㅋㅋㅋㅋㅋ');

-- REPEAT(문자열, 횟수)  - 횟수 만큼 문자열을 반복

-- REPLACE (문자열, 원래 문자열, 바꿀 문자열) - 문자열에서 원래 문자열을 찾아 바꿀 문자열로 바꿔준다.    
--  문자열 ( 문자열 , 기존 문자열에서 바꾸고 싶은 문자 선택,  선택한 문자를 해당 문자열로 바꿔줌)  
SELECT REPLACE ('이것이 mySQL', '이것이', '우레레레레레');

-- REVERSE(문자열) - 해당 문자열을 역순으로 반환

-- SPACE (lenght) - 길이만큼 공백 반환
Select concat('이것이', space(10), '뭐고 이건');

-- SUBSTRING (문자열, 시작위치, 길이) 또는 SUBSTRING(문자열 FROM 시작위치 FOR 길이) - 시작 위치부터 길이만큼 문자 반환, 길이 생략 되면 끝까지 반환
select substring('대한민국', 2, 2);
select substring('대한민국', 2);

-- SUBTRING_INDEX (문자열, 구분자, 횟수)
-- 문자열에서 구분자가 왼쪽 부터 횟수 번째 나오면 그 이후의 오른쪽은 버린다. 횟수가 음수면 오른쪽부터 세고 왼쪽을 버린다
SELECT SUBSTRING_INDEX('cafe.naver.com', '.', 2);  -- 두번째 '.' << 해당 문자가 나왔을 때 부터 뒷 열을 버린다
SELECT SUBSTRING_INDEX('cafe.naver.com', '.', -2);

-- ADDDATE (날짜, 차이), SUBDATE(날짜 차이) -- 날짜를 기준으로 차이를 더하거나 뺀 날짜를 구한다   add = 더하기, sub - 빼기
-- CURDATE() : 현재 날찌 시간 
SELECT adddate('2025-01-01', INTERVAL 31 day), ADDDATE('2025-01-01', INTERVAL 3 MONTH);
SELECT subdate('2025-01-01', INTERVAL 785 day), subdate('2025-01-01', INTERVAL 3 MONTH);


select addtime('2023-02-07 11:11:11', '2:59:00');

-- CURDATE() - 현재 연-월-일;
-- CURTIME() - 현재 시:분:초를 구한다.
-- NOW() , SYSDATE() - 현재 '연-월-일  시:분:초'

-- YEAR, MONTH, DAY, HOUR 등;
-- 날짜 또는 시간에서 연,월,일  시,분,초,밀리초를 구한다 
SELECT microsecond(current_time(6));

-- datediff(날짜1, 날짜2)  - 날짜 2에서 날짜 1까지 며칠이 남았는지 구한다.
-- timediff('시간1', '시간2') - 시간 2에서 시간 1까지 뺀 시간 차이
SELECt datediff('2024-01-01', now()); 

-- LAST_DAY(날짜) - 주어진 날짜의 마지막 날짜를 구한다. 주로 그 달이 며칠까지 있는지 확인할 때 사용
select last_day('2023-04-01');



--



