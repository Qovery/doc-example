package com.qovery.group;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by evoxmusic on 02/12/2019.
 */
@RestController
@RequestMapping("/users")
public class GroupController {

    @GetMapping(path = "{userId}/groups")
    public List<Group> listAll(@PathVariable String userId) {
        return Collections.singletonList(new Group("my super group",
                Arrays.asList(
                        new User("Alice", "Smith", 31),
                        new User("John", "Dom", 24),
                        new User("Jack", "Bauer", 54)
                )
        ));
    }

}
