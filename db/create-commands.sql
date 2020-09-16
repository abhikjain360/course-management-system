create table departments(
	id integer primary key,
	name text not null
);

create table teachers(
	id integer primary key,
	name text not null,
	password text not null,
	departments references departments(id)
);

create table students(
	id integer primary key,
	name text not null,
	password text not null,
	join_year integer check(join_year > 2014),
	departments references departments(id)
);

create table courses(
	id integer primary key,
	name text not null,
	teacher integer references teacher(id),
	semester text check(semester == "Spring" or semester == "Autumn")
);
