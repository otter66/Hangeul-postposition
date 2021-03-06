# About the Korean alphabet(Hangeul) 

## In Kotlin(JAVA) <img align='right' src="https://upload.wikimedia.org/wikipedia/commons/0/06/Kotlin_Icon.svg" width="147" height="147"> <img align='right' src="https://upload.wikimedia.org/wikipedia/commons/0/09/New_Unicode_logo.svg" width="150" height="150"> 
한글 표현 방법은 크게 조합형과 완성형으로 나눌 수 있다.   
이를 좀 더 세분화하면 N바이트 조합형, 3바이트 조합형, 7비트 완성형, 2바이트 조합형, 2바이트 완성형으로 나눌 수 있다.   

<br>

조합형: 한글의 제자 원리에 기반하여 초성, 중성, 종성에 각각 코드를 할당하는 방식.   
완성형: '가', '각', '간'과 같은 완성된 문자에 코드를 할당하는 방식.   
이 중 완성형이 한글 표준안으로 채택되었고, 나중에는 삼보 컴퓨터가 주도한 상용 조합형(KSSM)(2바이트 조합형)이 표준처럼 사용되었다.   

<br>

한글의 범위: '가'(U+AC00) ~ '힣'(U+D7A3)   
초성의 범위: U+1100 ~ U+115E   
중성의 범위: U+1161 ~ U+11A7   
종성의 범위: U+11A8 ~  U+11FF   

<br>

한글을 만드는 방법: (U+AC00) + ((초성 값 x 21) + 중성 값) x 28 + 종성 값   
한글을 분해하는 방법: 만드는 방법의 반대로 하면 된다.   
word = word -  U+AC00   
초성: word / (21 x 28)   
중성: word % (21 x 28) / 28   
종성: word % 28   

<br><br>

## In C++ <img align='right' src="https://upload.wikimedia.org/wikipedia/commons/1/18/ISO_C%2B%2B_Logo.svg" width="150" height="150">   
(추가 예정)   

<br><br><br>

---
**참고**   
네이버 D2 : 한글 인코딩의 이해 1편 [(링크)](https://d2.naver.com/helloworld/19187)   
네이버 D2 : 한글 인코딩의 이해 2편 [(링크)](https://d2.naver.com/helloworld/76650)   
앱개발자 테드박의 블로그 [(링크)](https://gun0912.tistory.com/65)   
<br>
이를 이용한 한글의 표준화 (초성, 중성, 종성 나누기): 한글 표준화 (추가 예정)

