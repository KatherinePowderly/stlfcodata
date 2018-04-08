package com.katherinepowderly.stlfcodata.models.data;

import com.katherinepowderly.stlfcodata.models.csb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CsbDao extends CrudRepository<csb, Integer> {


}
