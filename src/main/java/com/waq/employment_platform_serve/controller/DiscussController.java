package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.Discuss;
import com.waq.employment_platform_serve.service.impl.DiscussServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WAQ
 * @since 2021-06-02
 */
@RestController
@RequestMapping("/api")
public class DiscussController {

    @Autowired
    DiscussServiceImpl discussService;

   @GetMapping("/getAllDiscuss")
    public List<Discuss> getAllDiscuss(){
//       System.out.println("帖子呢你容为：");
//       System.out.println(discussService.getAllDiscuss());
       return discussService.getAllDiscuss();
   }

   @PostMapping("/getByType")
    public List<Discuss> getByType(@RequestBody Discuss discuss){
       return discussService.getByType(discuss.getType());
   }

   @PostMapping("/updateDiscuss")
    public boolean updateDiscuss(@RequestBody Discuss discuss){
       discussService.updateDiscuss(discuss);
       return true;
   }

    @PostMapping("/addDiscuss")
    public boolean addDiscuss(@RequestBody Discuss discuss){
        discussService.addDiscuss(discuss);
        return true;
    }
}

