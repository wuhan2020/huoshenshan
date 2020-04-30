/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2020/4/30 13:51:37                           */
/*==============================================================*/


drop table if exists "User";

drop table if exists Vedio;

/*==============================================================*/
/* Table: "User"                                                */
/*==============================================================*/
create table "User" 
(
   id                   long binary                    not null,
   name                 varchar                        null,
   email                varchar                        null,
   phoneNumber          varchar                        null,
   sex                  int                            null,
   birthday             date                           null,
   profession           varchar                        null,
   constraint PK_USER primary key clustered (id)
);

/*==============================================================*/
/* Table: Vedio                                                 */
/*==============================================================*/
create table Vedio 
(
   id                   long binary                    not null,
   fileName             varchar                        null,
   fileExtension        varchar                        null,
   publisher            varchar                        null,
   description          varchar                        null,
   createdTime          date                           null,
   updatedTime          date                           null,
   hackathonId          integer                        null,
   hackathonStage       integer                        null,
   constraint PK_VEDIO primary key clustered (id)
);



