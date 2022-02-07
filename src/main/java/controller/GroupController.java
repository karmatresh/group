package controller;

import model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.GroupRepository;

@RestController/*
@RequestMapping(value = "/group")*/

public class GroupController {
    @Autowired
    GroupRepository groupRepository;

    @GetMapping("/getGroup")
    public Group takePresent(){
        Group group = groupRepository.findById(1).get();
        return group;
    }
}






