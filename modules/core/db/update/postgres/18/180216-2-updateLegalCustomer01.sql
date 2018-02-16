alter table FINALPROJECT_LEGAL_CUSTOMER rename column phone to phone__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER alter column phone__UNUSED drop not null ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column name to name__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER alter column name__UNUSED drop not null ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column deleted_by to deleted_by__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column delete_ts to delete_ts__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column updated_by to updated_by__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column update_ts to update_ts__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column created_by to created_by__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column create_ts to create_ts__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER rename column version to version__UNUSED ;
alter table FINALPROJECT_LEGAL_CUSTOMER alter column version__UNUSED drop not null ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column ID uuid ^
update FINALPROJECT_LEGAL_CUSTOMER set ID = newid() where ID is null ;
alter table FINALPROJECT_LEGAL_CUSTOMER alter column ID set not null ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column VERSION integer ^
update FINALPROJECT_LEGAL_CUSTOMER set VERSION = 0 where VERSION is null ;
alter table FINALPROJECT_LEGAL_CUSTOMER alter column VERSION set not null ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column CREATE_TS timestamp ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column CREATED_BY varchar(50) ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column UPDATE_TS timestamp ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column UPDATED_BY varchar(50) ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column DELETE_TS timestamp ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column DELETED_BY varchar(50) ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column NAME varchar(255) ^
update FINALPROJECT_LEGAL_CUSTOMER set NAME = '' where NAME is null ;
alter table FINALPROJECT_LEGAL_CUSTOMER alter column NAME set not null ;
alter table FINALPROJECT_LEGAL_CUSTOMER add column PHONE varchar(255) ^
update FINALPROJECT_LEGAL_CUSTOMER set PHONE = '' where PHONE is null ;
alter table FINALPROJECT_LEGAL_CUSTOMER alter column PHONE set not null ;
