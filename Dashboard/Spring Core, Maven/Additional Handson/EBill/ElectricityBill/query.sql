create table ebill
(
    bill_number   int primary key auto_increment,
    consumer_id   varchar(50)   not null,
    billing_month date          not null,
    reading       int           not null,
    unit          int           not null,
    amount        decimal(8, 2) not null
) ENGINE = InnoDB
  AUTO_INCREMENT = 100;

insert into ebill
    (consumer_id, billing_month, reading, unit, amount)
values ('01-001-001-001', '2020-04-01', 10080, 80, 96),
       ('01-001-001-001', '2020-05-01', 10130, 50, 60),
       ('01-001-001-001', '2020-06-01', 10470, 340, 590),
       ('01-001-001-001', '2020-07-01', 10840, 370, 680),
       ('01-001-001-001', '2020-08-01', 11080, 240, 290);

select * from ebill;

drop table ebill;