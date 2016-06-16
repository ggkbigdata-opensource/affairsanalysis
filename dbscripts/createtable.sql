drop table if exists tbl_ans_calltraffic;

/*==============================================================*/
/* Table: tbl_ans_calltraffic                                   */
/*==============================================================*/
create table tbl_ans_calltraffic
(
   id                   numeric(64,0) not null,
   traffic              numeric(64,0),
   area                 varchar(255),
   create_date          timestamp default now(),
   update_date          timestamp,
   time_size            varchar(64),
   primary key (id)
);
drop table if exists tbl_ans_hotwords;

/*==============================================================*/
/* Table: tbl_ans_hotwords                                      */
/*==============================================================*/
create table tbl_ans_hotwords
(
   id                   numeric(64,0) not null,
   hotword_name         varchar(255),
   hotword_times        numeric(64,0),
   create_date          timestamp default now(),
   update_date          timestamp,
   time_size            varchar(64),
   summary_date         timestamp,
   area                 varchar(255),
   primary key (id)
);
drop table if exists tbl_ans_livelihoodindex;

/*==============================================================*/
/* Table: tbl_ans_livelihoodindex                               */
/*==============================================================*/
create table tbl_ans_livelihoodindex
(
   id                   numeric(64,0) not null,
   index_code           varchar(64) not null,
   index_name           varchar(64),
   index_value          numeric(64,0),
   time_size            varchar(64),
   create_date          timestamp  default now(),
   update_date          timestamp,
   area                 varchar(255),
   primary key (id, index_code)
);
drop table if exists tbl_ans_workorder;

/*==============================================================*/
/* Table: tbl_ans_workorder                                     */
/*==============================================================*/
create table tbl_ans_workorder
(
   wo_id                varchar(64) not null,
   call_id              varchar(64),
   call_date            timestamp,
   phone                varchar(64),
   phone_home           varchar(255),
   wo_register_date     timestamp,
   appeal_src           varchar(64),
   wo_type              varchar(64),
   wo_status            varchar(64),
   appeal_classification varchar(255),
   appeal_level         varchar(64),
   appeal_title         varchar(255),
   appeal_subject       varchar(1024),
   appeal_depart_no     varchar(64),
   appeal_depart_name   varchar(64),
   incident_site_large_area varchar(255),
   incident_site_small_area varchar(255),
   monitor_status       varchar(64),
   wo_deadline          timestamp,
   wo_deal_last_date    varchar(255),
   pre_alarm_day        numeric(16,0),
   alarm_day            numeric(16,0),
   satisfaction         varchar(64),
   wo_close_date        timestamp,
   remarks              varchar(255),
   migrate_date         timestamp  default now(),
   primary key (wo_id)
);

