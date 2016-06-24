drop table if exists tbl_ans_hotwords;

/*==============================================================*/
/* Table: tbl_ans_hotwords                                   */
/*==============================================================*/
create table tbl_ans_hotwords
(
   id                   numeric(64,0) not null,
   frequency_count      numeric(64,0),
   word_name            varchar(255),
   area                 varchar(255),
   create_date          timestamp default now(),
   update_date          timestamp default now(),
   statistical_date     timestamp not null,
   time_size            varchar(64),
   primary key (id)
);

/*==============================================================*/
/* Table: tbl_ans_wo_hotwords                                     */
/*==============================================================*/
drop table if exists tbl_ans_wo_hotwords;
CREATE TABLE tbl_ans_wo_hotwords (
  wo_id varchar(255) DEFAULT NULL,
  hotwords varchar(255) DEFAULT NULL,
  id int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	¡¤
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

