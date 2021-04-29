package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.webmodel.RecomCard;
import com.waq.employment_platform_serve.mapper.RecomCardMapper;
import com.waq.employment_platform_serve.service.RecomCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecomCardServiceImpl implements RecomCardService {

    @Autowired
    RecomCardMapper recomCardMapper;

    @Override
    public List<RecomCard> cardList() {
        return this.recomCardMapper.cardList();
    }

    @Override
    public List<RecomCard> findByTag(String tag) {
        return recomCardMapper.findByTag(tag);
    }
}
