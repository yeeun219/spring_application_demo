package com.example.demo.controller.api;

import com.example.demo.ifs.CrudInterface;
import com.example.demo.model.network.Header;
import com.example.demo.model.network.request.UserApiRequest;
import com.example.demo.model.network.response.UserApiResponse;
import com.example.demo.service.UserApiLogicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/user")
//@RequiredArgsConstructor    // lombok 사용
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {

    //private final UserApiLogicService userApiLogicService;
    @Autowired
    private UserApiLogicService userApiLogicService;
    @Override
    @PostMapping("")    // /api/user
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request){

        log.info("{}",request);
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // /api/user/{id}
    public Header read(@PathVariable(name = "id") Long id) {
        return null;
    }

    @Override
    @PutMapping("") // /api/user
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return null;
    }

    @Override
    @DeleteMapping("{id}")  // /api/user/{id}
    public Header delete(@PathVariable Long id) {
        return null;
    }

}
