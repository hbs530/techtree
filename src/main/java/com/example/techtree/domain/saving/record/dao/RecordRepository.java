package com.example.techtree.domain.saving.record.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.techtree.domain.saving.goal.entity.Goal;
import com.example.techtree.domain.saving.record.entity.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
	void deleteByGoal(Goal goal);
}
