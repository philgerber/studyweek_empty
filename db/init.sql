GRANT ALL PRIVILEGES ON DATABASE studyweek TO admin;

create table shop
(
	location TEXT,
	didok TEXT,
	geschaeft TEXT,
	kategorie TEXT,
	ebene TEXT,
	bahnhof TEXT,
	offen TEXT,
	url TEXT,
	email TEXT,
	tel TEXT,
	beschreibung TEXT,
	payment_accepted TEXT,
	geo TEXT
);

COPY shop FROM '/docker-entrypoint-initdb.d/shops_bak.csv' DELIMITER ';' CSV HEADER;
