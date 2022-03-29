package com.wzf.jpa.service;

import com.wzf.jpa.entity.People;
import com.wzf.jpa.repository.PeopleRepository;
import com.wzf.jpa.service.dto.PeopleDTO;
import com.wzf.jpa.service.mapper.PeopleMapper;
import org.springframework.stereotype.Service;


@Service
public class PeopleService {

    private PeopleRepository peopleRepository;

    private PeopleMapper peopleMapper;

    public PeopleService(PeopleRepository peopleRepository, PeopleMapper peopleMapper) {
        this.peopleRepository = peopleRepository;
        this.peopleMapper = peopleMapper;
    }

    public void savePeople(PeopleDTO dto) {
        People people = peopleMapper.convertToPeople(dto);
        peopleRepository.save(people);
    }
}
