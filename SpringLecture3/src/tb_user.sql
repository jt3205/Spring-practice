drop table tb_user purge;

create table tb_user(
no number primary key,
name varchar(12) not null,
addr varchar(50),
sal number(10,2));

create sequence no_seq increment by 1 start with 1 nocycle nocache;

insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '�Ѹ�', '����� ������ ��â��', 750000);
insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '���Ѹ�', '����� ������ ��', 750000);
insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '�Ѹ�¯', '����� ������ ��â��', 450000);
insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '��ġ', '����� ���ʱ� ���ʵ�', 550000);


select * from tb_user;