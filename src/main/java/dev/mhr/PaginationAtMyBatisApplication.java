package dev.mhr;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dev.mhr.entity.CrossTableDenpyouSyouhin;
import dev.mhr.entity.Employee;
import dev.mhr.entity.FloorPlan;
import dev.mhr.entity.Mansion;
import dev.mhr.repository.CrossTableDenpyouSyouhinRepository;
import dev.mhr.repository.EmployeeDenpyouTelephoneRepository;
import dev.mhr.repository.FloorPlanRepository;
import dev.mhr.repository.MansionRepository;
import lombok.AllArgsConstructor;

@MapperScan("dev.mhr.repository")
@AllArgsConstructor
@SpringBootApplication
public class PaginationAtMyBatisApplication {

	private final MansionRepository mansionRepository;
	private final FloorPlanRepository floorPlanRepository;
	private final CrossTableDenpyouSyouhinRepository crossTableDenpyouSyouhinRepository;
	private final EmployeeDenpyouTelephoneRepository employeeDenpyouTelephoneRepository;

	public static void main(String[] args) {

		// SpringApplication.run(PaginationAtMyBatisApplication.class, args);

		ApplicationContext applicationContext = SpringApplication.run(PaginationAtMyBatisApplication.class, args);
		PaginationAtMyBatisApplication app = applicationContext.getBean(PaginationAtMyBatisApplication.class);

		app.execute();

	}

	private void execute() {

		executeSection4_12();
		executeSection5_15();
		executeSection6_16_1();
		executeSection6_16_2();
		executeSection6_17_1();
		executeSection6_17_2();
		executeSection6_17_3();
		executeSection6_17_4();
		executeSection6_18();
		executeSection6_19();
		executeSection6_20();

		// 次行はレコードを追加するので、適宜コメントアウトする事。
		executeSection7_21();

		executeSection7_22();
		executeSection8_23();
		executeSection8_24();

		executeSection4_17();
		executeSection5_21();
		executeSection6_23();
		executeSection6_26();
		executeSection6_28();
		executeSection6_29();

		// 次行はレコードを追加するので、適宜コメントアウトする事。
		executeSection7_31();

		// 次行はレコードを更新するので、適宜コメントアウトする事。
		executeSection7_33();

		// 次行はレコードを更新するので、適宜コメントアウトする事。
		executeSection7_XX();

		// ４つのテーブルを結合しているサンプルである。（association を利用している）
		executeSectionMhr_01();

		// ３つのテーブルを結合しているサンプルである。（collection を利用している）
		executeSectionMhr_02();

	}

