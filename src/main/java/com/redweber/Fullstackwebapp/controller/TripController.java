package com.redweber.Fullstackwebapp.controller;

import com.redweber.Fullstackwebapp.entity.Plan;
import com.redweber.Fullstackwebapp.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")

@RequestMapping("/api.springboot")
public class TripController {
    @Autowired
    private TripService tripService;
    @PostMapping("/postplan")
    public Plan postPlans(@RequestBody Plan data){
        return tripService.postPlans(data);
    }
    @GetMapping("/getplans")
    public List<Plan> getPlans(){
        return tripService.getPlans();
    }
    @GetMapping("/getplan/{id}")
    public Plan getPlanById(@PathVariable("id") Long planId){
        return tripService.getPlanById(planId);
    }
    @DeleteMapping("/deleteplan/{id}")
    public String deletePlanById(@PathVariable("id") Long planId){
        tripService.deletePlanById(planId);
        return "Plan Deleted Sucessfully.";
    }
    @PutMapping("/updateplan/{id}")
    public Plan updatePlanById(@PathVariable("id")Long id,@RequestBody Plan plan){
        return tripService.updatePlanById(id,plan);
    }

}
