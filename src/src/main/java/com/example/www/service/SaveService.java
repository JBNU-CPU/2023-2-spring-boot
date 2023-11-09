package com.example.www.service;

import com.example.www.dto.SaveDTO;
import com.example.www.entity.ContentEntity;
import com.example.www.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaveService {

    @Autowired
    private ContentRepository contentRepository;

    public void saveContent(SaveDTO saveDTO) {

        System.out.println(saveDTO.getTitle());
        System.out.println(saveDTO.getContent());


        ContentEntity data1 = new ContentEntity();

        data1.setTitle(saveDTO.getTitle());
        data1.setContent(saveDTO.getContent());

        contentRepository.save(data1);
    }



    @Transactional
    public void updateContent(SaveDTO saveDTO, int id) {

        //delete
        contentRepository.deleteById(id);

        //dto -> entity
        ContentEntity data1 = new ContentEntity();
        data1.setId(id);
        data1.setTitle(saveDTO.getTitle());
        data1.setContent(saveDTO.getContent());

        //save
        contentRepository.save(data1);
    }


}
