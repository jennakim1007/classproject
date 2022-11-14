CREATE TABLE `tbl_todo` (
  `tno` int NOT NULL AUTO_INCREMENT,
  `todo` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tno`)
) ;

drop table tbl_todo;

insert into tbl_todo values(1, '할 일 테스트', '2022-01-01', 0);

select * from tbl_todo;