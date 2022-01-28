package com.netflix.api.controller;

import com.netflix.api.entity.Cast;
import com.netflix.api.service.CastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cast")
public class CastController {

    @Autowired
    private CastService castService;

    @PostMapping("/postcast")
    public String addCast(@RequestBody Cast cast) {
        String post = castService.postactorandactressList(cast);
        return post;
    }

    @GetMapping("/getcast")
    public List<Cast> getCast() {
        return castService.getactorandactressList();
    }

    @PutMapping("/updatecast/{autoid}")
    public String updateCast(@PathVariable("autoid") Long id, @RequestBody Cast cast) {
        String update = castService.putactorandactress(cast, id);
        return update;
    }

    @DeleteMapping("/deletecast/{autoid}")
    public String deleteCast(@PathVariable("autoid") Long id) {
       String delete = castService.deleteactorandactressList(id);
       return delete;
    }
}
