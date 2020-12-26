# Conference booking app

## GET POST DELETE PUT

http://localhost:8080/api/v1/sessions

http://localhost:8080/api/v1/speakers

## Docker Postgres Setup
Create Docker container with Postgres database:

```docker create --name conf_db -e POSTGRES_PASSWORD=abcde -p 5432:5432 postgres:alpine```

Start container:

```docker start conf_db```

Stop container:

```docker stop conf_db```

Connection Info:

JDBC URL: `jdbc:postgresql://localhost:5432/conf_db`

Username: `postgres`

Password: `abcde`

Connect to PSQL prompt from docker:

```docker exec -it conf_db psql -U postgres```

to list the created database
```\l```

to list the tables
```\dt```

to enter into psql shell inside the created database
```\c```

```
CREATE TABLE attendees
(
    attendee_id  SERIAL PRIMARY KEY,
    first_name   varchar(30) NOT NULL,
    last_name    varchar(30) NOT NULL,
    title        varchar(40) NULL,
    company      varchar(50) NULL,
    email        varchar(80) NOT NULL,
    phone_number varchar(20) NULL
);
```

```
INSERT INTO time_slots (time_slot_id,time_slot_date,start_time,end_time,is_keynote_time_slot)
VALUES (1,'2020-04-09','9:00','9:45',TRUE),
       (2,'2020-04-09','10:00','11:00',FALSE),
       (3,'2020-04-09','11:15','11:45',FALSE),
       (4,'2020-04-09','12:45','13:45',FALSE),
       (5,'2020-04-09','14:00','15:00',FALSE),
       (6,'2020-04-09','15:15','15:45',FALSE),
       (7,'2020-04-09','16:00','17:00',FALSE),
       (8,'2020-04-10','9:00','10:00',FALSE),
       (9,'2020-04-10','10:15','11:15',FALSE),
       (10,'2020-04-10','11:30','12:00',FALSE),
       (11,'2020-04-10','13:00','14:00',FALSE),
       (12,'2020-04-10','14:15','15:00',TRUE);
```
