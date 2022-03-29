package com.wzf.jpa.service.mapper;

import com.wzf.jpa.entity.People;
import com.wzf.jpa.service.dto.PeopleDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public class PeopleMapper {

    public People convertToPeople(PeopleDTO dto) {
        People people = new People();
        BeanUtils.copyProperties(dto, people);

        return people;
    }
}
