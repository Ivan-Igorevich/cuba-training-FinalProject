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
    COST integer,
    --
    primary key (ID)
);
