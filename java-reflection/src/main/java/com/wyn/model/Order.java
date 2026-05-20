package com.wyn.model;

import com.wyn.annotation.ApiClient;
import com.wyn.annotation.Get;
import com.wyn.annotation.Post;

@ApiClient(
        name = "orderApiClient"
)
public interface Order {

    @Post
    void posting();

    @Get
    void getOrder();

    void cancel();
}
