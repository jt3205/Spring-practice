select * from tab;

drop table goodsinfo purge;

create table goodsinfo(
code varchar2(10),
name varchar2(50),
price number,
maker varchar2(20));

insert into goodsinfo(code,name,price,maker) values('p0001','�ڹٹ�����',25000,'��������');
insert into goodsinfo(code,name,price,maker) values('p0002','JSP 3�Ͽϼ�',30000,'�߸޷����ǻ�');

select * from goodsinfo;

--����Ÿ �߰��ϱ�
insert into goodsinfo(code,name,price,maker) values('p0001','�ڹ�1���Ϲ���',15000,'�����ͽ�');
insert into goodsinfo(code,name,price,maker) values('p0007','����Ŭ',55000,'��������');
insert into goodsinfo(code,name,price,maker) values('p0008','Ajax',35000,'�����ͽ�');
insert into goodsinfo(code,name,price,maker) values('p0009','JSP',45000,'�����ͽ�');
