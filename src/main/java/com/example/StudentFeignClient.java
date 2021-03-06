package com.example;

import com.example.domain.Group;
import com.example.domain.Joke;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Elphas Khajira on 9/20/17.
 */
@FeignClient(url = "https://uctglznbjf.localtunnel.me",name = "yi")
public interface StudentFeignClient {

    @RequestMapping(value = "groups",method = RequestMethod.POST)
    Group createGroup(@RequestBody Group group);

    @RequestMapping(value = "{id}/jokes",method = RequestMethod.POST)
    Joke createJoke(@RequestBody Joke joke);
}
