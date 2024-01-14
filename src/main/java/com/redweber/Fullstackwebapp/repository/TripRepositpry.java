package com.redweber.Fullstackwebapp.repository;

import com.redweber.Fullstackwebapp.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepositpry extends JpaRepository<Plan,Long> {
}
