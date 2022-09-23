package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.CopyRight;
import com.example.for_angular_project.Repository.CopyRightRepository;

@Service
public class CopyRightServiceImp implements CopyRightService {

   @Autowired
   CopyRightRepository copyRightRepository;

   @Override
   public void postCopyRight(CopyRight copyRight) {
      copyRightRepository.save(copyRight);

   }

   @Override
   public List<CopyRight> getCopyRights() {
      return copyRightRepository.findAll();
   }

   @Override
   public CopyRight getCopyRight(Integer id) {
      return copyRightRepository.findById(id).get();
   }

   @Override
   public void updateCopyRight(Integer id, CopyRight copyRight) {
      CopyRight copyRightDemo = copyRightRepository.findById(id).get();

      if (Objects.nonNull(copyRight.getCopyRightText()) && !"".equalsIgnoreCase(copyRight.getCopyRightText())) {
         copyRightDemo.setCopyRightText(copyRight.getCopyRightText());
      }

      copyRightRepository.save(copyRightDemo);

   }

}
