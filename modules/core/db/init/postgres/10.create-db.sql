-- begin FINALPROJECT_COUNTRY
create table FINALPROJECT_COUNTRY (
    ID uuid,
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
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID uuid not null,
    CODE varchar(20) not null,
    --
    primary key (ID)
)^
-- end FINALPROJECT_AUTO_PRODUCER
-- begin FINALPROJECT_COLOR
create table FINALPROJECT_COLOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    CODE varchar(10) not null,
    --
    primary key (ID)
)^
-- end FINALPROJECT_COLOR
-- begin SEC_USER
alter table SEC_USER add column DEFAULT_COUNTRY_ID uuid ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'sec$User' where DTYPE is null ^
-- end SEC_USER
-- begin FINALPROJECT_VEHICLE_MODEL
create table FINALPROJECT_VEHICLE_MODEL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    PRODUCER_ID uuid not null,
    --
    primary key (ID)
)^
-- end FINALPROJECT_VEHICLE_MODEL
-- begin FINALPROJECT_VEHICLE_COMPLECTATION
create table FINALPROJECT_VEHICLE_COMPLECTATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    COST decimal(19, 2) not null,
    TYPE_ integer not null,
    COMMENT_ text,
    VEHICLE_MODEL_ID uuid,
    --
    primary key (ID)
)^
-- end FINALPROJECT_VEHICLE_COMPLECTATION
-- begin FINALPROJECT_VEHICLE
create table FINALPROJECT_VEHICLE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCER_ID uuid not null,
    MODEL_ID uuid,
    COMPLECTATION_ID uuid,
    NAME varchar(500),
    PROD_YEAR integer,
    COST decimal(19, 2),
    --
    primary key (ID)
)^
-- end FINALPROJECT_VEHICLE
-- begin FINALPROJECT_LEGAL_CUSTOMER
-- end FINALPROJECT_LEGAL_CUSTOMER
-- begin FINALPROJECT_PHYSICAL_CUSTOMER
-- end FINALPROJECT_PHYSICAL_CUSTOMER
-- begin FINALPROJECT_CUSTOMER
create table FINALPROJECT_CUSTOMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    NAME varchar(255) not null,
    PHONE varchar(255) not null,
    --
    -- from finalproject$PhysCustomer
    EMAIL varchar(255),
    --
    -- from finalproject$LegalCustomer
    INN varchar(20),
    --
    primary key (ID)
)^
-- end FINALPROJECT_CUSTOMER
