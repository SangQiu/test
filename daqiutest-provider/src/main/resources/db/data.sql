
CREATE TABLE IF NOT EXISTS user(id bigint unsigned not null primary key,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_time date,updated_time date, is_deleted int(1),version int(1),
name varchar(255)  ,phone varchar(255)  ,meiju varchar(255)  );
