CREATE TABLE Yarn (
	yarnid varchar(5) primary key NOT NULL,
	name varchar(45) NOT NULL,
	skeinLength decimal(5,2) NOT NULL,
	color varchar(25) NOT NULL,
	price decimal(5,2) NOT NULL
);

CREATE TABLE Needles (
	needleid varchar(5) primary key NOT NULL,
	needleType varchar(20) NOT NULL,
	material varchar(40),
	size decimal(3, 1) NOT NULL
);