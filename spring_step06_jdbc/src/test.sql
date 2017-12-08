select * from tab;        --테이블 목록 확인
select * from employees;  --employees 테이블 확인

--다음처럼 출력하시오
--   사원번호        이  름                 연 봉
--   ---------------------------------------------
--    100      Steven King   288000달러 
select employee_id as "사원 번호", first_name || '  ' || last_name as "이  름",
         salary * 12 || '달러' as "연  봉"
from  employees;