create table if not exists admin(
	id	varchar(20) not null,
	password varchar(16) not null,
	primary key(id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--	private String id ;  //企业编号
--	private String name ; // 企业名称
--	private String password ; // 密码
--	private String nature; // 企业性质
--	private String contactPerson;
--	private String contactTel;
create table if not exists company(
	id varchar(10) not null,
	name varchar(40) not null,
	password varchar(16) not null,
	nature varchar(16) not null,
	contactperson varchar(16),
	contacttel varchar(16),
	primary key(id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;




--	private String id ;
--	private String name ;
--	private String password ;
--	private String gender;
--	private String birthday;
--	private String workage;
--	private String major;
--	private String education;
--	
create table if not exists employee(
	id varchar(12) not null,
	name varchar(16) not null,
	gender char(6) not null,
	password varchar(16) not null,
	birthday date not null,
	workage int not null,
	major varchar(30),
	education varchar(12) not null,
	primary key(id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

/* 招聘信息表 */
create table if not exists zhaopin(
	id				int	unsigned	auto_increment,  	-- 招聘信息的编号
	title			varchar(100)	not null,			-- 职称
	category		varchar(10)		not null,			-- 工作类型
	salary			varchar(40),			-- 薪水 (3k-5k, 面议)
	welfare 		varchar(60),						-- 福利
	company			varchar(50)		not null,			-- 招聘公司
	address 		varchar(60)		not null,			-- 公司地址
	release_date	date			not null,			-- 招聘信息的发布日期
	content			varchar(500)	not null,
	primary key(id)
)ENGINE=InnoDB  auto_increment=1 DEFAULT CHARSET=utf8;	


/* 简历 */
create table if not exists cv(
	id				int	unsigned	not null auto_increment,
	uid				varchar(16)		not null,
	name			varchar(12)		not null,
	sex 			enum('男','女'),
	age				int not null,
	tel 			varchar(16) not null,
	email 			varchar(26) not null,
	jobIntent		varchar(100) not null,
	selfDescription varchar(100) not null,
	workExperience	varchar(100) not null,
	education		varchar(100) not null,
	primary key(id)
)ENGINE=InnoDB  auto_increment=1 DEFAULT CHARSET=utf8;

