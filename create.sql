create table category (id integer not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB;
create table product (id integer not null auto_increment, brand varchar(255), description varchar(255), image varchar(255), price double precision, title varchar(255), primary key (id)) engine=InnoDB;
create table product_category (product_id integer not null, category_id integer not null, primary key (product_id, category_id)) engine=InnoDB;
alter table product_category add constraint FKkud35ls1d40wpjb5htpp14q4e foreign key (category_id) references category (id);
alter table product_category add constraint FK2k3smhbruedlcrvu6clued06x foreign key (product_id) references product (id);