	private void executeSection4_12() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection4_12()");
		List<Mansion> list = mansionRepository.selectAll();
		list.forEach(mansion -> System.out.println(
				"id［" + mansion.getId() + "］, " +
						"name［" + mansion.getName() + "］, " +
						"address［" + mansion.getAddress() + "］, " +
						"station［" + mansion.getStation() + "］, " +
						"floorPlanId［" + mansion.getFloorPlanId() + "］, " +
						"buildingDate［" + mansion.getBuildingDate() + "］, " +
						"status［" + mansion.getStatus() + "］, " +
						"floorPlan［" + mansion.getFloorPlan() + "］"));
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection4_12()");

	}

	private void executeSection5_15() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection5_15()");
		Mansion mansion = mansionRepository.selectById(1);
		System.out.println(
				"id［" + mansion.getId() + "］, " +
						"name［" + mansion.getName() + "］, " +
						"address［" + mansion.getAddress() + "］, " +
						"station［" + mansion.getStation() + "］, " +
						"floorPlanId［" + mansion.getFloorPlanId() + "］, " +
						"buildingDate［" + mansion.getBuildingDate() + "］, " +
						"status［" + mansion.getStatus() + "］, " +
						"floorPlan［" + mansion.getFloorPlan() + "］");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection5_15()");

	}

	private void executeSection6_16_1() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_16_1()");
		Mansion mansion = new Mansion();
		mansion.setStatus(true);
		List<Mansion> list = mansionRepository.selectByStatusBuildingDate(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_16_1()");

	}

	private void executeSection6_16_2() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_16_2()");
		Mansion mansion = new Mansion();
		mansion.setStatus(true);
		mansion.setBuildingDate(Date.valueOf("2010-05-01"));
		List<Mansion> list = mansionRepository.selectByStatusBuildingDate(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_16_2()");

	}

	private void executeSection6_17_1() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_1()");
		Mansion mansion = new Mansion();
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_1()");

	}

	private void executeSection6_17_2() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_2()");
		Mansion mansion = new Mansion();
		mansion.setFloorPlanId(1);
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_2()");

	}

	private void executeSection6_17_3() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_3()");
		Mansion mansion = new Mansion();
		mansion.setBuildingDate(Date.valueOf("2010-01-01"));
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_3()");

	}

	private void executeSection6_17_4() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_4()");
		Mansion mansion = new Mansion();
		mansion.setFloorPlanId(1);
		mansion.setBuildingDate(Date.valueOf("2010-01-01"));
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_4()");

	}

	private void executeSection6_18() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_18()");
		List<Integer> idList = Arrays.asList(1, 2, 4);
		List<Mansion> list = mansionRepository.selectByIdIN(idList);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_18()");

	}

	private void executeSection6_19() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_19");
		List<Mansion> list = mansionRepository.selectByStationLike("宮");
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_19");

	}

	private void executeSection6_20() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_20()");
		Mansion mansion = new Mansion();
		List<Mansion> list = mansionRepository.selectByNameStation(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("--------------------------- executeSection6_23()");
		mansion.setName("ローズガーデンハイツ");
		mansion.setStation("大井町駅");
		list = mansionRepository.selectByNameStation(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
			"address［" + mnsn.getAddress() + "］, " +
			"station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
			"status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_20()");

	}

	// 本メソッドは、レコードを追加するので、呼び出し側をコメントアウトしている。

	private void executeSection7_21() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection7_21()");
		Mansion mansion = new Mansion();
		mansion.setName("サニーハイツ");
		mansion.setAddress("東京都品川区東大井×××");
		mansion.setStation("大井町駅");
		mansion.setFloorPlanId(1);
		mansion.setBuildingDate(Date.valueOf("2023-04-01"));
		mansion.setStatus(true);
		Boolean isSuccess = mansionRepository.insert_01(mansion);
		System.out.println("executeSection7_21() 処理が成功した？：" + isSuccess);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection7_21()");

	}

	private void executeSection7_22() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection7_22()");
		Mansion mansion = new Mansion();
		mansion.setId(10);
		mansion.setName("GreenHills");
		mansion.setAddress("東京都渋谷区渋谷111");
		mansion.setStation("ＪＲ渋谷駅");

		// ※次の3行分のデータは、MansionRepository.xml の set タグに記載されていないので、反映されない。
		// mansion.setFloorPlanId(2);
		// mansion.setBuildingDate(Date.valueOf("2000-01-01"));
		// mansion.setStatus(false);
		Boolean isSuccess = mansionRepository.update_01(mansion);
		System.out.println("executeSection7_22() 処理が成功した？：" + isSuccess);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection7_22()");

	}

	private void executeSection8_23() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection8_23()");
		// List<FloorPlan> result = floorPlanRepository.selectByFloorPlanIdWithMansion(2);
		List<FloorPlan> result = floorPlanRepository.selectByFloorPlanIdWithMansion(4);
		System.out.println("result：" + result);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection8_23()");

	}

	private void executeSection8_24() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection8_24()");
		Mansion result = mansionRepository.selectByIdWithFloorPlan(2);
		System.out.println("result：" + result);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection8_24()");

	}

	private void executeSection4_17() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection4_17");
		List<FloorPlan> list = floorPlanRepository.selectAll();
		list.forEach(floorPlan -> System.out.println(
				"id［" + floorPlan.getId() + "］, " +
						"floorPlanName［" + floorPlan.getFloorPlanName() + "］, " +
						"mansions［" + floorPlan.getMansions() + "］"));
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection4_17");

	}

	private void executeSection5_21() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection5_21()");
		//		List<FloorPlan> list = floorPlanRepository.selectById(3);
		//		list.forEach(floorPlan -> System.out.println(
		//				"id［" + floorPlan.getId() + "］, " +
		//						"floorPlanName［" + floorPlan.getFloorPlanName() + "］, " +
		//						"mansions［" + floorPlan.getMansions() + "］"));
		FloorPlan floorPlan = floorPlanRepository.selectById(3);
		System.out.println(
				"id［" + floorPlan.getId() + "］, " +
						"floorPlanName［" + floorPlan.getFloorPlanName() + "］, " +
						"mansions［" + floorPlan.getMansions() + "］");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection5_21()");

	}

	private void executeSection6_23() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_23()");
		Mansion mansion = new Mansion();
		mansion.setFloorPlanId(1);
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDate(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
		//  "address［" + mnsn.getAddress() + "］, " +
		//  "station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
		//  "status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("--------------------------- executeSection6_23()");
		mansion.setBuildingDate(Date.valueOf("2010-01-01"));
		list = mansionRepository.selectByFloorPlanIdBuildingDate(mansion);
		// @formatter:off
		list.forEach(mnsn -> System.out.println(
			"id［" + mnsn.getId() + "］, " +
			"name［" + mnsn.getName() + "］, " +
		//  "address［" + mnsn.getAddress() + "］, " +
		//  "station［" + mnsn.getStation() + "］, " +
			"floorPlanId［" + mnsn.getFloorPlanId() + "］, " +
			"buildingDate［" + mnsn.getBuildingDate() + "］, " +
		//  "status［" + mnsn.getStatus() + "］, " +
			"floorPlan［" + mnsn.getFloorPlan() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_23()");

	}

	private void executeSection6_26() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_26()");
		List<Integer> idList = Arrays.asList(1, 2, 4);

		List<FloorPlan> list = floorPlanRepository.selectByIdIN(idList);
		// @formatter:off
		list.forEach(floorPlan -> System.out.println(
			"id［" + floorPlan.getId() + "］, " +
			"floorPlanName［" + floorPlan.getFloorPlanName() + "］, " +
			"mansions［" + floorPlan.getMansions() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_26()");

	}

	private void executeSection6_28() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_28()");
		List<FloorPlan> list = floorPlanRepository.selectByFloorPlanNameLike("LDK");
		// @formatter:off
		list.forEach(floorPlan -> System.out.println(
			"id［" + floorPlan.getId() + "］, " +
			"floorPlanName［" + floorPlan.getFloorPlanName() + "］, " +
			"mansions［" + floorPlan.getMansions() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_28()");

	}

	private void executeSection6_29() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_29()");
		FloorPlan floorPlan = new FloorPlan();
		List<FloorPlan> list = floorPlanRepository.selectByTrim(floorPlan);
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("--------------------------- executeSection6_23()");
		floorPlan.setId(3);
		floorPlan.setFloorPlanName("3LDK");
		list = floorPlanRepository.selectByTrim(floorPlan);
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_29()");

	}

	private void executeSection7_31() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection7_31()");
		System.out.println("■Insert 実行前");
		List<FloorPlan> list = floorPlanRepository.selectByFloorPlanNameLike("4LDK");
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("--------------------------- executeSection7_31()");
		FloorPlan floorPlan = new FloorPlan();
		floorPlan.setFloorPlanName("4LDK");
		Boolean isSuccess = floorPlanRepository.insert_01(floorPlan);
		System.out.println("★Insert 処理成功？（true なら成功です）：" + isSuccess);
		System.out.println("--------------------------- executeSection7_31()");
		System.out.println("◆Insert 実行後");
		list = floorPlanRepository.selectByFloorPlanNameLike("4LDK");
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection7_31()");

	}

	private void executeSection7_33() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection7_33()");
		System.out.println("■Update 実行前");
		List<FloorPlan> list = floorPlanRepository.selectByFloorPlanNameLike("10LDK");
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("--------------------------- executeSection7_33()");
		FloorPlan floorPlan = new FloorPlan();
		floorPlan.setId(3);
		floorPlan.setFloorPlanName("10LDK");
		Boolean isSuccess = floorPlanRepository.update_01(floorPlan);
		System.out.println("★Update 処理成功？（true なら成功です）：" + isSuccess);
		System.out.println("--------------------------- executeSection7_33()");
		System.out.println("◆Update 実行後");
		list = floorPlanRepository.selectByFloorPlanNameLike("10LDK");
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection7_33()");

	}

	private void executeSection7_XX() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection7_XX()");
		System.out.println("■Update 実行前");
		List<FloorPlan> list = floorPlanRepository.selectByFloorPlanNameLike("100LDK");
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("--------------------------- executeSection7_XX()");
		FloorPlan floorPlan = new FloorPlan();
		floorPlan.setId(1);
		floorPlan.setFloorPlanName("100LDK");
		Boolean isSuccess = floorPlanRepository.update_02(floorPlan);
		System.out.println("★Update 処理成功？（true なら成功です）：" + isSuccess);
		System.out.println("--------------------------- executeSection7_XX()");
		System.out.println("◆Update 実行後");
		list = floorPlanRepository.selectByFloorPlanNameLike("100LDK");
		// @formatter:off
		list.forEach(fP -> System.out.println(
			"id［" + fP.getId() + "］, " +
			"floorPlanName［" + fP.getFloorPlanName() + "］, " +
			"mansions［" + fP.getMansions() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection7_XX()");

	}

	private void executeSectionMhr_01() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSectionMhr_01()");
		List<CrossTableDenpyouSyouhin> list = crossTableDenpyouSyouhinRepository.selectByDenpyouId(3);
		// @formatter:off
		list.forEach(cts -> System.out.println(
			"denpyou_id［" + cts.getDenpyouId() + "］, " +
			"syouhin_id［" + cts.getSyouhinId() + "］, " +
			"urine［" + cts.getUrine() + "］, " +

			// １対多の１側の為、List などの Collection にしない。
			// private Employee employee;
			"employee［" + cts.getEmployee() + "］, " +

			// １対多の１側の為、List などの Collection にしない。
			// private Denpyou denpyou;
			"denpyou［" + cts.getDenpyou() + "］, " +

			// １対多の１側の為、List などの Collection にしない。
			// private Syouhin syouhin;
			"syouhin［" + cts.getSyouhin() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSectionMhr_01()");

	}

	private void executeSectionMhr_02() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSectionMhr_02()");
		List<Employee> list = employeeDenpyouTelephoneRepository.selectAll();
		// @formatter:off
		list.forEach(e -> System.out.println(
			"empId［" + e.getEmpId() + "］, " +
			"empName［" + e.getEmpName() + "］, " +
			"empNameKana［" + e.getEmpNameKana() + "］, " +

			// １対多の多側の為、List<Telephone> とする。
			// private List<Telephone> telephones;
			"telephones［" + e.getTelephones() + "］, " +

			// １対多の多側の為、List<Denpyou> とする。
			// private List<Denpyou> denpyous;
			"denpyous［" + e.getDenpyous() + "］"));
		// @formatter:on
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSectionMhr_02()");

	}

}
