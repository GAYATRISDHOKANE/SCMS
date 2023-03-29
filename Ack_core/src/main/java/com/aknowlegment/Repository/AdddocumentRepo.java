package com.aknowlegment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aknowlegment.entity.AdDocuments;
@Repository
public interface AdddocumentRepo extends JpaRepository<AdDocuments, Long> {

}
