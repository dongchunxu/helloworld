package com.helloworld.api.service;

import com.helloworld.api.dto.tdk.ChannelType;
import com.helloworld.api.dto.tdk.TdkDto;

import java.util.List;

public interface TdkRecommendService {

    List<TdkDto> getTdkByChannel(ChannelType type);

}
