package dev.mhr.repository;

import java.util.List;

import dev.mhr.entity.CrossTableDenpyouSyouhin;

//Mapper Interface
//@MapperScan を書かない場合は、Mapper Repository のクラスに @Mapper アノテーションを付ける必要がある。
//@Mapper
public interface CrossTableDenpyouSyouhinRepository {

	public List<CrossTableDenpyouSyouhin> selectByDenpyouId(Integer id);

}
