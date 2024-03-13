CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR(64) UNIQUE  NOT NULL,
    password VARCHAR(256)        NOT NULL,
    email    VARCHAR(256) UNIQUE NOT NULL,
    role     VARCHAR(8)          NOT NULL
);