package com.student.demo.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.demo.entity.StEntity;
@Repository
public interface StRepository extends JpaRepository<StEntity,Integer>{
	
	@Query(value="SELECT *FROM GORESULT WHERE DOB= :date AND reg_no= :regst",nativeQuery=true)
	public  Optional<StEntity> getdataone(@Param("regst") long regst,@Param("date") LocalDate date);
	
}
