package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.CopyRight;

public interface CopyRightService {

   void postCopyRight(CopyRight copyRight);

   void updateCopyRight(Integer id, CopyRight copyRight);

   CopyRight getCopyRight(Integer id);

   List<CopyRight> getCopyRights();

}
