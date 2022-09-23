package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.TitleAndSlogan;

public interface TitleAndSloganService {

   void updateCopyRight(Integer id, TitleAndSlogan titleAndSlogan);

   void postCopyRight(TitleAndSlogan titleAndSlogan);

   TitleAndSlogan getTitleAndSlogan(Integer titleAndSloganId);

   List<TitleAndSlogan> getTitleAndSlogans();

}
