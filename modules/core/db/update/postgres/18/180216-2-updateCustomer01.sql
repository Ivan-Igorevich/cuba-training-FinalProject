-- alter table FINALPROJECT_CUSTOMER add column INN varchar(20) ^
-- update FINALPROJECT_CUSTOMER set INN = <default_value> ;
-- alter table FINALPROJECT_CUSTOMER alter column INN set not null ;
alter table FINALPROJECT_CUSTOMER add column INN varchar(20) ;
-- alter table FINALPROJECT_CUSTOMER add column EMAIL varchar(255) ^
-- update FINALPROJECT_CUSTOMER set EMAIL = <default_value> ;
-- alter table FINALPROJECT_CUSTOMER alter column EMAIL set not null ;
alter table FINALPROJECT_CUSTOMER add column EMAIL varchar(255) ;
alter table FINALPROJECT_CUSTOMER add column DTYPE varchar(100) ;
