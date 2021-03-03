package com.fet.db.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fet.db.mybatis.entity.CoMasterEntity;

@Mapper
public interface CoMasterMapper {

	List<CoMasterEntity> findAllCoMaster();
	
}
