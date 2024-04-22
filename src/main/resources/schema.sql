DROP TABLE IF EXISTS mansion;
DROP TABLE IF EXISTS floor_plan;
DROP TABLE IF EXISTS cross_table_denpyou_syouhin;
DROP TABLE IF EXISTS denpyou;
DROP TABLE IF EXISTS telephone;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS syouhin;

DROP TABLE IF EXISTS teacher;

CREATE TABLE IF NOT EXISTS floor_plan
(
		id serial PRIMARY KEY
	,	floor_plan_name VARCHAR (100)
);

CREATE TABLE IF NOT EXISTS mansion
(
		id serial PRIMARY KEY
	,	name VARCHAR (100)
	,	address VARCHAR (100)
	,	station VARCHAR (100)
	,	floor_plan_id INTEGER
	,	building_date DATE
	,	status boolean
	,	foreign key (floor_plan_id) references floor_plan (id)
);

CREATE TABLE IF NOT EXISTS employee(
		emp_id serial PRIMARY KEY
	,	emp_name VARCHAR (100) NOT NULL
	,	emp_name_kana VARCHAR (100)
	,	emp_age INTEGER
	,	emp_hiredate DATE
);

CREATE TABLE IF NOT EXISTS denpyou
(
		denpyou_id serial PRIMARY KEY
	,	hakkou_date DATE
	,	emp_id INTEGER
	,	foreign key (emp_id) references employee (emp_id)
);

CREATE TABLE IF NOT EXISTS syouhin
(
		syouhin_id serial PRIMARY KEY
	,	syouhin_name VARCHAR (100) NOT NULL
	,	syouhin_genka INTEGER
);

CREATE TABLE IF NOT EXISTS cross_table_denpyou_syouhin
(
   		denpyou_id INTEGER
	,	syouhin_id INTEGER
	,	urine INTEGER
	,	foreign key (denpyou_id) references denpyou (denpyou_id)
	,	foreign key (syouhin_id) references syouhin (syouhin_id)
	,	PRIMARY KEY (denpyou_id, syouhin_id)
);

CREATE TABLE IF NOT EXISTS telephone(
		number VARCHAR (100) PRIMARY KEY
	,	owner_id INTEGER
	,	foreign key (owner_id) references employee (emp_id)

);

CREATE TABLE IF NOT EXISTS teacher (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_name VARCHAR(60) NOT NULL,
  email VARCHAR(254) NOT NULL
);