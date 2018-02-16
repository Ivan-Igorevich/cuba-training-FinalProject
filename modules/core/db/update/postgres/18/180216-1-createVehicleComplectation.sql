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
);
