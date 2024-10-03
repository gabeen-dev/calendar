create table schedule
(
    schedule_id bigint auto_increment
        primary key,
    content     varchar(255) null,
    create_by   varchar(255) null,
    create_date datetime(6)  null,
    password    varchar(255) null,
    update_date datetime(6)  null
);

INSERT INTO schedule (schedule_id, content, create_by, create_date, password, update_date) VALUES (2, '신규등록', '김가빈', '2024-10-03 14:00:00.000000', null, '2024-10-03 14:00:00.000000');