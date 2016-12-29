package auth.mapper;

import auth.Entity.ApproveDef;
import auth.Entity.ApproveDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveDefMapper {
    int countByExample(ApproveDefExample example);

    int deleteByExample(ApproveDefExample example);

    int deleteByPrimaryKey(Long apprId);

    int insert(ApproveDef record);

    int insertSelective(ApproveDef record);

    List<ApproveDef> selectByExample(ApproveDefExample example);

    ApproveDef selectByPrimaryKey(Long apprId);

    int updateByExampleSelective(@Param("record") ApproveDef record, @Param("example") ApproveDefExample example);

    int updateByExample(@Param("record") ApproveDef record, @Param("example") ApproveDefExample example);

    int updateByPrimaryKeySelective(ApproveDef record);

    int updateByPrimaryKey(ApproveDef record);
}