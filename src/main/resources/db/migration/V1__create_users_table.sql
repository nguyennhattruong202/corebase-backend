CREATE TABLE users
(
    id         UUID PRIMARY KEY,
    email         VARCHAR(255) UNIQUE NOT NULL,
    password_hash VARCHAR(255)        NOT NULL,
    full_name     VARCHAR(255)        NOT NULL,
    role       VARCHAR(50) NOT NULL DEFAULT 'ROLE_USER',
    created_at TIMESTAMP            DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP            DEFAULT CURRENT_TIMESTAMP
);