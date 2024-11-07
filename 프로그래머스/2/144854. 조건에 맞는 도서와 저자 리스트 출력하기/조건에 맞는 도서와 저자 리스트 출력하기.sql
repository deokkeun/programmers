-- 코드를 입력하세요
SELECT B.BOOK_ID, A.AUTHOR_NAME, TO_CHAR(B.PUBLISHED_DATE, 'YYYY-MM-DD') AS PUBLISHED_DATE
FROM BOOK B
JOIN AUTHOR A ON (B.AUTHOR_ID = A.AUTHOR_ID)
WHERE B.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE;