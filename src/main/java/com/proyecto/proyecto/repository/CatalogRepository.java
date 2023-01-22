package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.CatalogEntity;
import com.proyecto.proyecto.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {

    //@Query("from CatalogEntity c where upper(c.gender) like upper(concat('%', :gender,'%'))")
    //List<CatalogEntity> findByGender(@Param("gender") String gender);

   // @Query(value = "select * from product_catalog p  c where upper(c.full_name) like upper(concat('%', ?1,'%'))", nativeQuery = true)
 //@Query(value = "select * from product_catalog p  inner join gender g  on g.id_gender =p.gender_id_gender where upper(g.gender) like upper(concat('%', ?1,'%'))", nativeQuery = true)
   // @Query("Select a,b,c,d,e,f,g,h,i,j,k from CatalogEntity u join u.gender c where c.gender=?1")
    List<CatalogEntity> findByGenderContaining(String gender);
}
