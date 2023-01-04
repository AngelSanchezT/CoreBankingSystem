-- Up Service Postgresql
-- pg_ctl.exe start -D %POSTGRESQL%\data


-- USER: banking_admin

CREATE ROLE banking_admin WITH
	LOGIN
	NOSUPERUSER
	NOCREATEDB
	NOCREATEROLE
	INHERIT
	NOREPLICATION
	CONNECTION LIMIT -1
	PASSWORD 'xxxxxx';

-- Database: banking

-- DROP DATABASE IF EXISTS banking;

CREATE DATABASE banking
    WITH
    OWNER = banking_admin
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Colombia.1252'
    LC_CTYPE = 'Spanish_Colombia.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


-- -----------------------------------------------------
-- Shema "administration"
-- -----------------------------------------------------
CREATE SCHEMA administration
    AUTHORIZATION banking_admin;


-- Table: administration.user

-- DROP TABLE IF EXISTS administration.user;

CREATE TABLE IF NOT EXISTS administration.user
(
    user_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    password character varying(255) COLLATE pg_catalog."default" NOT NULL,
    fisrt_name character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
    email character varying(255) COLLATE pg_catalog."default",
    status character varying(50) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default" NOT NULL,
    created_time timestamp with time zone NOT NULL,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone,
    CONSTRAINT "pk_user" PRIMARY KEY (user_name)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS administration.user
    OWNER to banking_admin;

COMMENT ON TABLE administration.user
    IS 'Represents a user the core banking system';