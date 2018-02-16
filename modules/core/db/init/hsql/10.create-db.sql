-- begin FINALPROJECT_COUNTRY
create table FINALPROJECT_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(3) not null,
    --
    primary key (ID)
)^
-- end FINALPROJECT_COUNTRY
-- begin FINALPROJECT_AUTO_PRODUCER
create table FINALPROJECT_AUTO_PRODUCER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID varchar(36) not null,
    CODE varchar(20) not null,
    --
    primary key (ID)
)^
-- end FINALPROJECT_AUTO_PRODUCER
-- begin SEC_USER
alter table SEC_USER add column DEFAULT_COUNTRY_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'sec$User' where DTYPE is null ^
-- end SEC_USER
