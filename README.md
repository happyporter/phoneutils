# phoneutils

## 캄보디아 (KH)

### 유효한 번호 테스트

<pre>
# 노말라이징 (입력 -> db)
- 원본 : 010111222
- 유효성 검사 결과 : true
- 노말라이징 결과 : +85510111222

# 파싱 (db -> 출력)
- 국가코드 (ISOAlpha2) : KH
- 국가코드 (숫자) : 855
- 번호 (international 표준) : +855 10 111 222
- 번호 (international 숫자만) : 85510111222
- 번호 (national 표준) : 010 111 222
- 번호 (national 숫자만) : 010111222
</pre>

### 유효하지 않은 번호 테스트

<pre>
# 노말라이징 (입력 -> db)
- 원본 : 123
- 유효성 검사 결과 : false
- 노말라이징 결과 : 123

# 파싱 (db -> 출력)
- 국가코드 (ISOAlpha2) : null
- 국가코드 (숫자) : null
- 번호 (international 표준) : +855 123
- 번호 (international 숫자만) : 855123
- 번호 (national 표준) : 123
- 번호 (national 숫자만) : 123
</pre>

<hr />

## 한국 (KR)

### 유효한 번호 테스트

<pre>
# 노말라이징 (입력 -> db)
- 원본 : 01011112222
- 유효성 검사 결과 : true
- 노말라이징 결과 : +821011112222

# 파싱 (db -> 출력)
- 국가코드 (ISOAlpha2) : KR
- 국가코드 (숫자) : 82
- 번호 (international 표준) : +82 10-1111-2222
- 번호 (international 숫자만) : 821011112222
- 번호 (national 표준) : 010-1111-2222
- 번호 (national 숫자만) : 01011112222
</pre>

### 유효하지 않은 번호 테스트

<pre>
# 노말라이징 (입력 -> db)
- 원본 : 123
- 노말라이징 결과 : 123

# 파싱 (db -> 출력)
- 국가코드 (ISOAlpha2) : null
- 국가코드 (숫자) : null
- 번호 (international 표준) : +82 123
- 번호 (international 숫자만) : 82123
- 번호 (national 표준) : 123
- 번호 (national 숫자만) : 123
</pre>
