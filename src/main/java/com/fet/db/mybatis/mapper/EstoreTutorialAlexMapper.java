package com.fet.db.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fet.db.mybatis.entity.EstoreTutorialAlexEntity;

@Mapper
public interface EstoreTutorialAlexMapper {

	List<EstoreTutorialAlexEntity> getAllEstoreTutorialAlex();
	
	List<EstoreTutorialAlexEntity> getAllEstoreTutorialAlexByName(String name);
	
	
}
