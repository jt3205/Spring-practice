select * from tab;        --���̺� ��� Ȯ��
select * from employees;  --employees ���̺� Ȯ��

--����ó�� ����Ͻÿ�
--   �����ȣ        ��  ��                 �� ��
--   ---------------------------------------------
--    100      Steven King   288000�޷� 
select employee_id as "��� ��ȣ", first_name || '  ' || last_name as "��  ��",
         salary * 12 || '�޷�' as "��  ��"
from  employees;