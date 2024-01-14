package com.redweber.Fullstackwebapp.service;

import com.redweber.Fullstackwebapp.entity.Plan;
import com.redweber.Fullstackwebapp.repository.TripRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TripService {
    @Autowired
    private TripRepositpry tripRepositpry;
    public Plan postPlans(Plan data) {
        return tripRepositpry.save(data);
    }

    public List<Plan> getPlans() {
       return tripRepositpry.findAll();
    }

    public Plan getPlanById(Long planId) {
        return tripRepositpry.findById(planId).get();
    }

    public void deletePlanById(Long planId) {
        tripRepositpry.deleteById(planId);
    }

    public Plan updatePlanById(Long id, Plan plan) {
        Plan planDb = tripRepositpry.findById(id).get();
        if(Objects.nonNull(plan.getPlace())&&
        !"".equalsIgnoreCase(plan.getPlace())){
            planDb.setPlace(plan.getPlace());
        }
        if(Objects.nonNull(plan.getDate())&&
                !"".equalsIgnoreCase(plan.getDate())){
            planDb.setDate(plan.getDate());
        }
        if(Objects.nonNull(plan.getTime())&&
                !"".equalsIgnoreCase(plan.getTime())){
            planDb.setTime(plan.getTime());
        }
        if(Objects.nonNull(plan.getBudget())&&
                !"".equalsIgnoreCase(plan.getBudget())){
            planDb.setBudget(plan.getBudget());
        }
        return tripRepositpry.save(planDb);
    }
}
