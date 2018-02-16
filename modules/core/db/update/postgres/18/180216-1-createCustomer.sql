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
    -- from finalproject$PhysicalCustomer
    EMAIL varchar(255) not null,
    --
    -- from finalproject$LegalCustomer
    INN varchar(20) not null,
    ADDRESS text,
    --
    primary key (ID)
);
