alter table FINALPROJECT_VEHICLE_COMPLECTATION add constraint FK_FINALPROJECT_VEHICLE_COMPLECTATION_VEHICLE_MODEL foreign key (VEHICLE_MODEL_ID) references FINALPROJECT_VEHICLE_MODEL(ID);
create index IDX_FINALPROJECT_VEHICLE_COMPLECTATION_VEHICLE_MODEL on FINALPROJECT_VEHICLE_COMPLECTATION (VEHICLE_MODEL_ID);
