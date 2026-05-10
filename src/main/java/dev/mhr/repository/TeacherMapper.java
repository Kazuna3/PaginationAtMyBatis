package dev.mhr.repository;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import dev.mhr.entity.Teacher;

// @Mapperはマッパーであることを示します。これはMyBatisが起動時にこのアノテーションを探して使えるようにしてくれます。
// @Mapper
public interface TeacherMapper {

	// countを追加
	Long count();

	// RowBoundsを追加
	List<Teacher> selectAll(RowBounds rowBounds);

	// @SelectはSELECT文を記述していく場合につけます
	// @Select("SELECT * FROM teacher")
	// @Select("SELECT id, user_name AS userName, email FROM teacher")
	// List<Teacher> selectAll();

	//	@Select({
	//			// "SELECT * FROM teacher",
	//			"SELECT id, user_name AS userName, email FROM teacher",
	//			"WHERE id = #{id}"
	//	})
	Teacher selectByPrimaryKey(Long id);

	//	@Insert({
	//			"INSERT INTO teacher(user_name, email)",
	//			"VALUES(#{userName}, #{email})"
	//	})
	int insert(Teacher record);

	//	@Update({
	//			"UPDATE teacher",
	//			"SET user_name = #{userName}, email = #{email}",
	//			"WHERE id = #{id}"
	//	})
	int updateByPrimaryKey(Teacher record);

	//	@Delete({
	//			"DELETE FROM teacher",
	//			"WHERE id = #{id}"
	//	})
	int deleteByPrimaryKey(Long id);

}
