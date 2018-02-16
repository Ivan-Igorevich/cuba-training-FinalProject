alter table FINALPROJECT_CUSTOMER rename column address to address__UNUSED ;
alter table FINALPROJECT_CUSTOMER rename column inn to inn__UNUSED ;
alter table FINALPROJECT_CUSTOMER alter column inn__UNUSED drop not null ;
alter table FINALPROJECT_CUSTOMER rename column email to email__UNUSED ;
alter table FINALPROJECT_CUSTOMER alter column email__UNUSED drop not null ;
alter table FINALPROJECT_CUSTOMER rename column dtype to dtype__UNUSED ;
