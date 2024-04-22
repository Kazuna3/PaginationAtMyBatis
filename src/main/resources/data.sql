INSERT INTO floor_plan(floor_plan_name) values('1K');
INSERT INTO floor_plan(floor_plan_name) values('1LDK');
INSERT INTO floor_plan(floor_plan_name) values('2DK');
INSERT INTO floor_plan(floor_plan_name) values('2LDK');
INSERT INTO floor_plan(floor_plan_name) values('3LDK');

-- PostgreSql 用の Insert 文
/*
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('グリーンヒルズ','東京都渋谷区渋谷1-1-1','渋谷駅','4','2010/5/1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('サンシャインレジデンス','大阪府大阪市中央区難波1-2-3','難波駅','1','2010/5/1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('レインボーハイツ','神奈川県中郡二宮町二宮961','二宮駅','5','2008/12/1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('パークサイド','神奈川県横浜市西区南1-4-5','西横浜駅','2','2012/7/1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('ローズガーデンハイツ','東京都品川区大井1-5-6','大井町駅','3','2005/3/1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('グランドパレス','福岡県福岡市博多区博多1-6-7','博多駅','5','2011/11/1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('ブルーリバー','愛知県名古屋市中村区名駅2-7-8','名古屋駅','1','2007/6/1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('グレースパレス','兵庫県神戸市中央区三宮4-8-9','三宮駅','4','2013/4/1','false');
*/

-- H2 用の Insert 文
/**/
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('グリーンヒルズ','東京都渋谷区渋谷1-1-1','渋谷駅','4','2010-5-1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('サンシャインレジデンス','大阪府大阪市中央区難波1-2-3','難波駅','1','2010-5-1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('レインボーハイツ','神奈川県中郡二宮町二宮961','二宮駅','5','2008-12-1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('パークサイド','神奈川県横浜市西区南1-4-5','西横浜駅','2','2012-7-1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('ローズガーデンハイツ','東京都品川区大井1-5-6','大井町駅','3','2005-3-1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('グランドパレス','福岡県福岡市博多区博多1-6-7','博多駅','5','2011-11-1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('ブルーリバー','愛知県名古屋市中村区名駅2-7-8','名古屋駅','1','2007-6-1','true');
INSERT INTO mansion (name,address,station,floor_plan_id,building_date,status)values('グレースパレス','兵庫県神戸市中央区三宮4-8-9','三宮駅','4','2013-4-1','false');
/**/

INSERT INTO employee (emp_name, emp_name_kana, emp_age, emp_hiredate)
VALUES
		('田中太郎', 'たなかたろう', 30, '2022-01-15')
	,	('山田花子', 'やまだはなこ', 28, '2022-02-20')
	,	('鈴木健太', 'すずきけんた', 35, '2021-12-10')
	,	('佐藤美晴', 'さとうみはる', 25, '2023-03-05')
	,	('伊藤健二', 'いとうけんじ', 32, '2022-07-18')
	,	('渡辺奈美', 'わたなべなみ', 29, '2022-09-03')
	,	('田村雅史', 'たむらまさふみ', 33, '2022-04-25')
	,	('中島愛美', 'なかじままなみ', 27, '2021-11-30')
	,	('小林隆夫', 'こばやしたかお', 31, '2022-08-14')
	,	('加藤智子', 'かとうともこ', 26, '2023-01-22')
	,	('山口直人', 'やまぐちなおと', 34, '2022-06-08')
	,	('松本理恵', 'まつもとりえ', 30, '2022-03-12')
	,	('井上和也', 'いのうえかずや', 28, '2022-05-29')
	,	('木村美穂', 'きむらみほ', 29, '2021-10-07')
	,	('佐々木修司', 'ささきしゅうじ', 32, '2022-12-01')
	,	('岡田さやか', 'おかださやか', 27, '2023-02-10')
	,	('三浦茂', 'みうらしげる', 33, '2022-07-25')
	,	('高橋智子', 'たかはしたむこ', 31, '2022-09-18')
	,	('田辺健一', 'たなべけんいち', 28, '2022-04-15')
	,	('村田望', 'むらたのぞみ', 30, '2022-11-05');

INSERT INTO denpyou (hakkou_date, emp_id)
VALUES
		('2024-04-10', 1)
	,	('2024-04-11', 1)
	,	('2024-04-12', 2)
	,	('2024-04-13', 3)
	,	('2024-04-13', 3)
	,	('2024-04-14', 3);

INSERT INTO syouhin (syouhin_name, syouhin_genka)
VALUES
		('商品１', 100)
	,	('商品２', 200)
	,	('商品３', 300)
	,	('商品４', 400)
	,	('商品５', 500);

INSERT INTO cross_table_denpyou_syouhin (
		denpyou_id
	,	syouhin_id
	,	urine
)
VALUES
		(1, 1, 200)
	,	(2, 1, 300)
	,	(2, 2, 500)
	,	(3, 1, 200)
	,	(3, 2, 300)
--	,	(3, 2, 500)
--	,	(3, 2, 500)
	,	(3, 3, 800);

INSERT INTO telephone (number, owner_id)
VALUES
		('123-456-7890', 1)
	,	('1234-56-7890', 2)
	,	('090-1234-5678', 4)
	,	('090-2345-6789', 4);

INSERT INTO teacher(user_name, email) VALUES('中池', 'nakaike@example.com');